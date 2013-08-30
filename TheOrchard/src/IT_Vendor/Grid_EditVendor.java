package IT_Vendor;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import FunctionLibrary.Common;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

@Test
public class Grid_EditVendor extends SeleneseTestBase{
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
		
//		LoginCode
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
		//	VendorOpen
			Thread.sleep(10000);
			selenium.type("name=varSearchString", "7123");
			Thread.sleep(2000);
			selenium.click("xpath=(//input[@name='srchSubmit'])[2]");
			Thread.sleep(10000);
			verifyTrue(selenium.isElementPresent("id=contentArea"));
			verifyTrue(selenium.isElementPresent("id=item"));
			assertTrue(selenium.isTextPresent("Quick Search Results"));
			assertTrue(selenium.isTextPresent("Viewing 1 of 1"));
			selenium.click("link=7123");
			Thread.sleep(15000);
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isTextPresent("Label Info")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			assertTrue(selenium.isTextPresent("Label Info"));
			assertTrue(selenium.isTextPresent("Label Summary"));
		//	EditVendor
			Thread.sleep(5000);
			selenium.click("link=Edit");
			Thread.sleep(10000);
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent("id=contentArea")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent("id=item")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			assertTrue(selenium.isTextPresent("Quick Search"));
			assertTrue(selenium.isTextPresent("Label Info"));
			String OwnerDet = selenium.getEval("'Bobby Ivanchev'");
			selenium.select("css=select[name=\"owner_req\"]", selenium.getEval("'" + OwnerDet + "'"));
			selenium.select("name=assigned_to", "label=Ackim Williams");
			Thread.sleep(2000);
			String MoneyFormat = selenium.getEval("'US'");
			verifyTrue(selenium.isElementPresent("css=select[name=\"number_format\"]"));
			selenium.select("css=select[name=\"number_format\"]", selenium.getEval("'" + MoneyFormat + "'"));
			Thread.sleep(2000);
			String LabelPriority = selenium.getEval("'2'");
			verifyTrue(selenium.isElementPresent("css=select[name=\"priority\"]"));
			selenium.select("css=select[name=\"priority\"]", selenium.getEval("'" + LabelPriority + "'"));
			String Genre = selenium.getEval("'DVD'");
			verifyTrue(selenium.isElementPresent("css=select[name=\"genre\"]"));
			selenium.select("css=select[name=\"genre\"]", selenium.getEval("'" + Genre + "'"));
			Thread.sleep(2000);
			String Country = selenium.getEval("'Fiji'");
			verifyTrue(selenium.isElementPresent("css=select[name=\"country\"]"));
			selenium.select("css=select[name=\"country\"]", selenium.getEval("'" + Country + "'"));
			Thread.sleep(2000);
			selenium.select("name=region", "label=CA - Canada");
			Thread.sleep(2000);
			String Website = selenium.getEval("'google.co.in'");
			verifyTrue(selenium.isElementPresent("css=input[name=\"website\"]"));
			selenium.type("css=input[name=\"website\"]", selenium.getEval("'" + Website + "'"));
			String Reference = selenium.getEval("'synergytechsolution'");
			verifyTrue(selenium.isElementPresent("css=input[name=\"hear_about_us1\"]"));
			selenium.type("css=input[name=\"hear_about_us1\"]", selenium.getEval("'" + Reference + "'"));
			String PaymentType = selenium.getEval("'Wire'");
			verifyTrue(selenium.isElementPresent("css=select[name=\"payment_type\"]"));
			selenium.select("css=select[name=\"payment_type\"]", selenium.getEval("'" + PaymentType + "'"));
			Thread.sleep(2000);
			String ChecksPayable = selenium.getEval("(new Date().getDate())");
			verifyTrue(selenium.isElementPresent("css=input[name=\"checks\"]"));
			selenium.type("css=input[name=\"checks\"]", selenium.getEval("'" + ChecksPayable + "'"));
			String TaxFormReceived = selenium.getEval("'Y'");
			verifyTrue(selenium.isElementPresent("css=select[name=\"tax_form_received\"]"));
			selenium.select("css=select[name=\"tax_form_received\"]", "label=Yes");
			Thread.sleep(2000);
			String W8TaxFormDate = selenium.getEval("'2012-05-03'");
			verifyTrue(selenium.isElementPresent("css=input[name=\"w8_tax_form_date\"]"));
			Thread.sleep(1000);
			selenium.type("css=input[name=\"w8_tax_form_date\"]", selenium.getEval("'" + W8TaxFormDate + "'"));
			Thread.sleep(2000);
			String USTaxID = selenium.getEval("'123456789'");
			verifyTrue(selenium.isElementPresent("css=input[name=\"ssn\"]"));
			selenium.type("css=input[name=\"ssn\"]", selenium.getEval("'" + USTaxID + "'"));
			Thread.sleep(2000);
			String TaxIDType = selenium.getEval("'Individual'");
			verifyTrue(selenium.isElementPresent("css=select[name=\"tax_id_type\"]"));
			selenium.select("css=select[name=\"tax_id_type\"]", selenium.getEval("'" + TaxIDType + "'"));
			Thread.sleep(2000);
			String ForeignTaxID = selenium.getEval("'98797'");
			verifyTrue(selenium.isElementPresent("css=input[name=\"foreign_tax_id\"]"));
			selenium.type("css=input[name=\"foreign_tax_id\"]", selenium.getEval("'" + ForeignTaxID + "'"));
			Thread.sleep(2000);
			String TaxIDCountry = selenium.getEval("'India'");
			verifyTrue(selenium.isElementPresent("css=select[name=\"tax_id_country\"]"));
			selenium.select("css=select[name=\"tax_id_country\"]", selenium.getEval("'" + TaxIDCountry + "'"));
			Thread.sleep(2000);
			String WireInfo = selenium.getEval("'98797'");
			verifyTrue(selenium.isElementPresent("css=textarea[name=\"wire_info\"]"));
			selenium.type("css=textarea[name=\"wire_info\"]", selenium.getEval("'" + WireInfo + "'"));
			Thread.sleep(2000);
			selenium.type("name=recurring_payment_threshold", "20.85");
			Thread.sleep(2000);
			selenium.select("name=allow_orchard_credit", "label=No");
			Thread.sleep(3000);
			selenium.click("css=div.panelButtons > input[type=\"submit\"]");
			Thread.sleep(10000);
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent("class=alertConfirm")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			assertTrue(selenium.isTextPresent("Label profile successfully updated."));
			Thread.sleep(5000);
			selenium.click("//div[@id='contentWrapper']/p/a[2]");
			Thread.sleep(10000);
			String LastUpdated = selenium.getEval("(new Date().getDate())");
			verifyTrue(selenium.isElementPresent("css=table.form > tbody > tr > td"));
			verifyTrue(selenium.isElementPresent("//div[5]/table/tbody/tr[2]/td"));
			verifyTrue(selenium.isElementPresent("//tr[3]/td"));
			verifyTrue(selenium.isElementPresent("//tr[5]/td"));
			verifyTrue(selenium.isElementPresent("//tr[6]/td"));
			verifyTrue(selenium.isElementPresent("//div[7]/table[2]/tbody/tr[2]/td"));
			verifyTrue(selenium.isElementPresent("//table[2]/tbody/tr[4]/td"));
			verifyTrue(selenium.isElementPresent("//table[2]/tbody/tr[5]/td"));
			verifyTrue(selenium.isElementPresent("css=a[title=\"Go to Website\"]"));
			verifyTrue(selenium.isElementPresent("//tr[9]/td"));
			/*verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr/td"));
			verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr[2]/td"));
			verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr[3]/td"));
			verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr[4]/td"));
			verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr[5]/td"));
			verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr[6]/td"));
			verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr[7]/td"));
			verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr[8]/td"));
			verifyTrue(selenium.isElementPresent("//tr[10]/td"));*/

		    //Logout
			Thread.sleep(8000);
			selenium.clickAt("link=Logout", "");
			Thread.sleep(5000);
			for (int second1 = 0;; second1++) {
				if (second1 >= 60) fail("timeout");
				try { if (selenium.isElementPresent("id=loginBox")) break; } catch (Exception e) {}
				Thread.sleep(1000);}
	     
        try {
            Thread.sleep(24579);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }   
}