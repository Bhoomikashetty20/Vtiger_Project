package Vtiger;

import java.util.Set;

import org.automation.base.Base_Test;
import org.automation.element_repository.Lead_Page;
import org.automation.generic_utilities.UtilityMethods;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Vtiger_006 extends Base_Test {
	
	String expectedPageTitle="Ajax Css-Popup chat";
	
	@Test
	public void toClickOnChat() {
		Lead_Page lead=new Lead_Page(driver);
		UtilityMethods utilityMethods=new UtilityMethods();
		lead.getLeads().click();
		String parentWindowId = driver.getWindowHandle();
		lead.getLeadChatIcon().click();
		utilityMethods.switchToASpecificTitledWindow(driver, "Ajax Css-Popup chat");
		
		Assert.assertEquals(driver.getTitle(), expectedPageTitle, "Chat pop-up is not displayed");
		Reporter.log("Chat pop-up is displayed", true);
		driver.switchTo().window(parentWindowId);
	}

}
