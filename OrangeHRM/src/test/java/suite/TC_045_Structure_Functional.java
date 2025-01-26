package suite;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.AdminPage;
import pages.LoginPage;

public class TC_045_Structure_Functional extends Common {
	
	@Test
	public void Structure_Functional() throws InterruptedException {
		LoginPage log=new LoginPage(d);
		AdminPage adm=new AdminPage(d);
		
		log.login("Admin", "admin123");
		adm.AdminPg.click();
		adm.OrganizationDropdownList.click();
		adm.Structure.click();
		
		Assert.assertTrue(d.getPageSource().contains("Structure"));
	}

}
