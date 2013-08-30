package ExcelRead;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

import org.testng.annotations.*;


import FunctionLibrary.Common;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestBase;
import com.thoughtworks.selenium.Selenium;

public class ExcelReads extends SeleneseTestBase{

	public Selenium selenium;
	/* URl ="http://trunk.synergy.theorchard.com/"
	 * login="/alw" 
	 */
	
	@BeforeClass
	public void loginUser() throws Exception{
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
		System.out.println("userlogin start");
		Common.getDataFromExcel(Common.xls_FileAW01);
	    // Common.open(selenium);
	     // verifyTrue(selenium.getTitle().contains("Client Login | Orchard"));
	//	Common.getDataFromExcel("D://subash.xls");
		/*FileInputStream fi = new FileInputStream("D://subash.xls");
		Workbook w = Workbook.getWorkbook(fi);
		Sheet s = w.getSheet(0);
		String a[][] = new String[s.getRows()][s.getColumns()];
		for (int i = 0; i < s.getRows(); i++) {
			for (int j = 0; j < s.getColumns(); j++) {
				a[i][j] = s.getCell(j, i).getContents();
				System.out.println("i="+i+"j="+j+"a[i][j]"+a[i][j]+"\n");
			}
		} */
	     selenium.type(Common.txt_UName, "recordlabel");
	     selenium.type(Common.txt_PWord,"123456");
	     selenium.click(Common.btn_Submit);
	     selenium.waitForPageToLoad("250000");
	     System.out.println("userlogin end");
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
