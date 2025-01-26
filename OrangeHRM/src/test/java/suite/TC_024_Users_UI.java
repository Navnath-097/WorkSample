package suite;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.AdminPage;
import pages.LoginPage;

public class TC_024_Users_UI extends Common {
	
	@Test
	public void UserManagementDropdownList_UI() throws InterruptedException {
		LoginPage log=new LoginPage(d);
		AdminPage adm=new AdminPage(d);
		
		log.login("Admin", "admin123");
		adm.AdminPg.click();
		adm.UserManagementDropdownList.click();
		Assert.assertTrue(adm.Users.isDisplayed());
		
	}

}
