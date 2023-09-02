package Vtiger;

import org.automation.base.Base_Test;
import org.automation.element_repository.Lead_Page;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Vtiger_005 extends Base_Test {
	
	@Test
	public void toClickOnCalculator() {
		Lead_Page lead=new Lead_Page(driver);
		lead.getLeads().click();
		lead.getCalculatorIcon().click();
		Assert.assertEquals(lead.getShowCalculator().isDisplayed(), true, "Calculator is not displayed");
		Reporter.log("Calculator is displayed", true);
	}

}
