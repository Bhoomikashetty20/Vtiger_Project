package Vtiger;

import org.automation.base.Base_Test;
import org.automation.element_repository.CreateLead_Page;
import org.automation.element_repository.Lead_Page;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_Vtiger_038 extends Base_Test {
	
	@DataProvider
	public String[] sendData() {
		String[] opt= {"India","1234567","India@!@#","@#$%^&*","India3421"};
		return opt;
	}
	
	@Test(dataProvider = "sendData")
	public void toEnterDataToPOBoxTextField(String data) {
		CreateLead_Page lead=new CreateLead_Page(driver);
		Lead_Page leadPage=new Lead_Page(driver);
		lead.getLeads().click();
		leadPage.getCreateLeadIcon().click();
		WebElement poBoxTextField = lead.getPoboxTextField();
		poBoxTextField.sendKeys(data);
		lead.getLastNameTextField().sendKeys("Shetty");
		lead.getCompanyTextField().sendKeys("TY");
		lead.getSaveButton().click();
		Assert.assertEquals(lead.getLeadInformationPage().isDisplayed(), true, data+" is not entered");
		Reporter.log(data+" is entered",true);	
	}

}
