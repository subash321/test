package Login;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import FunctionLibrary.Common;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

@Test
public class Grid_Login extends SeleneseTestBase{
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
		System.out.println("userlogin start");
		
	    // Common.open(selenium);
	     // verifyTrue(selenium.getTitle().contains("Client Login | Orchard"));
	      
	     selenium.type("css=#edit-username","recordlabel");
	     selenium.type("css=#edit-password","orchard999");
	     selenium.click("css=#edit-submit");
	     Thread.sleep(23579);
	     //selenium.waitForPageToLoad("012579");
	     System.out.println("userlogin end");
	     
        try {
            Thread.sleep(24579);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }   
}