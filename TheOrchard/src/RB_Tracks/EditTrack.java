package RB_Tracks;

import org.testng.annotations.*;
import com.thoughtworks.selenium.FlashSelenium;
import FunctionLibrary.Common;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

@Test
public class EditTrack extends SeleneseTestBase{

	public Selenium selenium;
	@BeforeClass
	public void loginUser() throws Exception{
		selenium=Common.CsetUp();
		Common.open(selenium);
			}
		public void userLogin() throws Exception{
        
		System.out.println("userlogin start");
         
    
      //  Login   
	      selenium.type(Common.txt_UName,"recordlabel");
	      selenium.type(Common.txt_PWord,"orchard999");
	      selenium.click(Common.btn_Submit);
	      selenium.waitForPageToLoad("250000");
	      System.out.println("userlogin end");
	   // Open URL of the unbound
	      selenium.open(Common.url_Open);
	   // ViewRelease   
	      Thread.sleep(15000);
			verifyTrue(selenium.isElementPresent("link=Release Builder"));
			selenium.click("link=Release Builder");
			Thread.sleep(18000);
			selenium.click("id=search_release_inputbox");
			selenium.type("id=search_release_inputbox", "Wuthering Heights");
			selenium.click("id=search_release_inputbox");
			Thread.sleep(6000);
			selenium.click("css=li.ac_even");
			Thread.sleep(15000);
			
		// 	UpdateRelease
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent("//tbody[@id='releasebuilder_tracks']/tr[1]/td[10]/a/img")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			selenium.click("css=a > img");
			Thread.sleep(18500);
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent("css=#modalWindow>h1")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			Thread.sleep(2000);
			selenium.click("css=option[value=\"MAR\"]");
			selenium.select("id=edittrackmodal_trackLanguage", "label=Marathi");
			Thread.sleep(2000);
			String trackname = selenium.getEval("'Selenium_Track Name_'+(new Date().getTime())");
			selenium.type("id=edittrackmodal_trackName", selenium.getEval("'" + trackname + "'.toLowerCase()"));
			Thread.sleep(1000);
			selenium.setCursorPosition("//input[@id='track_level_feature_artist_token_box']", "0");
			String featurename = selenium.getEval("'Feature_'+(new Date().getTime())");
			selenium.type("//input[@id='track_level_feature_artist_token_box']", selenium.getEval("'" + featurename + "'.toLowerCase()"));
			selenium.keyPress("//input[@id='track_level_feature_artist_token_box']", "\\13");
			verifyTrue(selenium.isElementPresent("xpath=(//div[@id='content'])[2]"));
			selenium.click("xpath=(//div[@id='content'])[2]");
			selenium.type("edittrackmodal_trackLevelFeaturingArtists", selenium.getEval("'" + featurename + "'.toLowerCase()"));
			Thread.sleep(1000);
			selenium.setCursorPosition("//input[@id='track_level_remixer_token_box']", "0");
			String remixername = selenium.getEval("'Remixer_'+(new Date().getTime())");
			selenium.type("//input[@id='track_level_remixer_token_box']", selenium.getEval("'" + remixername + "'.toLowerCase()"));
			selenium.keyPress("//input[@id='track_level_remixer_token_box']", "\\13");
			Thread.sleep(1000);
			selenium.click("id=edittrackmodal_explicit_Y");
			Thread.sleep(1000);
			selenium.click("id=edittrackmodal_third_party_publisher_Y");
			Thread.sleep(1000);
			selenium.click("id=edittrackmodal_pline");
			selenium.type("id=edittrackmodal_pline", "2011 Red");
			Thread.sleep(1000);
			selenium.setCursorPosition("//input[@id='writer_token_box']", "0");
			String writername = selenium.getEval("'Writer_'+(new Date().getTime())");
			selenium.type("//input[@id='writer_token_box']", selenium.getEval("'" + writername + "'.toLowerCase()"));
			selenium.keyPress("//input[@id='writer_token_box']", "\\13");
			selenium.type("edittrackmodal_writers", selenium.getEval("'" + writername + "'.toLowerCase()"));
			Thread.sleep(1000);
			selenium.setCursorPosition("//input[@id='publisher_token_box']", "0");
			String publishername = selenium.getEval("'Publisher_'+(new Date().getTime())");
			selenium.type("//input[@id='publisher_token_box']", selenium.getEval("'" + publishername + "'.toLowerCase()"));
			selenium.keyPress("//input[@id='publisher_token_box']", "\\13");
			Thread.sleep(18000);
			selenium.click("css=#save_and_close_button > span");
			verifyEquals(selenium.getText("css=div.uploadAudio > h3.text-left.roundedsubheader"), "Tracks");
			verifyTrue(selenium.isElementPresent("id=edit_release_basics_button"));
			verifyEquals(selenium.getText("id=edit_release_basics_button"), "Edit Release Basics");
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent("id=edit_release_basics_button")) break; } catch (Exception e) {}
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
