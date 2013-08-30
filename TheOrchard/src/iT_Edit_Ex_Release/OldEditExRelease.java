package iT_Edit_Ex_Release;

import org.testng.annotations.*;
import com.thoughtworks.selenium.FlashSelenium;
import FunctionLibrary.Common;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

@Test
public class OldEditExRelease extends SeleneseTestBase{

	public Selenium selenium;
	@BeforeClass
	public void loginUser() throws Exception{
		selenium=Common.CsetUp();
		Common.open(selenium);
			}
		public void userLogin() throws Exception{
        
		System.out.println("userlogin start");
         
    
      //  Login   
		Thread.sleep(7000);
		selenium.type("name=username", "synergy");
		Thread.sleep(2000);
		selenium.type("name=password", "Orchard09");
		Thread.sleep(2000);
		selenium.clickAt("//input[@type='submit']", "");
		Thread.sleep(10000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=contentArea")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
		System.out.println("UserLoginEnd");
	// 	OpenRelease
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
		Thread.sleep(2000);
		selenium.click("link=7123");
		Thread.sleep(20000);
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isTextPresent("Label Info")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		assertTrue(selenium.isTextPresent("Label Info"));
		assertTrue(selenium.isTextPresent("Label Summary"));
		System.out.println("OpenReleaseEndIf");
	// 	Edit_Ex_Release
		Thread.sleep(10000);
		selenium.clickAt("//ul[@id='itemTools']/li[9]/a", "");
		System.out.println("Edit_Ex_Release_01");
		Thread.sleep(15000);
	//	selenium.waitForPageToLoad("30000");
		assertTrue(selenium.isTextPresent("Manage Label Copy"));
		System.out.println("Edit_Ex_Release_02");
		assertTrue(selenium.isElementPresent("//table[@class='data']/tbody/tr[2]/td[4]/a"));
		System.out.println("//table[@class='data']/tbody/tr[2]/td[4]/a");
		selenium.clickAt("//table[@class='data']/tbody/tr[2]/td[4]/a", "");
		Thread.sleep(15000);
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=item")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}
		System.out.println("Edit_Ex_Release_test");
		assertTrue(selenium.isTextPresent("Edit Label Copy Release/Tracks"));
		assertTrue(selenium.isTextPresent("Label Copy Release Info"));
		Thread.sleep(2000);
		System.out.println("Edit_Ex_Release_04");
		selenium.select("name=product_type_id", "label=Movie");
		Thread.sleep(3000);
		selenium.select("name=film_subtype_film", "label=Feature");
		Thread.sleep(2000);
		selenium.select("name=meta_language", "label=German");
		Thread.sleep(2000);
		selenium.select("name=not_for_distribution", "label=N");
		Thread.sleep(2000);
		selenium.select("name=unknown_artist", "label=N");
		Thread.sleep(2000);
		selenium.select("name=language_id", "label=English");
		Thread.sleep(2000);
		selenium.select("name=subtitle_language_id", "label=French");
		Thread.sleep(2000);
		selenium.select("name=new_release", "label=New");
		Thread.sleep(2000);
		selenium.select("name=prmPreorderType", "label=Immediate");
		Thread.sleep(2000);
		selenium.select("name=prmArtistID", "label=Enrique");
		Thread.sleep(2000);
		selenium.type("name=vod_start_date", "2012-05-03");
		Thread.sleep(2000);
		selenium.select("name=distribution", "label=phys/digital");
		Thread.sleep(2000);
		selenium.select("id=primary_genre_id", "label=Animation");
		Thread.sleep(2000);
		selenium.addSelection("id=secondary_genre_id", "label=Adult");
		Thread.sleep(2000);
		selenium.addSelection("id=secondary_genre_id", "label=Biography");
		Thread.sleep(2000);
		selenium.select("name=europe_public_domain", "label=N");
		Thread.sleep(2000);
		selenium.select("name=product_format", "label=Single");
		Thread.sleep(2000);
		selenium.select("id=format", "label=Beta");
		Thread.sleep(2000);
		selenium.select("xpath=(//select[@id='ratings'])[9]", "label=M");
		Thread.sleep(2000);
		selenium.type("name=reasons_film[au_oflc]", "Reason 1");
		Thread.sleep(2000);
		selenium.select("xpath=(//select[@id='ratings'])[38]", "label=16+");
		Thread.sleep(2000);
		selenium.type("name=reasons_film[lv_movies]", "Reason 2");
		Thread.sleep(2000);
		selenium.click("//div[@id='contentArea']/div[4]/form/div[19]/input");
		Thread.sleep(5000);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isTextPresent("Edit Label Copy Release/Tracks")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("//div[@class='alertConfirm']")) break; } catch (Exception e) {}
			Thread.sleep(1000);
		}

		assertTrue(selenium.isTextPresent("Release Info. successfully updated."));
		Thread.sleep(2000);
		selenium.highlight("//div[@class='panelContent']/form[1]/div[11]/div[@class='divColTitle']/div[2]");
		Thread.sleep(300);
		selenium.highlight("//div[@class='panelContent']/form[1]/div[11]/div[@class='divColTitle']/div[2]");
		Thread.sleep(300);
		selenium.highlight("//div[@class='panelContent']/form[1]/div[11]/div[@class='divColTitle']/div[2]");
		Thread.sleep(300);
		selenium.highlight("//div[@class='movie_release_fields']/input");
		Thread.sleep(300);
		selenium.highlight("//div[@class='movie_release_fields']/input");
		Thread.sleep(300);
		selenium.highlight("//div[@class='movie_release_fields']/input");
		Thread.sleep(300);
		selenium.highlight("id=primary_genre_id");
		Thread.sleep(300);
		selenium.highlight("id=primary_genre_id");
		Thread.sleep(300);
		selenium.highlight("id=primary_genre_id");

		

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
