package Flash;

import org.testng.annotations.*;

import FunctionLibrary.Common;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.FlashSelenium;
public class FlashButton extends SeleneseTestBase{

//	public Selenium selenium;
//	private FlashSelenium flashApp;

	
	@BeforeClass
	public void setUp() throws Exception{
	/*	url="http://trunk.synergy.theorchard.com"
	    login="/alw"
	    username="synergy"
	    password="Orchard09"
	 */ 		
		selenium=Common.CsetUp();
		
	//	flashApp = new FlashSelenium(selenium,"id=upload_audio_button");
		Common.open(selenium);
	}

	@Test
	public void userLogin() throws Exception{
		System.out.println("userlogin start");
	      selenium.waitForPageToLoad("12799");
		//  Login   
		      selenium.type("css=#edit-username","recordlabel");
		      System.out.println("35");
		      selenium.type("css=#edit-password","orchard999");
		      System.out.println("37");
		      selenium.click("css=#edit-submit");
		      selenium.waitForPageToLoad("250000");
		      System.out.println("userlogin end");
		//  FlashButton
		      verifyTrue(selenium.isElementPresent("css=a[title=\"Releases in Progress\"]"));
				selenium.click("css=a[title=\"Releases in Progress\"]");
				Thread.sleep(15779);
				verifyTrue(selenium.isElementPresent("css=div.releaseInfo"));
				selenium.click("css=div.releaseInfo");
				Thread.sleep(15779);
				verifyTrue(selenium.isElementPresent("id=upload_tif_button"));
				verifyTrue(selenium.isElementPresent("id=uploadalbumartthumb"));
				verifyTrue(selenium.isElementPresent("id=upload_audio_button"));
				selenium.mouseDown("id=upload_audio_button");
				selenium.mouseUp("css=#upload_audio_button");
			    /*  System.out.println("beforeflash");
				assertTrue(flashApp.PercentLoaded()==100);
			      System.out.println("beforeflash0");
				flashApp.call("click");
			      System.out.println("beforeflash");*/
			//	FlashButton
				selenium.waitForPageToLoad( "60000");
				Boolean retry = true;
				int maxRetries = 10;
				String retVal = null;
				while( retry) {
				    try {
				        retVal = selenium.getEval( "window.callFlash('dqMovieId', 'callASElements');");
				        retry = false;
				    } catch(Exception e) {
				        System.out.println("got exception, trying again");
				        Thread.sleep( 1000);
				        if ( maxRetries-- <= 0) retry = false ;
				    }
				}
				System.out.println(retVal);
		        System.out.println("MaxRetries $maxRetries");
				Thread.sleep(157790);

	      
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
