package suite;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.LoginPage;

public class TC_011_Linkedin_UI extends Common {
	
	@Test
	public void LinkedIn_UI() {
		LoginPage log=new LoginPage(d);
		Assert.assertTrue(log.Linkedin.isDisplayed());
	}

}
