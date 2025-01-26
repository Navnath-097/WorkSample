package suite;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.AdminPage;
import pages.LoginPage;

public class TC_057_Memberships_Functional extends Common {
	
	@Test
	public void Memberships_Functional() throws InterruptedException {
		LoginPage log=new LoginPage(d);
		AdminPage adm=new AdminPage(d);
		
		log.login("Admin", "admin123");
		adm.AdminPg.click();
		adm.QualificationsDropdownlist.click();
		adm.Memberships.click();
		
		Assert.assertTrue(d.getPageSource().contains("Memberships"));
	}

}
