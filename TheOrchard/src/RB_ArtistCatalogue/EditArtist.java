package RB_ArtistCatalogue;

import org.testng.annotations.*;

import FunctionLibrary.Common;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

public class EditArtist extends SeleneseTestBase{

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
	 //  EditArtist
	     Thread.sleep(2000);
			Thread.sleep(2000);
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent("id=contentLeft")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			Thread.sleep(2000);
			Thread.sleep(3000);
			selenium.clickAt("link=catalogue info", "");
			verifyTrue(selenium.isElementPresent("css=a[title=\"Artist Builder\"]"));
			selenium.click("css=a[title=\"Artist Builder\"]");
			Thread.sleep(13000);
			verifyTrue(selenium.isElementPresent("//tr[@id='artistlist_200405']/td[2]"));
			selenium.click("//tr[@id='artistlist_200405']/td[2]");
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if ("Save General Information".equals(selenium.getText("css=a.rounded.pageFormBtn > span"))) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if ("40% complete".equals(selenium.getText("css=div.artistProfileWrap"))) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if ("Social Profiles".equals(selenium.getText("//div[@id='artistFormWrap']/h3[2]"))) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			verifyTrue(selenium.isElementPresent("css=a.rounded.pageFormBtn > span"));
			String artist = selenium.getEval("'$aa_Selenium_artist_'+(new Date().getTime())");
			String artist_name = selenium.getEval("'" + artist + "'.toLowerCase()");
			selenium.type("artistName", artist_name);
			Thread.sleep(2000);
			selenium.select("artistCountry", "label=United Kingdom");
			Thread.sleep(2000);
			verifyTrue(selenium.isElementPresent("id=artistZip"));
			selenium.type("id=artistZip", "234234234");
			selenium.type("artistUrl", "http://www.website2.com");
			selenium.type("similarArtists", "similar artist 2");
			Thread.sleep(2000);
			selenium.type("socialWebsite[0_4]", "twitter2");
			Thread.sleep(2000);
			selenium.type("socialWebsite[0_2]", "facebook2");
			Thread.sleep(2000);
			selenium.type("socialWebsite[0_3]", "youtube2");
			Thread.sleep(2000);
			selenium.type("socialWebsite[0_6]", "myspace2");
			Thread.sleep(2000);
			selenium.clickAt("//form[@id='edit_artist_form']/a/span", "");
			// verify updated artist info and links
			verifyEquals(selenium.getValue("artistName"), artist_name);
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
			selenium.click("css=a.rounded.pageFormBtn > span");
			System.out.println("TestEndIf");
			Thread.sleep(2000);

			

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
