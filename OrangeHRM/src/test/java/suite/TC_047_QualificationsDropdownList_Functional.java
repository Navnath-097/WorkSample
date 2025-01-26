package suite;


import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.AdminPage;
import pages.LoginPage;

public class TC_047_QualificationsDropdownList_Functional extends Common {
	@Test
	public void QualificationsDropdownList_Functional() throws InterruptedException {
		LoginPage log=new LoginPage(d);
		AdminPage adm=new AdminPage(d);
		
		log.login("Admin", "admin123");
		adm.AdminPg.click();
		
		adm.QualificationsDropdownlist.click();
		
		Assert.assertTrue(adm.Skills.isDisplayed());
		Assert.assertTrue(adm.Education.isDisplayed());
		Assert.assertTrue(adm.Licenses.isDisplayed());
		Assert.assertTrue(adm.Languages.isDisplayed());
		Assert.assertTrue(adm.Memberships.isDisplayed());
	}

}
