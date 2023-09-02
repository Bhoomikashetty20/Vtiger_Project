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

public class TC_Vtiger_034 extends Base_Test {
	
	@DataProvider
	public String[][] sendData() {
		String[][] opt= {{"--None--","Acquired","Active","Market Failed","Project Cancelled","Shutdown"}};
		return opt;
	}
	
	@Test(dataProvider = "sendData")
	public void toSelectOptionInRatingDropDown(String[] ratingDropDownOption) {
		CreateLead_Page lead=new CreateLead_Page(driver);
		Lead_Page leadPage=new Lead_Page(driver);
		lead.getLeads().click();
		leadPage.getCreateLeadIcon().click();
		Select select=new Select(lead.getRatingTextField());
		lead.getRatingTextField().click();
		List<WebElement> options = select.getOptions();
		for(int i=0;i<options.size();i++) {
			select.selectByIndex(i);
			Assert.assertEquals(select.getFirstSelectedOption().getText(), ratingDropDownOption[i], ratingDropDownOption[i]+" option is not selected");
			Reporter.log(ratingDropDownOption[i]+" option is selected", true);
			
		}
		
	}

}
