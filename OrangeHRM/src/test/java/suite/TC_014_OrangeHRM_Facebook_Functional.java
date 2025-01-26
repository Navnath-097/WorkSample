package suite;

import java.util.Iterator;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Common;
import pages.LoginPage;

public class TC_014_OrangeHRM_Facebook_Functional extends Common {
	
	@Test
	public void Facebook_Functional() {
		LoginPage log=new LoginPage(d);
		log.Facebook.click();
		
		Set <String> handles=d.getWindowHandles();
		System.out.println(handles);
		
		Iterator <String> itr=handles.iterator();
		@SuppressWarnings("unused")
		String mainWindow=itr.next();
		String childWindow=itr.next();
		
		d.switchTo().window(childWindow);
		
		Assert.assertTrue(d.getPageSource().contains("Opensource HRIS"));
	}

}
