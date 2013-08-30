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
public class Grid_AddArtist extends SeleneseTestBase{
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
	     Thread.sleep(58579);
	     System.out.println("userlogin end");
	 //  AddArtist
//	     for (int second = 0;; second++) {
//				if (second >= 60) fail("timeout");
//				try { if (selenium.isElementPresent("id=contentLeft")) break; } catch (Exception e) {}
//				Thread.sleep(1000);
//			}
	     System.out.println("userlogin end");

			Thread.sleep(3000);
//			selenium.clickAt("link=catalogue info", "");
//			selenium.waitForPageToLoad("12579");

		     System.out.println("userlogin end");
			selenium.click("//li[2]/ul/li[3]/a");
			//selenium.waitForPageToLoad("30000");
			Thread.sleep(26579);
			System.out.println("61");
			// create new artist
			// //div[@id='content']/div[2]/div[1]/div[1]/a/span = x path for button
			selenium.clickAt("//div[2]/div/div[2]/div/div/a", "");
			Thread.sleep(38579);
			System.out.println("65");
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent("createArtistModalArtistName")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}
			System.out.println("6te");
			String artist = selenium.getEval("'$a_Selenium_artist_'+(new Date().getTime())");
			String artist_name = selenium.getEval("'" + artist + "'.toLowerCase()");
			selenium.type("createArtistModalArtistName", artist_name);
			System.out.println("65");
			Thread.sleep(2000);
			selenium.select("artistCountry", "label=USA");
			selenium.type("artistZip", "32245");
			Thread.sleep(2000);
			selenium.type("similarArtists", "similar artist 1");
			Thread.sleep(2000);
			selenium.type("artistUrl", "http://www.website1.com");
			Thread.sleep(2000);
			selenium.clickAt("css=a.read_btn.pageFormBtn", "");
			Thread.sleep(26579);
			// verify artist info and links
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent("artistName")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			verifyEquals(selenium.getValue("artistName"), artist_name);
			Thread.sleep(2000);
			verifyEquals(selenium.getText("//option[@value='1']"), "USA");
			Thread.sleep(4000);
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent("artistUrl")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			Thread.sleep(4000);
			verifyEquals(selenium.getValue("artistUrl"), "http://www.website1.com");
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent("socialWebsite[0_4]")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			Thread.sleep(2000);
			verifyEquals(selenium.getText("socialWebsite[0_4]"), "");
			verifyTrue(selenium.isTextPresent("http://www.twitter.com/"));
			Thread.sleep(2000);
			verifyEquals(selenium.getText("socialWebsite[0_2]"), "");
			Thread.sleep(2000);
			verifyTrue(selenium.isTextPresent("http://www.facebook.com/"));
			Thread.sleep(2000);
			verifyEquals(selenium.getText("socialWebsite[0_3]"), "");
			Thread.sleep(2000);
			verifyTrue(selenium.isTextPresent("http://www.youtube.com/"));
			Thread.sleep(2000);
			verifyEquals(selenium.getText("socialWebsite[0_6]"), "");
			Thread.sleep(2000);
			verifyTrue(selenium.isTextPresent("http://www.myspace.com/"));
			String artist01 = selenium.getEval("'$aa_Selenium_artist_'+(new Date().getTime())");
			String artist_name02 = selenium.getEval("'" + artist01 + "'.toLowerCase()");
			selenium.type("artistName", artist_name02);
			Thread.sleep(1000);
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
			System.out.println("BeforeSaveGeneralInfo");
			selenium.clickAt("//form/a","");
			System.out.println("AftSaveGeneralInfo");
			Thread.sleep(15000);
			
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