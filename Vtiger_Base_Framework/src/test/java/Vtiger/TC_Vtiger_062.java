package Vtiger;

import org.automation.base.Base_Test;
import org.automation.element_repository.Lead_Page;
import org.automation.generic_utilities.InitObjects;
import org.automation.generic_utilities.UtilityMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Vtiger_062 extends Base_Test{
	
	String subject="Good morning";
	
	@Test
	public void toClickOnLeadSetting() {
		Lead_Page lead=new Lead_Page(driver);
		InitObjects init=new InitObjects();
		lead.getLeads().click();
		lead.getCheckBox().click();
		lead.getSendMailButton().click();
		String parentWindowId = driver.getWindowHandle();
		lead.getSelectEmail().click();
		init.getUtilityMethods().switchToASpecificTitledWindow(driver, "Compose Mail");
		driver.findElement(By.xpath("//input[@name='subject']")).sendKeys(subject);
		driver.findElement(By.xpath("//input[@class='crmbutton small save' and @value='  Save ']")).click();
		driver.switchTo().window(parentWindowId);
		lead.getEmail().click();
		WebElement emailPage = driver.findElement(By.xpath("//div[@id='email_con']"));
		Assert.assertEquals(emailPage.getText().contains(subject), true, "Mail is not saved in email page");
		Reporter.log("Mail is saved in email page", true);
	}

}
