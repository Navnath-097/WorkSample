package suite;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.LoginPage;

public class TC_015_OrangeHRM_Twitter_UI extends Common {
	
	@Test
	public void Twitter_UI() {
		LoginPage log=new LoginPage(d);
		Assert.assertTrue(log.Twitter.isDisplayed());
	}

}
