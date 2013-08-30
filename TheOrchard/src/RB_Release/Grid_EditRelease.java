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
public class Grid_EditRelease extends SeleneseTestBase{
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
		      Thread.sleep(49579);
		      System.out.println("userlogin end");
		      selenium.open("alw/releasebuilder/view?release_id=262854");
		      System.out.println("48");
		      Thread.sleep(24579);
		   // ReleaseBuilder   
		 /*for (int second = 0;; second++) {
					if (second >= 60) fail("timeout");
					try { if (selenium.isElementPresent(Common.dd_RelBuilder)) break; } catch (Exception e) {}
					Thread.sleep(1000);
				}

				selenium.click(Common.dd_RelBuilder);
				System.out.println("ReleaseBuilder end");
				//selenium.waitForPageToLoad("25000");
           // EditLink
				System.out.println("EditLinkBefore");
				
				for (int second = 0;; second++) {
					if (second >= 60) fail("timeout");
					try { if (selenium.isElementPresent(Common.lnk_EditRelease)) break; } catch (Exception e) {}
					Thread.sleep(1000);
				}
				verifyTrue(selenium.isElementPresent(Common.lnk_EditRelease));

				selenium.click(Common.lnk_EditRelease);
				System.out.println("ReleaseBuilder end");*/
			//	Thread.sleep(2000);
			// EditReleaseButton
				/*for (int second = 0;; second++) {
					if (second >= 60) fail("timeout");
					try { if (selenium.isElementPresent(Common.btn_ERelBasics)) break; } catch (Exception e) {}
					Thread.sleep(1000);
				}*/
		selenium.clickAt(Common.btn_ERelBasics, "");
	//  EditReleaseBasics	
		System.out.println("EditReleaseBasic end");
		Thread.sleep(68579);
		for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent(Common.msg_ERelBasic)) 
				{System.out.println("ElementPresentERelBasic");break;} } catch (Exception e) {}
			Thread.sleep(1000);
		}
		System.out.println("ReleaseBuilder end");
	//	Thread.sleep(2000);
	//	MetaLanguage
		//selenium.click("css=option[value=\'FRE\']");
		selenium.select(Common.dd_MtLanguage, "label=French");
		Thread.sleep(2000);
	    System.out.println("MetaLanguage end");
	//	Thread.sleep(2000);
	//	ReleaseName
	//	String releaseName = selenium.getEval("'$Selenium_release_'+(new Date().getTime())");
		selenium.type(Common.txtbox_RelName, "ReleaseName");
	//	String release_name = selenium.getEval("storedVars['releaseName'].toLowerCase()");
		System.out.println("ReleaseName end");
		Thread.sleep(1000);
	//	OrchardArtist
		selenium.click("css=option[value=\"164698\"]");
		selenium.select(Common.dd_OArtist, "label=Kevin");
		selenium.click("css=option[value=\"149857\"]");
		System.out.println("OrchardArtist end");
		Thread.sleep(1000);
	//	PrimaryArtist
		selenium.setCursorPosition(Common.txtbox_PArtist, "0");
		selenium.type(Common.txtbox_PArtist, "Kevin");
		selenium.keyPress(Common.txtbox_PArtist, "\\13");
		System.out.println("PrimaryArtist end");
	//	selenium.type("primaryArtist", "Kevin");
	//	Featuring
		selenium.setCursorPosition(Common.txtbox_Featuring, "0");
	//	selenium.click("//li[@id='createReleaseFeaturing_li']/div[1]/div/ul/li/span");
		selenium.type(Common.txtbox_Featuring, "feature1");
		selenium.keyPress(Common.txtbox_Featuring, "\\13");
		System.out.println("Featuring end");
	//	selenium.type("featuring", "feature1");
		Thread.sleep(1000);
	//	Remixer
		selenium.setCursorPosition(Common.txtbox_Remixer, "0");
	//	selenium.click("//li[@id='createReleaseRemixer_li']/div[1]/div/ul/li/span");
		selenium.type(Common.txtbox_Remixer, "remixer1");
		selenium.keyPress(Common.txtbox_Remixer, "\\13");
	//	selenium.type("remixer", "remixer1");
		System.out.println("Remixer end");
		Thread.sleep(1000);
	//	ReleaseDate
		selenium.click(Common.cal_RelDate);
		selenium.type(Common.txtbox_RelDate, "2008-12-14");
		System.out.println("ReleaseDate end");
	//	Thread.sleep(1000);
	//	SalesDate
		selenium.click(Common.cal_SDate);
		selenium.type(Common.txtbox_SDate, "2008-12-15");
		System.out.println("SalesDate end");
	//	Thread.sleep(1000);
	//	Format
		/*for (int second = 0;; second++) {
			if (second >= 60) fail("timeout");
			try { if (selenium.isElementPresent(Common.dd_Format)) 
				{System.out.println("ElementPresentERelBasic");break;} } catch (Exception e) {}
			Thread.sleep(1000);
		}
		selenium.click(Common.dd_Format);
		selenium.select(Common.dd_Format, "label=EP");*/
		/*selenium.click(Common.dd_Format);
		selenium.select(Common.dd_Format,"label=Single");*/
		System.out.println("Format end");
	//	Thread.sleep(1000);
	//	NewImprint
		selenium.click(Common.btn_NImprint);
		selenium.type(Common.txtbox_Imprint, "new imprint");
		selenium.click(Common.btn_ImprintAdd);
		System.out.println("Format end");
		Thread.sleep(1000);
	//	Genre
		selenium.click(Common.dd_Genre);
		selenium.select(Common.dd_Genre, "label=Classical");
		verifyTrue(selenium.isTextPresent("Classical"));
		System.out.println("Genre end");
		Thread.sleep(1000);
	//	Subgenre
		selenium.click(Common.dd_SGenre);
		Thread.sleep(1000);
		selenium.select(Common.dd_SGenre, "label=Guitar");
		verifyTrue(selenium.isTextPresent("Guitar"));
		System.out.println("Subgenre end");
		Thread.sleep(1000);
	//	Composers
		selenium.click(Common.txtbox_Comp);
		selenium.type(Common.txtbox_Comp, "composer1");
		System.out.println("Composers end");
	//	selenium.type("composer", "composer1");
		Thread.sleep(1000);
	//	Orchestras
		selenium.click(Common.txtbox_Orch);
		selenium.type(Common.txtbox_Orch, "orchestra1");
	//	selenium.type("orchestra", "orchestra1");
		System.out.println("Orchestras end");
		Thread.sleep(1000);
	//	Ensembles
		selenium.click(Common.txtbox_Ense);
		selenium.type(Common.txtbox_Ense, "ensemble1");
	//	selenium.type("ensemble", "ensemble1");
		System.out.println("Ensembles end");
		Thread.sleep(1000);
	//	Conductors
		selenium.click(Common.txtbox_Cond);
		selenium.type(Common.txtbox_Cond, "conductor1");
	//	selenium.type("conductor", "conductor1");
		System.out.println("Conductors end");
		Thread.sleep(1000);
	//	@Information
		selenium.click(Common.txtbox_info);
		selenium.type(Common.txtbox_info, "2011 Record Label 12345");
		System.out.println("@Information end");
		Thread.sleep(1000);
	//	LabelCatalogNumber
		selenium.click(Common.txtbox_LCNo);
		selenium.type(Common.txtbox_LCNo, "1234567894");
		System.out.println("LabelCatalogNumber end");
		Thread.sleep(1000);
	//	ReleaseVersion
		selenium.click(Common.txtbox_RelVersion);
		selenium.type(Common.txtbox_RelVersion, "1.11");
		System.out.println("ReleaseVersion end");
		Thread.sleep(1000);
	//	ManufacturerUPC
		/*selenium.click(Common.txtbox_MUPC);
		selenium.type(Common.txtbox_MUPC, "123456789126");
		System.out.println("ManufacturerUPC end");
		Thread.sleep(1000);*/
  //	CreateReleaseThread.sleep(1000);
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