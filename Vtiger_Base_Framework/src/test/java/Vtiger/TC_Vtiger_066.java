package Vtiger;

import org.automation.base.Base_Test;
import org.automation.element_repository.EditLead_Page;
import org.automation.element_repository.Lead_Page;
import org.automation.generic_utilities.InitObjects;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Vtiger_066 extends Base_Test{
	
	@Test
	public void toEdit() {
		Lead_Page lead=new Lead_Page(driver);
		EditLead_Page editPage=new EditLead_Page(driver);
		InitObjects init=new InitObjects();
		
		lead.getLeads().click();
		lead.getCheckBox().click();
		lead.getMassEditButton().click();
		Assert.assertEquals(lead.getMassEditPage().isDisplayed(), true, "Mass Edit Page is not displayed");
		Reporter.log("Mass Edit Page is displayed", true);
		
		WebElement lastNameTextField = editPage.getLastNameTextField();
		String lastName = init.getReadTestData().readStringDataFromExcel("Sheet1", 2, 1);
		lastNameTextField.sendKeys(lastName);
		//System.out.println(lastName);
		Assert.assertEquals(lastNameTextField.getAttribute("value"), lastName, "Last name is not entered");
		Reporter.log("Last name is entered", true);
		
		WebElement companyTextField = editPage.getCompanyTextField();
		String company = init.getReadTestData().readStringDataFromExcel("Sheet1", 2, 2);
		companyTextField.sendKeys(company);
		Assert.assertEquals(companyTextField.getAttribute("value"), company, "Company name is not entered");
		Reporter.log("Company name is entered", true);
		
		WebElement phoneTextField = editPage.getPhoneTextField();
		String phone = ""+(long)init.getReadTestData().readNumberDataFromExcel("Sheet1", 2, 3);
		phoneTextField.sendKeys(phone);
		Assert.assertEquals(phoneTextField.getAttribute("value"), phone, "Phone is not entered");
		Reporter.log("Phone is entered", true);
		
		editPage.getSaveButton().click();
		Assert.assertEquals(lead.getCheckBox().getText().contains(phone), true, "Phone is not entered");
		Reporter.log("Phone is entered", true);
		
	}

}
