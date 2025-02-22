package com.trello.qspider.genericutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * This class will be used to read the data from the excel workbook by using POI
 * Library components.
 * 
 * @author Madhan
 */
public class ExcelUtiltiy {

	/**
	 * This Method will be used to read the string data from the excel workbook from
	 * the target cell.
	 * 
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return String data from the cell
	 * @throws EncryptedDocumentException
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public String readStringData(String sheetName, int rowIndex, int cellIndex) throws EncryptedDocumentException, FileNotFoundException, IOException {
		Workbook workBook = WorkbookFactory.create(new FileInputStream("./src/test/resources/dragondata.xlsx"));
		String cellData = workBook.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		workBook.close();
		return cellData;
	}

	/**
	 * This Method will be used to read the numeric data from the excel workbook
	 * from the target cell.
	 * 
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return String data from the cell
	 * @throws EncryptedDocumentException
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public double readNumericData(String sheetName, int rowIndex, int cellIndex) throws EncryptedDocumentException, FileNotFoundException, IOException {
		Workbook workBook = WorkbookFactory.create(new FileInputStream("./src/test/resources/dragondata.xlsx"));
		double cellData = workBook.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getNumericCellValue();
		workBook.close();
		return cellData;
	}

	/**
	 * This method will be used to check the cell type.
	 * 
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public String checkCellType(String sheetName, int rowIndex, int cellIndex) throws EncryptedDocumentException, FileNotFoundException, IOException {
		Workbook workBook = WorkbookFactory.create(new FileInputStream("./src/test/resources/dragondata.xlsx"));
		CellType typeOfCell = workBook.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getCellType();
		String cellType = String.valueOf(typeOfCell);
		workBook.close();
		return cellType;
	}

	/**
	 * This will be used to check the row limit in the target sheet.
	 * 
	 * @param sheetName
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public int checkRowLimit(String sheetName) throws EncryptedDocumentException, FileNotFoundException, IOException {
		Workbook workBook = WorkbookFactory.create(new FileInputStream("./src/test/resources/dragondata.xlsx"));
		Sheet sheet = workBook.getSheet(sheetName);
//		int firstRowIndexCount=sheet.getFirstRowNum();
		int lastRowIndexCount = sheet.getLastRowNum();
		workBook.close();
		return lastRowIndexCount;
	}

	/**
	 * This method will be used to check the cell limit in a target row. Note: This
	 * method will return the cellIndexCount + 1 = cellCount.
	 * 
	 * @param sheetName
	 * @param rowIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public short checkCellLimitInRow(String sheetName, int rowIndex) throws EncryptedDocumentException, FileNotFoundException, IOException {
		Workbook workBook = WorkbookFactory.create(new FileInputStream("./src/test/resources/dragondata.xlsx"));
		Row row = workBook.getSheet(sheetName).getRow(rowIndex);
		short lastCellCount = row.getLastCellNum();
		workBook.close();
		return lastCellCount;
	}

}
