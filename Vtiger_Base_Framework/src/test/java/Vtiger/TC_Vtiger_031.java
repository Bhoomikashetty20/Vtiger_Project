package Vtiger;

import org.automation.base.Base_Test;
import org.automation.element_repository.CreateLead_Page;
import org.automation.element_repository.Lead_Page;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_Vtiger_031 extends Base_Test {
	
	@DataProvider
	public String[] sendData() {
		String[] opt= {"abcd@gamil.com","abcd123@gmail.com", "@#$%^^@gmail.com","2546987","selenium145"};
		return opt;
	}
	
	@Test(dataProvider = "sendData")
	public void toEnterDataToEmail(String data) {
		CreateLead_Page lead=new CreateLead_Page(driver);
		Lead_Page leadPage=new Lead_Page(driver);
		lead.getLeads().click();
		leadPage.getCreateLeadIcon().click();
		WebElement emailTextField = lead.getEmailTextField();
		emailTextField.sendKeys(data);
		lead.getLastNameTextField().sendKeys("Shetty");
		lead.getCompanyTextField().sendKeys("TY");
		lead.getSaveButton().click();
		Assert.assertEquals(lead.getLeadInformationPage().isDisplayed(), true, data+" is not entered");
		Reporter.log(data+" is entered",true);
		
	}

}
