package IT_YouTube;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import FunctionLibrary.Common;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

@Test
public class Grid_EditContracts extends SeleneseTestBase{
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
    	/*	url="http://internal.alpha.theorchard.com"
	    login="/oa"
	    username="synergy"
	    password="Orchard09"
	 */ 
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
		Thread.sleep(38579);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=contentArea")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
		System.out.println("Login:<Debug_01>");

	//	OpenVendorDebug_01
		Thread.sleep(10000);
		selenium.type("name=varSearchString", "7123");
		Thread.sleep(2000);
		selenium.click("xpath=(//input[@name='srchSubmit'])[2]");
		Thread.sleep(8000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=item")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
		assertTrue(selenium.isTextPresent("Quick Search Results"));
		assertTrue(selenium.isTextPresent("Viewing 1 of 1"));
		Thread.sleep(8000);
		selenium.click("link=7123");
		Thread.sleep(8000);
		System.out.println("OpenVendorCodingParts:<Debug_01>");
		
	//	EditContractsDebug_01
		Thread.sleep(57000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("link=View Contracts")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
		System.out.println("EditContractsDebug_02");
		verifyTrue(selenium.isElementPresent("link=View Contracts"));
		selenium.click("link=View Contracts");
		Thread.sleep(8000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isTextPresent("Executed Contracts")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
		System.out.println("EditContractsDebug_003");
		assertTrue(selenium.isTextPresent("Executed Contracts"));
		assertTrue(selenium.isTextPresent("View Contracts"));
		verifyTrue(selenium.isElementPresent("css=a[title=\"View Label Agreement\"]"));
		selenium.clickAt("css=a[title=\"View Label Agreement\"]", "");
		Thread.sleep(5000);
		System.out.println("EditContractsDebug_04");
		verifyTrue(selenium.isElementPresent("css=div.panelHeader"));
		verifyTrue(selenium.isElementPresent("link=Edit"));
		selenium.clickAt("link=Edit", "");
		Thread.sleep(14000);
		System.out.println("EditContractsDebug_05");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("css=select[name=\"orchrep_name\"]")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
	//  TestingConcept
		System.out.println("TestingDebug_01");
//		selenium.addSelection("css=select[name=\"lstTerritory[]\"]","Ukraine"); // new
		Thread.sleep(1000);
		System.out.println("TestingDebug_02");
	//  EndIf
	//	FieldsValues
		String OrchardClose = "The Orchard";
		System.out.println("EditContractsDebug_06");
		selenium.select("css=select[name=\"orchrep_name\"]",  OrchardClose );
		Thread.sleep(1000);
		verifyTrue(selenium.isElementPresent("css=select[name=\"contract_version\"]"));
		String ContractVersion = "OOP";
		selenium.select("css=select[name=\"contract_version\"]",  ContractVersion );
		Thread.sleep(1000);
	//	verifyTrue(selenium.isElementPresent("css=input[name=\"dig_distribution_type[1]\"]"));
		/*String DigitalDistributionType = "Tone";*/
		System.out.println("EditContractsDebug_07");
		System.out.println("132");
		/*selenium.check("css=input[name=\"dig_distribution_type[2]\"]");*/
		Thread.sleep(1000);
		System.out.println("135");
		verifyTrue(selenium.isElementPresent("css=select[name=\"exclusive\"]"));
		String Exclusivity = "Yes - Digital";
		selenium.select("css=select[name=\"exclusive\"]",  Exclusivity );
		System.out.println("139");
		Thread.sleep(1000);
		verifyTrue(selenium.isElementPresent("css=select[name=\"third_party_responsibility\"]"));
		String Responsibilities = "Standard";
		selenium.select("css=select[name=\"third_party_responsibility\"]",  Responsibilities );
		Thread.sleep(1000);
		System.out.println("EditContractsDebug_08");
		verifyTrue(selenium.isElementPresent("css=select[name=\"unlimited_roll\"]"));
		String UnlimitedRoll = "Yes";
		selenium.select("css=select[name=\"unlimited_roll\"]",  UnlimitedRoll );
		Thread.sleep(1000);
		verifyTrue(selenium.isElementPresent("css=input[name=\"rollover_length_in_months\"]"));
		String RolloverLength = "2";
		selenium.type("css=input[name=\"rollover_length_in_months\"]",  RolloverLength );
		Thread.sleep(1000);
		System.out.println("EditContractsDebug_09");
		verifyTrue(selenium.isElementPresent("css=select[name=\"can_terminate\"]"));
		String RolloverEnds = "No";
		selenium.select("css=select[name=\"can_terminate\"]",  RolloverEnds );
		Thread.sleep(1000);
		verifyTrue(selenium.isElementPresent("css=input[name=\"notice_required_in_days\"]"));
		String Notice = "7";
		selenium.type("css=input[name=\"notice_required_in_days\"]",  Notice );
		Thread.sleep(1000);
		verifyTrue(selenium.isElementPresent("css=input[name=\"txtDigitalSplit\"]"));
		String Split_DIGITAL = "0.54";
		selenium.type("css=input[name=\"txtDigitalSplit\"]",  Split_DIGITAL );
		Thread.sleep(1000);
		System.out.println("EditContractsDebug_10");
		verifyTrue(selenium.isElementPresent("css=input[name=\"txtPhysicalSplit\"]"));
		String Split_PHYSICAL = "0.12";
		selenium.type("css=input[name=\"txtPhysicalSplit\"]",  Split_PHYSICAL );
		Thread.sleep(1000);
		verifyTrue(selenium.isElementPresent("css=input[name=\"txtBackCatalogueFee\"]"));
		String Cap_BackCatalogue = "9999";
		selenium.type("css=input[name=\"txtBackCatalogueFee\"]",  Cap_BackCatalogue );
		Thread.sleep(1000);
		verifyTrue(selenium.isElementPresent("css=input[name=\"txtNewReleasesFee\"]"));
		String Cap_NewReleases = "9999";
		selenium.type("css=input[name=\"txtNewReleasesFee\"]",  Cap_NewReleases );
		Thread.sleep(1000);
		verifyTrue(selenium.isElementPresent("css=select[name=\"extend_until_recouped\"]"));
		String ExtendTerm = "No";
		selenium.select("css=select[name=\"extend_until_recouped\"]",  ExtendTerm );
		Thread.sleep(1000);
		System.out.println("EditContractsDebug_011");
		verifyTrue(selenium.isElementPresent("css=input[name=\"advance_recoupable_percentage\"]"));
		String RecoupablePercentage = "0.55";
		System.out.println("EditContractsDebug_011.01");
		selenium.type("css=input[name=\"advance_recoupable_percentage\"]",  RecoupablePercentage );
		Thread.sleep(1000);
//		selenium.addSelection("css=select[name=\"rights_granted[]\"]", "label=Wallpaper");
		Thread.sleep(1000);
		System.out.println("EditContractsDebug_011.02");
//		selenium.addSelection("css=select[name=\"rights_granted[]\"]", "label=Synch");
		Thread.sleep(1000);
		System.out.println("EditContractsDebug_011.three");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("css=select[name=\"oms_type\"]"))
				System.out.println("ElementPresent");
				break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
		//verifyTrue(selenium.isElementPresent("css=select[name=\"oms_type\"]"));
		/*Thread.sleep(2000);
		String FullTrackPublishing = "From Label's Share";
		selenium.select("css=select[name=\"oms_type\"]",  FullTrackPublishing );
		Thread.sleep(1000);*/
		System.out.println("EditContractsDebug_012");
		verifyTrue(selenium.isElementPresent("css=select[name=\"ringtone_publishing_type\"]"));
		String RingtonePublishing = "From Orchard's Share";
		selenium.select("css=select[name=\"ringtone_publishing_type\"]",RingtonePublishing);
		Thread.sleep(1000);
		System.out.println("EditContractsDebug_012.01");
		verifyTrue(selenium.isElementPresent("css=input[name=\"oms_fee_percentage\"]"));
		String OMS = "0.20";
		selenium.type("css=input[name=\"oms_fee_percentage\"]",  OMS );
		Thread.sleep(1000);
		System.out.println("EditContractsDebug_013");
		verifyTrue(selenium.isElementPresent("css=select[name=\"possible_track_restrictions\"]"));
		String TrackRestrictions = "No";
		selenium.select("css=select[name=\"possible_track_restrictions\"]",  TrackRestrictions );
		Thread.sleep(1000);
		verifyTrue(selenium.isElementPresent("css=select[name=\"payment_interval\"]"));
		String PaymentInterval = "Month";
		selenium.select("css=select[name=\"payment_interval\"]",  PaymentInterval );
		Thread.sleep(1000);
		verifyTrue(selenium.isElementPresent("css=select[name=\"pay_after\"]"));
		String PayAfter = "30 Days";
		selenium.select("css=select[name=\"pay_after\"]",PayAfter );
		Thread.sleep(1000);
		System.out.println("EditContractsDebug_014");
		verifyTrue(selenium.isElementPresent("css=#show_credit_card"));
/*		String CreditCard = "Yes";
		System.out.println("234");
		selenium.select("css=#show_credit_card",CreditCard);*/
		System.out.println("236");
		Thread.sleep(1000);
/*		verifyTrue(selenium.isElementPresent("css=#youtube_composition_clause"));
		String YouTube = "No";
		Thread.sleep(1000);
		selenium.select("css=#youtube_composition_clause",YouTube );*/
//		selenium.addSelection("css=select[name=\"lstDMS[]\"]", "label=121 Music LU");
		Thread.sleep(1000);
//		selenium.addSelection("css=select[name=\"lstDMS[]\"]", "label=121 Music SE");
		Thread.sleep(1000);
		System.out.println("EditContractsDebug_015");
		//selenium.addSelection("css=select[name=\"lstTerritory[]\"]", "label=Antarctica"); //exist
//		selenium.addSelection("css=select[name=\"lstTerritory[]\"]","label=Antarctica"); // new
		Thread.sleep(1000);
		System.out.println("EditContractsDebug_015.01");
//		selenium.addSelection("css=select[name=\"lstTerritory[]\"]","label=Ukraine");
		Thread.sleep(1000);
//		selenium.addSelection("css=select[name=\"lstContinents[]\"]","label=North America");
		Thread.sleep(1000);
		verifyTrue(selenium.isElementPresent("css=input[name=\"sync_admin_commission\"]"));
		String AdminSplit = "0.6";
		System.out.println("EditContractsDebug_016");
		selenium.type("css=input[name=\"sync_admin_commission\"]", AdminSplit );
		Thread.sleep(1000);
		verifyTrue(selenium.isElementPresent("css=input[name=\"sync_admin_response_time\"]"));
		String ResponseTim = "4";
		selenium.type("css=input[name=\"sync_admin_response_time\"]", ResponseTim );
		Thread.sleep(1000);
		verifyTrue(selenium.isElementPresent("css=select[name=\"sync_admin_type_of_deal\"]"));
		String TypeofDeal = "Publishing Admin Only";
		selenium.select("css=select[name=\"sync_admin_type_of_deal\"]", TypeofDeal );
		Thread.sleep(1000);
		System.out.println("EditContractsDebug_017");
		verifyTrue(selenium.isElementPresent("css=input[name=\"publishing_admin_commission\"]"));
		String AdministrationSplit = "0.5";
		selenium.type("css=input[name=\"publishing_admin_commission\"]", AdministrationSplit );
		Thread.sleep(1000);
		verifyTrue(selenium.isElementPresent("css=input[name=\"publishing_admin_limit_grant_of_rights\"]"));
		String GrantofRights = "no";
		selenium.type("css=input[name=\"publishing_admin_limit_grant_of_rights\"]", GrantofRights );
		Thread.sleep(1000);
		verifyTrue(selenium.isElementPresent("css=input[name=\"publishing_admin_misc_provisions\"]"));
		String MiscPrevisions = "yes";
		selenium.type("css=input[name=\"publishing_admin_misc_provisions\"]",  MiscPrevisions );
		Thread.sleep(1000);
		System.out.println("EditContractsDebug_018");
		verifyTrue(selenium.isElementPresent("css=input[name=\"royalty_collection_commission\"]"));
		String CollectionSplit = "0.45";
		selenium.type("css=input[name=\"royalty_collection_commission\"]",  CollectionSplit );
		Thread.sleep(1000);
		verifyTrue(selenium.isElementPresent("css=input[name=\"brand_split\"]"));
		String Split_BRAND = "0.1";
		selenium.type("css=input[name=\"brand_split\"]",  Split_BRAND );
		Thread.sleep(1000);
		verifyTrue(selenium.isElementPresent("css=select[name=\"sync_admin_territory[]\"] > option[value=\"20\"]"));
		//selenium.addSelection("css=select[name=\"sync_admin_territory[]\"]","label=Albania");
		Thread.sleep(1000);
		//selenium.addSelection("css=select[name=\"sync_admin_territory[]\"]","label=Wallis And Futuna");
		Thread.sleep(1000);
		System.out.println("EditContractsDebug_019");
//		selenium.addSelection("css=select[name=\"sync_admin_territory[]\"]","label=Western Sahara");
		Thread.sleep(1000);
//		selenium.addSelection("css=select[name=\"publishing_admin_territory[]\"]","label=Albania");
		Thread.sleep(1000);
//		selenium.addSelection("css=select[name=\"publishing_admin_territory[]\"]","label=United Arab Emirates");
		Thread.sleep(1000);
//		selenium.addSelection("css=select[name=\"royalty_collection_territory[]\"]","label=Virgin Islands, British");
		Thread.sleep(1000);
//		selenium.addSelection("css=select[name=\"royalty_collection_territory[]\"]","label=Virgin Islands, U.S.");
		Thread.sleep(1000);
		verifyTrue(selenium.isElementPresent("css=div.panelButtons > input[type=\"submit\"]"));
		selenium.clickAt("css=div.panelButtons > input[type=\"submit\"]","");
		Thread.sleep(8000);
		System.out.println("EditContractsDebug_twnty");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("css=div.alertConfirm")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		assertTrue(selenium.isTextPresent("Label Contract updated successfully."));
		selenium.click("link=View Label Contract");
		Thread.sleep(5000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isTextPresent("Label Contract Info")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		assertTrue(selenium.isTextPresent("Label Contract Info"));
		verifyTrue(selenium.isElementPresent("css=table.form.half > tbody > tr > td"));
		verifyTrue(selenium.isElementPresent("//div[5]/table/tbody/tr[2]/td"));
		verifyTrue(selenium.isElementPresent("//tr[9]/td"));
		verifyTrue(selenium.isElementPresent("//tr[13]/td"));
		System.out.println("EditContractsDebug_twntyone");
		verifyTrue(selenium.isElementPresent("//tr[14]/td"));
		verifyTrue(selenium.isElementPresent("//tr[15]/td"));
		verifyTrue(selenium.isElementPresent("//tr[16]/td"));
		verifyTrue(selenium.isElementPresent("//div[5]/table[2]/tbody/tr/td"));
		verifyTrue(selenium.isElementPresent("//div[5]/table[2]/tbody/tr[2]/td"));
		verifyTrue(selenium.isElementPresent("//table[2]/tbody/tr[4]/td"));
		verifyTrue(selenium.isElementPresent("//table[2]/tbody/tr[5]/td"));
		verifyTrue(selenium.isElementPresent("//tr[17]/td"));
		verifyTrue(selenium.isElementPresent("//table[2]/tbody/tr[9]/td"));
		verifyTrue(selenium.isElementPresent("//table[2]/tbody/tr[10]/td"));
		verifyTrue(selenium.isElementPresent("//table[2]/tbody/tr[11]/td"));
		System.out.println("EditContractsDebug_twntytwo");
		verifyTrue(selenium.isElementPresent("//table[2]/tbody/tr[12]/td"));
		verifyTrue(selenium.isElementPresent("//table[2]/tbody/tr[16]/td"));
		verifyTrue(selenium.isElementPresent("//table[2]/tbody/tr[17]/td"));
		verifyTrue(selenium.isElementPresent("//table[2]/tbody/tr[18]/td"));
		verifyTrue(selenium.isElementPresent("//tr[19]/td"));
		verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr/td"));
		System.out.println("EditContractsDebug_twntythree");
		verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr[2]/td"));
		verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr[4]/td"));
		verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr[5]/td"));
		verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr[6]/td"));
		verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr[7]/td"));
		verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr[8]/td"));
		verifyTrue(selenium.isElementPresent("//tr[18]/td"));
		verifyTrue(selenium.isElementPresent("//table[2]/tbody/tr[16]/td"));
		verifyTrue(selenium.isElementPresent("//table[2]/tbody/tr[19]/td"));
		System.out.println("EditContractsDebug_twnty4");
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