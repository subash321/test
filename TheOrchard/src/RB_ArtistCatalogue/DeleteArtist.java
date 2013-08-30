package RB_ArtistCatalogue;

import org.testng.annotations.*;

import FunctionLibrary.Common;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

public class DeleteArtist extends SeleneseTestBase{

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
