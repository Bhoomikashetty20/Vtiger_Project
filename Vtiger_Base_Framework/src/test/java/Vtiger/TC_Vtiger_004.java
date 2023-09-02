package Vtiger;

import org.automation.base.Base_Test;
import org.automation.element_repository.Lead_Page;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Vtiger_004 extends Base_Test {
	
	@Test
	public void toClickOnClock() {
		Lead_Page lead=new Lead_Page(driver);
		lead.getLeads().click();
		lead.getClockIcon().click();
		Assert.assertEquals(lead.getShowClock().isEnabled(), true, "Clock is not displayed");
		Reporter.log("clock is displayed", true);
	}

}
