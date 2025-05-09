package filehandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("D:\\Assignment\\Book1.xlsx");
	   XSSFWorkbook wb =new XSSFWorkbook(fis);
	   XSSFSheet ws = wb.getSheet("Sheet1");
	 // ws.getRow(1).getCell(3).setCellValue("Java"); - updating value to the existing cel
	//   ws.createRow(2).createCell(0).setCellValue("Selenium"); //- creating cell, row and adding value to it
	      ws.getRow(2).createCell(1).setCellValue("API"); //- create a cell and adding value to it
	  FileOutputStream fos = new FileOutputStream("D:\\Assignment\\Book1.xlsx");
	 wb.write(fos); 
	  wb.close();
	   

	}

}
