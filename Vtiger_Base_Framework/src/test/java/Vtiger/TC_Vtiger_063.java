package Vtiger;

import org.automation.base.Base_Test;
import org.automation.element_repository.CreateLead_Page;
import org.automation.element_repository.Lead_Page;
import org.automation.generic_utilities.InitObjects;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Vtiger_063 extends Base_Test {
	
	@Test
	public void toCreateNewLead() {
		Lead_Page lead=new Lead_Page(driver);
		CreateLead_Page createLead=new CreateLead_Page(driver);
		InitObjects init=new InitObjects();
		
		lead.getLeads().click();
		lead.getCreateLeadIcon().click();
		Assert.assertEquals(createLead.getFirstNameTextField().isDisplayed(), true, "Create lead page is not displayed");
		Reporter.log("Create lead page is displayed",true);
		
		WebElement firstNameTextField = createLead.getFirstNameTextField();
		String firstName = init.getReadTestData().readStringDataFromExcel("Sheet1", 1, 0);
		firstNameTextField.sendKeys(firstName);
		Assert.assertEquals(firstNameTextField.getAttribute("value"), firstName, "First name is not entered");
		Reporter.log("First name is entered",true);
		
		WebElement lastNameTextField = createLead.getLastNameTextField();
		String lastname = init.getReadTestData().readStringDataFromExcel("Sheet1", 1, 1);
		lastNameTextField.sendKeys(lastname);
		Assert.assertEquals(lastNameTextField.getAttribute("value"), lastname, "Last name is not entered");
		Reporter.log("Last name is entered",true);
		
		WebElement companyTextField = createLead.getCompanyTextField();
		String company = init.getReadTestData().readStringDataFromExcel("Sheet1", 1, 2);
		companyTextField.sendKeys(company);
		Assert.assertEquals(companyTextField.getAttribute("value"), company, "Company name is not entered");
		Reporter.log("Company name is entered",true);
		
		WebElement phoneTextField = createLead.getPhoneTextField();
		String phoneNo = ""+(long)init.getReadTestData().readNumberDataFromExcel("Sheet1", 1, 3);
		phoneTextField.sendKeys(phoneNo);
		Assert.assertEquals(phoneTextField.getAttribute("value"), phoneNo, "Phone number is not entered");
		Reporter.log("Phone number is entered",true);
		
		WebElement websiteTextField = createLead.getWebsiteTextField();
		String website = init.getReadTestData().readStringDataFromExcel("Sheet1", 1, 4);
		websiteTextField.sendKeys(website);
		Assert.assertEquals(websiteTextField.getAttribute("value"), website, "Website is not entered");
		Reporter.log("Website is entered",true);
		
		WebElement emailTextField = createLead.getEmailTextField();
		String email = init.getReadTestData().readStringDataFromExcel("Sheet1", 1, 5);
		emailTextField.sendKeys(email);
		Assert.assertEquals(emailTextField.getAttribute("value"), email, "Email is not entered");
		Reporter.log("Email is entered",true);
		
		createLead.getSaveButton().click();
		Assert.assertEquals(createLead.getLeadInformationPage().isDisplayed(), true, "New lead is not created");
		Reporter.log("New lead is created", true);
	}

}
