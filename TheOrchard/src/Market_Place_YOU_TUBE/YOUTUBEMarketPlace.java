package Market_Place_YOU_TUBE;

import org.testng.annotations.*;


import FunctionLibrary.Common;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

public class YOUTUBEMarketPlace extends SeleneseTestBase{

	public Selenium selenium;
	/* URl ="http://www.theorchard.com"
	 * login="/oa"
	 * synergy/Orchard09
	 *  
	 */
	
	@BeforeClass
	public void loginUser() throws Exception{
		selenium=Common.CsetUp();
		Common.open(selenium);
/*		selenium = new DefaultSelenium("localhost",4444,"iexplore","http://trunk.synergy.theorchard.com/");
		System.out.println("selenium start");
		System.out.println("selenium return");
		selenium.start();
		System.out.println("29");
				selenium.open("/alw");
*/		
		}

	@Test
	public void userLogin() throws Exception{
	//	Login
		Thread.sleep(10000);
		selenium.type("//input[@type='text']", "synergy");
		Thread.sleep(2000);
		selenium.type("//input[@type='password']", "Orchard09");
		Thread.sleep(2000);
		selenium.clickAt("//input[@type='submit']", "");
		Thread.sleep(15000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=contentArea")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
		System.out.println("49");
		Thread.sleep(15000);
	//	ApplicationOpen
		System.out.println("52");
		selenium.open("http://www.theorchard.com/oa/viewapplications");
		System.out.println("54");
		Thread.sleep(10000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=contentArea")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
		System.out.println("59");
		selenium.click("link=Youtube Connect");
		Thread.sleep(10000);
		selenium.selectWindow("var=testapp_window");
		selenium.windowFocus();
		selenium.windowMaximize();
		Thread.sleep(20000);
		selenium.click("id=testApp");
		Thread.sleep(20000);
		selenium.selectWindow("var=launch_window");
		System.out.println("69");
		selenium.windowFocus();
		selenium.windowMaximize();
		Thread.sleep(20000);
		selenium.click("//a[@id='btnLaunchApp']/span");
		Thread.sleep(20000);
		selenium.selectWindow("var=youtube_window");
		selenium.windowFocus();
		Thread.sleep(30000);
		Thread.sleep(10000);
		System.out.println("79");
		selenium.click("name=tracks[]");
		Thread.sleep(3000);
		selenium.clickAt("deliverlink", "");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=dialog-modal")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		Thread.sleep(7000);
		selenium.click("//body[@id='youtube_connect']/div[2]/div[3]/div/button[1]");
		Thread.sleep(20000);
		selenium.clickAt("name=tracks[]", "");
		Thread.sleep(3000);
		selenium.click("id=otherChannel");
		Thread.sleep(3000);
		String name = selenium.getEval("'Selenium_Name_'+(new Date().getTime())");
		selenium.type("id=custom_channel_name", selenium.getEval("'" + name + "'.toLowerCase()"));
		Thread.sleep(3000);
		selenium.clickAt("//input[@id='custom_channel_password_clear']", "");
		String nameTwo = selenium.getEval("'Selenium_Password_'+(new Date().getTime())");
		selenium.type("//input[@name='custom_channel_password']", selenium.getEval("'" + nameTwo + "'.toLowerCase()"));
		selenium.clickAt("//input[@name='custom_channel_name']", "");
		Thread.sleep(3000);
		selenium.clickAt("deliverlink", "");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=dialog-modal")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		Thread.sleep(5000);
		selenium.click("//body[@id='youtube_connect']/div[2]/div[3]/div/button[1]");
		Thread.sleep(30000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=track_form")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		selenium.click("//input[@id='searchText']");
		Thread.sleep(3000);
		selenium.type("//input[@id='searchText']", "com");
		selenium.typeKeys("//input[@id='searchText']", "com");
		Thread.sleep(3000);
		selenium.close();
		Thread.sleep(3000);
		selenium.selectWindow("var=launch_window");
		selenium.windowFocus();
		Thread.sleep(3000);
		selenium.close();
		Thread.sleep(3000);
		selenium.selectWindow("var=testapp_window");
		selenium.windowFocus();
		Thread.sleep(3000);
		selenium.close();

		
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
