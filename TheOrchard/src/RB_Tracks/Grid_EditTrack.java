package RB_Tracks;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import FunctionLibrary.Common;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

@Test
public class Grid_EditTrack extends SeleneseTestBase{
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
	      Thread.sleep(62579);
	      System.out.println("userlogin end");
	      selenium.open("alw/releasebuilder/view?release_id=262854");
	      Thread.sleep(26579);
			selenium.click("css=a > img");
			Thread.sleep(10000);
			selenium.select("id=edittrackmodal_trackLanguage", "label=Italian");
			selenium.type("id=edittrackmodal_trackName", "my fav");
			selenium.click("css=#edittrackmodal_trackfeaturingartists_container > ul.token-input-list");
			selenium.type("id=track_level_feature_artist_token_box", "hari");
			selenium.click("id=track_level_remixer_token_box");
			selenium.type("id=track_level_remixer_token_box", "pop");
			selenium.click("id=edittrackmodal_explicit_Y");
			selenium.click("id=edittrackmodal_third_party_publisher_N");
			selenium.type("id=edittrackmodal_pline", "1990ABC Company");
			selenium.click("id=writer_token_box");
			selenium.click("id=publisher_token_box");
			selenium.click("id=save_and_close_button");
			selenium.type("id=edittrackmodal_pline", "2009 Company Name");
			selenium.click("id=save_and_close_button");
			System.out.println("152");
	     
        try {
            Thread.sleep(24579);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }   
}