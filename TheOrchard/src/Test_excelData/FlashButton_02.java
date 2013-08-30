package Test_excelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import FunctionLibrary.Common;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class FlashButton_02 {
	public static void main(String st[]) {
		
		try {
			File fi = new File("D://subash.xls");
			Workbook workbook = Workbook.getWorkbook(fi);
			Sheet workbookheet = workbook.getSheet(0);
			String a[][] = new String[workbookheet.getRows()][workbookheet.getColumns()];
			FileOutputStream fo = new FileOutputStream("D://subashTest.xls");
			WritableWorkbook wwb = Workbook.createWorkbook(fo);
			wwb.createSheet("Test Result", 0);
			WritableSheet ws = wwb.getSheet(0);
			for (int i = 0; i < workbookheet.getRows(); i++) {
				System.out.println("workbookheet.getColumns = " + workbookheet.getColumns());
				for (int j = 0; j < workbookheet.getColumns(); j++) {
				a[i][j] = workbookheet.getCell(j, i).getContents();
				Label l = new Label(j, i, a[i][j]);
				Label l1 = new Label(2, 0, "Result");
				ws.addCell(l);
				ws.addCell(l1);
				}
			}
				wwb.write();
			wwb.close(); 
			System.out.println("42");	
			
			List<HashMap<String, String>> hashDataFile = Common.getTestDataFromExcel("D://subash.xls");
			System.out.println("45");
			String	 productName;
			String	 productCategory;
			for (HashMap<String, String> inputDataFile : hashDataFile){ 

				productName = inputDataFile.get("username").trim();
				productCategory = inputDataFile.get("password").trim();
				System.out.println("productName"+productName);
				
				//System.out.println(text);
				
			}
		}
			catch (Exception ex) {
				// Logger.getLogger(GenerateDB.class.getName()).log(Level.SEVERE,
				// null, ex);
				ex.printStackTrace();
			}
		}
			
			
	}
	

