package iT_Customer;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import FunctionLibrary.Common;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

@Test
public class TestGrid_EditProfile extends SeleneseTestBase{
    Selenium selenium;

    @BeforeClass	
    @Parameters({ "selenium.host","selenium.port","selenium.browser","selenium.url" })
    public void beforeClass(String host, String port, String browser, String url) {
        this.selenium = new DefaultSelenium(host, Integer.parseInt(port),
                browser, url);
        this.selenium.start();
        this.selenium.open("/oa/please_login.php");
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
	//	LoginCode
		Thread.sleep(12000);
		verifyTrue(selenium.isElementPresent(Common.txt_UName_02));
		selenium.type(Common.txt_UName_02, "synergy");
		//Thread.sleep(2000);
		verifyTrue(selenium.isElementPresent(Common.txt_Pwd));
		selenium.type(Common.txt_Pwd, "Orchard09");
		//Thread.sleep(2000);
		verifyTrue(selenium.isElementPresent(Common.btn_Submit_02));
		selenium.clickAt(Common.btn_Submit_02, "");
		Thread.sleep(38579);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=contentArea")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
		System.out.println("Login:<Debug_01>");
	//	OpenProfile
		//Thread.sleep(5000);
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
	    // Edit_Profile
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
		String ProductType = "Movie";
		System.out.println("137");
		selenium.addSelection("//div[@id='leftPane']/div[2]/form/table/tbody[4]/tr[2]/td/select","label=Music");
		selenium.addSelection("//div[@id='leftPane']/div[2]/form/table/tbody[4]/tr[2]/td/select","label=Movie");
		selenium.addSelection("//div[@id='leftPane']/div[2]/form/table/tbody[4]/tr[2]/td/select","label=Video Etc");
		selenium.addSelection("//div[@id='leftPane']/div[2]/form/table/tbody[4]/tr[2]/td/select","label=TV Show");

		System.out.println("139");
		Thread.sleep(12579);
		selenium.click("//div/input");
		System.out.println("142");
		Thread.sleep(68579);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("class=alertConfirm")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		assertTrue(selenium.isTextPresent("Quick Search"));
		System.out.println("151");
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
		System.out.println("165");
	// Logout	
		Thread.sleep(8000);
		selenium.clickAt("link=Logout", "");
		Thread.sleep(5000);
		for (int second1 = 0;; second1++) {
			if (second1 >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=loginBox")) break; } catch (Exception e) {}
			Thread.sleep(1000);}

		
		System.out.println("176");
        try {
            Thread.sleep(24579);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }   
}