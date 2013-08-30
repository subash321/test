package RB_CopyRelease;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import FunctionLibrary.Common;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

@Test
public class Grid_CopyRelease extends SeleneseTestBase{
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
        
        
        //  Login   
  		Thread.sleep(7000);
  		selenium.type("name=username", "recordlabel");
  		System.out.println("Login_0");
  		Thread.sleep(2000);
  		System.out.println("Login_1");
  		selenium.type("name=password", "orchard999");
  		Thread.sleep(2000);
  		System.out.println("Login_2");
  		selenium.clickAt("//input[@type='submit']", "");
  		Thread.sleep(10000);
  		System.out.println("Login_4");
  		/*for (int second = 0;; second++) {
  			if (second >= 60) fail("timeout");
  			try { if (selenium.isElementPresent("id=contentLeft")) break; } catch (Exception e) {}
  			Thread.sleep(1000);
  		}*/
  		
  	//	CopyReleases
  		Thread.sleep(30000);
  		//verifyTrue(selenium.isElementPresent("//li[@id='tCatalogInfo']/ul/li[2]/a"));
  		selenium.click("//li[@id='tCatalogInfo']/ul/li[2]/a");
  		Thread.sleep(10000);
  		for (int second = 0;; second++) {
  			if (second >= 60) fail("timeout");
  			try { if (selenium.isElementPresent("class=homepageTable")) break; } catch (Exception e) {}
  			Thread.sleep(1000);
  		}

  		Thread.sleep(10000);
  		verifyTrue(selenium.isElementPresent("//table[@class='homepageTable']/tbody//tr[1]/td[1]/div[2]/a"));
  		selenium.click("//table[@class='homepageTable']/tbody//tr[1]/td[1]/div[2]/a");
  		Thread.sleep(20000);
  		for (int second = 0;; second++) {
  			if (second >= 60) fail("timeout");
  			try { if (selenium.isElementPresent("class=releaseBasics")) break; } catch (Exception e) {}
  			Thread.sleep(1000);
  		}

  		for (int second = 0;; second++) {
  			if (second >= 60) fail("timeout");
  			try { if (selenium.isElementPresent("//span[@id='copy_release_button']")) break; } catch (Exception e) {}
  			Thread.sleep(1000);
  		}

  		verifyTrue(selenium.isElementPresent("//span[@id='copy_release_button']"));
  		selenium.click("//span[@id='copy_release_button']");
  		Thread.sleep(10000);
  		for (int second = 0;; second++) {
  			if (second >= 60) fail("timeout");
  			try { if (selenium.isElementPresent("id=modalWindow")) break; } catch (Exception e) {}
  			Thread.sleep(1000);
  		}
  		System.out.println("CopyReleaseDebug");
  		String releaseName = selenium.getEval("'$Selenium_version_'+(new Date().getTime())");
  		System.out.println("CopyReleaseDebug");
  		selenium.type("//input[@name='version']", selenium.getEval("'" + releaseName + "'.toLowerCase()"));
  	//	String release_name = selenium.getEval("storedVars['releaseName'].toLowerCase()");
  		Thread.sleep(2000);
  		System.out.println("CopyReleaseDebug");
  		selenium.click("id=copyrelease_button");
  		System.out.println("CopyReleaseDebug_01");
  		Thread.sleep(68579);
  		System.out.println("CopyReleaseDebug_02");

  		/*for (int second = 0;; second++) {
  			if (second >= 60) fail("timeout");
  			try { if (selenium.isElementPresent("class=releaseBasics")) break; } catch (Exception e) {}
  			Thread.sleep(1000);
  		}
  		System.out.println("CopyReleaseDebug_03");

  		for (int second = 0;; second++) {
  			if (second >= 60) fail("timeout");
  			try { if (selenium.isElementPresent("id=edit_release_basics_button")) break; } catch (Exception e) {}
  			Thread.sleep(1000);
  		}*/
  		System.out.println("CopyReleaseDebug_04");

  	//	verifyTrue(selenium.isElementPresent("//div[@id='submit_final_button']/a/span"));
  		selenium.click("//div[2]/a[2]");
  		Thread.sleep(127579);
  		System.out.println("CopyReleaseDebug_05");
//  		selenium.click("//div[2]/div/div/a/span");
  		selenium.click("//div[2]/div[2]/div/div/a");
  		System.out.println(128);	
  		Thread.sleep(89579);

  		/*for (int second = 0;; second++) {
  			if (second >= 60) fail("timeout");
  			try { if (selenium.isElementPresent("//a[3]")) break; } catch (Exception e) {}
  			Thread.sleep(1000);
  		}*/
  		System.out.println("CopyReleaseDebug_06");

  		for (int second = 0;; second++) {
  			if (second >= 60) fail("timeout");
  			try { if (selenium.isElementPresent("id=navigation")) break; } catch (Exception e) {}
  			Thread.sleep(1000);
  		}
  		System.out.println("CopyReleaseDebug_07");

  		System.out.println("UserLoginEnd");
	     
        try {
            Thread.sleep(24579);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }   
}