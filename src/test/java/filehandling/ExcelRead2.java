package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D:\\Assignment\\Book1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet("Sheet1");

		XSSFRow row = null;
		XSSFCell cell = null;

		for (int i = 0; i <= ws.getLastRowNum(); i++) // iterating rows
		{
			if (ws.getRow(i) != null) { // checking if row is not empty
				row = ws.getRow(i); // entering in that specific row
				for (int j = 0; j < row.getLastCellNum(); j++) { // iterating cells
					if (row.getCell(j) != null) {// checking if cell is not empty
						cell = row.getCell(j); // entering in that specific cell
						if (cell.getCellType() == CellType.STRING) // printing based upon the cell type
						{
							System.out.println(cell.getStringCellValue() + " is a String");
						} else if (cell.getCellType() == CellType.NUMERIC) {
							System.out.println(cell.getNumericCellValue() + " is a number");
						} else if (cell.getCellType() == CellType.BOOLEAN) {
							System.out.println(cell.getBooleanCellValue() + " is a boolean");
						} else if (cell.getCellType() == CellType.BLANK) {
							System.out.println(cell + " is blank");
						}
					}
				}
			}
		}

		wb.close();

	}

}
