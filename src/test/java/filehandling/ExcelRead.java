package filehandling;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		//first we are creating object of FIS and sending our file name as a string
		FileInputStream fis = new FileInputStream("D:\\Assignment\\Book1.xlsx");
	
		// above file cannot be workbook, so we need to create a object for workbook 
		//and send the file as a Input stream	
	   XSSFWorkbook wb =new XSSFWorkbook(fis);
	   //we are using WB methods and then retrieving the sheet which we require
	   
	   XSSFSheet ws = wb.getSheet("Sheet1");
	  int lastNoOfRows= ws.getLastRowNum(); //count starts from 0
	  System.out.println(lastNoOfRows);
	  int noOfRows =  ws.getPhysicalNumberOfRows();//count starts from 1
	  System.out.println(noOfRows);
	  XSSFRow row =  ws.getRow(0); //retrieving of data starts from 0
	  int lastNoCells = row.getLastCellNum(); //count starts from 1
	  System.out.println(lastNoCells);
	  int noOfCells =row.getPhysicalNumberOfCells(); //count starts from 1
	  System.out.println(noOfCells);
	  XSSFCell cell = row.getCell(0); //retrieving of data starts from 0
	  System.out.println(cell);
	  System.out.println(cell.getCellType());
	  wb.close();
	   

	}

}
