package IT_Edit_Release;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import FunctionLibrary.Common;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

@Test
public class Grid_Edit_Release extends SeleneseTestBase{
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
    		verifyTrue(selenium.isElementPresent("css=input[name=\"username\"]"));
    		selenium.type("css=input[name=\"username\"]","synergy");
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

    	//  OpenRelease
    		selenium.type("css=input[name=\"varSearchString\"]", "7123");
    		selenium.click("//input[3]");
    		Thread.sleep(35579);
    		selenium.select("css=select[name=\"search_list\"]", "label=Release");
    		Thread.sleep(8579);
    		selenium.type("css=input[name=\"label_id\"]", "7123");
    		selenium.click("css=div.panelButtons > input[type=\"submit\"]");
    		Thread.sleep(8579);
    		verifyTrue(selenium.isElementPresent("css=a[title=\"View Release\"]"));
    		selenium.click("css=a[title=\"View Release\"]");
    		Thread.sleep(8579);
    	
    	//	EditReleaseDebug_01
    		Thread.sleep(2000);
    		verifyTrue(selenium.isElementPresent("link=Edit"));
    		selenium.click("link=Edit");
    		Thread.sleep(24579);
    		for (int second = 0;; second++) {
    			if (second >= 60) fail("timeout");
    			try { if (selenium.isElementPresent("css=select[name=\"meta_language\"]")) break; } catch (Exception e) {}
    			Thread.sleep(1000);
    		}
    	
    		Thread.sleep(1000);
    		System.out.println("EditReleaseDebug_01.01");
    		String MetaLanguage = "English";
    		System.out.println("EditReleaseDebug_02");
    		Thread.sleep(1000);
    		selenium.select("css=select[name=\"meta_language\"]", selenium.getEval("'" + MetaLanguage + "'"));
    		Thread.sleep(1000);
    		String ManufacturersUPC = selenium.getEval("'5454'+(new Date().getSeconds())");
    		verifyTrue(selenium.isElementPresent("css=input[name=\"manufacturer_upc\"]"));
    		selenium.type("css=input[name=\"manufacturer_upc\"]",ManufacturersUPC);
    		String LabelCatalog = selenium.getEval("''+(new Date().getTime())");
    		verifyTrue(selenium.isElementPresent("css=input[name=\"vendor_catalog_number\"]"));
    		selenium.type("css=input[name=\"vendor_catalog_number\"]",LabelCatalog);
    		selenium.select("css=select[name=\"album_download\"]", "label=No");
    		System.out.println("EditReleaseDebug_003");
    		String RetailReleasePrice = "98987";
    		verifyTrue(selenium.isElementPresent("css=input[name=\"download_price\"]"));
    		selenium.type("css=input[name=\"download_price\"]",RetailReleasePrice);
    		System.out.println("EditReleaseDebug_04");
    		selenium.type("css=input[name=\"release_name\"]", "Release Name");
    		String Label = selenium.getEval("'Label'+(new Date().getTime())");
    		selenium.type("css=input[name=\"label\"]",Label.toLowerCase());
    		verifyTrue(selenium.isElementPresent("css=input[name=\"sale_start_date\"]"));
    		String SaleStartDate = selenium.getEval("'2012-05-29'");
    		System.out.println("EditReleaseDebug_05");
    		selenium.type("css=input[name=\"sale_start_date\"]",SaleStartDate);
    		Thread.sleep(2000);
    		String ReleaseDate = selenium.getEval("'2012-05-27'");
    		verifyTrue(selenium.isElementPresent("css=input[name=\"release_date\"]"));
    		selenium.type("css=input[name=\"release_date\"]",ReleaseDate);
    		String ApplicationFee = selenium.getEval("'578'+(new Date().getSeconds())");
    		verifyTrue(selenium.isElementPresent("css=input[name=\"applfees\"]"));
    		selenium.type("css=input[name=\"applfees\"]",ApplicationFee);
    		String Promocode = selenium.getEval("''+(new Date().getTime())");
    		verifyTrue(selenium.isElementPresent("css=input[name=\"promocode\"]"));
    		selenium.type("css=input[name=\"promocode\"]",Promocode);
    		System.out.println("EditReleaseDebug_06");
    		String Promobox = selenium.getEval("''+(new Date().getTime())");
    		verifyTrue(selenium.isElementPresent("css=input[name=\"promobox_no\"]"));
    		selenium.type("css=input[name=\"promobox_no\"]",Promobox);
    		System.out.println("EditReleaseDebug_06.one");
    		selenium.type("css=input[name=\"referral_id\"]","Referral");
    		System.out.println("EditReleaseDebug_06.02");
    		String Distribution = "phys/digital";
    		selenium.select("css=select[name=\"distribution\"]",Distribution);
    		System.out.println("EditReleaseDebug_06.three");
    		Thread.sleep(2000);
    		Thread.sleep(2000);
    		System.out.println("EditReleaseDebug_06.04");
    		selenium.select("name=sellprice","label=1.85");
    		System.out.println("EditReleaseDebug_06.05");
    		selenium.select("name=listprice","label=5.98");
    		String Primary_Genre ="DVD";
    		System.out.println("EditReleaseDebug_09");
    		verifyTrue(selenium.isElementPresent("id=genre_id"));
    		selenium.select("id=genre_id",Primary_Genre);
    		System.out.println("EditReleaseDebug_09.Oone");
    		Thread.sleep(8579);
    		selenium.type("name=genre_note", "Genre Note");
/*    		String Format="Beta";
    		System.out.println("EditReleaseDebug_09.Two");
    		verifyTrue(selenium.isElementPresent("css=#format"));
    		selenium.select("css=#format",Format);*/
    		System.out.println("EditReleaseDebug_09.Three");
    		String Description = selenium.getEval("'DVD'+(new Date().getTime())");
    		System.out.println("EditReleaseDebug_09.04");
    		verifyTrue(selenium.isElementPresent("css=textarea[name=\"description\"]"));
    		System.out.println("EditReleaseDebug_ten");
    		selenium.type("css=textarea[name=\"description\"]",Description);
    		selenium.type("name=orig_release_year", "Orig");
    		selenium.type("name=original_release_date", "Original R");
    		System.out.println("EditReleaseDebug_eleven");
    		String Priority="2";
    		System.out.println("EditReleaseDebug_ten");
    		verifyTrue(selenium.isElementPresent("css=select[name=\"priority\"]"));
    		selenium.select("css=select[name=\"priority\"]",Priority);
    		System.out.println("EditReleaseDebug_ten.01");
    		String Display="yes";
    		verifyTrue(selenium.isElementPresent("name=display"));
    		System.out.println("EditReleaseDebug_ten.02");	
    		selenium.select("name=display",Display);
    		String CopyrightInfo ="2012 Red Chilly";
    		verifyTrue(selenium.isElementPresent("css=input[name=\"c_line\"]"));
    		System.out.println("EditReleaseDebug_012");
    		selenium.type("css=input[name=\"c_line\"]",CopyrightInfo);
    		String NotForDistribution="Y";
    		verifyTrue(selenium.isElementPresent("css=select[name=\"not_for_distribution\"]"));
    		selenium.select("css=select[name=\"not_for_distribution\"]",NotForDistribution);
    		String PublicDomaininEurope ="Y";
    		verifyTrue(selenium.isElementPresent("css=select[name=\"europe_public_domain\"]"));
    		selenium.select("css=select[name=\"europe_public_domain\"]",PublicDomaininEurope);
    		String TributebyUnknownArtist = "Y";
    		verifyTrue(selenium.isElementPresent("css=select[name=\"unknown_artist\"]"));
    		System.out.println("EditReleaseDebug_13");
    		selenium.select("css=select[name=\"unknown_artist\"]",TributebyUnknownArtist);
    		String ProductFormat ="Boxset";
    		verifyTrue(selenium.isElementPresent("css=select[name=\"product_format\"]"));
    		selenium.select("css=select[name=\"product_format\"]",ProductFormat);
    		selenium.select("name=trackdown_black_list", "label=Y");
    		String Karaoke = "Y";
    		verifyTrue(selenium.isElementPresent("css=select[name=\"karaoke\"]"));
    		selenium.select("css=select[name=\"karaoke\"]",Karaoke);
    		String SyncOnly = "Y";
    		verifyTrue(selenium.isElementPresent("css=select[name=\"sync_only\"]"));
    		selenium.select("css=select[name=\"sync_only\"]",SyncOnly);
    		String NewRelease ="New";
    		verifyTrue(selenium.isElementPresent("css=select[name=\"new_release\"]"));
    		selenium.select("css=select[name=\"new_release\"]",NewRelease);
    		String OfPromos = "10";
    		System.out.println("EditReleaseDebug_14");
    		verifyTrue(selenium.isElementPresent("css=input[name=\"promos_number\"]"));
    		selenium.type("css=input[name=\"promos_number\"]",OfPromos);
    		selenium.select("name=digital_only", "label=Y");
    		String Version ="Version";
    		verifyTrue(selenium.isElementPresent("name=version"));
    		selenium.type("name=version",Version);
    		String ProductType = "Movie";
    		verifyTrue(selenium.isElementPresent("name=product_type_id"));
    		selenium.select("name=product_type_id",ProductType);
    		selenium.select("id=primary_genre_id", "label=Holiday");
    		selenium.type("name=version", "Version");
    		String PromoUPC = selenium.getEval("''+(new Date().getTime())");
    		verifyTrue(selenium.isElementPresent("css=input[name=\"promo_upc\"]"));
    		System.out.println("EditReleaseDebug_15");
    		selenium.type("css=input[name=\"promo_upc\"]",PromoUPC);
    		String Language = "Aleut";
    		verifyTrue(selenium.isElementPresent("css=select[name=\"language_id\"]"));
    		selenium.select("css=select[name=\"language_id\"]",Language);
    		selenium.select("name=subtitle_language_id", "label=Algonquian languages");
    		String PreOrder = "2012-05-27";
    		System.out.println("EditReleaseDebug_16");
    		/*selenium.type("css=#preorder_date",PreOrder);*/
    		/*selenium.select("id=itunes_previewable", "label=No");*/
    		selenium.type("css=textarea[name=\"short_synopsis_film\"]", "Synopsis");
    		selenium.type("css=input[name=\"keywords_film\"]", "Keywords");
    		verifyTrue(selenium.isElementPresent("css=input[name=\"theatrical_release_date_film\"]"));
    		selenium.type("css=input[name=\"theatrical_release_date_film\"]", "2012-05-28");
    		Thread.sleep(2000);
    		verifyTrue(selenium.isElementPresent("css=input[name=\"physical_release_date\"]"));
    		selenium.type("css=input[name=\"physical_release_date\"]", "2012-05-28");
    		selenium.type("css=input[name=\"amd_id_film\"]", "AMG");
    		selenium.select("css=select[name=\"film_subtype_film\"]", "label=Feature");
    		System.out.println("EditReleaseDebug_17");
    		selenium.select("css=select[name=\"country_of_origin_film\"]", "label=Afghanistan");
    		selenium.select("css=select[name=\"channel_id_film\"]", "label=Action");
    		selenium.type("css=input[name=\"production_co_film\"]", "Production");
    		selenium.type("css=input[name=\"brand_film\"]", "Brand");
    		selenium.type("css=input[name=\"tms_id_film\"]", "TMS");
    		selenium.check("css=input[name=\"est_film\"]");
    		System.out.println("EditReleaseDebug_18");
    		selenium.check("css=input[name=\"vod_film\"]");
    		selenium.select("//div[2]/div/table/tbody/tr/td/select", "label=ATP");
    		selenium.select("//div[2]/div/table/tbody/tr[2]/td/select", "label=G");
    		selenium.select("//div[2]/div/table/tbody/tr[3]/td/select", "label=ab 0 Jahren");
    		selenium.select("//div[2]/div/table/tbody/tr[4]/td/select", "label=16");
    		selenium.select("//div[2]/div/table/tbody/tr[5]/td/select", "label=18");
    		selenium.select("//div[2]/div/table/tbody/tr[6]/td/select", "label=12");
    		selenium.select("//div[2]/div/table/tbody/tr[7]/td/select", "label=B");
    		selenium.select("//div[2]/div/table/tbody/tr[8]/td/select", "label=18A");
    		selenium.select("//div[2]/div/table/tbody/tr[9]/td/select", "label=14");
    		selenium.select("//div[2]/div/table/tbody/tr[10]/td/select", "label=15");
    		selenium.select("//div[2]/div/table/tbody/tr[11]/td/select", "label=12");
    		System.out.println("EditReleaseDebug_19");
    		selenium.select("//div/table/tbody/tr[12]/td/select", "label=12");
    		selenium.select("//div/table/tbody/tr[13]/td/select", "label=12+");
    		selenium.select("//div/table/tbody/tr[14]/td/select", "label=15");
    		selenium.select("//div/table/tbody/tr[15]/td/select", "label=Todos");
    		selenium.select("//div/table/tbody/tr[16]/td/select", "label=15");
    		selenium.select("//div/table/tbody/tr[17]/td/select", "label=12");
    		selenium.select("//div/table/tbody/tr[18]/td/select", "label=K14");
    		selenium.select("//div/table/tbody/tr[19]/td/select", "label=K-13");
    		selenium.select("//div/table/tbody/tr[20]/td/select", "label=-12");
    		System.out.println("EditReleaseDebug_twnty");
    		selenium.select("//tr[21]/td/select", "label=ab 0 Jahren");
    		selenium.select("//tr[22]/td/select", "label=K-13");
    		selenium.select("//div/table/tbody/tr[23]/td/select", "label=B");
    		selenium.select("//div/table/tbody/tr[24]/td/select", "label=All Ages");
    		selenium.select("//tr[25]/td/select", "label=15");
    		selenium.select("//tr[26]/td/select", "label=12");
    		System.out.println("EditReleaseDebug_twentyone");
    		selenium.select("//div/table/tbody/tr[27]/td/select", "label=15");
    		System.out.println("263");
    		selenium.select("//div/table/tbody/tr[28]/td/select", "label=VM10");
    		System.out.println("265");
/*    		selenium.type("css=input[name=\"reasons_film[ar_movies]\"]", "Reasons (AR-Movies)");
    		System.out.println("267");
    		selenium.type("css=input[name=\"reasons_film[au_oflc]\"]", "Reasons (AU-OFLC)");
    		System.out.println("269");
    		selenium.type("css=input[name=\"reasons_film[fsk]\"]", "FSK");
    		System.out.println("EditReleaseDebug_t2");
    		selenium.type("//td[2]/input", "BE-Movies");
    		System.out.println("273");
    		selenium.type("css=input[name=\"reasons_film[bo_movies]\"]", "BO-Movies");
    		selenium.type("css=input[name=\"reasons_film[br_movies]\"]", "BR-Movies");
    		selenium.type("css=input[name=\"reasons_film[bg_movies]\"]", "BG-Movies");
    		selenium.type("css=input[name=\"reasons_film[ca_chvrs]\"]", "CA-CHVRS");
    		selenium.type("css=input[name=\"reasons_film[cl_movies]\"]", "CL-Movies");
    		selenium.type("css=input[name=\"reasons_film[co_movies]\"]", "CO-Movies");
    		selenium.type("css=input[name=\"reasons_film[cr_movies]\"]", "CR-Movies");
    		selenium.type("css=input[name=\"reasons_film[cy_movies]\"]", "CY-Movies");
    		selenium.type("css=input[name=\"reasons_film[cz_movies]\"]", "CZ-Movies");
    		selenium.type("css=input[name=\"reasons_film[dk_movies]\"]", "DK-Movies");
    		selenium.type("css=input[name=\"reasons_film[do_movies]\"]", "DO-Movies");
    		selenium.type("css=input[name=\"reasons_film[ec_movies]\"]", "EC-Movies");
    		selenium.type("css=input[name=\"reasons_film[sv_movies]\"]", "SV-Movies");
    		selenium.type("css=input[name=\"reasons_film[ee_movies]\"]", "EE-Movies");
    		selenium.type("css=input[name=\"reasons_film[fi_movies]\"]", "FI-Movies");
    		selenium.type("css=input[name=\"reasons_film[fr_cnc]\"]", "FR-CNC");
    		selenium.type("css=input[name=\"reasons_film[de-fsk]\"]", "DE-FSK");
    		selenium.type("css=input[name=\"reasons_film[gr_movies]\"]", "GR-Movies");	
    		selenium.type("css=input[name=\"reasons_film[gt_movies]\"]", "GT-Movies");
    		selenium.type("css=input[name=\"reasons_film[gy_movies]\"]", "GY-Movies");
    		System.out.println("EditReleaseDebug_23");
    		selenium.type("css=input[name=\"reasons_film[hn_movies]\"]", "HN-Movies");
    		selenium.type("css=input[name=\"reasons_film[hu_movies]\"]", "HU-Movies");
    		selenium.type("css=input[name=\"reasons_film[ie_ifco]\"]", "IE-IFCO");
    		selenium.type("css=input[name=\"reasons_film[it_movies]\"]", "IT-Movies");*/
    		selenium.type("//td[2]/input", "Reasons (AR-Movies)");
    		selenium.type("//tr[2]/td[2]/input", "Reasons (AU-OFLC)");
    		selenium.type("//tr[3]/td[2]/input", "FSK");
    		selenium.type("//tr[4]/td[2]/input", "BE-Movies");
    		selenium.type("//tr[5]/td[2]/input", "BO-Movies");
    		selenium.type("//tr[6]/td[2]/input", "BR-Movies");
    		selenium.type("//tr[7]/td[2]/input", "BG-Movies");
    		selenium.type("//tr[8]/td[2]/input", "CA-CHVRS");
    		selenium.type("//tr[9]/td[2]/input", "CL-Movies");
    		selenium.type("//tr[10]/td[2]/input", "CO-Movies");
    		selenium.type("//tr[11]/td[2]/input", "CR-Movies");
    		selenium.type("//tr[12]/td[2]/input", "CY-Movies");
    		selenium.type("//tr[13]/td[2]/input", "CZ-Movies");
    		selenium.type("//tr[14]/td[2]/input", "DK-Movies");
    		selenium.type("//tr[15]/td[2]/input", "DO-Movies");
    		selenium.type("//tr[16]/td[2]/input", "EC-Movies");
    		selenium.type("//tr[17]/td[2]/input", "SV-Movies");
    		selenium.type("//tr[18]/td[2]/input", "EE-Movies");
    		selenium.type("//tr[19]/td[2]/input", "FI-Movies");
    		selenium.type("//tr[20]/td[2]/input", "FR-CNC");
    		selenium.type("//tr[21]/td[2]/input", "DE-FSK");
    		selenium.type("//tr[22]/td[2]/input", "GR-Movies");
    		selenium.type("//tr[23]/td[2]/input", "GT-Movies");
    		selenium.type("//tr[24]/td[2]/input", "GY-Movies");
    		selenium.type("//tr[25]/td[2]/input", "HN-Movies");
    		selenium.type("//tr[26]/td[2]/input", "HU-Movies");
    		selenium.type("//tr[27]/td[2]/input", "IE-IFCO");
    		selenium.type("//tr[28]/td[2]/input", "IT-Movies");
    		System.out.println("327");
    		
    		selenium.select("//div[2]/div/table[2]/tbody/tr/td/select", "label=A-16");
    		selenium.select("//div[2]/div/table[2]/tbody/tr[2]/td/select", "label=G");
    		selenium.select("//div[2]/div/table[2]/tbody/tr[3]/td/select", "label=12+");
    		selenium.select("//div[2]/div/table[2]/tbody/tr[4]/td/select", "label=A");
    		selenium.select("//div[2]/div/table[2]/tbody/tr[5]/td/select", "label=12");
    		selenium.select("//div[2]/div/table[2]/tbody/tr[6]/td/select", "label=12");
    		selenium.select("//div[2]/div/table[2]/tbody/tr[7]/td/select", "label=A");
    		selenium.select("//div[2]/div/table[2]/tbody/tr[8]/td/select", "label=12");
    		selenium.select("//div[2]/div/table[2]/tbody/tr[9]/td/select", "label=G");
    		selenium.select("//div[2]/div/table[2]/tbody/tr[10]/td/select", "label=PG");
    		selenium.select("//div[2]/div/table[2]/tbody/tr[11]/td/select", "label=11");
    		selenium.select("//div/table[2]/tbody/tr[12]/td/select", "label=A");
    		selenium.select("//div/table[2]/tbody/tr[13]/td/select", "label=13");
    		selenium.select("//div/table[2]/tbody/tr[14]/td/select", "label=18");
    		selenium.select("//div/table[2]/tbody/tr[15]/td/select", "label=12");
    		selenium.select("//table[2]/tbody/tr[16]/td/select", "label=M/12");
    		selenium.select("//div/table[2]/tbody/tr[17]/td/select", "label=13+");
    		selenium.select("//div/table[2]/tbody/tr[18]/td/select", "label=A.G.");
    		selenium.select("//table[2]/tbody/tr[19]/td/select", "label=12");
    		selenium.select("//table[2]/tbody/tr[20]/td/select", "label=+15");
    		selenium.select("//table[2]/tbody/tr[21]/td/select", "label=12");
    		selenium.select("//table[2]/tbody/tr[22]/td/select", "label=All Ages");
    	//	selenium.select("//table[2]/tbody/tr[23]/td/select", "label=Barntillåten");
    		selenium.select("//table[2]/tbody/tr[24]/td/select", "label=10");
    		selenium.select("//table[2]/tbody/tr[25]/td/select", "label=12");
    		selenium.select("//table[2]/tbody/tr[26]/td/select", "label=+12");
    		selenium.select("//table[2]/tbody/tr[27]/td/select", "label=PG");
    		selenium.select("//table[2]/tbody/tr[27]/td/select", "label=X\\N");
    		selenium.select("//table[2]/tbody/tr[28]/td/select", "label=B");
    		
    		/*selenium.type("css=input[name=\"reasons_film[jm_movies]\"]", "JM-Movies");
    		selenium.type("css=input[name=\"reasons_film[jp_eirin]\"]", "JP-EIRIN");
    		selenium.type("css=input[name=\"reasons_film[lv_movies]\"]", "LV-Movies");
    		selenium.type("css=input[name=\"reasons_film[lt_movies]\"]", "LT-Movies");
    		selenium.type("css=input[name=\"reasons_film[lu_movies]\"]", "LU-Movies");
    		selenium.type("css=input[name=\"reasons_film[mt_movies]\"]", "MT-Movies");
    		selenium.type("css=input[name=\"reasons_film[mx_movies]\"]", "MX-Movies");
    		selenium.type("css=input[name=\"reasons_film[nl_movies]\"]", "NL-Movies");
    		selenium.type("css=input[name=\"reasons_film[nz_oflc]\"]", "NZ-OFLC");
    		selenium.type("css=input[name=\"reasons_film[ni_movies]\"]", "NI-Movies");
    		selenium.type("css=input[name=\"reasons_film[no_movies]\"]", "NO-Movies");
    		selenium.type("css=input[name=\"reasons_film[pa_movies]\"]", "PA-Movies");
    		selenium.type("css=input[name=\"reasons_film[py_movies]\"]", "PY-Movies");
    		selenium.type("css=input[name=\"reasons_film[pe_movies]\"]", "PE-Movies");
    		selenium.type("css=input[name=\"reasons_film[pl_movies]\"]", "PL-Movies");
    		selenium.type("css=input[name=\"reasons_film[pt_movies]\"]", "PT-Movies");
    		selenium.type("css=input[name=\"reasons_film[ca-rcq]\"]", "CA-RCQ");
    		selenium.type("css=input[name=\"reasons_film[ro_movies]\"]", "RO-Movies");
    		selenium.type("css=input[name=\"reasons_film[sk_movies]\"]", "SK-Movies");
    		selenium.type("css=input[name=\"reasons_film[si_movies]\"]", "SI-Movies");
    		selenium.type("css=input[name=\"reasons_film[es_movies]\"]", "ES-Movies");
    		selenium.type("css=input[name=\"reasons_film[sr_movies]\"]", "SR-Movies");
    		selenium.type("css=input[name=\"reasons_film[se_movies]\"]", "SE-Movies");
    		selenium.type("css=input[name=\"reasons_film[ch_movies]\"]", "CH-Movies");
    		selenium.type("css=input[name=\"reasons_film[bbfc]\"]", "BBFC");
    		selenium.type("css=input[name=\"reasons_film[uy_movies]\"]", "UY-Movies");
    		selenium.type("css=input[name=\"reasons_film[mpaa]\"]", "MPAA");
    		selenium.type("css=input[name=\"reasons_film[ve_movies]\"]", "VE-Movies");
    		selenium.click("css=input[type=\"button\"]");*/
    		
    		System.out.println("389");
    		selenium.type("//table[2]/tbody/tr/td[2]/input", "JM-Movies");
    		selenium.type("//table[2]/tbody/tr[2]/td[2]/input", "JP-EIRIN");
    		selenium.type("//table[2]/tbody/tr[3]/td[2]/input", "LV-Movies");
    		selenium.type("//table[2]/tbody/tr[4]/td[2]/input", "LT-Movies");
    		selenium.type("//table[2]/tbody/tr[5]/td[2]/input", "LU-Movies");
    		selenium.type("//table[2]/tbody/tr[6]/td[2]/input", "MT-Movies");
    		selenium.type("//table[2]/tbody/tr[7]/td[2]/input", "MX-Movies");
    		selenium.type("//table[2]/tbody/tr[8]/td[2]/input", "NL-Movies");
    		selenium.type("//table[2]/tbody/tr[9]/td[2]/input", "NZ-OFLC");
    		selenium.type("//table[2]/tbody/tr[10]/td[2]/input", "NI-Movies");
    		selenium.type("//table[2]/tbody/tr[11]/td[2]/input", "NO-Movies");
    		selenium.type("//table[2]/tbody/tr[12]/td[2]/input", "PA-Movies");
    		selenium.type("//table[2]/tbody/tr[13]/td[2]/input", "PY-Movies");
    		selenium.type("//table[2]/tbody/tr[14]/td[2]/input", "PE-Movies");
    		selenium.type("//table[2]/tbody/tr[15]/td[2]/input", "PL-Movies");
    		selenium.type("//table[2]/tbody/tr[16]/td[2]/input", "PT-Movies");
    		selenium.type("//table[2]/tbody/tr[17]/td[2]/input", "CA-RCQ");
    		selenium.type("//table[2]/tbody/tr[18]/td[2]/input", "RO-Movies");
    		selenium.type("//table[2]/tbody/tr[19]/td[2]/input", "SK-Movies");
    		selenium.type("//table[2]/tbody/tr[20]/td[2]/input", "SI-Movies");
    		selenium.type("//table[2]/tbody/tr[21]/td[2]/input", "ES-Movies");
    		selenium.type("//table[2]/tbody/tr[22]/td[2]/input", "SR-Movies");
    		selenium.type("//table[2]/tbody/tr[23]/td[2]/input", "SE-Movies");
    		selenium.type("//table[2]/tbody/tr[24]/td[2]/input", "CH-Movies");
    		selenium.type("//table[2]/tbody/tr[25]/td[2]/input", "BBFC");
    		selenium.type("//table[2]/tbody/tr[26]/td[2]/input", "UY-Movies");
    		selenium.type("//table[2]/tbody/tr[27]/td[2]/input", "MPAA");
    		selenium.type("//table[2]/tbody/tr[28]/td[2]/input", "VE-Movies");
    		selenium.click("//div[4]/input");
    		System.out.println("419");
    		Thread.sleep(4500);
    	//	VerificationDebug_01
    		System.out.println("VerificationDebug_02");
    	//	verifyEquals(selenium.getText("css=div.alertConfirm"),"Release Info. successfully updated.");
    		verifyTrue(selenium.isTextPresent("Release Info. successfully updated."));
    		System.out.println("VerificationDebug_02.01");
    		verifyTrue(selenium.isElementPresent("css=div.alertConfirm"));
    		System.out.println("VerificationDebug_02.two");
    		verifyTrue(selenium.isElementPresent("link=Release Name"));
    		System.out.println("VerificationDebug_02.Othree");
    	//	//div[@id='contentWrapper']/p/a[3]
    	//	selenium.clickAt("//div[@id='contentWrapper']/p/a[3]", "");
    		System.out.println("VerificationDebug_02.Otwo");
    		selenium.clickAt("link=Release Name", "");
    	//	selenium.click("//p/a[3]");
    		System.out.println("VerificationDebug_02.04");
    		Thread.sleep(8000);
    		System.out.println("VerificationDebug_003");
    		verifyTrue(selenium.isElementPresent("//div[6]/table/tbody/tr[2]/th"));
    		verifyTrue(selenium.isElementPresent("//tr[3]/th"));
    		verifyTrue(selenium.isElementPresent("//tr[4]/th"));
    		verifyTrue(selenium.isElementPresent("//tr[5]/th"));
    		verifyTrue(selenium.isElementPresent("//tr[6]/th"));
    		verifyTrue(selenium.isElementPresent("//tr[7]/th"));
    		verifyTrue(selenium.isElementPresent("//tr[8]/th"));
    		verifyTrue(selenium.isElementPresent("//tr[9]/th"));
    		verifyTrue(selenium.isElementPresent("//tr[10]/th"));
    		verifyTrue(selenium.isElementPresent("//tr[11]/th"));
    		verifyTrue(selenium.isElementPresent("//tr[12]/th"));
    		verifyTrue(selenium.isElementPresent("//tr[13]/th"));
    		System.out.println("VerificationDebug_04");
    		verifyTrue(selenium.isElementPresent("//tr[14]/th"));
    		verifyTrue(selenium.isElementPresent("//tr[15]/th"));
    		verifyTrue(selenium.isElementPresent("css=table.form.full > tbody > tr > th"));
    		verifyTrue(selenium.isElementPresent("css=table.form > tbody > tr > th"));
    		verifyTrue(selenium.isElementPresent("//div[6]/table[2]/tbody/tr/th"));
    		verifyTrue(selenium.isElementPresent("//div[6]/table[2]/tbody/tr[2]/th"));
    		verifyTrue(selenium.isElementPresent("//table[2]/tbody/tr[3]/th"));
    		verifyTrue(selenium.isElementPresent("//table[2]/tbody/tr[4]/th"));
    		verifyTrue(selenium.isElementPresent("//table[2]/tbody/tr[5]/th"));
    		verifyTrue(selenium.isElementPresent("//table[2]/tbody/tr[6]/th"));
    		verifyTrue(selenium.isElementPresent("//table[2]/tbody/tr[7]/th"));
    		verifyTrue(selenium.isElementPresent("//table[2]/tbody/tr[8]/th"));
    		verifyTrue(selenium.isElementPresent("//table[2]/tbody/tr[9]/th"));
    		verifyTrue(selenium.isElementPresent("//table[2]/tbody/tr[10]/th"));
    		verifyTrue(selenium.isElementPresent("//table[2]/tbody/tr[11]/th"));
    		System.out.println("VerificationDebug_05");
    		verifyTrue(selenium.isElementPresent("//table[2]/tbody/tr[12]/th"));
    		verifyTrue(selenium.isElementPresent("//table[2]/tbody/tr[13]/th"));
    		verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr/th"));
    		verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr[2]/th"));
    		verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr[3]/th"));
    		verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr[4]/th"));
    		verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr[5]/th"));
    		verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr[6]/th"));
    		verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr[7]/th"));
    		verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr[8]/th"));
    		verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr[9]/th"));
    		verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr[10]/th"));
    		verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr[11]/th"));
    		verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr[12]/th"));
    		verifyTrue(selenium.isElementPresent("//table[3]/tbody/tr[13]/th"));
    		System.out.println("VerificationDebug_06");
    		verifyEquals(selenium.getText("css=table.form > tbody > tr > td"),MetaLanguage);
    		verifyEquals(selenium.getText("//div[6]/table/tbody/tr[2]/td"),Label.toLowerCase());
    		verifyEquals(selenium.getText("//tr[3]/td"),Distribution);
    		verifyEquals(selenium.getText("css=table.form > tbody > tr > td"),MetaLanguage);
    		verifyEquals(selenium.getText("//div[6]/table/tbody/tr[2]/td"),Label.toLowerCase());
        	verifyEquals(selenium.getText("//tr[3]/td"),Distribution);
    		/*verifyEquals(selenium.getText("//tr[4]/td"),Format);*/
    		verifyEquals(selenium.getText("//tr[8]/td"),Display);
    		verifyEquals(selenium.getText("//tr[9]/td"),Language);
    		verifyTrue(selenium.isElementPresent("//tr[13]/td"));
    		verifyEquals(selenium.getText("//tr[13]/td"),CopyrightInfo);
    		verifyEquals(selenium.getText("//tr[14]/td"),NotForDistribution);
    		verifyEquals(selenium.getText("//tr[15]/td"),TributebyUnknownArtist);
    		verifyEquals(selenium.getText("//tr[16]/td"),OfPromos);
    		System.out.println("VerificationDebug_07");
    		verifyEquals(selenium.getText("//table[4]/tbody/tr/td"),Description);
    		verifyEquals(selenium.getText("//div[6]/table[2]/tbody/tr[2]/td"),ReleaseDate);
    		verifyEquals(selenium.getText("//table[2]/tbody/tr[3]/td"),SaleStartDate);
    		verifyEquals(selenium.getText("//table[2]/tbody/tr[5]/td"),Priority);
    		verifyEquals(selenium.getText("//table[2]/tbody/tr[7]/td"),ManufacturersUPC);
    		verifyEquals(selenium.getText("//table[2]/tbody/tr[8]/td"),Promocode);
    		verifyEquals(selenium.getText("//table[2]/tbody/tr[9]/td"),Promobox);
    		verifyEquals(selenium.getText("//table[2]/tbody/tr[10]/td"),PublicDomaininEurope);
    		verifyEquals(selenium.getText("//table[2]/tbody/tr[11]/td"),SyncOnly);
    		verifyEquals(selenium.getText("//table[2]/tbody/tr[12]/td"),PromoUPC);
    		verifyEquals(selenium.getText("//table[2]/tbody/tr[13]/td"),ProductType);
    		System.out.println("VerificationDebug_08");
    		verifyEquals(selenium.getText("//table[2]/tbody/tr[14]/td"),NewRelease);
    		verifyEquals(selenium.getText("//table[3]/tbody/tr[2]/td"),RetailReleasePrice);
    		verifyEquals(selenium.getText("//table[3]/tbody/tr[8]/td"),LabelCatalog);
    		verifyEquals(selenium.getText("//table[3]/tbody/tr[9]/td"),ApplicationFee);
    		verifyEquals(selenium.getText("//table[3]/tbody/tr[11]/td"),Karaoke);
    		verifyEquals(selenium.getText("//table[3]/tbody/tr[12]/td"),ProductFormat);
    		verifyEquals(selenium.getText("//table[3]/tbody/tr[13]/td"),Version);

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