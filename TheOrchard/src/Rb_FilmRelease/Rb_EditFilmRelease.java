package Rb_FilmRelease;

import org.testng.annotations.*;


import FunctionLibrary.Common;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

public class Rb_EditFilmRelease extends SeleneseTestBase{

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
		System.out.println("2_9");
		String baseUrl = "http://rb4.alpha.theorchard.com/alw";
		selenium.open(baseUrl);
		selenium.windowFocus();
		selenium.windowMaximize();
		
		Thread.sleep(7000);
		verifyTrue(selenium.isElementPresent("css=#edit-username"));
		selenium.type("css=#edit-username", "recordlabel");
		Thread.sleep(2000);
		verifyTrue(selenium.isElementPresent("css=#edit-password"));
		selenium.type("css=#edit-password", "orchard999");
		System.out.println("3_9");
		Thread.sleep(2000);	
		verifyTrue(selenium.isElementPresent("css=#edit-submit"));
		selenium.clickAt("css=#edit-submit", "");
		Thread.sleep(15000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("//a[3]")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
		System.out.println("4_9");
		verifyTrue(selenium.isElementPresent("//a[3]"));

		selenium.open("http://rb4.alpha.theorchard.com/alw/releasebuilder/view?release_id=264142");
		selenium.waitForCondition("selenium.browserbot.getCurrentWindow().document.getElementById('edit_film_release_basics_button')", "40579");
		selenium.click("css=#edit_film_release_basics_button");
		selenium.waitForCondition("selenium.browserbot.getCurrentWindow().document.getElementById('meta_language')", "40579");
		verifyTrue(selenium.isElementPresent("css=#meta_language"));

		String MetaLanguage = selenium.getEval("'English'");
		verifyTrue(selenium.isElementPresent("css=#meta_language"));
		System.out.println("5_9");
		selenium.select("css=#meta_language", selenium.getEval("'" + MetaLanguage + "'"));
		String BrandName = selenium.getEval("'Selenium_BrandName_1337929254142'");
		Thread.sleep(20000);
		selenium.click("id=artistName");
		selenium.select("id=artistName", selenium.getEval("'" + BrandName + "'"));
		verifyTrue(selenium.isElementPresent("css=#artistName"));
		String FilmTitle = selenium.getEval("'Test'");
		verifyTrue(selenium.isElementPresent("css=#releaseName"));	
		System.out.println("6_9");
		selenium.type("css=#releaseName", selenium.getEval("'" + FilmTitle + "'"));
		String FilmType = selenium.getEval("'Feature'");
		verifyTrue(selenium.isElementPresent("css=#productSubtype"));
		verifyTrue(selenium.isElementPresent("css=#productSubtype"));
		selenium.select("css=#productSubtype", selenium.getEval("'" + FilmType + "'"));
		String Studio = selenium.getEval("'$Selenium_Studio_1339500200166'");
		verifyTrue(selenium.isElementPresent("css=#imprintName"));
		selenium.select("css=#imprintName", selenium.getEval("'" + Studio + "'"));
		String AudioLanguage = selenium.getEval("'Tswana'");
		System.out.println("7_9");
		verifyTrue(selenium.isElementPresent("css=#audio_language"));
		selenium.select("css=#audio_language", selenium.getEval("'" + AudioLanguage + "'"));
		selenium.click("css=#subtitled-Y");
		String PrimaryGenre = selenium.getEval("'Video'");
		verifyTrue(selenium.isElementPresent("css=#primaryGenre"));
		selenium.select("css=#primaryGenre", selenium.getEval("'" + PrimaryGenre + "'"));
		String SecondaryGenre = selenium.getEval("'Spanish Language'");
		selenium.click("css=#selected_secondarygenre_row_1 > span > img");
		Thread.sleep(4579);
		verifyTrue(selenium.isElementPresent("css=#secondaryGenres"));
		System.out.println("8_9");
		selenium.select("css=#secondaryGenres", selenium.getEval("'" + SecondaryGenre + "'"));
		String ShortSynopsis = selenium.getEval("'ShortSynopsis'");
		selenium.type("css=#shortSynopsis", selenium.getEval("'" + ShortSynopsis + "'"));
		String LongSynopsis = selenium.getEval("'LongSynopsis'");
		selenium.type("css=#description", selenium.getEval("'" + LongSynopsis + "'"));
		String DownloadStartDate = selenium.getEval("'2012-05-29'");
		verifyTrue(selenium.isElementPresent("css=#saleStartDate"));	
		selenium.type("css=#saleStartDate", selenium.getEval("'" + DownloadStartDate + "'"));
		System.out.println("9_9");
		String VODStartDate = selenium.getEval("'2012-05-29'");
		verifyTrue(selenium.isElementPresent("css=#vodStartDateBtn-Y"));
		selenium.click("css=#vodStartDateBtn-Y");
		selenium.type("css=#vodStartDate", selenium.getEval("'" + VODStartDate + "'"));
		verifyTrue(selenium.isElementPresent("css=#physicalReleaseDateBtn-Y"));
		selenium.click("css=#physicalReleaseDateBtn-Y");
		String PhysicalReleaseDate = selenium.getEval("'2012-05-29'");
		selenium.type("css=#physicalReleaseDate", selenium.getEval("'" + PhysicalReleaseDate + "'"));
		verifyTrue(selenium.isElementPresent("css=#theatricalReleaseDateBtn-Y"));
		System.out.println("10_9");
		selenium.click("css=#theatricalReleaseDateBtn-Y");		
		String TheatricalReleaseDate = selenium.getEval("'2012-05-29'");
		verifyTrue(selenium.isElementPresent("css=#theatricalReleaseDate"));
		selenium.type("css=#theatricalReleaseDate", selenium.getEval("'" + TheatricalReleaseDate + "'"));
		String CountryofOrigin = selenium.getEval("'Tonga'");
		selenium.select("css=#country_of_origin", selenium.getEval("'" + CountryofOrigin + "'"));
		verifyTrue(selenium.isElementPresent("css=#subtitled-Y"));
		selenium.click("css=#subtitled-Y");
		verifyTrue(selenium.isElementPresent("css=#subtitle_language"));
		Thread.sleep(14579);
		String SubtitleLanguage = selenium.getEval("'Umbundu'");
		selenium.select("css=#subtitle_language", selenium.getEval("'" + SubtitleLanguage + "'"));
		String CatalogNumb = selenium.getEval("'234234'");
		selenium.type("css=#labelCatalog", selenium.getEval("'" + CatalogNumb + "'"));
		verifyTrue(selenium.isElementPresent("css=#saveRelease"));
		selenium.click("css=#saveRelease");
		selenium.waitForCondition("selenium.browserbot.getCurrentWindow().document.getElementById('edit_film_release_basics_button')", "67999");
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
