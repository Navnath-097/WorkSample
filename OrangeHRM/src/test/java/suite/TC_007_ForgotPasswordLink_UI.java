package suite;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.LoginPage;

public class TC_007_ForgotPasswordLink_UI extends Common {
	
	@Test
	public void ForgotPasswordLink_UI() {
		LoginPage log=new LoginPage(d);
		Assert.assertTrue(log.ForgotPasswordLink.isDisplayed());
	}

}
