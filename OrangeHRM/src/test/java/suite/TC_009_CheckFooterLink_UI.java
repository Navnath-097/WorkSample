package suite;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.LoginPage;

public class TC_009_CheckFooterLink_UI extends Common {
	
	@Test
	public void FooterLink_UI() {
		LoginPage log=new LoginPage(d);
		Assert.assertTrue(log.FooterLink.isDisplayed());
	}

}
