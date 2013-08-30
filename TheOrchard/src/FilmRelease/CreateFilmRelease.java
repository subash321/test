package FilmRelease;

import org.testng.annotations.*;

import FunctionLibrary.Common;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

public class CreateFilmRelease extends SeleneseTestBase{

	public Selenium selenium;
	
	
	@BeforeClass
	public void loginUser() throws Exception{
/*	url="http://rbfilm.synergy.theorchard.com/"
    login="/alw"
    username="synergy"
    password="Orchard999"
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
	//  Login
		System.out.println("loginstart");
		Thread.sleep(7000);
		verifyTrue(selenium.isElementPresent("css=#edit-username"));
		selenium.type("css=#edit-username", "recordlabel");
		Thread.sleep(2000);
		verifyTrue(selenium.isElementPresent("css=#edit-password"));
		selenium.type("css=#edit-password", "orchard999");
		Thread.sleep(2000);
		verifyTrue(selenium.isElementPresent("css=#edit-submit"));
		selenium.clickAt("css=#edit-submit", "");
		Thread.sleep(15000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("//a[3]")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		verifyTrue(selenium.isElementPresent("//a[3]"));
	//	CreateFilmRelease
		verifyTrue(selenium.isElementPresent("//a[3]"));
		selenium.click("//a[3]");
		Thread.sleep(12000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("css=#modalWindow > h1")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		verifyTrue(selenium.isElementPresent("css=#modalWindow > h1"));
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("css=h3.roundedsubheader")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		verifyTrue(selenium.isElementPresent("css=h3.roundedsubheader"));
		String MetaLanguage = selenium.getEval("'English'");
		verifyTrue(selenium.isElementPresent("css=#meta_language"));
		selenium.select("css=#meta_language", selenium.getEval("'" + MetaLanguage + "'"));
		String BrandName = selenium.getEval("'Test ADD Artist 2117515129'");
		verifyTrue(selenium.isElementPresent("css=#artistName"));
		selenium.select("css=#artistName", selenium.getEval("'" + BrandName + "'"));
		String FilmTitle = selenium.getEval("'CreateFilmTitle'");
		verifyTrue(selenium.isElementPresent("css=#releaseName"));
		selenium.type("css=#releaseName", selenium.getEval("'" + FilmTitle + "'"));
		String FilmType = selenium.getEval("'sneak_peak'");
		verifyTrue(selenium.isElementPresent("css=#productSubtype"));
		selenium.select("css=#productSubtype", selenium.getEval("'" + FilmType + "'"));
		String Studio = selenium.getEval("'ViciSolum Productions'");
		verifyTrue(selenium.isElementPresent("css=#imprintName"));
		selenium.select("css=#imprintName", selenium.getEval("'" + Studio + "'"));
		String AudioLanguage = selenium.getEval("'Tswana'");
		verifyTrue(selenium.isElementPresent("css=#audio_language"));
		selenium.select("css=#audio_language", selenium.getEval("'" + AudioLanguage + "'"));
		selenium.click("css=#subtitled-Y");
		String PrimaryGenre = selenium.getEval("'Video'");
		verifyTrue(selenium.isElementPresent("css=#primaryGenre"));
		selenium.select("css=#primaryGenre", selenium.getEval("'" + PrimaryGenre + "'"));
		String SecondaryGenre = selenium.getEval("'Video'");
		verifyTrue(selenium.isElementPresent("css=#secondaryGenres"));
		selenium.select("css=#secondaryGenres", selenium.getEval("'" + SecondaryGenre + "'"));
		String ShortSynopsis = selenium.getEval("'ShortSynopsis'");
		selenium.type("css=#shortSynopsis", selenium.getEval("'" + ShortSynopsis + "'"));
		String LongSynopsis = selenium.getEval("'LongSynopsis'");
		selenium.type("css=#description", selenium.getEval("'" + LongSynopsis + "'"));
		selenium.click("css=#saleStartDateBtn-Y");
		String DownloadStartDate = selenium.getEval("'2012-05-29'");
		verifyTrue(selenium.isElementPresent("css=#saleStartDate"));
		selenium.type("css=#saleStartDate", selenium.getEval("'" + DownloadStartDate + "'"));
		String VODStartDate = selenium.getEval("'2012-05-29'");
		verifyTrue(selenium.isElementPresent("css=#vodStartDateBtn-Y"));
		selenium.click("css=#vodStartDateBtn-Y");
		selenium.type("css=#vodStartDate", selenium.getEval("'" + VODStartDate + "'"));
		verifyTrue(selenium.isElementPresent("css=#physicalReleaseDateBtn-Y"));
		selenium.click("css=#physicalReleaseDateBtn-Y");
		String PhysicalReleaseDate = selenium.getEval("'2012-05-29'");
		selenium.type("css=#physicalReleaseDate", selenium.getEval("'" + PhysicalReleaseDate + "'"));
		verifyTrue(selenium.isElementPresent("css=#theatricalReleaseDateBtn-Y"));
		selenium.click("css=#theatricalReleaseDateBtn-Y");
		String TheatricalReleaseDate = selenium.getEval("'2012-05-29'");
		verifyTrue(selenium.isElementPresent("css=#theatricalReleaseDate"));
		selenium.type("css=#theatricalReleaseDate", selenium.getEval("'" + TheatricalReleaseDate + "'"));
		String CountryofOrigin = selenium.getEval("'Tonga'");
		selenium.select("css=#country_of_origin", selenium.getEval("'" + CountryofOrigin + "'"));
		verifyTrue(selenium.isElementPresent("css=#subtitle_language"));
		String SubtitleLanguage = selenium.getEval("'Umbundu'");
		selenium.select("css=#subtitle_language", selenium.getEval("'" + SubtitleLanguage + "'"));
		selenium.click("css=#saveRelease > span");
		Thread.sleep(37000);
		verifyEquals(selenium.getText("css=p"), selenium.getEval("'Brand Name: '+'" + BrandName + "'"));
		verifyEquals(selenium.getText("css=#country_of_origin_display"), selenium.getEval("'" + CountryofOrigin + "'"));
		verifyEquals(selenium.getText("css=#audio_language_display"), selenium.getEval("'" + AudioLanguage + "'"));
		verifyEquals(selenium.getText("css=#meta_language_display"), selenium.getEval("'" + MetaLanguage + "'"));
		verifyEquals(selenium.getText("css=#imprint_display"), selenium.getEval("'" + Studio + "'"));
		verifyEquals(selenium.getText("css=#genre_display"), selenium.getEval("'" + PrimaryGenre + "'"));
		verifyEquals(selenium.getText("css=#subgenre_display"), selenium.getEval("'" + SecondaryGenre + "'"));
		verifyEquals(selenium.getText("css=#short_synopsis_display"), selenium.getEval("'" + ShortSynopsis + "'"));
		verifyEquals(selenium.getText("css=#description_display"), selenium.getEval("'" + LongSynopsis + "'"));
		verifyEquals(selenium.getText("css=#vod_start_date_display"), selenium.getEval("'" + VODStartDate + "'"));
		verifyEquals(selenium.getText("css=#physical_release_date_display"), selenium.getEval("'" + PhysicalReleaseDate + "'"));
		verifyEquals(selenium.getText("css=#theatrical_release_date_display"), selenium.getEval("'" + TheatricalReleaseDate + "'"));
		verifyEquals(selenium.getText("css=#sales_start_date_display"), selenium.getEval("'" + DownloadStartDate + "'"));


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
