package org.automation.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditLead_Page {
	
	public WebDriver driver;
	public EditLead_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(name = "firstname")
	private WebElement firstNameTextField;
	
	@FindBy(name = "lastname")
	private WebElement lastNameTextField;
	
	@FindBy(name = "company")
	private WebElement companyTextField;
	
	@FindBy(name = "phone")
	private WebElement phoneTextField;
	
	@FindBy(xpath = "//input[@class='crmbutton small save']")
	private WebElement saveButton;
	
	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getCompanyTextField() {
		return companyTextField;
	}

	public WebElement getPhoneTextField() {
		return phoneTextField;
	}

	
}
