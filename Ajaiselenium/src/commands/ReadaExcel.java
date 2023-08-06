package commands;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadaExcel {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		FileInputStream file = new FileInputStream("C:\\Users\\DELL\\Desktop\\driver\\data excel.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");   // providing sheet name 
		//XSSFSheet sheet = Workbook.getSheetAt(0);  //providing sheet name with index
		
		int rowcount = sheet.getLastRowNum();
		System.out.println("Row Count = "+ rowcount);
		
		int cellcount = sheet.getRow(0).getLastCellNum();
		System.out.println("Cell count = "+ cellcount);
		
		for(int i=0;i<rowcount;i++) {
			XSSFRow Currentrow=sheet.getRow(i);
			
			for(int j=0;j<cellcount;j++) {
				String values= Currentrow.getCell(j).toString(); //values read from the excel
				//String values= Currentrow.getCell(j).getStringCellValue();
				
				System.out.print("           " + values);
			}
			System.out.println();
		}
		
		
		
	}

}
