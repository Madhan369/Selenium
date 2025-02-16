package basics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DealWithExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// create a object for FileInputStream with file address
		FileInputStream fis = new FileInputStream("./src/test/resources/dragondata.xlsx");
		// call create() from workbookfactory class
		Workbook workbook = WorkbookFactory.create(fis);
		// specify the sheet
		Sheet sheet = workbook.getSheet("Sheet1");
		// specify the row
		Row row = sheet.getRow(1);
		// specify cell
		Cell cell = row.getCell(0);
		// read the data from the cell
		long celldata = (long) cell.getNumericCellValue();
		System.out.println(celldata);
		Cell cell2 = row.getCell(1);
		String cell2Data = cell2.getStringCellValue();
		System.out.println(cell2Data);
		workbook.close();
		
		
	}

}
