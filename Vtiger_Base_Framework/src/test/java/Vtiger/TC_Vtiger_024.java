package Vtiger;

import java.util.List;

import org.automation.base.Base_Test;
import org.automation.element_repository.CreateLead_Page;
import org.automation.element_repository.Lead_Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_Vtiger_024 extends Base_Test{
	
	@DataProvider
	public String[][] sendData() {
		String[][] opt= {{"--None--","Cold Call", "Existing Customer","Self Generated","Employee","Partner","Public Relations","Direct Mail","Conference",
				        "Trade Show","Web Site","Word of mouth","Other"}};
		return opt;
	}
	
	@Test(dataProvider = "sendData")
	public void toSelectOptionToLeadSource(String[] leadSourceOption) {
		CreateLead_Page lead=new CreateLead_Page(driver);
		Lead_Page leadPage=new Lead_Page(driver);
		lead.getLeads().click();
		leadPage.getCreateLeadIcon().click();
		Select select=new Select(lead.getLeadSource());
		lead.getLeadSource().click();
		List<WebElement> options = select.getOptions();
		for(int i=0;i<options.size();i++) {
			select.selectByIndex(i);
			Assert.assertEquals(select.getFirstSelectedOption().getText(), leadSourceOption[i], leadSourceOption[i]+" option is not selected");
			Reporter.log(leadSourceOption[i]+" option is selected", true);
		}
		
		
	}

}
