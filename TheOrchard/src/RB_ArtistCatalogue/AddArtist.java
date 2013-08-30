package RB_ArtistCatalogue;

import org.testng.annotations.*;

import FunctionLibrary.Common;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

public class AddArtist extends SeleneseTestBase{

	public Selenium selenium;
	
	
	@BeforeClass
	public void loginUser() throws Exception{
		selenium=Common.CsetUp();
		Common.open(selenium);
/*		selenium = new DefaultSelenium("localhost",4444,"iexplore","http://trunk.synergy.theorchard.com/");
		System.out.println("selenium start");
		System.out.println("selenium return");
		selenium.start();
		System.out.println("selenium start");
				selenium.open("/alw");
*/		
		}

	@Test
	public void userLogin() throws Exception{
		System.out.println("userlogin start");
		
	    // Common.open(selenium);
	     // verifyTrue(selenium.getTitle().contains("Client Login | Orchard"));
	      
	     selenium.type(Common.txt_UName, "recordlabel");
	     selenium.type(Common.txt_PWord,"orchard999");
	     selenium.click(Common.btn_Submit);
	     selenium.waitForPageToLoad("250000");
	     System.out.println("userlogin end");
	 //  AddArtist
	     for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent("id=contentLeft")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			Thread.sleep(3000);
			selenium.clickAt("link=catalogue info", "");
			selenium.click("link=Artist Builder");
			selenium.waitForPageToLoad("30000");
			Thread.sleep(13000);
			// create new artist
			// //div[@id='content']/div[2]/div[1]/div[1]/a/span = x path for button
			selenium.clickAt("link=Create a New Artist", "");
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
			selenium.clickAt("//form[@id='edit_artist_form']/a/span", "");
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
			selenium.clickAt("css=a.rounded.pageFormBtn > span", "");
			System.out.println("AftSaveGeneralInfo");
			Thread.sleep(15000);
			

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
