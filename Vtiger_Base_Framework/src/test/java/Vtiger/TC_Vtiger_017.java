package Vtiger;

import org.automation.base.Base_Test;
import org.automation.element_repository.Lead_Page;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Vtiger_017 extends Base_Test{

	@Test
	public void toClickOnMassEditButton() {
		Lead_Page lead=new Lead_Page(driver);
		lead.getLeads().click();
		lead.getCheckBox().click();
		lead.getMassEditButton().click();
		Assert.assertEquals(lead.getMassEditPage().isDisplayed(), true, "Mass Edit Page is not displayed");
		Reporter.log("Mass Edit Page is displayed", true);
		lead.getCloseEdit().click();
	}
}
