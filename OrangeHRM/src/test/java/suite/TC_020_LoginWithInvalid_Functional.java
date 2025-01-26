package suite;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.LoginPage;

public class TC_020_LoginWithInvalid_Functional extends Common {
	
	@Test
	public void LoginWithInvalid_Functional() throws InterruptedException {
		LoginPage log=new LoginPage(d);
		log.login("Random", "random@123");
		Assert.assertTrue(d.getPageSource().contains("Invalid credentials"));
	}

}
