package Vtiger;

import org.automation.base.Base_Test;
import org.automation.element_repository.Lead_Page;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Vtiger_003 extends Base_Test {
	
	@Test
	public void toClickOnCalendar() {
		Lead_Page lead=new Lead_Page(driver);
		lead.getLeads().click();
		lead.getCalendarIcon().click();
		Assert.assertEquals(lead.getMiniCalendar().isEnabled(), true, "Calendar is not displayed");
		Reporter.log("Calendar is displayed", true);
	}

}
