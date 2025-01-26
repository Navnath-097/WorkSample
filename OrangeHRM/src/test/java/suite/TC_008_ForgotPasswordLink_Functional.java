package suite;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.LoginPage;

public class TC_008_ForgotPasswordLink_Functional extends Common {
	
	@Test
	public void checkLogo() throws InterruptedException {
		LoginPage log=new LoginPage(d);
		log.ForgotPasswordLink.click();
		Thread.sleep(2000);
		Assert.assertTrue(d.getPageSource().contains("Reset Password"));
	}

}
