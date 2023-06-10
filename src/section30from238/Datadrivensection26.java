package section30from238;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadrivensection26 {
	
	public ArrayList<String> getData(String testcasename) throws IOException {
		// Identif testcases column by scanning the entire first row
				// once column is identify then scan entire testcase column to idntify purchase test case row
				// after you grab purchase testcase row=pull all the data of that row and feed into test
				
				
				ArrayList<String>a=new ArrayList<String>();

				FileInputStream fis = new FileInputStream("C://Users//admin//Documents//Demodata.xlsx");// this will read any
																										// file here we are
																										// giving the permissin
																										// to read this path of
																										// file
				XSSFWorkbook workbook = new XSSFWorkbook(fis);// this will except fileinputstreamm argument//it will read the
																// excel

				// go to desired sheet for that first we will get count of sheet then we will
				// reach our require sheet

				int sheets = workbook.getNumberOfSheets();// total no of sheets
				for (int i = 0; i < sheets; i++) {
					if (workbook.getSheetName(i).equalsIgnoreCase("testdata"))// will give sheetname if it is matching with
																				// sheet name it will go inside
					{
						XSSFSheet sheet = workbook.getSheetAt(i);// will give sheet

						// Identif testcases column by scanning the entire first row
						Iterator<Row> row = sheet.iterator();// this will iterate easch row
						Row firstrow = row.next();// this will give row
						Iterator<Cell> ce = firstrow.cellIterator();// this will iterate each cell

						int k = 0;// this will give coumn no thats why we are using k
						int column = 0;// column no will store in this column

						while (ce.hasNext()) // here it will check cell is present or not
						{
							Cell value = ce.next();// this will move to every cell
							if (value.getStringCellValue().equalsIgnoreCase(testcasename)) // here we will find specified row
							{
								column = k;// here we will get desired column
							}
							k++;

						}
						System.out.println(column);
						// once column is identify then scan entire testcase column to idntify purchase test case row
						while(row.hasNext()) {
							Row r = row.next();
							if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcasename)) {
								// after you grab purchase testcase row=pull all the data of that row and feed into test
								Iterator<Cell> cv = r.cellIterator();
								while(cv.hasNext()) {
									Cell c = cv.next();
									if(c.getCellType()==CellType.STRING){ //here it will check which kind of data it is
									a.add(c.getStringCellValue());// we are storing in cell value
								}
									else
									{
										a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
									}
								
							}

						}
					}

				}
				}
				return a;
				

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

			}

	

}
