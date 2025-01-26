package suite;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;

public class TC_001_CheckURL extends Common {
	
	@Test
	public void checkURL() throws InterruptedException {
		//d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		Assert.assertTrue(d.getPageSource().contains("Login"));
		//Assert.assertEquals("OrangeHRM", d.getTitle());
	}
}
