package suite;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.LoginPage;

public class TC_018_OrangeHRM_YouTube_Functional extends Common {
	
	@Test
	public void YouTube_Functional() {
		LoginPage log=new LoginPage(d);
		log.YouTube.click();
		
		Set <String> handles=d.getWindowHandles();
		System.out.println(handles);
		
		Iterator <String> itr=handles.iterator();
		@SuppressWarnings("unused")
		String mainWindow=itr.next();
		String childWindow=itr.next();
		
		d.switchTo().window(childWindow);
		
		Assert.assertTrue(d.getPageSource().contains("OrangeHRM Inc"));
	}

}
