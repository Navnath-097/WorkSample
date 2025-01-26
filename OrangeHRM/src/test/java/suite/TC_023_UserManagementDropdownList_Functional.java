package suite;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.AdminPage;
import pages.LoginPage;

public class TC_023_UserManagementDropdownList_Functional extends Common {
	
	@Test
	public void UserManagementDropdownList_Functional() throws InterruptedException {
		LoginPage log=new LoginPage(d);
		AdminPage adm=new AdminPage(d);
		
		log.login("Admin", "admin123");
		adm.AdminPg.click();
		adm.UserManagementDropdownList.click();
		Assert.assertTrue(adm.Users.isDisplayed());
		
	}

}
