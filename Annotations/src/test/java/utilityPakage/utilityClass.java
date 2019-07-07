package utilityPakage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

public class utilityClass {
	
	static Workbook book;
	static org.apache.poi.ss.usermodel.Sheet sheet;
	public static String  sheetpath= "C:\\Users\\Abdel\\Documents\\Book1.xls";
	
	
	public static  Object[][] getDataforExcelSheel(String esheet) {
		
		FileOutputStream file= null;
		
		try {
			file= new FileOutputStream(sheetpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("I got here1");
		try {
			book = XSSFWorkbookFactory.create(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("I got here2");
		sheet = book.getSheet(esheet);
		
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		
		for(int i=1;i<sheet.getLastRowNum(); i++){
			
			for (int k=0; k< sheet.getRow(0).getLastCellNum(); k++) {
				
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
			}
			
		}
		
		
		
		return data;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public void readExcel(String filePath,String fileName,String sheetName) throws IOException{

	    //Create an object of File class to open xlsx file
		String f = "C:\\Users\\Abdel\\Documents\\dateDrivenTest.xlsx";

	    File file =    new File(f);

	    //Create an object of FileInputStream class to read excel file

	    FileInputStream inputStream = new FileInputStream(file);

	    Workbook Workbook = null;

	    //Find the file extension by splitting file name in substring  and getting only extension name

	    String fileExtensionName = fileName.substring(fileName.indexOf("."));

	    //Check condition if the file is xlsx file

	    if(fileExtensionName.equals(".xlsx")){

	    //If it is xlsx file then create object of XSSFWorkbook class

	    Workbook = new XSSFWorkbook(inputStream);

	    }

	    //Check condition if the file is xls file

	    else if(fileExtensionName.equals(".xls")){

	        //If it is xls file then create object of HSSFWorkbook class

	        Workbook = new HSSFWorkbook(inputStream);

	    }

	    //Read sheet inside the workbook by its name

	    Sheet Sheet = (org.apache.poi.sl.usermodel.Sheet) Workbook.getSheet(sheetName);

	    //Find number of rows in excel file

	    int rowCount = ((org.apache.poi.ss.usermodel.Sheet) Sheet).getLastRowNum()-((org.apache.poi.ss.usermodel.Sheet) Sheet).getFirstRowNum();

	    //Create a loop over all the rows of excel file to read it

	    for (int i = 0; i < rowCount+1; i++) {

	        Row row = ((org.apache.poi.ss.usermodel.Sheet) Sheet).getRow(i);

	        //Create a loop to print cell values in a row

	        for (int j = 0; j < row.getLastCellNum(); j++) {

	            //Print Excel data in console

	            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

	        }

	        System.out.println();
	    } 

	    }  */
	
	
}


