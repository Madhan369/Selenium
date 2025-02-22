package basics;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.trello.qspider.genericutility.ExcelUtiltiy;


public class ExcelSheetMock {
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		ExcelUtiltiy excelUtils = new ExcelUtiltiy();
		// rowLimit
		int rowIndexCount = excelUtils.checkRowLimit("dragon");
		System.out.println(rowIndexCount);
		//cell limit
		short cellCount = excelUtils.checkCellLimitInRow("dragon", 2);
		System.out.println(cellCount);
		//cell type
		String cellType = excelUtils.checkCellType("dragon", 2, 2);
		System.out.println(cellType);
	}
}