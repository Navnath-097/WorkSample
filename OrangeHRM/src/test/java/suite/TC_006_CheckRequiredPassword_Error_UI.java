package suite;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.LoginPage;

public class TC_006_CheckRequiredPassword_Error_UI extends Common {
	
	@Test
	public void checkLogin2() throws InterruptedException {
		LoginPage log=new LoginPage(d);
		log.login("Admin", " ");
		Thread.sleep(2000);
		Assert.assertTrue(d.getPageSource().contains("Required"));
	}

}
