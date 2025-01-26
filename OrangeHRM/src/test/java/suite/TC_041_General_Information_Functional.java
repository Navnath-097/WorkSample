package suite;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.AdminPage;
import pages.LoginPage;

public class TC_041_General_Information_Functional extends Common {
	
	@Test
	public void GeneralInformation_Functional() throws InterruptedException {
		LoginPage log=new LoginPage(d);
		AdminPage adm=new AdminPage(d);
		
		log.login("Admin", "admin123");
		adm.AdminPg.click();
		adm.OrganizationDropdownList.click();
		adm.GeneralInformation.click();
		Assert.assertTrue(d.getPageSource().contains("General Information"));
	}

}
