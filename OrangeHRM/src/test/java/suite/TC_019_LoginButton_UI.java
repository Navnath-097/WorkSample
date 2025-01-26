package suite;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.LoginPage;

public class TC_019_LoginButton_UI extends Common {
	
	@Test
	public void LoginButton_UI() {
		LoginPage log=new LoginPage(d);
		Assert.assertTrue(log.LoginButton.isDisplayed());
	}

}
