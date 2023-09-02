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

public class TC_Vtiger_033 extends Base_Test{
	
	@DataProvider
	public String[][] sendData() {
		String[][] opt= {{"--None--", "Attempted to Contact","Cold","Contact in Future", "Contacted","Hot","Junk Lead",
				          "Lost Lead","Not Contacted","Pre Qualified","Qualified","Warm"}};
		return opt;
	}
	
	@Test(dataProvider = "sendData")
	public void toSelectOptionToLeadSource(String[] leadStatusOption) {
		CreateLead_Page lead=new CreateLead_Page(driver);
		Lead_Page leadPage=new Lead_Page(driver);
		lead.getLeads().click();
		leadPage.getCreateLeadIcon().click();
		Select select=new Select(lead.getLeadStatus());
		lead.getLeadStatus().click();
		List<WebElement> options = select.getOptions();
		for(int i=0;i<options.size();i++) {
			select.selectByIndex(i);
			Assert.assertEquals(select.getFirstSelectedOption().getText(), leadStatusOption[i], leadStatusOption[i]+" option is not selected");
			Reporter.log(leadStatusOption[i]+" option is selected", true);
			
		}
		
	}


}
