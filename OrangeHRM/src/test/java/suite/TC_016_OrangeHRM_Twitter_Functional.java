package suite;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.LoginPage;

public class TC_016_OrangeHRM_Twitter_Functional extends Common {
	
	@Test
	public void Twitter_Functional() throws InterruptedException {
		LoginPage log=new LoginPage(d);
		log.Twitter.click();
		
		Set <String> handles=d.getWindowHandles();
		System.out.println(handles);
		
		Iterator <String> itr=handles.iterator();
		@SuppressWarnings("unused")
		String mainWindow=itr.next();
		String childWindow=itr.next();
		
		d.switchTo().window(childWindow);
		
		Thread.sleep(6000);
		
		Assert.assertTrue(d.getPageSource().contains("OrangeHRM"));
	}

}
