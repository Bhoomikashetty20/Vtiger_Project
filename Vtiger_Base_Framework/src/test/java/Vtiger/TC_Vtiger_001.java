package Vtiger;

import org.automation.base.Base_Test;
import org.automation.element_repository.Lead_Page;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Vtiger_001 extends Base_Test {
	
	 String expectedPageTitle="Administrator - Leads - vtiger CRM 5 - Commercial Open Source CRM";
	
	@Test
	public void toClickOnLead() {
		Lead_Page lead=new Lead_Page(driver);
		lead.getLeads().click();
		Assert.assertEquals(driver.getTitle(), expectedPageTitle, "Leads page is not displayed");
		Reporter.log("Leads Page is displayed", true);
	}

}
