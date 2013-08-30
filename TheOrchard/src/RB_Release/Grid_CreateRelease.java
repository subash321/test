package RB_Release;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import FunctionLibrary.Common;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

@Test
public class Grid_CreateRelease extends SeleneseTestBase{
    Selenium selenium;

    @BeforeClass	
    @Parameters({ "selenium.host","selenium.port","selenium.browser","selenium.url" })
    public void beforeClass(String host, String port, String browser, String url) {
        this.selenium = new DefaultSelenium(host, Integer.parseInt(port),
                browser, url);
        this.selenium.start();
        this.selenium.open("/client/login");
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
		      selenium.type(Common.txt_UName,"recordlabel");
		      selenium.type(Common.txt_PWord,"orchard999");
		      selenium.click(Common.btn_Submit);
		      Thread.sleep(128579);
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
	/*			for (int second = 0;; second++) {
					if (second >= 60) fail("timeout");
					try { if (selenium.isElementPresent(Common.msg_CRelease)) break; } catch (Exception e) {}
					Thread.sleep(1000);
				}*/

				Thread.sleep(36579);
				
			//	selenium.click("css=option[value=\"ENG\"]");
			//	MetaLanguage
				selenium.select("//select", "label=English");
				Thread.sleep(2000);
	  	        System.out.println("MetaLanguage end");

			//	ReleaseName
				String releaseName = selenium.getEval("'$Selenium_release_'+(new Date().getTime())");
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
				Thread.sleep(12579);
				System.out.println("Genre end");
	        // 	Subgenre
				//selenium.click(Common.dd_SGenre);
				Thread.sleep(1000);
				selenium.select(Common.dd_SGenre, "label=Guitar");
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
				Thread.sleep(1000);
				selenium.clickAt("id=saveRelease", "");
			//	logout	
				selenium.clickAt("link=Log out »", "");
				for (int second = 0;; second++) {
					if (second >= 60) fail("timeout");
					try { if (selenium.isElementPresent("id=edit-username")) break; } catch (Exception e) {}
					Thread.sleep(1000);
				}
	     
        try {
            Thread.sleep(24579);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }   
}