/**
 * 
 */
package Test_excelData;

import java.util.*;

import org.openqa.selenium.browserlaunchers.Sleeper;
import org.testng.annotations.*;

import com.thoughtworks.selenium.*;

import FunctionLibrary.Common;

/**
 * @author prerna.tayal
 *
 */
public class ExcelDataDriveTest_02  extends SeleneseTestBase{

	public Selenium selenium;
	String product,keyword1,keyword2,keyword3,keyword4;
	
	@BeforeClass
	public void beforeTest() throws Exception{
		selenium=Common.CsetUp();
		Common.open(selenium);
	}

	@Test

	public void addMultipleComplexProducts() throws Exception{
		System.out.println("userlogin start");
		
	    // Common.open(selenium);
	     // verifyTrue(selenium.getTitle().contains("Client Login | Orchard"));

		//Login to the application
		

		//STEP 1 : Enter Data in Basic Information page using Recommended Categories

		//Click on Products
	//	assertTrue(selenium.getTitle().equals(Common.title_UserDashboard));
	//	Common.clickAndWaitForPage(selenium, Common.products);
        
		//Click on Add new Product
	//	assertTrue(selenium.getTitle().equals(Common.title_ProductDashboard));
    //	assertTrue(selenium.getText(Common.title_productHeader).equals("All Products"));
	//	Thread.sleep(3000);

		String inputfilePath=Common.excelPath+"testxls.xls";
		System.out.println("58");
		//List<HashMap<String, String>> hashDataFile = Common.getTestDataFromExcel(inputfilePath,2);
		List<HashMap<String, String>> hashDataFile = Common.getTestDataFromExcel(inputfilePath);
		
		System.out.println("61");
		for (HashMap<String, String> inputDataFile : hashDataFile)
		{
			keyword1 = inputDataFile.get("username");
			keyword2= inputDataFile.get("password");
			System.out.println("64");
			selenium.type(Common.txt_UName,keyword1);
		     selenium.type(Common.txt_PWord,keyword2);
		     selenium.click(Common.btn_Submit);
		     selenium.waitForPageToLoad("25000");
		     System.out.println("userlogin end");
			System.out.println("keyword1"+keyword1+"\t"+""+"keyword2"+keyword2);
			selenium.clickAt("css=#welcome > a", "");

//			keyword3= inputDataFile.get("Keyword3");
//			keyword4= inputDataFile.get("Keyword4");
			

//			selenium.click(Common.btn_addProduct);
//			Thread.sleep(50000);
//
//			//check Add New Product page is displayed and Basic Information is selected by default
//			assertTrue(selenium.getText(Common.title_addNewProduct).equals("Add New Product"));
//			assertTrue(selenium.getAttribute("//li[@id='NN1']@class").equals("tabs-selected"));
//
//			//Enter Data
//			product = Common.stringGenerator()+"_"+keyword1;
//			System.out.println(product);
//			selenium.type(Common.txt_productName, product);
//			Common.listProductKeyword(selenium, "keyword1", Common.txt_Keyword1, Common.select_Keyword1,keyword1);
//			Common.listProductKeyword(selenium, "keyword2",Common.txt_Keyword2, Common.select_Keyword2, keyword2);
//			Common.listProductKeyword(selenium, "keyword3",Common.txt_Keyword3, Common.select_Keyword3, keyword3);
//
//			Common.selectAllCategories(selenium, keyword1, keyword2, keyword3, keyword4);
//
//			System.out.println("Basic Information : "+selenium.getText(Common.completionMeter)+selenium.getText("//div[@class='completionMeter stickyMeter']/strong[2]"));
//			Thread.sleep(1000);
//			selenium.click(Common.btn_nextButton);
//			Thread.sleep(2000);
//			assertTrue(selenium.getAttribute("//li[@id='NN2']@class").equals("tabs-selected"));
//
//			//STEP 2 : Enter Data in Detailed Information page using Recommended Categories	
//
//			//Enter PUV Values
//			Common.enterAllPUVValues(selenium);
//			
//			//Check More Details is displayed and enter value in More Details
//			assertTrue(selenium.getText("//div[@id='moreDetail']").equals("More Detail :"));
//
//			//Add one Key-value pair in More Detail
//			selenium.type("//div[@class='moreDetailsMarginBottom fl']/div/input[contains(@id,'key')]",Common.stringGenerator());
//			selenium.type("//div[@class='moreDetailsMarginBottom fl']/div[2]/input[contains(@id,'value')]",Common.stringGenerator());
//
//			//Add 1 product photo
//			
//			int r = Common.getRandomNumber(3);
//			for(int i=1;i<=r;i++){
//			selenium.click(Common.btn_browsePhoto);
//			selenium.type(Common.btn_browsePhoto, "C:\\Users\\Public\\Pictures\\Sample Pictures\\Sample"+i+".jpg");
//			Thread.sleep(Common.sleep);
//			}
//			
//			//Check Brief Information is displayed and enter value in Brief Information
//			System.out.println(selenium.getText("//form/div[2]/div[5]/div"));
//			assertTrue(selenium.getText("//form/div[2]/div[5]/div").equals("*Brief Description:"));
//			selenium.type(Common.txt_briefDescription,Common.stringGenerator());
//
//			//Check Detailed Information is displayed and enter value in Detailed Information
//			System.out.println(selenium.getText("//form/div[2]/div[6]/div"));
//			assertTrue(selenium.getText("//form/div[2]/div[6]/div").equals("Detailed Description :"));
//			//selenium.type("//html/body[@id='tinymce']/p",Common.stringGenerator());
//			System.out.println(selenium.getText(Common.completionMeter)+selenium.getText("//div[@class='completionMeter stickyMeter']/strong[2]"));
//			selenium.click("css=#detailNext");
//			Thread.sleep(2000);
//			assertTrue(selenium.getAttribute("//li[@id='NN3']@class").equals("tabs-selected"));
//
//			//STEP 3:
//
//			//Check Select Payment & Shipping Term is displayed and enter values
//
//			assertTrue(selenium.getText("//div[@id='tabs-3']/div[2]/div").equals("Minimum Order Quantity :"));
//			selenium.type(Common.txt_minimumOrderQuantity, Integer.toString(Common.getRandomNumber()));
//			//selenium.select(Common.select_minOrderQtyUnitType, selenium.getSelectOptions(Common.select_minOrderQtyUnitType)[Common.getRandomSelectOption(selenium, Common.select_minOrderQtyUnitType)]);
//			Common.setRandomSelectOption(selenium, Common.select_minOrderQtyUnitType);
//
//			assertTrue(selenium.getText("//div[@id='tabs-3']/div[2]/div[3]").equals("Other :"));
//			selenium.type(Common.txt_Other,Common.stringGenerator());
//
//			assertTrue(selenium.getText("//div[@id='tabs-3']/div[3]/div").equals("FOB Price :"));
//			Common.setRandomSelectOption(selenium, Common.select_fobPriceCurrency);
//			selenium.type("css=#fobPriceMin","32");
//			selenium.type("css=#fobPriceMax","32");
//			Common.setRandomSelectOption(selenium, Common.select_fobUnit);
//			
//			assertTrue(selenium.getText("//div[@id='tabs-3']/div[4]/div").equals("Port :"));
//			selenium.type(Common.txt_port,Common.stringGenerator());
//
//			assertTrue(selenium.getText("//div[@id='tabs-3']/div[5]/div").equals("Production Capacity :"));
//			selenium.type("css=#productionCapacity",Integer.toString(Common.getRandomNumber()));
//			Common.setRandomSelectOption(selenium, Common.select_prodUnitType);
//			Common.setRandomSelectOption(selenium, Common.select_prodCapacityPer);
//			selenium.type(Common.txt__prodCapacityOther, Common.stringGenerator());
//			
//			assertTrue(selenium.getText("//div[@id='tabs-3']/div[6]/div").equals("Delivery Time :"));
//			selenium.type(Common.txt_deliveryTime,Common.stringGenerator());
//
//			assertTrue(selenium.getText("//div[@id='tabs-3']/div[7]/div").equals("Packaging Detail :"));
//			selenium.type(Common.txt_packagingDetail,Common.stringGenerator());
//
//			selenium.click(Common.btn_finish);
//			Thread.sleep(Common.sleep);
//
//			assertTrue(selenium.getText(Common.successMessage).equals("Product created successfully."));

			//assertTrue(selenium.getText("//table[@id = 'productContent']//tr[@id='firstId']").contains(product));
		}
	}

	@AfterClass
	public void afterTest() throws Exception{	
		System.gc();
		Common.CtearDown(selenium);
	}

}
