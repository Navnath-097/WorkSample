package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Common;

public class AdminPage extends Common {
	WebDriver d;
	public AdminPage(WebDriver d) {
		this.d=d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy (xpath="//span[text()='Admin']") public WebElement AdminPg;
	@FindBy (xpath="//span[text()='User Management ']") public WebElement UserManagementDropdownList;
	@FindBy (xpath="//a[text()='Users']") public WebElement Users;
	
	@FindBy (xpath="//span[text()='Job ']") public WebElement JobDropdownList;
	@FindBy (xpath="//a[text()='Job Titles']") public WebElement JobTitles;
	@FindBy (xpath="//a[text()='Pay Grades']") public WebElement PayGrades;
	@FindBy (xpath="//a[text()='Employment Status']") public WebElement EmploymentStatus;
	@FindBy (xpath="//a[text()='Job Categories']") public WebElement JobCategories;
	@FindBy (xpath="//a[text()='Work Shifts']") public WebElement WorkShifts;
	
	@FindBy (xpath="//header/div[2]/nav[1]/ul[1]/li[3]") public WebElement OrganizationDropdownList;
	@FindBy (xpath="//a[contains(text(),'General Information')]") public WebElement GeneralInformation;
	@FindBy (xpath="//a[contains(text(),'Locations')]") public WebElement Locations;
	@FindBy (xpath="//a[contains(text(),'Structure')]") public WebElement Structure;
	
	
	@FindBy (xpath="//header/div[2]/nav[1]/ul[1]/li[4]/span[1]") public WebElement QualificationsDropdownlist;
	@FindBy (xpath="//a[contains(text(),'Skills')]") public WebElement Skills;
	@FindBy (xpath="//a[contains(text(),'Education')]") public WebElement Education;
	@FindBy (xpath="//a[contains(text(),'Licenses')]") public WebElement Licenses;
	@FindBy (xpath="//a[contains(text(),'Languages')]") public WebElement Languages;
	@FindBy (xpath="//a[contains(text(),'Memberships')]") public WebElement Memberships;
	
	
	@FindBy (xpath="//a[contains(text(),'Nationalities')]") public WebElement NationalitiesButton;
	@FindBy (xpath="//a[contains(text(),'Corporate Branding')]") public WebElement CorporateBrandingButton;
	
	
	 @FindBy (xpath="//header/div[2]/nav[1]/ul[1]/li[7]/span[1]") public WebElement ConfigurationDropdownlist;
	 @FindBy (xpath="//a[contains(text(),'Email Configuration')]") public WebElement EmailConfiguration;
	 @FindBy (xpath="//a[contains(text(),'Email Subscriptions')]") public WebElement EmailSubscriptions;
	 @FindBy (xpath="//a[contains(text(),'Localization')]") public WebElement Localization;
	 @FindBy (xpath="//a[contains(text(),'Language Packages')]") public WebElement LanguagePackages;
	 @FindBy (xpath="//a[contains(text(),'Modules')]") public WebElement Modules;
	 @FindBy (xpath="//a[contains(text(),'Social Media Authentication')]") public WebElement SocialMediaAuthentication;
	 @FindBy (xpath="//a[contains(text(),'Register OAuth Client')]") public WebElement RegisterOAuthClient;
	 @FindBy (xpath="//a[contains(text(),'LDAP Configuration')]") public WebElement LDAP_Configuration;

}
