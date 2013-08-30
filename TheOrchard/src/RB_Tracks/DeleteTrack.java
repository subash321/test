package RB_Tracks;

import org.testng.annotations.*;
import com.thoughtworks.selenium.FlashSelenium;
import FunctionLibrary.Common;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

@Test
public class DeleteTrack extends SeleneseTestBase{

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
	      selenium.type(Common.txt_PWord,"123456");
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
			
		// 	DeleteRelease
			Thread.sleep(10000);
			selenium.mouseDownAt("//tbody[@id='releasebuilder_tracks']/tr[1]/td[1]/img", "");
			Thread.sleep(1000);
			selenium.mouseMoveAt("//div[@id='trash_can']", "");
			Thread.sleep(1000);
			selenium.mouseMoveAt("//div[@id='trash_can']", "");
			Thread.sleep(700);
			selenium.mouseUpAt("//div[@id='trash_can']", "");
			assertTrue(selenium.getConfirmation().matches("^Are you Sure[\\s\\S]$"));
			selenium.chooseOkOnNextConfirmation();
			selenium.refresh();
			Thread.sleep(5000);
			selenium.waitForPageToLoad("");
			Thread.sleep(10000);
			Thread.sleep(30000);
			selenium.click("link=Save for Later");


	      
	  
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
