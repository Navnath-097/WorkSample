package suite;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.LoginPage;

public class TC_002_CheckLogo extends Common {
	
	@Test
	public void checkLogo() throws InterruptedException {
		LoginPage log=new LoginPage(d);
		Assert.assertTrue(log.Logo.isDisplayed());
	}

}
