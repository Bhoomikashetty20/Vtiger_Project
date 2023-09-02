package Vtiger;

import org.automation.base.Base_Test;
import org.automation.element_repository.Lead_Page;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Vtiger_016 extends Base_Test {

	@Test
	public void toClickOnDeleteButton() {
		Lead_Page lead=new Lead_Page(driver);
		lead.getLeads().click();
		lead.getCheckBox().click();
		lead.getDeleteButton().click();
		Alert alertPopUp=driver.switchTo().alert();
		Assert.assertEquals(alertPopUp.getText().contains("delete the selected"), true, "Delete pop up is not displayed");
		Reporter.log("Delete pop up is displayed", true);
		alertPopUp.dismiss();
	}
	
}
