package Vtiger;

import org.automation.base.Base_Test;
import org.automation.element_repository.Lead_Page;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Vtiger_002 extends Base_Test{
	
	String expectedPageTitle="Administrator - Leads - vtiger CRM 5 - Commercial Open Source CRM";
	
	@Test
	public void toClickCreateLeads() {
		Lead_Page leads=new Lead_Page(driver);
		leads.getLeads().click();
		leads.getCreateLeadIcon().click();
		Assert.assertEquals(driver.getTitle(), expectedPageTitle, "Create lead page is not displayed");
		Reporter.log("Create lead page displayed");
	}

}
