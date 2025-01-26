package suite;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.LoginPage;

public class TC_003_Login_text_UI extends Common{
	
	@Test
	public void LoginText_UI() {
		LoginPage log=new LoginPage(d);
		Assert.assertTrue(log.LoginTitle.isDisplayed());
	}

}
