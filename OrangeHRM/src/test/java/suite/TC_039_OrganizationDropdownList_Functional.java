package suite;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.AdminPage;
import pages.LoginPage;

public class TC_039_OrganizationDropdownList_Functional extends Common {
	@Test
	public void OrganizationDropdownList_Functional() throws InterruptedException {
		LoginPage log=new LoginPage(d);
		AdminPage adm=new AdminPage(d);
		
		log.login("Admin", "admin123");
		adm.AdminPg.click();
		
		adm.OrganizationDropdownList.click();
		
		Assert.assertTrue(adm.GeneralInformation.isDisplayed());
		Assert.assertTrue(adm.Locations.isDisplayed());
		Assert.assertTrue(adm.Structure.isDisplayed());
	}

}
