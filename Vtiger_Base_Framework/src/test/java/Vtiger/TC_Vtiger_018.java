package Vtiger;

import org.automation.base.Base_Test;
import org.automation.element_repository.Lead_Page;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Vtiger_018 extends Base_Test{
	
	@Test
	public void toClickOnSendEmailButton() {
		Lead_Page lead=new Lead_Page(driver);
		lead.getLeads().click();
		lead.getCheckBox().click();
		lead.getSendMailButton().click();
		Assert.assertEquals(lead.getSelectEmailPage().isDisplayed(), true, "Send email ID's pop up is not displayed");
		Reporter.log("Send email ID's pop up is displayed", true);
		lead.getCloseMail().click();
	}

}
