package Vtiger;

import org.automation.base.Base_Test;
import org.automation.element_repository.Lead_Page;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Vtiger_007 extends Base_Test {

	@Test
	public void toClickOnImportLeads() {
		Lead_Page lead=new Lead_Page(driver);
		lead.getLeads().click();
		lead.getImportLeadIcon().click();
		Assert.assertEquals(lead.getShowImportLeads().isDisplayed(), true, "Import leads page is not displayed");
		Reporter.log("Import leads page is displayed", true);
	}
}
