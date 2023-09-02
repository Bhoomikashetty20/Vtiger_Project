package Vtiger;

import java.util.List;

import org.automation.base.Base_Test;
import org.automation.element_repository.CreateLead_Page;
import org.automation.element_repository.Lead_Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_Vtiger_035 extends Base_Test {
	
	@DataProvider
	public String[] sendData() {
		String[] opt= {"Bangalore","1234567","Bangalore@!@#","@#$%^&*","Bangalore3421"};
		return opt;
	}
	
	@Test(dataProvider = "sendData")
	public void toEnterDataToStreetTextField(String data) {
		CreateLead_Page lead=new CreateLead_Page(driver);
		Lead_Page leadPage=new Lead_Page(driver);
		lead.getLeads().click();
		leadPage.getCreateLeadIcon().click();
		WebElement streetTextField = lead.getStreetTextField();
		streetTextField.sendKeys(data);
		lead.getLastNameTextField().sendKeys("Shetty");
		lead.getCompanyTextField().sendKeys("TY");
		lead.getSaveButton().click();
		Assert.assertEquals(lead.getLeadInformationPage().isDisplayed(), true, data+" is not entered");
		Reporter.log(data+" is entered",true);	
	}


}
