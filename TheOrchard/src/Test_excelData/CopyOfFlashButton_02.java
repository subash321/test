package Test_excelData;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.List;

import FunctionLibrary.Common;

import jxl.Sheet;
import jxl.Workbook;

public class CopyOfFlashButton_02 {
	public static void main(String st[]) {
		System.out.println("test");
		try {
			// Workbook workbook = Workbook
			// .getWorkbook(new File());
			File fi = new File("D://subash.xls");
			Workbook workbook = Workbook.getWorkbook(fi);
			Sheet sheet = workbook.getSheet(0);
			for (int i = 1; i < sheet.getRows(); i++) {
				System.out.println("---------------------------------");
				String organizationUname = (sheet.getCell(1, i).getContents())
						.toString();
				System.out.println("organizationUname" + organizationUname);
				List<HashMap<String, String>> hashDataFile = Common.getTestDataFromExcel("D:\\subash.xls");		
				String	 productName;
				String	 productCategory;
				for (HashMap<String, String> inputDataFile : hashDataFile){ 

					productName = inputDataFile.get("username").trim();
					productCategory = inputDataFile.get("password").trim();
					System.out.println("productName"+productName);
					
					//System.out.println(text);
					
				}
//				String organizationName = (sheet.getCell(2, i).getContents())
//						.toString();
//				String organizationDescription = (sheet.getCell(3, i)
//						.getContents()).toString();
//				String organizationComment = "";
//				if (((sheet.getCell(4, i).getContents()).toString()) != null) {
//					organizationComment = (sheet.getCell(4, i).getContents())
//							.toString();
//				}
//				String organizationLogo = "";
//				if (((sheet.getCell(4, i).getContents()).toString()) != null) {
//					organizationLogo = (sheet.getCell(4, i).getContents())
//							.toString();
//				}

				// dmxOrganization = new DmxOrganization(organizationId,
				// organizationUname, organizationName, organizationDescription,
				// organizationComment, organizationLogo, null, "SuperAdmin",
				// new Date(), "SuperAdmin", new Date());
				// organizationDao.create(dmxOrganization);

			}
			// return dmxOrganization;
		} catch (Exception ex) {
			// Logger.getLogger(GenerateDB.class.getName()).log(Level.SEVERE,
			// null, ex);
			ex.printStackTrace();
		}
	}
}