package Market_Place_ALW;

import org.testng.annotations.*;


import FunctionLibrary.Common;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

public class CopyOfALWMarketPlace extends SeleneseTestBase{

	public Selenium selenium;
	/* URl ="http://trunk.synergy.theorchard.com/"
	 * login="/alw" 
	 */
	
	@BeforeClass
	public void loginUser() throws Exception{
		selenium=Common.CsetUp();
		Common.open(selenium);
		}
	@Test
	public void userLogin() throws Exception{
		System.out.println("userlogin start");
		Thread.sleep(10000);
		selenium.type("id=edit-username", "recordlabel");
		Thread.sleep(2000);
		selenium.type("id=edit-password", "orchard999");
		Thread.sleep(2000);
		selenium.clickAt("id=edit-submit", "");
		Thread.sleep(30000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=content")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
		Thread.sleep(30000);

	//	APP_ALW
		Thread.sleep(10000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=contentLeft")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		verifyTrue(selenium.isElementPresent("//li[@id='tMarketing']/ul/li[1]/a"));
		selenium.click("//li[@id='tMarketing']/ul/li[1]/a");
		Thread.sleep(30000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=latest")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		verifyTrue(selenium.isElementPresent("//div[@id='latest']/div/ul/li[1]/div[1]/h4/a"));
		selenium.clickAt("//div[@id='latest']/div/ul/li[1]/div[1]/h4/a", "");
		Thread.sleep(10000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=largescreen")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=comments")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		verifyTrue(selenium.isElementPresent("installByArtist"));
		selenium.clickAt("installByArtist", "");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=modal_overlaypickArtistWindow")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		Thread.sleep(7000);
		verifyTrue(selenium.isElementPresent("//div[1]/div[2]/a/span"));
		selenium.clickAt("//div[1]/div[2]/a/span", "");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=modal_overlaygetInstallAppWindow")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		Thread.sleep(7000);
		verifyTrue(selenium.isElementPresent("terms"));
		selenium.clickAt("terms", "");
		Thread.sleep(3000);
		verifyTrue(selenium.isElementPresent("css=#acceptAppTerms"));
		selenium.clickAt("css=#acceptAppTerms", "");
		Thread.sleep(20000);
		selenium.windowFocus();

	//  ALWDelete
		Thread.sleep(10000);
		verifyTrue(selenium.isElementPresent("css=div.uninstall_app > a > img"));
		selenium.clickAt("css=div.uninstall_app > a > img", "");
		Thread.sleep(7000);
		verifyTrue(selenium.isElementPresent("acceptAppTerms"));
		selenium.clickAt("acceptAppTerms", "");
		Thread.sleep(20000);

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
