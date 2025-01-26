package suite;

import java.util.Iterator;
import java.util.Set;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.Common;
import pages.LoginPage;

public class TC_012_Linkdin_Functional extends Common {
	
	@Test
	public void linkedin() throws InterruptedException {
		LoginPage log=new LoginPage(d);
		log.Linkedin.click();
		
		Set <String> handles=d.getWindowHandles();
		System.out.println(handles);
		
		Iterator <String> itr=handles.iterator();
		@SuppressWarnings("unused")
		String mainWindow=itr.next();
		String childWindow=itr.next();
		
		d.switchTo().window(childWindow);
		Thread.sleep(2000);
		
		
		Assert.assertTrue(d.getPageSource().contains("Join"));
	}
}
