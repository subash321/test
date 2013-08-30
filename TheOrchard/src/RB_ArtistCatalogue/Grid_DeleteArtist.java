package RB_ArtistCatalogue;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import FunctionLibrary.Common;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

@Test
public class Grid_DeleteArtist extends SeleneseTestBase{
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
		
	    // Common.open(selenium);
	     // verifyTrue(selenium.getTitle().contains("Client Login | Orchard"));
	      
	     selenium.type(Common.txt_UName, "recordlabel");
	     selenium.type(Common.txt_PWord,"orchard999");
	     selenium.click(Common.btn_Submit);
	     Thread.sleep(68579);
	     System.out.println("userlogin end");
	 //  DeleteArtist
	     selenium.clickAt("link=Artist Builder", "");
			Thread.sleep(20000);
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent("id=search_artist_inputbox")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			Thread.sleep(20000);
			selenium.mouseDown("//td[5]/a/img");
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isTextPresent("Do you really want to delete this artist?")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			Thread.sleep(2000);
			selenium.clickAt("css=#yes_button > span", "");
			Thread.sleep(8000);
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent("id=search_artist_inputbox")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}
			
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