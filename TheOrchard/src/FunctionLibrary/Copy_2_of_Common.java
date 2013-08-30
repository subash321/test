/**
 * author sushant.sharma
 * Date Mar 29 2012
 */
package FunctionLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;

import org.openqa.selenium.server.RemoteControlConfiguration;
import org.openqa.selenium.server.SeleniumServer;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import SeleniumServer.StartSeleniumServer;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

/**
 * @author sushant.sharma
 *
 */
public class Copy_2_of_Common {
	public  Selenium selenium;
	/*
	 * Function is written for the project The Orchard
	 * @author Sushant Sharma
	 */
   //public static String url="http://192.168.0.104:9090";
	public static String url = "http://internal.alpha.theorchard.com";
   // public static String login="/client/login";
    //	1. EditExReleasePath / 2. CopyRelease	
	//public static String url= "http://internal.alpha.theorchard.com/";
    // 1. YouTube 2. Edit_Release
    //	public static String url= "http://internal.alpha.theorchard.com/";
    //	public static String login = "/oa";
	//public static String url="http://www.filefactory.com/";
	//public static String login = "u/local";
		
	public static String login = "/oa";
	public static String browser ="*firefox";
	public static String IEbrowser="*iexplore";
	public static String Cbrowser="*chrome";
	
	/*
	 * Common elements for Sign Up Page
	 */
	public static String btn_JoinNow = "//div[@id='nav']/ul/li[5]/a/span";
	public static String btn_Home = "//div[@id='nav']/ul/li/a/span";
	public static String btn_Login = "//div[@id='nav']/ul/li[6]/a/span";
	public static String btn_FreePlan = "css=#tiers-1";
	public static String btn_StandardPlan = "css=#tiers-2";
	public static String btn_ProPlan = "css=#tiers-3";
	public static String btn_PlanNext = "css=#savetiers";
	public static String txtbox_BandArtistName = "css=#signupBand";
	public static String txtbox_MyBand = "css=#signupAlias";
	public static String txtbox_Name = "css=#signupName";
	public static String txtbox_City = "css=#bandcity";
	public static String dd_Country = "css=#signupCountry";
	public static String txtbox_BandUrl = "css=#bandurl";
	public static String txt_BandEmail = "css=#signupEmail";
	public static String txt_BandPwd = "css=#signupPassword";
	public static String txt_BandPwdConfirm ="css=#signupPasswordConfirm";
	public static String dd_Iam = "css=#signupBackground";
	public static String chkbox_Agree = "css=#agreeTerms";
	public static String btn_SignupSubmit = "css=#signupSubmit"; 
	public static String rbtn_Success = "css=#recurlyResult-success";
	public static String rbtn_Fail = "//form[@id='mockCheckout']/div/div[2]/label[2]";
	public static String url_Open="http://trunk.synergy.theorchard.com/alw/index/viewexareleases/";
	/*
	 * Common elements for Login
	 */
	public static String txt_Email = "css=#email";
	public static String txt_Password ="css=#password";
	public static String btn_LoginSubmit = "css=#loginSubmit";
	public static String chk_RemenberMe = "css=#rememberCheck";
	
	public static String excelPath = "D:\\f drive subhash\\SafeFiles\\EclipseWorkspace\\Workspace_04May12\\workspace\\TheOrchard\\Data\\Input\\";
	/*
	 * Common elements for Distribute
	 */
/*	public static String dd_DistributeMenu = "//div[@id='main_navigation']/div[3]/div[3]/div";
	public static String menu_CreateRelease = "css=div.submenu.active > div.submenu-inner > div > a";
	public static String txt_PaypalEmail = "css=#paypal_email";
	public static String txt_PaypalEmailConfirm = "css=#paypal_email_confirmation";
	public static String dd_AccCountry = "css=#paypal_country";
	public static String dd_Currency = "css=#paypal_currency";
	public static String txt_MusicTitle = "css=#title";
	public static String dd_MusicFormat = "css=#formatSelect";
	public static String btn_ReleaseDate = "//form[@id='albumForm']/div[11]/div[2]/div/a";
	public static String btn_DateSelect = "//div[@id='datepicker_788']/div[9]/table/tbody/tr/td/table/tbody[2]/tr[5]/td[4]/a/span";
	//public static String dd_Genre = "css=#genre";
	public static String dd_SubGenre = "css=#selected_subgenre";
	public static String txt_AdditionalArtist ="//form[@id='albumForm']/div[14]/div[2]/div/ul";
	public static String txt_Label = "css=#label";
	public static String txt_AlbumDes = "css=#description";
	public static String btn_CoverImage= "link=Select";
	public static String pp_CoverImage = "id=simplemodal-container";*/
	
	/*
	 * Create Audio Release Single
	 */
	/* txtbox:textbox
	 * dd:dropdown
	 * public static String 
	 * tt:tooltip
	 * lbl:lable
	 */
	// common
	// AudioReleaseSingle
	public static String dd_ASingle = "//ul[@id='dropdown']/li"; // 1. //ul[@id='dropdown']/li 2. css=#dropdown > li
	public static String lb_RelBasics="css=h3.roundedsubheader";
	public static String msg_RelBasics="Release Basics";
	public static String ttl_CRelease="css=#modalWindow > h1";
	public static String lbl_MLanguage="id=lbleditreleasemodal_commentReleaseLanguage";
	
	// CreateRlease
	public static String msg_CRelease="css=#modalWindow>h1";
	
	public static String lbl_DisAs="css=#createReleaseDisplayedas_li > label";
	public static String lbl_Featuring="css=#editreleasemodal_featuring_container > label.optional";
	public static String lbl_Remixer="css=#editreleasemodal_remixer_container > label.optional";
	public static String lbl_Format="css=#createReleaseFormat_li > label.optional";
	public static String lbl_info="css=#createReleaseCLine_li > label.optional";
	public static String lbl_LCNo="css=#labelCatalog-label > label.optional";
	public static String lbl_RelVersion="css=#version-label > label.optional";
	public static String lbl_MUPC="css=#manufacturerUPC-label > label.optional";
	public static String lbl_SGenre="id=createReleaseGenre_li";
	
	
	
	public static String tt_Featuring="css=span.toolTipBottom";
	public static String tt_Remixer="css=span.toolTipBottom";
	public static String tt_Format="css=span.toolTipBottom";
	public static String tt_info="css=span.toolTipBottom";
	public static String tt_LCNo="css=span.toolTipBottom";
	public static String tt_RelVersion="id=tooltipTextRelease";
	public static String tt_MUPC="id=tooltipTextRelease";
	public static String tt_SGenre="id=tooltipTextRelease";
	
	
	
	
	public static String displayAs = "id=displayedAs";
	public static String rslt_displayAs = "Release Name";
	
	
	
	public static String txtbox_Featuring="//input[@id='featuring_token_box']"; // 1. //input[@id='featuring_token_box'] 2. id=featuring_token_box
	
	public static String txtbox_Remixer="//input[@id='remixer_token_box']"; // 1. //input[@id='remixer_token_box'] 2. id=remixer_token_box
	
	
	public static String dd_Format="css=#format"; // 1. css=#format 2. id=format
	

	
	public static String txtbox_info="id=c_line";
	public static String txtbox_LCNo="id=labelCatalog";
	public static String txtbox_RelVersion="id=version";
	public static String txtbox_MUPC="id=manufacturerUPC";
	public static String dd_SGenre="id=subgenre";
	
	public static String btn_CRelease="//a[@id='saveRelease']/span";// 1. //a[@id='saveRelease']/span 2. css=#saveRelease > span
	public static String btn_NImprint="css=#newImprintButton > span";
	public static String btn_CreateReleaseSingleClose="css=#modalWindow > div.close";
	
	// MetaLanguage
	public static String lb_MtLanguage="id=invalid_meta_language";
	public static String msg_MtLanguage="Missing Meta Language";
	public static String tt_MtLanguage="css=span.toolTipBottom";
	public static String dd_MtLanguage="id=meta_language";
	
	// OrchardArtist
	public static String lb_OArtist="id=invalid_artistName";
	public static String msg_OArtist="Missing Artist Name";
	public static String lbl_OArtist="css=#createReleaseArtistName_li > label.optional";
	public static String dd_OArtist="id=artistName";
	public static String ddo_OArtist="css=option[value='167268']";

	// ReleaseName
	public static String lb_RelName="id=invalid_releaseName";
	public static String msg_RelName="Missing Release Name";
	public static String lbl_RelName="css=label.optional";
	public static String tt_RelName="id=tooltipTextRelease";
	public static String txtbox_RelName = "id=releaseName";
	
	// PrimaryArtist
	public static String lb_PArtist="id=invalid_primaryArtist";
	public static String msg_PArtist="Missing Primary Artist Name";
	public static String lbl_PArtist="css=div > label.optional";
	public static String tt_PArtist="id=tooltipTextRelease";
	public static String txtbox_PArtist="//input[@id='primary_token_box']";// 1. //input[@id='primary_token_box'] 2. id=primary_token_box


	// ReleaseDate
	public static String lb_RelDate="id=invalid_releaseDate";
	public static String msg_RelDate="Missing or Invalid Release Date";
	public static String lbl_RelDate="css=#createReleaseReleaseDate_li > label.optional";
	public static String tt_RelDate="id=tooltipTextRelease";
	public static String txtbox_RelDate="id=releaseDate";
	public static String cal_RelDate="css=img.ui-datepicker-trigger";
	public static String dat_RelDate="xpath=(//a[contains(text(),'26')])[2]";

	// SalesDate
	public static String lb_SDate="id=invalid_salesDate";
	public static String msg_SDate="Missing or Invalid Sales Date";
	public static String lbl_SDate="css=#createReleaseSalesDate_li > label.optional";
	public static String tt_SDate="css=span.toolTipBottom";
	public static String txtbox_SDate="id=salesDate";
	public static String cal_SDate="css=#createReleaseSalesDate_li > img.ui-datepicker-trigger";
	public static String dat_SDate="xpath=(//a[contains(text(),'26')])[2]";

	// Imprint
	public static String lb_Imprint="id=invalid_imprintName";
	public static String msg_Imprint="Missing Imprint Name";
	public static String lbl_Imprint="css=#createReleaseLabel_li > label.optional";
	public static String tt_Imprint="id=tooltipTextRelease";
	public static String dd_Imprint="id=imprintName";
	public static String txtbox_Imprint="id=newImprint";
	public static String btn_ImprintAdd="css=span.smallbtn";

	// Genre
	public static String lb_Genre="id=invalid_genre";
	public static String msg_Genre="Missing Genre";
	public static String ddo_Genre="css=option[value='12']";
	public static String dd_Genre="id=genre";
	public static String lbl_Genre="css=#createReleaseGenre_li > label.optional";
	public static String tt_Genre="id=tooltipTextRelease";
    //	Composers
	public static String txtbox_Comp="id=release_composer_token_box";
	//	Orchestras
	public static String txtbox_Orch="id=release_orchestra_token_box";
	//  Ensembles
	public static String txtbox_Ense="id=release_ensemble_token_box";
	//  Conductors
	public static String txtbox_Cond="id=release_conductor_token_box";
	//  SubGenre
	public static String lb_SGenre="id=subgenre_required";
	public static String msg_SGenre="Subgenre is Required";
	
	/*
	 * Delete Audio Release Single
	 */
	//CatalogInfoReleaseBuider
	public static String dd_CIRelBuilder="//li[@id='tCatalogInfo']/ul/li[1]/a";
	public static String chk_Release = "name=release_checkboxes[]";
	public static String frm_Release="//form[@id='view_exarelease_form']";
	public static String lnk_DelRelease="link=delete selected releases";
	public static String btn_DRDelete="//a[@id='delete_releases_button']";
	/*
	 * Edit Audio Release Single
	 */
	// Edit Release Basics
	public static String msg_ERelBasic="css=#modalWindow > h1";
	public static String msg_RelBuilder="css=#content>h1";
	public static String btn_ERelBasics="id=edit_release_basics_button";
	public static String dd_RelBuilder="link=Release Builder";
	public static String lnk_EditRelease="css=a.albumName"; // 1. css=a.albumName 2. xpath=(//a[contains(@href, '/alw/releasebuilder/view?release_id=262642')]
	/*
	 * Login Page
	 * txt
	 */
	public static String txt_UName="id=edit-username";
	public static String txt_PWord="id=edit-password";
	public static String btn_Submit="id=edit-submit";
	/*
	 * Login Page verification message
	 * txt
	 */
	public static String lb_ValCommon="css=div.messages.error";
	public static String msg_ValCommon="Sorry, account not found";
	/*
	 * ExcelFile
	 * 
	 */
	public static String xls_FileAW01="D://subash.xls";
	
	/*
	 * Track Detail
	 */
	public static String btn_AddTrack = "//form[@id='albumForm']/div[19]/div/label";
	public static String txt_TrackTitle ="";
	public static String dd_MetaLang = "";
	public static String chk_Explicit = "";
	public static String txt_TrackAddArtist = "";
	public static String dd_DistMode = "";
	
	
	private static ResourceBundle resourceBundle = null;
    static{
    	resourceBundle = ResourceBundle.getBundle("build");
    }
    public static String getKeyValue(String key)
    {
    	String val = null;
    	try{
    		val = resourceBundle.getString(key);
    	}
    	catch(Exception e){e.printStackTrace();}
    	
    	return val;
    }
    public static Selenium CsetUp() throws InterruptedException{
    	int port=4445;
    	System.out.println("inside csetup");
		Copy_2_of_Common setUp= new Copy_2_of_Common();
		StartSeleniumServer Server=new StartSeleniumServer();
		System.out.println("DefaultSelenium");
		setUp.selenium = new DefaultSelenium("localhost",4444,"firefoxproxy",url);
	//	setUp.selenium = new DefaultSelenium("localhost",4444,"*iexplore","http://trunk.synergy.theorchard.com");
/*		RemoteControlConfiguration rcc = new RemoteControlConfiguration();
        rcc.setPort(port);*/
		System.out.println("selenium start");	
		setUp.selenium.start();
		System.out.println("selenium return");
		Thread.sleep(2579);
		return(setUp.selenium);
		
	}
public static void a1(){
	System.out.println("test");
}
    
    public static void open( Selenium selenium) throws Exception
	{ 
   //selenium.open(Common.City);
   selenium.open(Copy_2_of_Common.login);
   selenium.windowMaximize();
	}

	public static void CtearDown( Selenium selenium) throws Exception
	{
		selenium.close();
		selenium.stop();
		
	}
	
	/*
	 * This function reads Data from an Excel Sheet in Hash Map Type
	 * @author:
	 */
	public static List<HashMap<String, String>> getTestDataFromExcel(String strDataFilePath){
		System.out.println("352");
		Workbook workbook = null;
		try {
			workbook = Workbook.getWorkbook(new File(strDataFilePath));
			System.out.println("356");
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		} 
		Sheet sheet = workbook.getSheet(0); 
		System.out.println("363");
		int lastRow = sheet.getRows();
		int lastcolumn = sheet.getColumns();



		List<HashMap<String, String>> result = new ArrayList<HashMap<String,String>>(lastRow-1);

		for(int i=1; i<lastRow; i++){
			HashMap<String, String> testdata = new HashMap<String, String>();
			for(int j=0; j<lastcolumn; j++)
				testdata.put(sheet.getCell(j, 0).getContents(),sheet.getCell(j, i).getContents());
			result.add(testdata);
			System.out.println("376");
		}
		System.out.println("377");
		return result;
	}

	/**
	 * This function reads Data from an Excel Sheet in Hash Map Type
	 * @author: Prerna Tayal
	 */
	public static List<HashMap<String, String>> getTestDataFromExcel(String inputDatafile,int sheetNo){

		Workbook workbook = null;
		try {
			workbook = Workbook.getWorkbook(new File(inputDatafile));
		} catch (BiffException e) {
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		} 
		Sheet sheet = workbook.getSheet(sheetNo); 

		int lastRow = sheet.getRows();
		int lastcolumn = sheet.getColumns();



		List<HashMap<String, String>> result = new ArrayList<HashMap<String,String>>(lastRow-1);

		for(int i=1; i<lastRow; i++){
			HashMap<String, String> testdata = new HashMap<String, String>();
			for(int j=0; j<lastcolumn; j++)
				testdata.put(sheet.getCell(j, 0).getContents(),sheet.getCell(j, i).getContents());
			result.add(testdata);
		}

		return result;
	}
	/**
	 * This function reads data from excel sheet in array format.
	 * @author: Prerna Tayal
	 */
	public static String[][] getDataFromExcel(String strDataFilePath) throws Exception 
	{
		// Read data from excel sheet
		FileInputStream fi = new FileInputStream(strDataFilePath);
		Workbook w = Workbook.getWorkbook(fi);
		Sheet s = w.getSheet(0);
		String a[][] = new String[s.getRows()][s.getColumns()];
		for (int i = 0; i < s.getRows(); i++) {
			for (int j = 0; j < s.getColumns(); j++) {
				a[i][j] = s.getCell(j, i).getContents();
				System.out.println("i="+i+"j="+j+"a[i][j]"+a[i][j]+"\n");
			}
		}
		return a;	
	}

	public static void writeDataToExcel(String strDataFilePath,String targetDataFile,String[] result)throws Exception{

		FileInputStream fi = new FileInputStream(strDataFilePath);
		Workbook w = Workbook.getWorkbook(fi);
		Sheet s = w.getSheet(0);


		FileOutputStream fo = new FileOutputStream(targetDataFile);
		WritableWorkbook wwb = Workbook.createWorkbook(fo);
		wwb.createSheet("Test Result", 0);
		WritableSheet ws = wwb.getSheet(0);

		for(int j=0;j<s.getColumns();j++){
			//System.out.println(s.getCell(j, 0).getContents());
			Label l = new Label(j, 0,s.getCell(j, 0).getContents());
			//System.out.println(l.getContents());
			ws.addCell(l);  
		}                                                                                                                                                                                                                                                                              
		Label l1=new Label(s.getColumns(),0,"Results");
		ws.addCell(l1);

		for (int i = 1; i < s.getRows(); i++) {
			for (int j = 0; j < s.getColumns(); j++) {
				Label value = new Label(j,i,s.getCell(j, i).getContents());

				//System.out.println(value.getContents());
				ws.addCell(value);

			}

			Label lresult = new Label(s.getColumns(),i,result[i-1]);
			ws.addCell(lresult);
		}
		wwb.write();

		wwb.close();

	}

	public static StringBuffer stringGenerator(){


		final int STRING_LENGTH = 3; 

		StringBuffer sb = new StringBuffer(); 

		for (int x = 0; x < STRING_LENGTH; x++) 
		{ 
		sb.append((char)((int)(Math.random()*26)+97)); 
		} 
		System.out.println(sb.toString()); 
		return(sb);

		}

	
	
}
