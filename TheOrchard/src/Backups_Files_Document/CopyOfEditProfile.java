package Backups_Files_Document;

import org.testng.annotations.*;

import FunctionLibrary.Common;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

public class CopyOfEditProfile extends SeleneseTestBase{

	public Selenium selenium;
	
	
	@BeforeClass
	public void loginUser() throws Exception{
	/*	url="http://internal.alpha.theorchard.com/"
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
		System.out.println("userlogin start");
	//	LoginCode
		Thread.sleep(12000);
		verifyTrue(selenium.isElementPresent("css=input[name=\"username\"]"));
		selenium.type("css=input[name=\"username\"]", "synergy");
		Thread.sleep(2000);
		verifyTrue(selenium.isElementPresent("css=input[name=\"password\"]"));
		selenium.type("css=input[name=\"password\"]", "Orchard09");
		Thread.sleep(2000);
		verifyTrue(selenium.isElementPresent("css=input[type=\"submit\"]"));
		selenium.clickAt("css=input[type=\"submit\"]", "");
		Thread.sleep(10000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=contentArea")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
		System.out.println("Login:<Debug_01>");
	//	OpenProfile
		Thread.sleep(5000);
		selenium.click("//a[contains(text(),'Warehouse')]");
		Thread.sleep(5000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=contentArea")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("class=panelContent tools")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		assertTrue(selenium.isTextPresent("Resources"));
		assertTrue(selenium.isTextPresent("Add a Customer Order:"));
		selenium.select("name=view_list", "label=DMS Customers");
		Thread.sleep(8000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("class=panelContent")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=contentArea")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		assertTrue(selenium.isTextPresent("Customer Master Record"));
		assertTrue(selenium.isTextPresent("DMS Customer List"));
		selenium.click("//div[@class='panelContent']/table/tbody//tr[2]/td[2]/a");
		Thread.sleep(5000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("class=panelContent")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		assertTrue(selenium.isTextPresent("Remote Server Info"));
		assertTrue(selenium.isTextPresent("Metadata/Image/Audio Specs"));
	//	EditProfile
		Thread.sleep(5000);
		selenium.click("//div[@id='item']/h2/a");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=contentArea")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=edit_customer_master")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		assertTrue(selenium.isTextPresent("Customer Info"));
		assertTrue(selenium.isTextPresent("Quick Search"));
		Thread.sleep(2000);
		verifyTrue(selenium.isElementPresent("css=#ddex_party_id"));
		String DDEXParty = selenium.getEval("'8574FR'");
		selenium.type("css=#ddex_party_id", selenium.getEval("'" + DDEXParty + "'"));
		Thread.sleep(2000);
		verifyTrue(selenium.isElementPresent("name=customer_name"));
		String MasterName = selenium.getEval("'Enric'");
		selenium.type("name=customer_name", selenium.getEval("'" + MasterName + "'"));
		Thread.sleep(2000);
		verifyTrue(selenium.isElementPresent("css=select[name=\"delivery_option\"]"));
		String DeliveryOption = selenium.getEval("'Full Catalog'");
		selenium.select("css=select[name=\"delivery_option\"]", selenium.getEval("'" + DeliveryOption + "'"));
		Thread.sleep(2000);
		verifyTrue(selenium.isElementPresent("css=select[name=\"show_delivery_info\"]"));
		String DeliveryInfo = selenium.getEval("'No'");
		selenium.select("css=select[name=\"show_delivery_info\"]", selenium.getEval("'" + DeliveryInfo + "'"));
		Thread.sleep(2000);
		verifyTrue(selenium.isElementPresent("css=select[name=\"product_type_arr[]\"]"));
		String ProductType = selenium.getEval("'Music'");
		selenium.addSelection("css=select[name=\"product_type_arr[]\"]", selenium.getEval("'" + ProductType + "'"));
		Thread.sleep(2000);
		selenium.click("id=edit_customer_master");
		Thread.sleep(5000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("class=alertConfirm")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
		assertTrue(selenium.isTextPresent("Quick Search"));
		assertTrue(selenium.isTextPresent("Customer master record updated successfully."));
		Thread.sleep(1000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("//ul[@id='itemInfo']")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
		assertTrue(selenium.isTextPresent("Remote Server Info"));
		verifyTrue(selenium.isElementPresent("//ul[@id='itemInfo']/li[1]"));
		verifyTrue(selenium.isElementPresent("//div[@id='item']/h2"));
		verifyTrue(selenium.isElementPresent("//ul[@id='itemInfo']/li[4]"));
		verifyTrue(selenium.isElementPresent("//ul[@id='itemInfo']/li[5]"));
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
