package RB_ReleaseArtist;

import org.testng.annotations.*;

import FunctionLibrary.Common;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

public class CreateArtistFromAudioRelease extends SeleneseTestBase{

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
	     selenium.type(Common.txt_PWord, "orchard999");
	     selenium.clickAt("id=edit-submit", "");
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent("id=contentLeft")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			Thread.sleep(30000);

	 //  CreateArtistFromAudioRelease 
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent("id=contentLeft")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			selenium.click("//ul[@id='dropdown']/li");
			Thread.sleep(12579);
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent("css=#modalWindow > h1")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			selenium.mouseDown("//li[@id='createReleaseArtistName_li']/a");
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent("css=#modal_overlaynewArtistModal > #modalWindow > h1")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			String artist = selenium.getEval("'Selenium_artist_'+(new Date().getTime())");
			String artist_name = selenium.getEval("'" + artist + "'.toLowerCase()");
			selenium.type("id=createArtistModalArtistName", artist_name);
			Thread.sleep(2000);
			selenium.select("id=artistCountry", "label=Spain");
			Thread.sleep(2000);
			selenium.type("id=artistZip", "1234567");
			Thread.sleep(2000);
			selenium.type("id=artistUrl", "http://www.website.com");
			Thread.sleep(2000);
			selenium.type("id=tinymce", "Hi.... \n	This Is My Biography..!!");
			Thread.sleep(2000);
			selenium.type("id=similarArtists", "Artist1, Artist2");
			Thread.sleep(2000);
			selenium.mouseDown("//form[@id='edit_artist_form']/a");
			Thread.sleep(12579);
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent("css=#modal_overlaynewArtistModal > #modalWindow > h1")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			verifyTrue(selenium.isElementPresent("id=artistName"));
			String label = selenium.getSelectedLabel("id=artistName");
			System.out.println(label);
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent("css=#modalWindow > h1")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent("id=artistName")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			Thread.sleep(10000);
			assertEquals(selenium.getSelectedLabel("id=artistName"), artist_name);

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
