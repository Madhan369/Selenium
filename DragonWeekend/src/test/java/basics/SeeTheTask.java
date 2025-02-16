package basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SeeTheTask {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		Workbook workbook = WorkbookFactory.create(new FileInputStream("./src/test/resources/dragondata.xlsx"));
		Sheet sheet = workbook.getSheet("dragon");
		// row limit
		// first row
		int firstRowIndex = sheet.getFirstRowNum();
		System.out.println("firstRowIndex :"+firstRowIndex);
		// cell count in the row
		Row firstRow = sheet.getRow(2);
		short firstCellIndex = firstRow.getFirstCellNum();
		System.out.println("firstCellIndex : "+firstCellIndex);
		short lastCellCount = firstRow.getLastCellNum();
		System.out.println("lastCellCount : "+lastCellCount);
		// last row
		int lastRowIndex = sheet.getLastRowNum();
		System.out.println("lastRowIndex : "+lastRowIndex);
		//cell Type
		 org.apache.poi.ss.usermodel.CellType cellType = sheet.getRow(0).getCell(0).getCellType();
		 System.out.println("cellType : "+cellType);
		 workbook.close();
	}

}
