package suite;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.AdminPage;
import pages.LoginPage;

public class TC_066_EmailSubscriptions_UI extends Common {
	
	@Test
	public void EmailSubscriptions_UI() throws InterruptedException {
		LoginPage log=new LoginPage(d);
		AdminPage adm=new AdminPage(d);
		
		log.login("Admin", "admin123");
		adm.AdminPg.click();
		adm.ConfigurationDropdownlist.click();
		
		Assert.assertTrue(adm.EmailSubscriptions.isDisplayed());
	}

}
