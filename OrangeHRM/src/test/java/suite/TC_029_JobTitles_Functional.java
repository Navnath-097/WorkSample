package suite;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.AdminPage;
import pages.LoginPage;

public class TC_029_JobTitles_Functional extends Common {
	
	@Test
	public void JobTitles_Functionals() throws InterruptedException {
		LoginPage log=new LoginPage(d);
		AdminPage adm=new AdminPage(d);
		
		log.login("Admin", "admin123");
		adm.AdminPg.click();
		
		adm.JobDropdownList.click();
		adm.JobTitles.click();
		
		Assert.assertTrue(d.getPageSource().contains("Job Titles"));
	}

}
