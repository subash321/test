package RB_Release;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import FunctionLibrary.Common;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

@Test
public class Grid_DeleteRelease extends SeleneseTestBase{
    Selenium selenium;

    @BeforeClass	
    @Parameters({ "selenium.host","selenium.port","selenium.browser","selenium.url" })
    public void beforeClass(String host, String port, String browser, String url) {
        this.selenium = new DefaultSelenium(host, Integer.parseInt(port),
                browser, url);
        this.selenium.start();
        this.selenium.open("/client/login");
        this.selenium.windowMaximize();
        System.out.println("Test Begins");
    }

    @AfterClass
    public void afterClass() {
        this.selenium.close();
        this.selenium.stop();

    }

    @Parameters({ "searchCriteria" })
    public void testGoogleSearch(String criteria) throws Exception {
		System.out.println("userlogin start");
        // Login
		 selenium.type(Common.txt_UName,"recordlabel");
	     selenium.type(Common.txt_PWord,"orchard999");
	     selenium.click(Common.btn_Submit);
	     Thread.sleep(48579);
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
			Thread.sleep(68579);
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
	     
        try {
            Thread.sleep(24579);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }   
}