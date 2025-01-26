package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Common;

public class LoginPage extends Common {
	
	WebDriver d;
	public LoginPage(WebDriver d) {
		this.d=d;
		PageFactory.initElements(d, this);
		
	}
	@FindBy (xpath="//input[@name='username']") public WebElement Username;
	@FindBy (xpath="//input[@name='password']") public WebElement Password;
	@FindBy (xpath=" //button[text()=' Login ']") public WebElement LoginButton;
	@FindBy (xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/h5[1]") public WebElement LoginTitle;
	
	@FindBy (xpath="//img[@alt='company-branding']") public WebElement Logo;
	@FindBy (xpath="//p[text()='Forgot your password? ']") public WebElement ForgotPasswordLink;
	@FindBy (xpath="//a[text()='OrangeHRM, Inc']") public WebElement FooterLink;
	
	@FindBy (xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/a[1]/*[1]") public WebElement Linkedin;
	@FindBy (xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/a[2]/*[1]") public WebElement Facebook;
	@FindBy (xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/a[3]/*[1]") public WebElement Twitter;
	@FindBy (xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/a[4]/*[1]") public WebElement YouTube;
	
	
	
	public void login(String user, String pwd) throws InterruptedException {
		Username.sendKeys(user);
		Thread.sleep(2000);
		Password.sendKeys(pwd);
		Thread.sleep(2000);
		LoginButton.click();
	}
}
