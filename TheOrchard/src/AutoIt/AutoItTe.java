package AutoIt;

import org.testng.annotations.*;

import FunctionLibrary.Common;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

public class AutoItTe extends SeleneseTestBase{

	public Selenium selenium;
	
	
	@BeforeClass
	public void loginUser() throws Exception{
	/*	url="http://internal.alpha.theorchard.com"
	    login="/oa"
	    username="synergy"
	    password="Orchard09"
	 */ 
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
		Thread.sleep(7000);
		System.out.println("37");

		selenium.type("name=username", "synergy");
		Thread.sleep(2000);
		selenium.type("name=password", "Orchard09");
		Thread.sleep(2000);
		selenium.clickAt("//input[@type='submit']", "");
		Thread.sleep(15000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=contentArea")) break; } catch (Exception e) {}
			System.out.println("48");
			Thread.sleep(1000);
		}
		
	//	OpenUploadManagement
			selenium.click("link=Accounting");
			
			for (int second1 = 0;; second1++) {
				if (second1 >= 60) fail("timeout");
				try { if (selenium.isElementPresent("//table[@class='data']")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}
			
			
			System.out.println("56");
			Thread.sleep(67579);
			selenium.click("//ul[2]/li[7]/a");
			Thread.sleep(23579);
/*			verifyTrue(selenium.isElementPresent("css=input[name=\"prmUserFile\"]"));
			selenium.click("css=input[name=\"prmUserFile\"]");*/
			System.out.println("68");
			selenium.focus("css=input[name=\"prmUserFile\"]");
			selenium.click("css=input[name=\"prmUserFile\"]");
			selenium.fireEvent("css=input[name=\"prmUserFile\"]", "Click");
			verifyTrue(selenium.isElementPresent("//ul[2]/li[7]/a"));
			Process proc = Runtime.getRuntime().exec("D:\\upload_file.exe");
			System.out.println("79");			
			Thread.sleep(235799);

		/*  verifyTrue(selenium.isElementPresent("link=Upload Manual Adjustments"));
			selenium.click("link=Upload Manual Adjustments");*/
			
//			Thread.sleep(4000);
//			for (int second1 = 0;; second1++) {
//				if (second1 >= 60) fail("timeout");
//				try { if (selenium.isElementPresent("//table[@class='form wide']")) break; } catch (Exception e) {}
//				Thread.sleep(1000);
//			}
//
			Thread.sleep(23578);

//			assertTrue(selenium.isElementPresent("//div[@class='alertConfirm']"));
//			assertTrue(selenium.isTextPresent("Manual Adjustments successfully added."));
//			String C:\internal\Test-orchard_manual_adjustment_template_v1.0.txt = "C:\\internal\\Test-orchard_manual_adjustment_template_v1.0.txt";
//			System.out.println("${a}");
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
