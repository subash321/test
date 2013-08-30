package iT_Edit_Ex_Release;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import FunctionLibrary.Common;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

@Test
public class Grid_EditExRelease extends SeleneseTestBase{
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
        
        
        //  Login   
  		Thread.sleep(7000);
  		selenium.type("name=username", "synergy");
  		Thread.sleep(2000);
  		selenium.type("name=password", "Orchard09");
  		Thread.sleep(2000);
  		selenium.clickAt("//input[@type='submit']", "");
  		Thread.sleep(20579);
  		verifyTrue(selenium.isElementPresent("id=contentArea"));
  		verifyTrue(selenium.isElementPresent("css=input[name=\"varSearchString\"]"));
  		System.out.println("userlogin end");

  	// 	OpenRelease
  		System.out.println("OpenRelease start");
  		  selenium.open("oa/cont_mgmt/edit_ex_release.php?release_id=263946");
    		System.out.println("56");  
  		  Thread.sleep(68579);
  		System.out.println("57");  
  		String ProductType = selenium.getEval("'Movie'");
		verifyTrue(selenium.isElementPresent("css=select[name=\"product_type_id\"]"));
		selenium.select("css=select[name=\"product_type_id\"]", ProductType );
		String ReleaseMetaLanguage = selenium.getEval("'French'");
		verifyTrue(selenium.isElementPresent("css=select[name=\"meta_language\"]"));
		selenium.select("css=select[name=\"meta_language\"]", ReleaseMetaLanguage );
		String ReleaseName = selenium.getEval("'Selenium_Release_'+885686234877");
		verifyTrue(selenium.isElementPresent("css=input[name=\"release_name_req\"]"));
		selenium.type("css=input[name=\"release_name_req\"]", ReleaseName );
		String LabelImprint = selenium.getEval("'sony records'+(new Date().getDate())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"label\"]"));
		selenium.type("css=input[name=\"label\"]", LabelImprint );
		String ManufacturersUPC = selenium.getEval("''+(new Date().getDate())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"manufacturer_upc\"]"));
		selenium.type("css=input[name=\"manufacturer_upc\"]", ManufacturersUPC );
		String Line = selenium.getEval("'2012 VAPI'+(new Date().getHours())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"c_line\"]"));
		selenium.type("css=input[name=\"c_line\"]", Line );
		String DescriptionSynopsis = selenium.getEval("'Describe'+(new Date().getTime())");
		verifyTrue(selenium.isElementPresent("css=textarea[name=\"description\"]"));
		selenium.type("css=textarea[name=\"description\"]", DescriptionSynopsis );
		String NotForDistribution = selenium.getEval("'Y'");
		verifyTrue(selenium.isElementPresent("css=select[name=\"not_for_distribution\"]"));
		selenium.select("css=select[name=\"not_for_distribution\"]", NotForDistribution );
		String TributeByUnknownArtist = selenium.getEval("'Y'");
		verifyTrue(selenium.isElementPresent("css=select[name=\"unknown_artist\"]"));
		selenium.select("css=select[name=\"unknown_artist\"]", TributeByUnknownArtist );
		String PromoUPC = selenium.getEval("'601463444129'");
		verifyTrue(selenium.isElementPresent("css=input[name=\"promo_upc\"]"));
		selenium.type("css=input[name=\"promo_upc\"]", PromoUPC );
		String Language = selenium.getEval("'English'");
		verifyTrue(selenium.isElementPresent("css=select[name=\"language_id\"]"));
		selenium.select("css=select[name=\"language_id\"]", Language );
		String SubtitleLanguage = selenium.getEval("'French'");
		verifyTrue(selenium.isElementPresent("css=select[name=\"subtitle_language_id\"]"));
		selenium.select("css=select[name=\"subtitle_language_id\"]", SubtitleLanguage );
		String InitialPriority = selenium.getEval("'2'");
		verifyTrue(selenium.isElementPresent("css=select[name=\"priority\"]"));
		System.out.println("98");
		selenium.select("css=select[name=\"priority\"]", InitialPriority );
		String NewRelease = selenium.getEval("'Direct To Video'");
		verifyTrue(selenium.isElementPresent("css=select[name=\"new_release\"]"));
		selenium.select("css=select[name=\"new_release\"]", NewRelease );
		String OrchardArtist = selenium.getEval("'seleniumPro'");
		verifyTrue(selenium.isElementPresent("css=select[name=\"prmArtistID\"]"));
		System.out.println("106");
		selenium.select("css=select[name=\"prmArtistID\"]", OrchardArtist );
		String ReleaseDate = selenium.getEval("'2012-03-31'");
		verifyTrue(selenium.isElementPresent("css=input[name=\"release_date\"]"));
		selenium.type("css=input[name=\"release_date\"]", ReleaseDate );
		String SaleStartDate = selenium.getEval("'2012-06-20'");
		verifyTrue(selenium.isElementPresent("css=input[name=\"sale_start_date\"]"));
		selenium.type("css=input[name=\"sale_start_date\"]", SaleStartDate );
		String VODStartDate = selenium.getEval("'2012-05-03'");
		verifyTrue(selenium.isElementPresent("css=input[name=\"vod_start_date\"]"));
		selenium.type("css=input[name=\"vod_start_date\"]", SaleStartDate );
		System.out.println("115");
		String LabelCatalog = selenium.getEval("'2012 synergy'");
		verifyTrue(selenium.isElementPresent("css=input[name=\"VCN\"]"));
		selenium.type("css=input[name=\"VCN\"]", LabelCatalog );
		String Distribution = selenium.getEval("'phys/digital'");
		verifyTrue(selenium.isElementPresent("css=select[name=\"distribution\"]"));
		selenium.select("css=select[name=\"distribution\"]", Distribution );
		String GenreNote = selenium.getEval("'This is Primary & Secondary Genre.'");
		verifyTrue(selenium.isElementPresent("css=input[name=\"genre_note\"]"));
		selenium.type("css=input[name=\"genre_note\"]", GenreNote );
		String PrimaryGenre = selenium.getEval("'Animation'");
		verifyTrue(selenium.isElementPresent("css=#primary_genre_id"));
		selenium.select("css=#primary_genre_id", PrimaryGenre );
		System.out.println("127");
		Thread.sleep(4000);
		String SecondoryGenre = selenium.getEval("'Art House'");
		verifyTrue(selenium.isElementPresent("css=#secondary_genre_id"));
		selenium.select("css=#secondary_genre_id", SecondoryGenre );
		Thread.sleep(4000);
		String ofPromos = selenium.getEval("'adult'");
		verifyTrue(selenium.isElementPresent("css=input[name=\"promos_number\"]"));
		selenium.type("css=input[name=\"promos_number\"]", ofPromos );
		String PublicDomaininEurope = selenium.getEval("'Y'");
		verifyTrue(selenium.isElementPresent("css=select[name=\"europe_public_domain\"]"));
		selenium.select("css=select[name=\"europe_public_domain\"]", PublicDomaininEurope );
		String ProductFormat = selenium.getEval("'Boxset'");
		verifyTrue(selenium.isElementPresent("css=select[name=\"product_format\"]"));
		selenium.select("css=select[name=\"product_format\"]", ProductFormat );
		String Format = selenium.getEval("'DVD'");
		verifyTrue(selenium.isElementPresent("css=#format"));
		selenium.select("css=#format", Format );
		String Karaoke = selenium.getEval("'Y'");
		verifyTrue(selenium.isElementPresent("css=select[name=\"karaoke\"]"));
		selenium.select("css=select[name=\"karaoke\"]", Karaoke );
		String DigitalOnly = selenium.getEval("'Y'");
		verifyTrue(selenium.isElementPresent("css=select[name=\"digital_only\"]"));
		System.out.println("149");
		selenium.select("css=select[name=\"digital_only\"]", DigitalOnly );
		String Version = selenium.getEval("'Version'+(new Date().getDate())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"version\"]"));
		selenium.type("css=input[name=\"version\"]", Version );
		selenium.select("name=prmPreorderType", "label=Specific Date:");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=preorder_date")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		String Previewable = selenium.getEval("'2012-06-18'");
		verifyTrue(selenium.isElementPresent("//div[@id='preorder_date_box']/a[1]"));
		selenium.type("id=preorder_date", Previewable );
		String ShortSynopsis = selenium.getEval("'Version'+(new Date().getDate())");
		verifyTrue(selenium.isElementPresent("name=short_synopsis_film"));
		selenium.type("name=short_synopsis_film", ShortSynopsis );
		String AMGID = selenium.getEval("'Version'+(new Date().getDate())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"amd_id_film\"]"));
		selenium.type("css=input[name=\"amd_id_film\"]", AMGID );
		String TheatricalReleaseDate = selenium.getEval("'2012-03-19'");
		verifyTrue(selenium.isElementPresent("css=input[name=\"theatrical_release_date_film\"]"));
		selenium.type("css=input[name=\"theatrical_release_date_film\"]", TheatricalReleaseDate );
		String PhysicalReleaseDate = selenium.getEval("'2012-03-19'");
		verifyTrue(selenium.isElementPresent("css=input[name=\"physical_release_date\"]"));
		selenium.type("css=input[name=\"physical_release_date\"]", PhysicalReleaseDate );
		String Subtype = selenium.getEval("'Short'");
		verifyTrue(selenium.isElementPresent("css=select[name=\"film_subtype_film\"]"));
		selenium.select("css=select[name=\"film_subtype_film\"]", Subtype );
		String CountryofOrigin = selenium.getEval("'Angola'");
		verifyTrue(selenium.isElementPresent("css=select[name=\"country_of_origin_film\"]"));
		selenium.select("css=select[name=\"country_of_origin_film\"]", CountryofOrigin );
		String Channel = selenium.getEval("'Action'");
		verifyTrue(selenium.isElementPresent("css=select[name=\"channel_id_film\"]"));
		selenium.select("css=select[name=\"channel_id_film\"]", Channel );
		String ProductionCo = selenium.getEval("'Action'");
		verifyTrue(selenium.isElementPresent("css=input[name=\"production_co_film\"]"));
		selenium.type("css=input[name=\"production_co_film\"]", ProductionCo );
		String Brand = selenium.getEval("'Action'");
		verifyTrue(selenium.isElementPresent("css=input[name=\"brand_film\"]"));
		selenium.type("css=input[name=\"brand_film\"]", Brand );
		String TMSMovieID = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"tms_id_film\"]"));
		selenium.type("css=input[name=\"tms_id_film\"]", TMSMovieID );
		String ARMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("//td[2]/input"));
		selenium.type("//td[2]/input", ARMovies );
//		
//		
//		
//		
		System.out.println("205");
		String AUOFLC = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[au_oflc]\"]"));
		selenium.type("//tr[2]/td[2]/input", AUOFLC );
		String FSK = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[fsk]\"]"));
		System.out.println("199");
		selenium.type("//tr[3]/td[2]/input", FSK );
		
		String BEMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[be_movies]\"]"));
		selenium.type("//tr[4]/td[2]/input", BEMovies );
		String BOMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[bo_movies]\"]"));
		selenium.type("//tr[5]/td[2]/input", BOMovies );
		
		String BRMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[br_movies]\"]"));
		selenium.type("//tr[6]/td[2]/input", BRMovies );
		String BGMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[bg_movies]\"]"));
		selenium.type("//tr[7]/td[2]/input", BGMovies );
		String CACHVRS = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[ca_chvrs]\"]"));
		selenium.type("//tr[8]/td[2]/input", CACHVRS );
		
		
		System.out.println("239");
		String CLMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[cl_movies]\"]"));
		selenium.type("//tr[9]/td[2]/input", CLMovies );
		String COMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[co_movies]\"]"));
		selenium.type("//tr[10]/td[2]/input",COMovies );
		
				String CRMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[cr_movies]\"]"));
		selenium.type("//tr[11]/td[2]/input", CRMovies );		
		String CYMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[cy_movies]\"]"));
		selenium.type("//tr[12]/td[2]/input", CYMovies );
		String CZMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[cz_movies]\"]"));
		
		selenium.type("//tr[13]/td[2]/input", CZMovies );
		String DKMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[dk_movies]\"]"));
		selenium.type("//tr[14]/td[2]/input", DKMovies );
		String DOMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[do_movies]\"]"));
		
		selenium.type("//tr[15]/td[2]/input", DOMovies );
		String ECMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[ec_movies]\"]"));
		selenium.type("//tr[16]/td[2]/input", ECMovies );
		
		String SVMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[sv_movies]\"]"));
		selenium.type("//tr[17]/td[2]/input", SVMovies );
		String EEMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[ee_movies]\"]"));
		selenium.type("//tr[18]/td[2]/input", EEMovies );
		
		String FIMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[fi_movies]\"]"));
		selenium.type("//tr[19]/td[2]/input", FIMovies );
		String FRMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[fr_cnc]\"]"));
		selenium.type("//tr[20]/td[2]/input", FRMovies );
		
		String DEFSK = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[de-fsk]\"]"));
		selenium.type("//tr[21]/td[2]/input", DEFSK );
		String GRMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[gr_movies]\"]"));
		selenium.type("//tr[22]/td[2]/input", GRMovies );
		String GTMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[gt_movies]\"]"));
		selenium.type("//tr[23]/td[2]/input", GTMovies );
		String GYMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[gy_movies]\"]"));
		selenium.type("//tr[24]/td[2]/input", GYMovies );		
		String HNMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[hn_movies]\"]"));
		selenium.type("//tr[25]/td[2]/input", HNMovies );
		String HUMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[hu_movies]\"]"));
		selenium.type("//tr[26]/td[2]/input", HUMovies );
		String IEIfco = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[ie_ifco]\"]"));
		selenium.type("//tr[27]/td[2]/input", IEIfco );
		String ITMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[it_movies]\"]"));
		selenium.type("//tr[28]/td[2]/input", ITMovies );
		String JMMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[jm_movies]\"]"));
		
		
		
		selenium.type("//table[2]/tbody/tr/td[2]/input", JMMovies );
		String JPEIRIN = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[jp_eirin]\"]"));
		selenium.type("//table[2]/tbody/tr[2]/td[2]/input", JPEIRIN );
		String LVMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[lv_movies]\"]"));
		selenium.type("//table[2]/tbody/tr[3]/td[2]/input", LVMovies );
		String LTMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[lt_movies]\"]"));
		selenium.type("//table[2]/tbody/tr[4]/td[2]/input", LTMovies );
		String LUMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[lu_movies]\"]"));
		selenium.type("//table[2]/tbody/tr[5]/td[2]/input", LUMovies );
		String MTMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[mt_movies]\"]"));
		selenium.type("//table[2]/tbody/tr[6]/td[2]/input", MTMovies );
		String MXMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[mx_movies]\"]"));
		selenium.type("//table[2]/tbody/tr[7]/td[2]/input", MXMovies );
		String NLMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[nl_movies]\"]"));
		selenium.type("//table[2]/tbody/tr[8]/td[2]/input", NLMovies );
		System.out.println("298");
		String NZOflc = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[nz_oflc]\"]"));
		
		selenium.type("//table[2]/tbody/tr[9]/td[2]/input", NZOflc );
		String NIMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[ni_movies]\"]"));
		selenium.type("//table[2]/tbody/tr[10]/td[2]/input", NIMovies );
		String NOMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[no_movies]\"]"));
		selenium.type("//table[2]/tbody/tr[11]/td[2]/input", NOMovies );
		String PAMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[pa_movies]\"]"));
		selenium.type("//table[2]/tbody/tr[12]/td[2]/input", PAMovies );
		String PYMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[py_movies]\"]"));
		
		selenium.type("//table[2]/tbody/tr[13]/td[2]/input", PYMovies );
		String PEMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[pe_movies]\"]"));
		selenium.type("//table[2]/tbody/tr[14]/td[2]/input", PEMovies );
		String PLMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[pl_movies]\"]"));
		
		selenium.type("//table[2]/tbody/tr[15]/td[2]/input", PLMovies );
		String PTMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[pt_movies]\"]"));
		selenium.type("//table[2]/tbody/tr[16]/td[2]/input", PTMovies );
		String CARcq = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[ca-rcq]\"]"));
		
		selenium.type("//table[2]/tbody/tr[17]/td[2]/input", CARcq );
		String ROMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[ro_movies]\"]"));
		selenium.type("//table[2]/tbody/tr[18]/td[2]/input", ROMovies );
		selenium.selectWindow("null");
		String SKMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[sk_movies]\"]"));
		
		selenium.type("//table[2]/tbody/tr[19]/td[2]/input", SKMovies );
		String SIMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[si_movies]\"]"));
		selenium.type("//table[2]/tbody/tr[20]/td[2]/input", SIMovies );
		String ESMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[es_movies]\"]"));
		
		selenium.type("//table[2]/tbody/tr[21]/td[2]/input", ESMovies );
		String SRMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[sr_movies]\"]"));
		selenium.type("//table[2]/tbody/tr[22]/td[2]/input", SRMovies );
		String CHMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[ch_movies]\"]"));
		
		selenium.type("//table[2]/tbody/tr[23]/td[2]/input", CHMovies );
		String SEMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[se_movies]\"]"));
		selenium.type("//table[2]/tbody/tr[24]/td[2]/input", SEMovies );
		String BBFC = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[bbfc]\"]"));
		
		selenium.type("//table[2]/tbody/tr[25]/td[2]/input", BBFC );
		String UYMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[uy_movies]\"]"));
		selenium.type("//table[2]/tbody/tr[26]/td[2]/input", UYMovies );
		String MPAA = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[mpaa]\"]"));
		
		selenium.type("//table[2]/tbody/tr[27]/td[2]/input", MPAA );
		String VEMovies = selenium.getEval("'578'+(new Date().getSeconds())");
		verifyTrue(selenium.isElementPresent("css=input[name=\"reasons_film[ve_movies]\"]"));
		selenium.type("//table[2]/tbody/tr[28]/td[2]/input", VEMovies );
		String ArgentinaARMovies = selenium.getEval("'ATP'");
		verifyTrue(selenium.isElementPresent("//tr[@id='ar_movies_tr']/td[1]/select"));
		
		selenium.select("//tr[@id='ar_movies_tr']/td[1]/select", ArgentinaARMovies );
		String AustraliaAUOFLC = selenium.getEval("'G'");
		verifyTrue(selenium.isElementPresent("//tr[@id='au_oflc_tr']/td[1]/select"));
		selenium.select("//tr[@id='au_oflc_tr']/td[1]/select", AustraliaAUOFLC );
		String AustriaFSK = selenium.getEval("'ab 0 Jahren'");
		verifyTrue(selenium.isElementPresent("//tr[@id='fsk_tr']/td[1]/select"));
		selenium.select("//tr[@id='fsk_tr']/td[1]/select", AustriaFSK );
		String BelgiumBEMovies = selenium.getEval("'12'");
		verifyTrue(selenium.isElementPresent("//tr[@id='be_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='be_movies_tr']/td[1]/select", BelgiumBEMovies );
		String BoliviaBOMovies = selenium.getEval("'14'");
		verifyTrue(selenium.isElementPresent("//tr[@id='bo_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='bo_movies_tr']/td[1]/select", BoliviaBOMovies );
		String BrazilBRMovies = selenium.getEval("'10'");
		verifyTrue(selenium.isElementPresent("//tr[@id='br_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='br_movies_tr']/td[1]/select", BrazilBRMovies );
		String BulgariaBGMovies = selenium.getEval("'A'");
		verifyTrue(selenium.isElementPresent("//tr[@id='bg_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='bg_movies_tr']/td[1]/select", BulgariaBGMovies );
		String CanadaCACHVRS = selenium.getEval("'14A'");
		verifyTrue(selenium.isElementPresent("//tr[@id='ca_chvrs_tr']/td[1]/select"));
		selenium.select("//tr[@id='ca_chvrs_tr']/td[1]/select", CanadaCACHVRS );
		String ChileCLMovies = selenium.getEval("'14'");
		verifyTrue(selenium.isElementPresent("//tr[@id='cl_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='cl_movies_tr']/td[1]/select", ChileCLMovies );
		String ColombiaCOMovies = selenium.getEval("'12'");
		verifyTrue(selenium.isElementPresent("//tr[@id='co_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='co_movies_tr']/td[1]/select", ColombiaCOMovies );
		String CostaRicaCRMovies = selenium.getEval("'12'");
		verifyTrue(selenium.isElementPresent("//tr[@id='cr_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='cr_movies_tr']/td[1]/select", CostaRicaCRMovies );
		String CyprusCYMovies = selenium.getEval("'12'");
		verifyTrue(selenium.isElementPresent("//tr[@id='cy_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='cy_movies_tr']/td[1]/select", CyprusCYMovies );
		String CzechRepublicCZMovies = selenium.getEval("'12+'");
		verifyTrue(selenium.isElementPresent("//tr[@id='cz_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='cz_movies_tr']/td[1]/select", CzechRepublicCZMovies );
		String DenmarkDKMovies = selenium.getEval("'11'");
		System.out.println("399");
		verifyTrue(selenium.isElementPresent("//tr[@id='dk_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='dk_movies_tr']/td[1]/select", DenmarkDKMovies );
		String DominicanRepublicDOMovies = selenium.getEval("'Todos'");
		verifyTrue(selenium.isElementPresent("//tr[@id='do_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='do_movies_tr']/td[1]/select", DominicanRepublicDOMovies );
		String EcuadorECMovies = selenium.getEval("'12'");
		verifyTrue(selenium.isElementPresent("//tr[@id='ec_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='ec_movies_tr']/td[1]/select", EcuadorECMovies );
		String EISalvadorSVMovies = selenium.getEval("'12'");
		verifyTrue(selenium.isElementPresent("//tr[@id='sv_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='sv_movies_tr']/td[1]/select", EISalvadorSVMovies );
		String EstoniaEEMovies = selenium.getEval("'K12'");
		verifyTrue(selenium.isElementPresent("//tr[@id='ee_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='ee_movies_tr']/td[1]/select", EstoniaEEMovies );
		String FinlandFIovies = selenium.getEval("'K-11'");
		verifyTrue(selenium.isElementPresent("//tr[@id='fi_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='fi_movies_tr']/td[1]/select", FinlandFIovies );
		String FranceFRCNC = selenium.getEval("'-10'");
		verifyTrue(selenium.isElementPresent("//tr[@id='fr_cnc_tr']/td[1]/select"));
		selenium.select("//tr[@id='fr_cnc_tr']/td[1]/select", FranceFRCNC );
		String GermanyDEFSK = selenium.getEval("'ab 12 Jahren'");
		verifyTrue(selenium.isElementPresent("//tr[@id='de_fsk_tr']/td[1]/select"));
		selenium.select("//tr[@id='de_fsk_tr']/td[1]/select", GermanyDEFSK );
		String GreeceGRMovies = selenium.getEval("'K'");
		verifyTrue(selenium.isElementPresent("//tr[@id='gr_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='gr_movies_tr']/td[1]/select", GreeceGRMovies );
		String GuatemalaGTMovies = selenium.getEval("'A'");
		verifyTrue(selenium.isElementPresent("//tr[@id='gt_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='gt_movies_tr']/td[1]/select", GuatemalaGTMovies );
		String GuyanaGYMovies = selenium.getEval("'All Ages'");
		verifyTrue(selenium.isElementPresent("//tr[@id='gy_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='gy_movies_tr']/td[1]/select", GuyanaGYMovies );
		verifyTrue(selenium.isElementPresent("//tr[@id='hn_movies_tr']/td[1]/select"));
		String HondurasHNMovies = selenium.getEval("'14'");
		selenium.select("//tr[@id='hn_movies_tr']/td[1]/select", HondurasHNMovies );
		String HungaryHUMovies = selenium.getEval("'12'");
		verifyTrue(selenium.isElementPresent("//tr[@id='hu_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='hu_movies_tr']/td[1]/select", HungaryHUMovies );
		String IrelandIEIFCO = selenium.getEval("'12'");
		verifyTrue(selenium.isElementPresent("//tr[@id='ie_ifco_tr']/td[1]/select"));
		selenium.select("//tr[@id='ie_ifco_tr']/td[1]/select", IrelandIEIFCO );
		String ItalyITMovies = selenium.getEval("'T'");
		verifyTrue(selenium.isElementPresent("//tr[@id='it_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='it_movies_tr']/td[1]/select", ItalyITMovies );
		String JamaicaJMMovies = selenium.getEval("'U'");
		verifyTrue(selenium.isElementPresent("//tr[@id='jm_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='jm_movies_tr']/td[1]/select", JamaicaJMMovies );
		String JapanJPEIRIN = selenium.getEval("'G'");
		verifyTrue(selenium.isElementPresent("//tr[@id='jp_eirin_tr']/td[1]/select"));
		selenium.select("//tr[@id='jp_eirin_tr']/td[1]/select", JapanJPEIRIN );
		String LatviaLVMovies = selenium.getEval("'16+'");
		verifyTrue(selenium.isElementPresent("//tr[@id='lv_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='lv_movies_tr']/td[1]/select", LatviaLVMovies );
		String LithuaniaLTMovies = selenium.getEval("'A'");
		verifyTrue(selenium.isElementPresent("//tr[@id='lt_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='lt_movies_tr']/td[1]/select", LithuaniaLTMovies );
		String LuxembourgLUMovies = selenium.getEval("'12'");
		verifyTrue(selenium.isElementPresent("//tr[@id='lu_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='lu_movies_tr']/td[1]/select", LuxembourgLUMovies );
		String MaltaMTMovies = selenium.getEval("'12'");
		verifyTrue(selenium.isElementPresent("//tr[@id='mt_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='mt_movies_tr']/td[1]/select", MaltaMTMovies );
		String MexicoMXMovies = selenium.getEval("'A'");
		verifyTrue(selenium.isElementPresent("//tr[@id='mx_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='mx_movies_tr']/td[1]/select", MexicoMXMovies );
		String NetherlandsNLMovies = selenium.getEval("'12'");
		verifyTrue(selenium.isElementPresent("//tr[@id='nl_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='nl_movies_tr']/td[1]/select", NetherlandsNLMovies );
		String NewZealandNZOFLC = selenium.getEval("'G'");
		verifyTrue(selenium.isElementPresent("//tr[@id='nz_oflc_tr']/td[1]/select"));
		selenium.select("//tr[@id='nz_oflc_tr']/td[1]/select", NewZealandNZOFLC );
		String NicaraguaNIMovies = selenium.getEval("'R'");
		verifyTrue(selenium.isElementPresent("//tr[@id='ni_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='ni_movies_tr']/td[1]/select", NicaraguaNIMovies );
		String NorwayNOMovies = selenium.getEval("'18'");
		verifyTrue(selenium.isElementPresent("//tr[@id='no_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='no_movies_tr']/td[1]/select", NorwayNOMovies );
		String PanamaPAMovies = selenium.getEval("'A'");
		verifyTrue(selenium.isElementPresent("//tr[@id='pa_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='pa_movies_tr']/td[1]/select", PanamaPAMovies );
		String ParaguayPYMovies = selenium.getEval("'13'");
		verifyTrue(selenium.isElementPresent("//tr[@id='py_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='py_movies_tr']/td[1]/select", ParaguayPYMovies );
		String PeruPEMovies = selenium.getEval("'14'");
		verifyTrue(selenium.isElementPresent("//tr[@id='pe_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='pe_movies_tr']/td[1]/select", PeruPEMovies );
		String PolandPlMovies = selenium.getEval("'12'");
		verifyTrue(selenium.isElementPresent("//tr[@id='pl_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='pl_movies_tr']/td[1]/select", PolandPlMovies );
		String PortugalPTMovies = selenium.getEval("'M/12'");
		verifyTrue(selenium.isElementPresent("//tr[@id='pt_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='pt_movies_tr']/td[1]/select", PortugalPTMovies );
		System.out.println("491");
		String QuebecCARCQ = selenium.getEval("'13+'");
		verifyTrue(selenium.isElementPresent("//tr[@id='ca_rcq_tr']/td[1]/select"));
		selenium.select("//tr[@id='ca_rcq_tr']/td[1]/select", QuebecCARCQ );
		String RomaniaROMovies = selenium.getEval("'A.G.'");
		verifyTrue(selenium.isElementPresent("//tr[@id='ro_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='ro_movies_tr']/td[1]/select", RomaniaROMovies );
		String SlovakiaSKMovies = selenium.getEval("'12'");
		verifyTrue(selenium.isElementPresent("//tr[@id='sk_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='sk_movies_tr']/td[1]/select", SlovakiaSKMovies );
		String SloveniaSIMovies = selenium.getEval("'+15'");
		verifyTrue(selenium.isElementPresent("//tr[@id='si_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='si_movies_tr']/td[1]/select", SloveniaSIMovies );
		String SpainESMovies = selenium.getEval("'12'");
		verifyTrue(selenium.isElementPresent("//tr[@id='es_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='es_movies_tr']/td[1]/select", SpainESMovies );
		String SurinameSRMovies = selenium.getEval("'All Ages'");
		verifyTrue(selenium.isElementPresent("//tr[@id='sr_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='sr_movies_tr']/td[1]/select", SurinameSRMovies );
		String SwedenSEMovies = selenium.getEval("'Från 15 år'");
		verifyTrue(selenium.isElementPresent("//tr[@id='se_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='se_movies_tr']/td[1]/select", SwedenSEMovies );
		String SwitzerlandCHMovies = selenium.getEval("'0'");
		verifyTrue(selenium.isElementPresent("//tr[@id='ch_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='ch_movies_tr']/td[1]/select", SwitzerlandCHMovies );
		String UnitedKingdomBBFC = selenium.getEval("'12'");
		verifyTrue(selenium.isElementPresent("//tr[@id='bbfc_tr']/td[1]/select"));
		selenium.select("//tr[@id='bbfc_tr']/td[1]/select", UnitedKingdomBBFC );
		String UruguayUYMovies = selenium.getEval("'+15'");
		verifyTrue(selenium.isElementPresent("//tr[@id='uy_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='uy_movies_tr']/td[1]/select", UruguayUYMovies );
		String USMPAA = selenium.getEval("'G'");
		verifyTrue(selenium.isElementPresent("//tr[@id='mpaa_tr']/td[1]/select"));
		selenium.select("//tr[@id='mpaa_tr']/td[1]/select", USMPAA );
		String VenezuelaVEMovies = selenium.getEval("'A'");
		verifyTrue(selenium.isElementPresent("//tr[@id='ve_movies_tr']/td[1]/select"));
		selenium.select("//tr[@id='ve_movies_tr']/td[1]/select", VenezuelaVEMovies );
		selenium.click("//div[@class='panelButtons']/input[@type='submit']");
		Thread.sleep(20000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("class=alertConfirm")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		assertTrue(selenium.isTextPresent("Release Info. successfully updated."));
		verifyEquals(selenium.getValue("css=select[name=\"product_type_id\"]"), "3");
		verifyEquals(selenium.getValue("css=select[name=\"meta_language\"]"), "FRE");
		verifyEquals(selenium.getValue("css=input[name=\"release_name_req\"]"), ReleaseName );
		verifyEquals(selenium.getValue("css=input[name=\"label\"]"), LabelImprint );
		verifyEquals(selenium.getValue("css=input[name=\"manufacturer_upc\"]"), ManufacturersUPC );
		verifyEquals(selenium.getValue("css=input[name=\"c_line\"]"), Line );
		verifyEquals(selenium.getValue("css=textarea[name=\"description\"]"), DescriptionSynopsis );
		verifyEquals(selenium.getValue("css=select[name=\"not_for_distribution\"]"), NotForDistribution );
		verifyEquals(selenium.getValue("css=select[name=\"unknown_artist\"]"), TributeByUnknownArtist );
		verifyEquals(selenium.getValue("css=input[name=\"promo_upc\"]"), PromoUPC );
		verifyEquals(selenium.getValue("css=select[name=\"priority\"]"), InitialPriority );
		verifyEquals(selenium.getValue("css=select[name=\"new_release\"]"), "Direct_To_Video");
		verifyEquals(selenium.getValue("id=preorder_date"), Previewable );
		verifyEquals(selenium.getValue("css=select[name=\"prmArtistID\"]"), "167218");
		verifyEquals(selenium.getValue("css=input[name=\"release_date\"]"), ReleaseDate );
		verifyEquals(selenium.getValue("css=input[name=\"sale_start_date\"]"), SaleStartDate );
		verifyEquals(selenium.getValue("css=input[name=\"vod_start_date\"]"), SaleStartDate );
		verifyEquals(selenium.getValue("css=input[name=\"VCN\"]"), LabelCatalog );
		verifyEquals(selenium.getValue("css=select[name=\"distribution\"]"), Distribution );
		verifyEquals(selenium.getValue("css=#primary_genre_id"), "3");
		verifyEquals(selenium.getValue("css=input[name=\"genre_note\"]"), GenreNote );
		verifyEquals(selenium.getValue("css=#secondary_genre_id"), "32");
		verifyEquals(selenium.getValue("css=select[name=\"europe_public_domain\"]"), PublicDomaininEurope );
		verifyEquals(selenium.getValue("css=select[name=\"product_format\"]"), ProductFormat );
		verifyEquals(selenium.getValue("css=#format"), Format );
		verifyEquals(selenium.getValue("css=select[name=\"karaoke\"]"), Karaoke );
		verifyEquals(selenium.getValue("css=select[name=\"digital_only\"]"), DigitalOnly );
		verifyEquals(selenium.getValue("css=input[name=\"version\"]"), Version );
		verifyEquals(selenium.getValue("name=short_synopsis_film"), ShortSynopsis );
		verifyEquals(selenium.getValue("css=input[name=\"amd_id_film\"]"), AMGID );
		verifyEquals(selenium.getValue("css=input[name=\"theatrical_release_date_film\"]"), TheatricalReleaseDate );
		verifyEquals(selenium.getValue("css=input[name=\"physical_release_date\"]"), PhysicalReleaseDate );
		verifyEquals(selenium.getValue("css=select[name=\"film_subtype_film\"]"), "2");
		verifyEquals(selenium.getValue("css=select[name=\"country_of_origin_film\"]"), "21");
		verifyEquals(selenium.getValue("css=select[name=\"channel_id_film\"]"), "20");
		verifyEquals(selenium.getValue("css=input[name=\"production_co_film\"]"), ProductionCo );
		verifyEquals(selenium.getValue("css=input[name=\"brand_film\"]"), Brand );
		verifyEquals(selenium.getValue("css=input[name=\"tms_id_film\"]"), TMSMovieID );
		
		
		
		verifyEquals(selenium.getValue("//td[2]/input"), ARMovies );
		verifyEquals(selenium.getValue("//tr[2]/td[2]/input"), AUOFLC );
		verifyEquals(selenium.getValue("//tr[3]/td[2]/input"), FSK );
		verifyEquals(selenium.getValue("//tr[4]/td[2]/input"), BEMovies );
		verifyEquals(selenium.getValue("//tr[5]/td[2]/input"), BOMovies );
		verifyEquals(selenium.getValue("//tr[6]/td[2]/input"), BRMovies );
		verifyEquals(selenium.getValue("//tr[7]/td[2]/input"), BGMovies );
		verifyEquals(selenium.getValue("//tr[8]/td[2]/input"), CACHVRS );
		verifyEquals(selenium.getValue("//tr[9]/td[2]/input"), CLMovies );
		verifyEquals(selenium.getValue("//tr[10]/td[2]/input"), COMovies );
		verifyEquals(selenium.getValue("//tr[11]/td[2]/input"), CRMovies );
		verifyEquals(selenium.getValue("//tr[12]/td[2]/input"), CYMovies );
		verifyEquals(selenium.getValue("//tr[13]/td[2]/input"), CZMovies );
		verifyEquals(selenium.getValue("//tr[14]/td[2]/input"), DKMovies );
		verifyEquals(selenium.getValue("//tr[15]/td[2]/input"), DOMovies );
		verifyEquals(selenium.getValue("//tr[16]/td[2]/input"), ECMovies );
		verifyEquals(selenium.getValue("//tr[17]/td[2]/input"), SVMovies );
		verifyEquals(selenium.getValue("//tr[18]/td[2]/input"), EEMovies );
		verifyEquals(selenium.getValue("//tr[19]/td[2]/input"), FIMovies );
		verifyEquals(selenium.getValue("//tr[20]/td[2]/input"), FRMovies );
		verifyEquals(selenium.getValue("//tr[21]/td[2]/input"), DEFSK );
		verifyEquals(selenium.getValue("//tr[22]/td[2]/input"), GRMovies );
		verifyEquals(selenium.getValue("//tr[23]/td[2]/input"), GTMovies );
		verifyEquals(selenium.getValue("//tr[24]/td[2]/input"), GYMovies );
		verifyEquals(selenium.getValue("//tr[25]/td[2]/input"), HNMovies );
		System.out.println("599");	
		verifyEquals(selenium.getValue("//tr[26]/td[2]/input"), HUMovies );
		verifyEquals(selenium.getValue("//tr[27]/td[2]/input"), IEIfco );
		verifyEquals(selenium.getValue("//tr[28]/td[2]/input"), ITMovies );
		
		verifyEquals(selenium.getValue("//table[2]/tbody/tr/td[2]/input"), JMMovies );
		verifyEquals(selenium.getValue("//table[2]/tbody/tr[2]/td[2]/input"), JPEIRIN );
		verifyEquals(selenium.getValue("//table[2]/tbody/tr[3]/td[2]/input"), LVMovies );
		verifyEquals(selenium.getValue("//table[2]/tbody/tr[4]/td[2]/input"), LTMovies );
		verifyEquals(selenium.getValue("//table[2]/tbody/tr[5]/td[2]/input"), LUMovies );
		verifyEquals(selenium.getValue("//table[2]/tbody/tr[6]/td[2]/input"), MTMovies );
		verifyEquals(selenium.getValue("//table[2]/tbody/tr[7]/td[2]/input"), MXMovies );
		verifyEquals(selenium.getValue("//table[2]/tbody/tr[8]/td[2]/input"), NLMovies );
		verifyEquals(selenium.getValue("//table[2]/tbody/tr[9]/td[2]/input"), NZOflc );
		verifyEquals(selenium.getValue("//table[2]/tbody/tr[10]/td[2]/input"), NIMovies );
		verifyEquals(selenium.getValue("//table[2]/tbody/tr[11]/td[2]/input"), NOMovies );
		verifyEquals(selenium.getValue("//table[2]/tbody/tr[12]/td[2]/input"), PAMovies );
		verifyEquals(selenium.getValue("//table[2]/tbody/tr[13]/td[2]/input"), PYMovies );
		verifyEquals(selenium.getValue("//table[2]/tbody/tr[14]/td[2]/input"), PEMovies );
		verifyEquals(selenium.getValue("//table[2]/tbody/tr[15]/td[2]/input"), PLMovies );
		verifyEquals(selenium.getValue("//table[2]/tbody/tr[16]/td[2]/input"), PTMovies );
		verifyEquals(selenium.getValue("//table[2]/tbody/tr[17]/td[2]/input"), CARcq );
		verifyEquals(selenium.getValue("//table[2]/tbody/tr[18]/td[2]/input"), ROMovies );
		verifyEquals(selenium.getValue("//table[2]/tbody/tr[19]/td[2]/input"), SKMovies );
		verifyEquals(selenium.getValue("//table[2]/tbody/tr[20]/td[2]/input"), SIMovies );
		verifyEquals(selenium.getValue("//table[2]/tbody/tr[21]/td[2]/input"), ESMovies );
		verifyEquals(selenium.getValue("//table[2]/tbody/tr[22]/td[2]/input"), SRMovies );
		verifyEquals(selenium.getValue("//table[2]/tbody/tr[23]/td[2]/input"), CHMovies );
		verifyEquals(selenium.getValue("//table[2]/tbody/tr[24]/td[2]/input"), SEMovies );
		verifyEquals(selenium.getValue("//table[2]/tbody/tr[25]/td[2]/input"), BBFC );
		verifyEquals(selenium.getValue("//table[2]/tbody/tr[26]/td[2]/input"), UYMovies );
		verifyEquals(selenium.getValue("//table[2]/tbody/tr[27]/td[2]/input"), MPAA );
		verifyEquals(selenium.getValue("//table[2]/tbody/tr[28]/td[2]/input"), VEMovies );
		verifyEquals(selenium.getSelectedValue("//tr[@id='ar_movies_tr']/td[1]/select"), "111");
		verifyEquals(selenium.getSelectedValue("//tr[@id='au_oflc_tr']/td[1]/select"), "74");
		verifyEquals(selenium.getSelectedValue("//tr[@id='fsk_tr']/td[1]/select"), "116");
		verifyEquals(selenium.getSelectedValue("//tr[@id='be_movies_tr']/td[1]/select"), "125");
		verifyEquals(selenium.getSelectedValue("//tr[@id='bo_movies_tr']/td[1]/select"), "141");
		verifyEquals(selenium.getSelectedValue("//tr[@id='br_movies_tr']/td[1]/select"), "145");
		verifyEquals(selenium.getSelectedValue("//tr[@id='bg_movies_tr']/td[1]/select"), "150");
		verifyEquals(selenium.getSelectedValue("//tr[@id='ca_chvrs_tr']/td[1]/select"), "82");
		verifyEquals(selenium.getSelectedValue("//tr[@id='cl_movies_tr']/td[1]/select"), "157");
		verifyEquals(selenium.getSelectedValue("//tr[@id='co_movies_tr']/td[1]/select"), "162");
		verifyEquals(selenium.getSelectedValue("//tr[@id='cr_movies_tr']/td[1]/select"), "167");
		verifyEquals(selenium.getSelectedValue("//tr[@id='cy_movies_tr']/td[1]/select"), "172");
		verifyEquals(selenium.getSelectedValue("//tr[@id='cz_movies_tr']/td[1]/select"), "176");
		verifyEquals(selenium.getSelectedValue("//tr[@id='dk_movies_tr']/td[1]/select"), "181");
		verifyEquals(selenium.getSelectedValue("//tr[@id='do_movies_tr']/td[1]/select"), "183");
		verifyEquals(selenium.getSelectedValue("//tr[@id='ec_movies_tr']/td[1]/select"), "186");
		verifyEquals(selenium.getSelectedValue("//tr[@id='sv_movies_tr']/td[1]/select"), "192");
		verifyEquals(selenium.getSelectedValue("//tr[@id='ee_movies_tr']/td[1]/select"), "199");
		verifyEquals(selenium.getSelectedValue("//tr[@id='fi_movies_tr']/td[1]/select"), "204");
		verifyEquals(selenium.getSelectedValue("//tr[@id='fr_cnc_tr']/td[1]/select"), "92");
		verifyEquals(selenium.getSelectedValue("//tr[@id='de_fsk_tr']/td[1]/select"), "89");
		verifyEquals(selenium.getSelectedValue("//tr[@id='gr_movies_tr']/td[1]/select"), "213");
		verifyEquals(selenium.getSelectedValue("//tr[@id='gt_movies_tr']/td[1]/select"), "216");
		verifyEquals(selenium.getSelectedValue("//tr[@id='gy_movies_tr']/td[1]/select"), "222");
		verifyEquals(selenium.getSelectedValue("//tr[@id='hn_movies_tr']/td[1]/select"), "225");
		verifyEquals(selenium.getSelectedValue("//tr[@id='hu_movies_tr']/td[1]/select"), "230");
		verifyEquals(selenium.getSelectedValue("//tr[@id='ie_ifco_tr']/td[1]/select"), "235");
		verifyEquals(selenium.getSelectedValue("//tr[@id='it_movies_tr']/td[1]/select"), "238");
		verifyEquals(selenium.getSelectedValue("//tr[@id='jm_movies_tr']/td[1]/select"), "244");
		verifyEquals(selenium.getSelectedValue("//tr[@id='jp_eirin_tr']/td[1]/select"), "96");
		verifyEquals(selenium.getSelectedValue("//tr[@id='lt_movies_tr']/td[1]/select"), "256");
		verifyEquals(selenium.getSelectedValue("//tr[@id='lu_movies_tr']/td[1]/select"), "137");
		verifyEquals(selenium.getSelectedValue("//tr[@id='mt_movies_tr']/td[1]/select"), "263");
		verifyEquals(selenium.getSelectedValue("//tr[@id='mx_movies_tr']/td[1]/select"), "268");
		verifyEquals(selenium.getSelectedValue("//tr[@id='nl_movies_tr']/td[1]/select"), "131");
		verifyEquals(selenium.getSelectedValue("//tr[@id='nz_oflc_tr']/td[1]/select"), "101");
		Thread.sleep(2000);
		System.out.println("669");
		assertTrue(selenium.isElementPresent("name=prmMore"));
		selenium.type("name=prmMore", "1");
		Thread.sleep(2000);
		selenium.click("name=exAdd");
		Thread.sleep(8000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("name=exSave")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		assertTrue(selenium.isElementPresent("name=prmMoreTrackName_0"));
		Thread.sleep(2000);
		assertTrue(selenium.isElementPresent("name=prmMoreExplicitLyrics_0"));
		String Explicit = selenium.getEval("'Clean'");
		selenium.select("name=prmMoreExplicitLyrics_0", Explicit );
		Thread.sleep(2000);
		assertTrue(selenium.isElementPresent("name=prmMoreOfferType_0"));
		String OfferType = selenium.getEval("'Album Download Only'");
		selenium.select("name=prmMoreOfferType_0", OfferType );
		Thread.sleep(2000);
		assertTrue(selenium.isElementPresent("name=prmMoreTrackName_0"));
		String TrackName = selenium.getEval("'$Selenium_track_'+(new Date().getTime())");
		selenium.type("name=prmMoreTrackName_0", TrackName );
		Thread.sleep(2000);
		assertTrue(selenium.isElementPresent("name=prmMorePLine_0"));
		String P_Line = selenium.getEval("'2012 RecordLabel 123'");
		selenium.type("name=prmMorePLine_0", P_Line );
		Thread.sleep(2000);
		assertTrue(selenium.isElementPresent("name=prmMoreHours_0"));
		String Hour = selenium.getEval("'1'");
		selenium.type("name=prmMoreHours_0", Hour );
		Thread.sleep(2000);
		assertTrue(selenium.isElementPresent("name=prmMoreMinutes_0"));
		String Minute = selenium.getEval("'2'");
		selenium.type("name=prmMoreMinutes_0", Minute );
		Thread.sleep(2000);
		assertTrue(selenium.isElementPresent("name=prmMoreSeconds_0"));
		String Seconds = selenium.getEval("'3'");
		selenium.type("name=prmMoreSeconds_0", Seconds );
		Thread.sleep(2000);
		selenium.click("name=prmMoreBonus_0");
		Thread.sleep(2000);
		assertTrue(selenium.isElementPresent("name=preview_start_time_0"));
		String PreviewStartTime = selenium.getEval("'2000'");
		selenium.type("name=preview_start_time_0", PreviewStartTime );
		Thread.sleep(2000);
		assertTrue(selenium.isElementPresent("id=prmMoreTrackType_0"));
		String TrackType = selenium.getEval("'Music'");
		selenium.select("id=prmMoreTrackType_0", TrackType );
		Thread.sleep(2000);
		assertTrue(selenium.isElementPresent("name=prmMoreYouTubeMatches_0"));
		String YouTubeMatches = selenium.getEval("'Take Down'");
		selenium.select("name=prmMoreYouTubeMatches_0", YouTubeMatches );
		Thread.sleep(2000);
		selenium.click("name=exSave");
		Thread.sleep(8000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("class=alertConfirm")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
		System.out.println("729");
		assertTrue(selenium.isTextPresent("Tracks successfully updated."));	
		System.out.println("732");
  		    
		//Logout
  			Thread.sleep(8000);
  			selenium.clickAt("link=Logout", "");
  			Thread.sleep(5000);
  			for (int second1 = 0;; second1++) {
  				if (second1 >= 60) fail("timeout");
  				try { if (selenium.isElementPresent("id=loginBox")) break; } catch (Exception e) {}
  				Thread.sleep(1000);}
  			System.out.println("end if");

	     
        try {
            Thread.sleep(24579);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }   
}