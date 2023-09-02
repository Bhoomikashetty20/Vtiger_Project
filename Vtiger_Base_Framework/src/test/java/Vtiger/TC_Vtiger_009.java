package Vtiger;

import org.automation.base.Base_Test;
import org.automation.element_repository.Lead_Page;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Vtiger_009 extends Base_Test{

	@Test
	public void toClickOnLeadSetting() {
		Lead_Page lead=new Lead_Page(driver);
		lead.getLeads().click();
		lead.getLeadSettingsIcon().click();
		Assert.assertEquals(lead.getLeadSettingPage().isDisplayed(), true, "Leads setting page is not displayed");
		Reporter.log("Leads setting page is displayed", true);
	}
}
