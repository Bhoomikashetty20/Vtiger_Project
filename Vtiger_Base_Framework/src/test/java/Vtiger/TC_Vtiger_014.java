package Vtiger;

import java.util.List;

import org.automation.base.Base_Test;
import org.automation.element_repository.Lead_Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Vtiger_014 extends Base_Test{

	@Test
	public void toClickEdit() {
		Lead_Page leads=new Lead_Page(driver);
		leads.getLeads().click();
		Select select=new Select(leads.getFilterDropDown());
		
		leads.getFilterDropDown().click();
		select.selectByIndex(1);
		leads.getEditFilter().click();
		Assert.assertEquals(leads.getEditCustomViewPage().isDisplayed(), true, " Edit filter page is not displayed");
		Reporter.log("Edit filter page is displayed",true);
	}
}
