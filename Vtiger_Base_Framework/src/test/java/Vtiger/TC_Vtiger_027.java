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

public class TC_Vtiger_027 extends Base_Test {

	String expectedPopUpMsg = "Please enter a valid Secondary Email (EMAIL)";

	@DataProvider
	public String[] sendData() {
		String[] opt = { "abc@gmail.com", "lmnopq123!@gmail.com", "@#%^@gmail.com", "1458542", "123@!#@gmail.com",
				"Bhoomi23!@" };
		return opt;
	}

	@Test(dataProvider = "sendData")
	public void toEnterDataToEmail(String data) {
		CreateLead_Page lead = new CreateLead_Page(driver);
		Lead_Page leadPage = new Lead_Page(driver);
		lead.getLeads().click();
		leadPage.getCreateLeadIcon().click();
		WebElement secondaryEmailTextField = lead.getSecondaryEmail();
		secondaryEmailTextField.sendKeys(data);
		lead.getLastNameTextField().sendKeys("Shetty");
		lead.getCompanyTextField().sendKeys("TY");
		lead.getSaveButton().click();

		if (lead.getLeadInformationPage().isDisplayed()) {
			Assert.assertEquals(lead.getLeadInformationPage().isDisplayed(), true, data + " is not entered");
			Reporter.log(data + " is entered", true);
		} else {
			Alert alertPopUp = driver.switchTo().alert();
			System.out.println(alertPopUp.getText());
			// Assert.assertEquals(alertPopUp.getText(), expectedPopUpMsg, data+" is
			// entered");
			// Reporter.log(data+" is not entered");
			alertPopUp.accept();
		}
	}
}
