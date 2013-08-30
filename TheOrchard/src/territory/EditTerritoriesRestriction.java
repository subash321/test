package territory;

import org.testng.annotations.*;
import com.thoughtworks.selenium.FlashSelenium;
import FunctionLibrary.Common;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

@Test
public class EditTerritoriesRestriction extends SeleneseTestBase{
	public Selenium selenium;
	@BeforeClass
	public void loginUser() throws Exception{
		selenium=Common.CsetUp();
		Common.open(selenium);
			}
		public void userLogin() throws Exception{
        
		System.out.println("userlogin start");
         
	      //  Login   
	      selenium.type(Common.txt_UName,"recordlabel");
	      selenium.type(Common.txt_PWord,"123456");
	      selenium.click(Common.btn_Submit);
	      selenium.waitForPageToLoad("25000");
	      System.out.println("userlogin end");
       // openUrl    
	      selenium.open(Common.url_Open);
          
	  //  Territory
	      Thread.sleep(30000);
	    //  CatalogInfoReleaseBuilder
	        selenium.clickAt(Common.dd_CIRelBuilder1, "");
			Thread.sleep(10000);
		//  ReleaseForm	
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent(Common.frm_Release1)) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

        //  ReleaseLink  
			selenium.clickAt(Common.lnk_Release, "");
			Thread.sleep(10000);
		// 	BAckGroundReleaseBasic
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent(Common.dv_RelBasics)) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}
		//	EditReleaseBasicsButton
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent(Common.btn_ERelBasics)) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}
		//  ReleaseBuilderHeading	
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent(Common.msg_RelBuilder)) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}
		// 	SubmitFinalButtons
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent(Common.btn_SubFinRelease)) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			Thread.sleep(8000);
		//	EditTerritoriesRestrictions_Link
			selenium.click(Common.lnk_ETRestrictions);
			Thread.sleep(5000);
		//	EditTerritoriesRestrictions_HeaderMsg
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent(Common.msg_CRelease)) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			Thread.sleep(8000);
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent("id=submit_link")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}
		//	ClearedForSale_CheckBox
			Thread.sleep(10000);
			selenium.clickAt(Common.chk_CForSale0, "");
			Thread.sleep(1000);
			selenium.clickAt(Common.chk_CForSale1, "");
			Thread.sleep(10000);
		//	Add_Button
			selenium.click(Common.btn_Add);
			Thread.sleep(3000);
		//	Save_Button
			selenium.click(Common.btn_Save);
			Thread.sleep(10000);
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent(Common.btn_SubFinRelease)) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			Thread.sleep(13000);
			selenium.click(Common.lnk_ETRestrictions);
			Thread.sleep(8000);
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent(Common.msg_CRelease)) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			Thread.sleep(8000);
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent(Common.btn_Save2)) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			Thread.sleep(3000);
			selenium.clickAt("//div[@id='modalBoundingBox']/div[1]/div[1]/div[7]/div/ul/li[1]/a/span[2]", "");
			Thread.sleep(2000);
			selenium.click(Common.btn_Remove);
			Thread.sleep(7000);
			selenium.clickAt(Common.btn_Save, "");
			Thread.sleep(25000);
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent(Common.msg_RelBuilder)) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

			selenium.clickAt("link=Save for Later", "");
			Thread.sleep(9000);
			for (int second = 0;; second++) {
				if (second >= 60) fail("timeout");
				try { if (selenium.isElementPresent("//div[@id='contentLeft']/a")) break; } catch (Exception e) {}
				Thread.sleep(1000);
			}

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
