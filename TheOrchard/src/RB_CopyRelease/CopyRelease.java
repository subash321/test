package RB_CopyRelease;

import org.testng.annotations.*;
import com.thoughtworks.selenium.FlashSelenium;
import FunctionLibrary.Common;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

@Test
public class CopyRelease extends SeleneseTestBase{

	public Selenium selenium;
	@BeforeClass
	public void loginUser() throws Exception{
		selenium=Common.CsetUp();
		Common.open(selenium);
			}
		public void userLogin() throws Exception{
        
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
		selenium.click("//div[2]/a/span");
		System.out.println("CopyReleaseDebug_01");
		Thread.sleep(30000);
		Thread.sleep(10000);
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
		selenium.click("//div[2]/a/span");
		Thread.sleep(12000);
		System.out.println("CopyReleaseDebug_05");

		/*for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=contentLeft")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
		System.out.println("CopyReleaseDebug_06");

		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=navigation")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}*/
		System.out.println("CopyReleaseDebug_07");

		System.out.println("UserLoginEnd");
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
