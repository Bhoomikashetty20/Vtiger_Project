package org.automation.element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuickCreate_Page {
	
	public WebDriver driver;
	public QuickCreate_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(name = "firstname")
	private WebElement firstNameTextField;
	
	@FindBy(name = "company")
	private WebElement companyTextField;
	
	@FindBy(name = "lastname")
	private WebElement lastNameTextField;
	
	@FindBy(name = "email")
	private WebElement emailTextField;
	
	@FindBy(name = "phone")
	private WebElement phoneTextField;
	
	@FindBy(xpath = "//input[@value='  Save']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement leadInformationPage;
	
	
	public WebElement getLeadInformationPage() {
		return leadInformationPage;
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getCompanyTextField() {
		return companyTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPhoneTextField() {
		return phoneTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	

}
