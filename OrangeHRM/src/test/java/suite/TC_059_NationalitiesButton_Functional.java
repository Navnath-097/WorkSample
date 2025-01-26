package suite;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.AdminPage;
import pages.LoginPage;

public class TC_059_NationalitiesButton_Functional extends Common {
	@Test
	public void NationalitiesButton_Functional() throws InterruptedException {
		LoginPage log=new LoginPage(d);
		AdminPage adm=new AdminPage(d);
		
		log.login("Admin", "admin123");
		adm.AdminPg.click();
		
		adm.NationalitiesButton.click();
		
		Assert.assertTrue(d.getPageSource().contains("Nationalities"));
	}

}
