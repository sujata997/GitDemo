package section30from238;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excelprovidepractice {

	DataFormatter formatter = new DataFormatter();

	@Test(dataProvider="exceldriven")
	public void testCase1(String name, String place, String phno) {

		System.out.println(name+place+phno);

	}

	@DataProvider(name = "exceldriven")
	public Object[][] getDetails() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Documents\\excelDataprovider.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(1);
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		
		Object data[][] = new Object[rowCount - 1][colCount];

		for (int i = 0; i < rowCount - 1; i++) {
			row = sheet.getRow(i + 1);
			for (int j = 0; j < colCount; j++) {
				XSSFCell celll = row.getCell(j);
				data[i][j] = formatter.formatCellValue(celll);

			}
		}

		return data;
	}

}
