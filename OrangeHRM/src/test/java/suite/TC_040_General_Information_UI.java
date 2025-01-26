package suite;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.AdminPage;
import pages.LoginPage;

public class TC_040_General_Information_UI extends Common {
	
	@Test
	public void GeneralInformation_UI() throws InterruptedException {
		LoginPage log=new LoginPage(d);
		AdminPage adm=new AdminPage(d);
		
		log.login("Admin", "admin123");
		adm.AdminPg.click();
		adm.OrganizationDropdownList.click();
		
		Assert.assertTrue(adm.GeneralInformation.isDisplayed());
	}

}
