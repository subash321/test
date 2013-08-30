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
public class Grid_EditArtist extends SeleneseTestBase{
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
    selenium.type(Common.txt_UName,"recordlabel");
    selenium.type(Common.txt_PWord,"orchard999");
    selenium.click(Common.btn_Submit);
	Thread.sleep(28579);
	//selenium.waitForPageToLoad("68579");
    System.out.println("userlogin end");	 //  EditArtist
//	        selenium.clickAt("link=catalogue info", "");
			selenium.click("link=Artist Builder");
			Thread.sleep(28579);
		    System.out.println("52");
			verifyTrue(selenium.isElementPresent("//td[2]/a"));			
			selenium.open("alw/artistinfo/index/artist_id/200803");
		    System.out.println("56");
			Thread.sleep(32579);
			selenium.select("artistCountry", "label=United Kingdom");
			selenium.type("similarArtists", "similar artist 2");
			Thread.sleep(2000);
			selenium.type("artistUrl", "http://www.website2.com");
			Thread.sleep(2000);
			selenium.type("socialWebsite[0_6]", "myspace2");
			Thread.sleep(2000);
			selenium.type("socialWebsite[0_4]", "twitter2");
			Thread.sleep(2000);
			selenium.type("socialWebsite[0_2]", "facebook2");
			Thread.sleep(2000);
			selenium.type("socialWebsite[0_3]", "youtube2");
			Thread.sleep(2000);
			verifyTrue(selenium.isElementPresent("css=a.read_btn.pageFormBtn"));
			selenium.clickAt("//form[@id='edit_artist_form']/a", "");
			// verify updated artist info and links
			verifyTrue(selenium.isElementPresent("//td[2]/a"));
			verifyTrue(selenium.isTextPresent("United Kingdom"));
			verifyEquals(selenium.getValue("similarArtists"), "similar artist 2");
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent("artistUrl")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			verifyEquals(selenium.getValue("artistUrl"), "http://www.website2.com");
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent("socialWebsite[0_4]")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			verifyEquals(selenium.getValue("socialWebsite[0_4]"), "twitter2");
			Thread.sleep(2000);
			verifyEquals(selenium.getValue("socialWebsite[0_2]"), "facebook2");
			Thread.sleep(2000);
			verifyEquals(selenium.getValue("socialWebsite[0_3]"), "youtube2");
			Thread.sleep(2000);
			verifyEquals(selenium.getValue("socialWebsite[0_6]"), "myspace2");
			 System.out.println("end if");
			 
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