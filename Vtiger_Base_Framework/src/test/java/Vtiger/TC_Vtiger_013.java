package Vtiger;

import java.util.List;

import org.automation.base.Base_Test;
import org.automation.element_repository.Lead_Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_Vtiger_013 extends Base_Test {
	
	@DataProvider
	public String[][] sendData() {
		String[][] opt= {{"All","Hot Leads","This Month Leads"}};
		return opt;
	}
	
	@Test(dataProvider = "sendData")
	public void toClickFilterDropDown(String[] inOption) {
		Lead_Page leads=new Lead_Page(driver);
		leads.getLeads().click();
		Select select=new Select(leads.getFilterDropDown());
		
		leads.getFilterDropDown().click();
		List<WebElement> filterDropDownOptions = select.getOptions();
		for(int i=0;i<filterDropDownOptions.size();i++) {
			select.selectByIndex(i);
			Assert.assertEquals(inOption[i], select.getFirstSelectedOption().getText(), inOption[i]+" is not selected");
			Reporter.log(inOption[i]+" is selected", true);
		}
		
	}

}
