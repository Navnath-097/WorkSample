package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Common {
	
	public WebDriver d;
	
	@Parameters("browser")
	@BeforeMethod
	public void launchBrowser(String browser) throws InterruptedException {
		
		
		
		if(browser.equals("CH")) {
			/*ChromeOptions copt=new ChromeOptions();
			copt.addArguments("--remote-allow-origins=*");
			d=new ChromeDriver(copt);*/
			d=new ChromeDriver();
		}
		else if(browser.equals("FF")) {
			d=new FirefoxDriver();
		}
		else if(browser.equals("ED")) {
			d = new EdgeDriver();
			
		}
		
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		d.quit();
	}

}
