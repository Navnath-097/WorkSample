package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Common;

public class PIMpage extends Common {
	
	WebDriver d;
	public PIMpage(WebDriver d) {
		this.d=d;
		PageFactory.initElements(d, this);
		
	}
	@FindBy (xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[position()=2]") public WebElement PimP;
	@FindBy (xpath="//span[text()='Configuration ']") public WebElement Configuration;
	@FindBy (xpath="//a[text()='Optional Fields']") public WebElement OptionalFields;
	@FindBy (xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']") public WebElement Profile;
	@FindBy (xpath="//a[text()='Logout']") public WebElement logoutButton;
	
	@FindBy (xpath="//a[text()='Custom Fields']") public WebElement customFields;
	@FindBy (xpath="//a[text()='Data Import']") public WebElement dataImport;
	@FindBy (xpath="//a[text()='Reporting Methods']") public WebElement reportingMethods;
	@FindBy (xpath="//a[text()='Termination Reasons']") public WebElement terminationReasons;
	
	@FindBy (xpath="//a[text()='Employee List']") public WebElement employeeList;
	@FindBy (xpath="//a[text()='Add Employee']") public WebElement addEmployee;
	@FindBy (xpath="//a[text()='Reports']") public WebElement Reports;
	
	@FindBy (xpath="//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[1]/a[1]/div[2]/img[1]") public WebElement pimLogo;
	/*@FindBy (xpath="") public WebElement ;
	@FindBy (xpath="") public WebElement ;
	@FindBy (xpath="") public WebElement ; */
	
	
	public void logout() throws InterruptedException {
		Thread.sleep(2000);
		Profile.click();
		Thread.sleep(2000);
		logoutButton.click();
	}
	

}
