package suite;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.LoginPage;

public class TC_013_OrangeHRM_Facebook_UI extends Common {
	
	@Test
	public void Facebook_UI() {
		LoginPage log=new LoginPage(d);
		Assert.assertTrue(log.Facebook.isDisplayed());
	}

}
