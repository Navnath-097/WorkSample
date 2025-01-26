package suite;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.AdminPage;
import pages.LoginPage;

public class TC_051_Education_Functional extends Common {
	
	@Test
	public void Education_Functional() throws InterruptedException {
		LoginPage log=new LoginPage(d);
		AdminPage adm=new AdminPage(d);
		
		log.login("Admin", "admin123");
		adm.AdminPg.click();
		adm.QualificationsDropdownlist.click();
		adm.Education.click();
		
		Assert.assertTrue(d.getPageSource().contains("Education"));
	}

}
