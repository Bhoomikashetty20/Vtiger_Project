package Vtiger;

import org.automation.base.Base_Test;
import org.automation.element_repository.CreateLead_Page;
import org.automation.element_repository.Lead_Page;
import org.automation.element_repository.QuickCreate_Page;
import org.automation.generic_utilities.InitObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Vtiger_064 extends Base_Test {
	
	@Test
	public void toCreateNewLeadUsingQuickCreate() {
		Lead_Page lead=new Lead_Page(driver);
		QuickCreate_Page quickCreate=new QuickCreate_Page(driver);
		InitObjects init=new InitObjects();
		
		lead.getLeads().click();
		lead.getQuickCreateDropDown().click();
		Select select=new Select(lead.getQuickCreateDropDown());
		select.selectByValue("Leads");
		
		Assert.assertEquals(quickCreate.getFirstNameTextField().isDisplayed(), true, "Create lead page is not displayed");
		Reporter.log("Create lead page is displayed",true);
		
		WebElement firstNameTextField = quickCreate.getFirstNameTextField();
		String firstName = init.getReadTestData().readStringDataFromExcel("Sheet1", 1, 0);
		firstNameTextField.sendKeys(firstName);
		Assert.assertEquals(firstNameTextField.getAttribute("value"), firstName, "First name is not entered");
		Reporter.log("First name is entered",true);
		
		WebElement lastNameTextField = quickCreate.getLastNameTextField();
		String lastname = init.getReadTestData().readStringDataFromExcel("Sheet1", 1, 1);
		lastNameTextField.sendKeys(lastname);
		Assert.assertEquals(lastNameTextField.getAttribute("value"), lastname, "Last name is not entered");
		Reporter.log("Last name is entered",true);
		
		WebElement companyTextField = quickCreate.getCompanyTextField();
		String company = init.getReadTestData().readStringDataFromExcel("Sheet1", 1, 2);
		companyTextField.sendKeys(company);
		Assert.assertEquals(companyTextField.getAttribute("value"), company, "Company name is not entered");
		Reporter.log("Company name is entered",true);
		
		WebElement phoneTextField = quickCreate.getPhoneTextField();
		String phoneNo = ""+(long)init.getReadTestData().readNumberDataFromExcel("Sheet1", 1, 3);
		phoneTextField.sendKeys(phoneNo);
		Assert.assertEquals(phoneTextField.getAttribute("value"), phoneNo, "Phone number is not entered");
		Reporter.log("Phone number is entered",true);
		
		WebElement emailTextField = quickCreate.getEmailTextField();
		String email = init.getReadTestData().readStringDataFromExcel("Sheet1", 1, 5);
		emailTextField.sendKeys(email);
		Assert.assertEquals(emailTextField.getAttribute("value"), email, "Email is not entered");
		Reporter.log("Email is entered",true);
		
		quickCreate.getSaveButton().click();
		Assert.assertEquals(quickCreate.getLeadInformationPage().isDisplayed(), true, "New lead is not created");
		Reporter.log("New lead is created", true);
	}

}
