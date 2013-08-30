package RB_Release;

import org.testng.annotations.*;

import FunctionLibrary.Common;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

public class DeleteRelease extends SeleneseTestBase{

	public Selenium selenium;
	@BeforeClass
	public void loginUser() throws Exception{
		selenium=Common.CsetUp();
		Common.open(selenium);
			}
		@Test
	public void userLogin() throws Exception{
        
		System.out.println("userlogin start");
         // Login
		 selenium.type(Common.txt_UName,"recordlabel");
	     selenium.type(Common.txt_PWord,"orchard999");
	     selenium.click(Common.btn_Submit);
	     selenium.waitForPageToLoad("25000");
	     System.out.println("userlogin end");
	  
	     // DeleteRelease
	     selenium.waitForPageToLoad("");
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isTextPresent("Release Builder")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			Thread.sleep(20000);
		//  CatalogInfoReleaseBuider
			selenium.click(Common.dd_CIRelBuilder);
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent(Common.frm_Release)) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			selenium.check(Common.chk_Release);
			Thread.sleep(4000);
			selenium.waitForPageToLoad("");
			Thread.sleep(5000);
			selenium.click(Common.lnk_DelRelease);
			Thread.sleep(5000);
			selenium.click(Common.btn_DRDelete);
			Thread.sleep(15000);
			/* for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent("css=#content>h1")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}*/
		//	logout	
			selenium.clickAt("link=Log out »", "");
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent("id=edit-username")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

	}
		@AfterClass
	    public void afterClass() {
			try {
				Common.CtearDown(selenium);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	
}
