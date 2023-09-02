package Vtiger;

import org.automation.base.Base_Test;
import org.automation.element_repository.Lead_Page;
import org.automation.generic_utilities.InitObjects;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Vtiger_065 extends Base_Test {
	
	@Test
	public void toSearchLead() {
		Lead_Page lead=new Lead_Page(driver);
		InitObjects init=new InitObjects();
		
		lead.getLeads().click();
		WebElement searchTextField = lead.getSearchTextField();
		String searchData = init.getReadTestData().readStringDataFromExcel("Sheet1", 1, 1);
		searchTextField.sendKeys(searchData);
		Assert.assertEquals(searchTextField.getAttribute("value"), searchData, "Search data is not entetred");
		Reporter.log("Search data is successfully entered", true);
		lead.getSearchNowButton().click();
		Assert.assertEquals(lead.getNoLeadFound().isDisplayed(), true, "Search data is displayed");
		Reporter.log("Search data is displayed", true);
	}

}
