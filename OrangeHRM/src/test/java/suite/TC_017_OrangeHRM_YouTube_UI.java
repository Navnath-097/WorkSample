package suite;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.LoginPage;

public class TC_017_OrangeHRM_YouTube_UI extends Common {
	
	
	@Test
	public void YouTube_UI() {
		LoginPage log=new LoginPage(d);
		Assert.assertTrue(log.YouTube.isDisplayed());
	}

}
