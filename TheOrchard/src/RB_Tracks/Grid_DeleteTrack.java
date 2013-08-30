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
public class Grid_DeleteTrack extends SeleneseTestBase{
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
    	// login 
    	selenium.type(Common.txt_UName,"recordlabel");
	      selenium.type(Common.txt_PWord,"orchard999");
	      selenium.click(Common.btn_Submit);
	     Thread.sleep(68579);
	      System.out.println("userlogin end");
	      selenium.open("alw/releasebuilder/view?release_id=262854");
		// 	DeleteRelease
			Thread.sleep(60579);
			System.out.println("49");
			selenium.mouseDownAt("//tbody[@id='releasebuilder_tracks']/tr[1]/td[1]/img", "");
			Thread.sleep(12579);
			System.out.println("52");
			selenium.mouseMoveAt("//div[@id='trash_can']", "");
			System.out.println("54");
			Thread.sleep(12579);
			selenium.mouseMoveAt("//div[@id='trash_can']", "");
			System.out.println("57");
			Thread.sleep(700);
			selenium.mouseUpAt("//div[@id='trash_can']", "");
			Thread.sleep(8579);
			assertTrue(selenium.getConfirmation().matches("Are you Sure?"));
//			selenium.chooseOkOnNextConfirmation();			
			Thread.sleep(5000);
			Thread.sleep(10000);
			Thread.sleep(30000);
			selenium.click("link=Save for Later");
			System.out.println("52id");
			Thread.sleep(68579);
	     
        try {
            Thread.sleep(24579);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }   
}