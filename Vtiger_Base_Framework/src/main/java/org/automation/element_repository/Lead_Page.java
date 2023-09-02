package org.automation.element_repository;

import org.automation.base.Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lead_Page extends Base_Page {
	
	public WebDriver driver;
	public Lead_Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(linkText = "Leads")
	private WebElement leads;
	
	public WebElement getLeads() {
		return leads;
	}

	@FindBy(xpath="//img[@title='Create Lead...']")
	private WebElement createLeadIcon;
	
	@FindBy(xpath="//img[@title='Search in Leads...']")
	private WebElement searchInLeadsIcon;
	
	@FindBy(xpath="//img[@title='Open Calendar...']")
	private WebElement calendarIcon;
	
	@FindBy(xpath="//img[@title='Show World Clock...']")
	private WebElement clockIcon;
	
	@FindBy(xpath="//img[@title='Open Calculator...']")
	private WebElement calculatorIcon;
	
	@FindBy(xpath="//img[@title='Chat...']")
	private WebElement leadChatIcon;
	
	@FindBy(xpath="//img[@title='Import Leads']")
	private WebElement importLeadIcon;
	
	@FindBy(xpath="//img[@title='Export Leads']")
	private WebElement exportLeadIcon;
	
	@FindBy(xpath="//img[@title='Leads Settings']")
	private WebElement leadSettingsIcon;
	
	@FindBy(xpath="//input[@name='search_text']")
	private WebElement searchTextField;
	
	@FindBy(xpath="//input[@name='submit']")
	private WebElement searchNowButton;
	
	@FindBy(xpath="//div[@id='basicsearchcolumns_real']/select")
	private WebElement inDropDown;
	
	@FindBy(linkText = "Create Filter")
	private WebElement createFilter;
	
	@FindBy(linkText = "Edit")
	private WebElement editFilter;
	
	@FindBy(linkText = "Delete")
	private WebElement deleteFilter;
	
	@FindBy(id="viewname")
	private WebElement filterDropDown;
	
	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement deleteButton;
	
	@FindBy(xpath = "//input[@value='Mass Edit']")
	private WebElement massEditButton;
	
	@FindBy(xpath="//input[@value='Send Mail']")
	private WebElement sendMailButton;
	
	@FindBy(xpath = "//input[@value='Send SMS']")
	private WebElement sendSMSButton;
	
	@FindBy(partialLinkText = "Create Mail Merge templates")
	private WebElement createMailMergeTemplate;
	
	@FindBy(linkText = "Go to Advanced Search")
	private WebElement advanceSearch;
	
	@FindBy(xpath = "//input[@name='selected_id' and @id='38']")
	private WebElement row;
	
	@FindBy(id = "miniCal")
	private WebElement miniCalendar;
	
	@FindBy(id="theClockLayer")
	private WebElement showClock;
	
	@FindBy(name = "calculator")
	private WebElement showCalculator;
	
	@FindBy(xpath = "//td[contains(text(),'Import Leads')]")
	private WebElement showImportLeads;
	
	@FindBy(xpath = "//td[contains(text(),'Leads >> Export ')]")
	private WebElement showExportLeads;
	
	@FindBy(xpath = "//td[contains(text(),'Manage module behavior inside vtiger CRM')]")
	private WebElement leadSettingPage;
	
	@FindBy(xpath = "//b[contains(text(),'Advanced Search')]")
	private WebElement advanceSearchPage;
	
	@FindBy(xpath = "//span[contains(text(),'Edit Custom View')]")
	private WebElement editCustomViewPage;
	
	@FindBy(xpath = "//*[@name='selected_id' and @id='36']")
	private WebElement checkBox;
	
	@FindBy(xpath = "//td[@class='layerPopupHeading']")
	private WebElement massEditPage;
	
	@FindBy(xpath = "//img[@title='Close']")
	private WebElement closeEdit;
	
	@FindBy(xpath = "//td[@class='genHeaderSmall' and contains(text(),'Select Email IDs')]")
	private WebElement selectEmailPage;
	
	@FindBy(xpath = "//div[@id='roleLay']/table/tbody/tr/td/a")
	private WebElement closeMail;

	@FindBy(xpath = "//input[@name='Select']")
	private WebElement selectEmail;
	
	@FindBy(xpath = "//input[@id='selectCurrentPageRec']/../../..")
	private WebElement leadTable;
	
	@FindBy(xpath = "//span[contains(text(),'No Lead Found !')]")
	private WebElement noLeadFound;
	
	public WebElement getNoLeadFound() {
		return noLeadFound;
	}

	public WebElement getLeadTable() {
		return leadTable;
	}

	public WebElement getSelectEmail() {
		return selectEmail;
	}
	
	public WebElement getMassEditPage() {
		return massEditPage;
	}

	public WebElement getCloseEdit() {
		return closeEdit;
	}

	public WebElement getSelectEmailPage() {
		return selectEmailPage;
	}

	public WebElement getCloseMail() {
		return closeMail;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getEditCustomViewPage() {
		return editCustomViewPage;
	}

	public WebElement getAdvanceSearchPage() {
		return advanceSearchPage;
	}

	public WebElement getLeadSettingPage() {
		return leadSettingPage;
	}

	public WebElement getShowExportLeads() {
		return showExportLeads;
	}

	public WebElement getShowImportLeads() {
		return showImportLeads;
	}

	public WebElement getShowCalculator() {
		return showCalculator;
	}

	public WebElement getShowClock() {
		return showClock;
	}

	public WebElement getMiniCalendar() {
		return miniCalendar;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCreateLeadIcon() {
		return createLeadIcon;
	}

	public WebElement getSearchInLeadsIcon() {
		return searchInLeadsIcon;
	}

	public WebElement getCalendarIcon() {
		return calendarIcon;
	}

	public WebElement getClockIcon() {
		return clockIcon;
	}

	public WebElement getCalculatorIcon() {
		return calculatorIcon;
	}

	public WebElement getLeadChatIcon() {
		return leadChatIcon;
	}

	public WebElement getImportLeadIcon() {
		return importLeadIcon;
	}

	public WebElement getExportLeadIcon() {
		return exportLeadIcon;
	}

	public WebElement getLeadSettingsIcon() {
		return leadSettingsIcon;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getSearchNowButton() {
		return searchNowButton;
	}

	public WebElement getInDropDown() {
		return inDropDown;
	}

	public WebElement getCreateFilter() {
		return createFilter;
	}

	public WebElement getEditFilter() {
		return editFilter;
	}

	public WebElement getDeleteFilter() {
		return deleteFilter;
	}

	public WebElement getFilterDropDown() {
		return filterDropDown;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public WebElement getMassEditButton() {
		return massEditButton;
	}

	public WebElement getSendMailButton() {
		return sendMailButton;
	}

	public WebElement getSendSMSButton() {
		return sendSMSButton;
	}

	public WebElement getCreateMailMergeTemplate() {
		return createMailMergeTemplate;
	}

	public WebElement getAdvanceSearch() {
		return advanceSearch;
	}

	public WebElement getRow() {
		return row;
	}
	
	
	
	
	
	
}
