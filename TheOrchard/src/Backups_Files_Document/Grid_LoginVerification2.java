package Backups_Files_Document;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import FunctionLibrary.Common;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

public class Grid_LoginVerification2 extends SeleneseTestBase{
    Selenium selenium;

    @BeforeClass	
    @Parameters({ "selenium.host","selenium.port","selenium.browser","selenium.url" })
    public void beforeClass(String host, String port, String browser, String url) {
        this.selenium = new DefaultSelenium(host, Integer.parseInt(port),
                browser, url);
        this.selenium.start();
        this.selenium.open("/client/login");
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
		System.out.println("29");
		selenium.type("css=#edit-username", " ");
		selenium.type("css=#edit-password", " ");
	    selenium.click("css=#edit-submit");
		System.out.println("29.1");
		Thread.sleep(27579);
		verifyEquals(selenium.getText("css=div.messages.error"), "Sorry, account not found");
		System.out.println("29.02");
	     Thread.sleep(23579);
	     //selenium.waitForPageToLoad("012579");
	     System.out.println("userlogin end");
	     
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }   
}