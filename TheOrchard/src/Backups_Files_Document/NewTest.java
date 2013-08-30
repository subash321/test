package Backups_Files_Document;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import FunctionLibrary.Common;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

@Test
public class NewTest {
    Selenium selenium;

    @BeforeClass	
    @Parameters({ "selenium.host", "selenium.port", "selenium.browser","selenium.url" })
    public void beforeClass(String host, String port, String browser, String url) throws InterruptedException {
        selenium = new DefaultSelenium(host, Integer.parseInt(port),
                browser, url);
//        Thread.sleep(13569); 
        System.out.println("Selenium");
        selenium.start();
        selenium.open("/alw");
        selenium.windowMaximize();
    }

    @AfterClass
    public void afterClass() {
        selenium.close();
        selenium.stop();
    }

    @Parameters({ "searchCriteria" })
    public void testGoogleSearch(String criteria) throws InterruptedException {
         System.out.println("userlogin start");
		
	    // Common.open(selenium);
	     // verifyTrue(selenium.getTitle().contains("Client Login | Orchard"));
	      
	     selenium.type(Common.txt_UName,"recordlabel");
	     selenium.type(Common.txt_PWord,"orchard999");
	     selenium.click(Common.btn_Submit);
//	     Thread.sleep(12579);
//	     selenium.waitForPageToLoad("24579");
	     System.out.println("userlogin end");
	      /*assertTrue(selenium.getTitle().contains("Guguchu - Promote music, only better"));
	      selenium.type("name=listingBasicInfo.street1", "street1");*/
	      //Common.txt_Email();
/*     	System.out.println("SeleniumGridtes");
        selenium.type("name=q", criteria);
*/
       
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }   
}