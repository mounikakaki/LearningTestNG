package utils;

public class ExcelUtilsTest {
	static int i;
	public static void main(String[] args) {
		String excelPath = "./data/TestData.xlsx";
		String sheetName = "Sheet1";
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		excel.getClass();
		excel.getRowCount();
	
		for(i=0;i<=2;i++)
		excel.getCelldata(1,i);
		
	}

}
