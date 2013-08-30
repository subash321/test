package Login;

import org.testng.annotations.*;

import FunctionLibrary.Common;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

public class LoginVerification extends SeleneseTestBase{

	public Selenium selenium;
	
	
	@BeforeClass
	public void loginUser() throws Exception{
		selenium=Common.CsetUp();
		Common.open(selenium);
		
	}

	@Test
	public void userLogin() throws Exception{
		System.out.println("29");
		selenium.type("css=#edit-username", "");
		selenium.type("css=#edit-password", "");
		selenium.click("css=#edit-submit");
		System.out.println("29.1");
		Thread.sleep(4579);
		verifyEquals(selenium.getText("css=div.messages.error"), "Sorry, account not found");
		System.out.println("29.02");
	     
	      /*assertTrue(selenium.getTitle().contains("Guguchu - Promote music, only better"));
	      selenium.type("name=listingBasicInfo.street1", "street1");*/
	      //Common.txt_Email();
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
