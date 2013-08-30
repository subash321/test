package FlashButton;

import org.testng.annotations.*;

import FunctionLibrary.Common;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.FlashSelenium;
public class NewFlashButtonClick extends SeleneseTestBase{

	public Selenium selenium;
	private FlashSelenium flashApp;

	
	@BeforeClass
	public void setUp() throws Exception{
	/*	url="http://trunk.synergy.theorchard.com"
	    login="/alw"
	    username="synergy"
	    password="Orchard09"
	 */ 		
		selenium=Common.CsetUp();
		
		flashApp = new FlashSelenium(selenium, "css=object#uploadalbumartUploader");
		Common.open(selenium);
	}

	@Test
	public void userLogin() throws Exception{
		System.out.println("userlogin start");

		//  Login   
		      selenium.type(Common.txt_UName,"recordlabel");
		      selenium.type(Common.txt_PWord,"orchard999");
		      selenium.click(Common.btn_Submit);
		      selenium.waitForPageToLoad("250000");
		      System.out.println("userlogin end");
		   //  AudioReleaseSingle 
		     for (int second = 0;; second++) {
					if (second >= 60) fail("timeout");
					try { if (selenium.isElementPresent(Common.dd_ASingle)){
					      System.out.println("ElementPresent");
						   break; } 
					} catch (Exception e) {}
					Thread.sleep(1000);
				}
				selenium.clickAt(Common.dd_ASingle,"10");
			      System.out.println("AudioReleaseClick");
				for (int second = 0;; second++) {
					if (second >= 60) fail("timeout");
					try { if (selenium.isElementPresent(Common.msg_CRelease)) break; } catch (Exception e) {}
					Thread.sleep(1000);
				}

				Thread.sleep(1000);
				
			//	selenium.click("css=option[value=\"ENG\"]");
			//	MetaLanguage
				selenium.select(Common.dd_MtLanguage, "label=English");
				Thread.sleep(2000);
	  	        System.out.println("MetaLanguage end");

			//	ReleaseName
				String releaseName = selenium.getEval("'$Selenium_release_123'+(new Date().getTime())");
				selenium.type(Common.txtbox_RelName, selenium.getEval("'" + releaseName + "'.toLowerCase()"));
				System.out.println("ReleaseName end");
			//	OrchardArtist
				selenium.select(Common.dd_OArtist, "label=Arctic Monkeys");
				Thread.sleep(24000);
				System.out.println("OrchardArtist end");
			//	PrimaryArtist
				selenium.setCursorPosition(Common.txtbox_PArtist, "0");
				selenium.type(Common.txtbox_PArtist, "Arctic Monkeys");
				selenium.keyPress(Common.txtbox_PArtist, "\\13");
			//	selenium.type("primaryArtist", "Arctic Monkeys");
				System.out.println("PrimaryArtist end");
			//	Featuring
				selenium.setCursorPosition(Common.txtbox_Featuring, "0");
				selenium.type(Common.txtbox_Featuring, "feature");
				selenium.keyPress(Common.txtbox_Featuring, "\\13");
			//	selenium.type("featuring", "feature");
				System.out.println("Featuring end");
			//	Remixer
				selenium.setCursorPosition(Common.txtbox_Remixer, "0");
				selenium.type(Common.txtbox_Remixer, "remixer");
				selenium.keyPress(Common.txtbox_Remixer, "\\13");
			//	selenium.type("remixer", "remixer");
				System.out.println("Remixer end");
			// 	ReleaseDate
				selenium.click(Common.cal_RelDate);
				selenium.type(Common.txtbox_RelDate, "2008-12-15");
				System.out.println("ReleaseDate end");
			//	SalesDate
				selenium.click(Common.cal_SDate);
				selenium.type(Common.txtbox_SDate, "2008-12-15");
				System.out.println("SalesDate end");
			//	Format
				selenium.click(Common.dd_Format);
				selenium.select(Common.dd_Format, "label=EP");
			//	selenium.click("css=option[value=\"Livelife Digital\"]");
				System.out.println("Format end");
			//	Imprint
				selenium.select(Common.dd_Imprint, "label=kkkk");
				System.out.println("Imprint end");
			//	Genre
				selenium.click(Common.dd_Genre);
				selenium.select(Common.dd_Genre, "label=Classical");
				verifyTrue(selenium.isTextPresent("Classical"));
				Thread.sleep(1000);
				System.out.println("Genre end");
	        // 	Subgenre
				selenium.click(Common.dd_SGenre);
				Thread.sleep(1000);
				selenium.select(Common.dd_SGenre, "label=Opera");
				verifyTrue(selenium.isTextPresent("Classical"));
				Thread.sleep(1000);
				System.out.println("Subgenre end");
			//	Composers
				selenium.click(Common.txtbox_Comp);
				selenium.type(Common.txtbox_Comp, "composer");
			//	selenium.type("composer", "composer");
				Thread.sleep(1000);
				System.out.println("Composers end");
			//	Orchestras
				selenium.click(Common.txtbox_Orch);
				selenium.type(Common.txtbox_Orch, "orchestra");
			//	selenium.type("orchestra", "orchestra");
				Thread.sleep(1000);
				System.out.println("Orchestras end");
			//	Ensembles
				selenium.click(Common.txtbox_Ense);
				selenium.type(Common.txtbox_Ense, "ensemble");
			//	selenium.type("ensemble", "ensemble");
				Thread.sleep(1000);
				System.out.println("Ensembles end");
			//	Conductors
				selenium.click(Common.txtbox_Cond);
				selenium.type(Common.txtbox_Cond, "conductor");
			//	selenium.type("conductor", "conductor");
				System.out.println("Conductors end");
			//	@Information
				selenium.click(Common.txtbox_info);
				selenium.type(Common.txtbox_info, "2011 Record Label 123");
				System.out.println("@Information end");
			//	LabelCatalogNumber
				selenium.click(Common.txtbox_LCNo);
				selenium.type(Common.txtbox_LCNo, "1234567890");
				System.out.println("LabelCatalogNumber end");
			//	ReleaseVersion
				selenium.click(Common.txtbox_RelVersion);
				selenium.type(Common.txtbox_RelVersion, "1.1");
				System.out.println("ReleaseVersion end");
			//	ManufacturerUPC
				selenium.click(Common.txtbox_MUPC);
				selenium.type(Common.txtbox_MUPC, "123456789123");
				System.out.println("ManufacturerUPC end");
			//	CreateRelease
				for (int second = 0;; second++) {
					if (second >= 60) fail("timeout");
					try { if (selenium.isElementPresent("Common.btn_CRelease")) break; } catch (Exception e) {}
					Thread.sleep(2000);
				}
				System.out.println("ManufacturerUPC02 end");
				selenium.clickAt(Common.btn_CRelease, "");
				System.out.println("CreateRelease end");
				Thread.sleep(35799);
				
        // flash button
		System.out.println("userlogin start");
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent("id=edit_release_basics_button")) break; } catch (Exception e) {}
			Thread.sleep(2000);
		}
		System.out.println("flash login");
		assertEquals(100, flashApp.PercentLoaded());
		flashApp.call("click");
		
		selenium.click("css=object#uploadalbumartUploader");
		System.out.println("flash end ");
		selenium.click("css=object#uploadalbumartUploader");
		selenium.type(flashApp.call("click"), "D:\\The Orchard\\AudioFiles\\testImages\\1.jpg");

		
        //((Selenium) flashApp).click("uploadalbumartUploader");	    
	      
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
