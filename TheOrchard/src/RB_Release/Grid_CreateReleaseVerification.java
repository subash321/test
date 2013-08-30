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
public class Grid_CreateReleaseVerification extends SeleneseTestBase{
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
	      //  Login   
	      selenium.type(Common.txt_UName,"recordlabel");
	      selenium.type(Common.txt_PWord,"orchard999");
	      selenium.click(Common.btn_Submit);
	      Thread.sleep(128579);	
	      System.out.println("userlogin end");
	   //  AudioReleaseSingle 
	     for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent(Common.dd_ASingle)){
				      System.out.println("ElementPresent");
					   break; } 
				} catch (Exception e) {}
				Thread.sleep(1000);
			}
			selenium.clickAt(Common.dd_ASingle,"10");
		      System.out.println("AudioReleaseClick");
/*			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent(Common.msg_CRelease)) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}*/

			Thread.sleep(26579);
   
   
   System.out.println("45");
		Thread.sleep(1000);
		selenium.click(Common.dd_ASingle);
/*			for (int second = 0;; second++) {
			if (second >= 600) fail("timeout");
			try { if (selenium.isElementPresent(Common.btn_CRelease))
			{  System.out.println("CReleaseButtonPresent");
				break;} } catch (Exception e) {}
						
			Thread.sleep(1000);
		}*/
	 System.out.println("ButtonRelease"+Common.btn_CRelease);
   selenium.click("css=#saveRelease");
// MetaLanguage
   System.out.println("AfterButtonCReleaseClick");
   verifyEquals(selenium.getText(Common.lb_MtLanguage),Common.msg_MtLanguage);
   System.out.println(Common.msg_MtLanguage);

// ReleaseName
   verifyEquals(selenium.getText(Common.lb_RelName),Common.msg_RelName);
   System.out.println(Common.msg_RelName);
// OrchardArtist
   verifyEquals(selenium.getText(Common.lb_OArtist),Common.msg_OArtist);
   System.out.println(Common.msg_OArtist);
// PrimaryArtist
   verifyEquals(selenium.getText(Common.lb_PArtist),Common.msg_PArtist);
   System.out.println(Common.msg_PArtist);
// ReleaseDate
   verifyEquals(selenium.getText(Common.lb_RelDate),Common.msg_RelDate);
   System.out.println(Common.msg_RelDate);
// SalesDate
   verifyEquals(selenium.getText(Common.lb_SDate),Common.msg_SDate);
   System.out.println(Common.msg_SDate);
// Imprint
   verifyEquals(selenium.getText(Common.lb_Imprint),Common.msg_Imprint);
   System.out.println(Common.msg_Imprint);
// Genre
   verifyEquals(selenium.getText(Common.lb_Genre),Common.msg_Genre);
   System.out.println(Common.msg_Genre);
//	logout	
		selenium.clickAt("link=Log out »", "");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=edit-username")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
		Thread.sleep(12579);
	     
        try {
            Thread.sleep(24579);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }   
}