package suite;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.AdminPage;
import pages.LoginPage;

public class TC_058_NationalitiesButton_UI extends Common {
	@Test
	public void NationalitiesButton_UI() throws InterruptedException {
		LoginPage log=new LoginPage(d);
		AdminPage adm=new AdminPage(d);
		
		log.login("Admin", "admin123");
		adm.AdminPg.click();
		
		Assert.assertTrue(adm.NationalitiesButton.isDisplayed());
	}

}
