package suite;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.AdminPage;
import pages.LoginPage;

public class TC_063_ConfigurationDropdownList_Functional extends Common {
	@Test
	public void ConfigurationDropdownList_Functional() throws InterruptedException {
		LoginPage log=new LoginPage(d);
		AdminPage adm=new AdminPage(d);
		
		log.login("Admin", "admin123");
		adm.AdminPg.click();
		
		adm.ConfigurationDropdownlist.click();
		
		Assert.assertTrue(adm.EmailConfiguration.isDisplayed());
		Assert.assertTrue(adm.EmailSubscriptions.isDisplayed());
		Assert.assertTrue(adm.Localization.isDisplayed());
		Assert.assertTrue(adm.LanguagePackages.isDisplayed());
		Assert.assertTrue(adm.Modules.isDisplayed());
		Assert.assertTrue(adm.SocialMediaAuthentication.isDisplayed());
		Assert.assertTrue(adm.RegisterOAuthClient.isDisplayed());
		Assert.assertTrue(adm.LDAP_Configuration.isDisplayed());
	}

}
