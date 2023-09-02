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

public class TC_Vtiger_025 extends Base_Test {
	
	@DataProvider
	public String[][] sendData() {
		String[][] opt= {{"--None--", "Apparel","Banking","Biotechnology","Chemicals","Communications","Construction","Consulting","Education","Electronics","Energy","Engineering","Entertainment"
				           ,"Environmental","Finance","Food & Beverage","Government","Healthcare","Hospitality","Insurance","Machinery","Manufacturing","Media","Not For Profit",
				           "Recreation","Retail","Shipping","Technology","Telecommunications","Transportation","Utilities","Other"}};
		return opt;
	}
	
	@Test(dataProvider = "sendData")
	public void toSelectOptionToIndustry(String[] industryOption) {
		CreateLead_Page lead=new CreateLead_Page(driver);
		Lead_Page leadPage=new Lead_Page(driver);
		lead.getLeads().click();
		leadPage.getCreateLeadIcon().click();
		Select select=new Select(lead.getIndustry());
		lead.getIndustry().click();
		List<WebElement> options = select.getOptions();
		for(int i=0;i<options.size();i++) {
			select.selectByIndex(i);
			Assert.assertEquals(select.getFirstSelectedOption().getText(), industryOption[i], industryOption[i]+" option is not selected");
			Reporter.log(industryOption[i]+" option is selected", true);
		}
		
		
	}

}
