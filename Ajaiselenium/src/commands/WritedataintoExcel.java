package commands;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritedataintoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream file = new FileOutputStream("C:\\Users\\DELL\\Desktop\\driver\\Testdata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Data");
		
		for(int i=0;i<=5;i++) {
			XSSFRow row = sheet.createRow(i);
			for(int j=0;j<3;j++) {
				row.createCell(j).setCellValue("XYZ");
			}
		}
	
		wb.write(file);
		file.close();
		
		System.out.println("Data is successfully written");
	}

}
