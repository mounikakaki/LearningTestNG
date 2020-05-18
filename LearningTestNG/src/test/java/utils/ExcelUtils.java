package utils;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static Logger logger = LogManager.getLogger(ExcelUtils.class);
	
	//	static String ExcelPath = "./data/TestData.xlsx";

	public ExcelUtils(String excelPath, String sheetName){

		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet= workbook.getSheet(sheetName);
			logger.error("This is wrong");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}



	public static void getRowCount(){

		int rowCount=sheet.getPhysicalNumberOfRows();
		System.out.println("No.of rows:"+rowCount);

	}


	public static void getCelldata(int rowNum, int colNum){

		try{
			DataFormatter dataformatter = new DataFormatter();
			Object value= dataformatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
			System.out.println("Value is:"+value);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
