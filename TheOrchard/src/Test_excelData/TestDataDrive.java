/*
 * This Test case verifies whether Infoseeker is navigated to Search listing page of that 
  	Popular Local searches category
 * 
 */
/* @author Preerna Tayal
 * Date:Oct 18, 2011
 */
package Test_excelData;

import java.util.HashMap;
import java.util.List;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import FunctionLibrary.Common;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

public class TestDataDrive {

	public Selenium selenium;

	String dataFilePath = Common.getKeyValue("Excel.Input.Path")+"AW001_TC010.xls";
	String targetfile = Common.getKeyValue("Excel.Output.Path")+"AW001_TC010_Result.xls";
	String productName;
	String productCategory;
	String[] result = new String[70];

	@BeforeClass
	public void setUp() throws Exception{
		selenium=Common.CsetUp();
		
	}

	@Test
	public void PopularLocalSearch() throws Exception{

		Common.open(selenium);
		
		int i=0;
		List<HashMap<String, String>> hashDataFile = Common.getTestDataFromExcel(dataFilePath);		

		for (HashMap<String, String> inputDataFile : hashDataFile){ 

			productName = inputDataFile.get("PRODUCT_NAME").trim();
			productCategory = inputDataFile.get("PRODUCT_CATEGORY").trim();

			//Check Popular Local Searches is displayed.
			String text = selenium.getText("css=#contentBar");
			//System.out.println(text);
			if(text.contains("Popular Local Searches")){
				//System.out.println("PASS:Popular Local Searches is displayed");	
				result[i] = "Pass";
			}
			else{
				result[i] = "Fail";
				//System.out.println("FAIL:Popular Local Searches is not present");
			}

			//Check Product Category is displayed with list of Product names.
			if(text.contains(productCategory)){
				Reporter.log("PASS:"+productCategory+" is displayed");
				System.out.println("PASS:"+productCategory+" is displayed");
				result[i] = "Pass";
			}
			else{
				System.out.println("FAIL:"+productCategory+" is not displayed");
				Reporter.log("FAIL:"+productCategory+" is not displayed");
				result[i] = "Fail";
			}

			try{
				//Check Infoseeker is navigated to Search listing page of that Popular Local searches categorys
				selenium.click("link="+productName);
				selenium.waitForPageToLoad("30000");

				//			if(selenium.isElementPresent("css=img[alt=Infomedia Yellowpages]")){
				//				selenium.click("link=close");
				selenium.refresh();
				selenium.waitForPageToLoad("30000");
				/*if(selenium.getValue(Common.SearchBox).equals(productName)){
					Reporter.log("PASS:"+productName+" is displayed in Search Tab");
					System.out.println("PASS:"+productName+" is displayed in Search Tab");	
					result[i] = "Pass";
				}
				else{
					System.out.println("FAIL:"+selenium.getValue("css=#whatSuggest")+" is displayed in Search Tab instead of "+productName);
					 Reporter.log("FAIL:"+selenium.getValue("css=#whatSuggest")+" is displayed in Search Tab instead of "+productName);
					result[i] = "Fail";
				}

				if(selenium.getText(Common.SearchBreadcrum).contains(productName)){
					System.out.println("PASS:Search for "+productName+" is displayed in Search page");
					Reporter.log("PASS:Search for "+productName+" is displayed in Search page");
					result[i] = "Pass";
				}
				else{
					System.out.println("FAIL:"+selenium.getText("css=p.breadcrumbs.clearfix")+" is displayed in Breadcrumb.");
					Reporter.log("FAIL:"+selenium.getText("css=p.breadcrumbs.clearfix")+" is displayed in Breadcrumb.");
					result[i] = "Fail";
				}

				i++;	
				selenium.click(Common.AskmeLogo);
				selenium.waitForPageToLoad("30000");*/
			}
			catch (Exception e){
				Common.writeDataToExcel(dataFilePath, targetfile, result);
				
			}
		}
		//}
		Common.writeDataToExcel(dataFilePath, targetfile, result);

}
@AfterClass
public void CtearDown() throws Exception{
	Common.CtearDown(selenium);
	
}
}
