package suite;

import java.util.Iterator;
import java.util.Set;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.Common;
import pages.LoginPage;

public class TC_010_CheckFooterLink_Functional extends Common {
	
	@Test
	public void checkLogo() throws InterruptedException {
		LoginPage log=new LoginPage(d);
		log.FooterLink.click();
		Thread.sleep(2000);
		
		Set <String> handles=d.getWindowHandles();
		
		Iterator <String> itr=handles.iterator();
		
		@SuppressWarnings("unused")
		String firstWindow=itr.next();
		String secondWindow=itr.next();
		
		d.switchTo().window(secondWindow);
		Thread.sleep(3000);
		
		Assert.assertTrue(d.getPageSource().contains("Peace of mind is just a few clicks away!"));
	}

}
