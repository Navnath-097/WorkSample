package suite;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.LoginPage;

public class TC_021_LoginWithValid_Functional extends Common {
	
	@Test
	public void LoginWithValid_Functional() throws InterruptedException {
		LoginPage log=new LoginPage(d);
		log.login("Admin", "admin123");
		Assert.assertTrue(d.getPageSource().contains("PIM"));
	}

}
