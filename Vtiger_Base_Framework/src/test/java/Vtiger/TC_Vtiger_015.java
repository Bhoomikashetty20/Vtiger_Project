package Vtiger;

import org.automation.base.Base_Test;
import org.automation.element_repository.Lead_Page;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Vtiger_015 extends Base_Test {
	
	@Test
	public void toClickDelete() {
		Lead_Page leads=new Lead_Page(driver);
		leads.getLeads().click();
		Select select=new Select(leads.getFilterDropDown());
		
		leads.getFilterDropDown().click();
		select.selectByIndex(1);
		leads.getDeleteFilter().click();
		Alert alertPopUp=driver.switchTo().alert();
		System.out.println(alertPopUp.getText());
		Assert.assertEquals(alertPopUp.getText().contains("want to Delete"), true, "Delete filter pop up is not displayed");
		Reporter.log("Delete filter pop up is displayed",true);
		alertPopUp.dismiss();
	}

}
