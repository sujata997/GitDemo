package section30from238;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class excel {
	
      @Test
		public Object[][] getData() throws IOException
		{
			//Object[][] data= {{"Hello","text","456"},{"Bye","message","143"},{"solo","call","265"}};// it will accept all type of data
			//return data;
			//every row of excel shoud be sent to 1 array
			FileInputStream fis =new FileInputStream("C:\\Users\\admin\\Documents\\excelDataprovider.xlsx");//where is our file is present we have to give the path
		XSSFWorkbook wb=new XSSFWorkbook(fis);//wb have information about our excel sheet and this has power to read your excel sheet and get the data
	XSSFSheet sheet=	wb.getSheetAt(0);//will give 1 st sheet we will control over 1 st sheet
	int rowCount = sheet.getPhysicalNumberOfRows();//whatever you see physical in row give row how many row is present no of rows
	XSSFRow row = sheet.getRow(0);//will give 1st row
	int colCount = row.getLastCellNum();//column will give means cell
	Object data[][]= new Object [rowCount-1][colCount];//here we created multidimesnsional array creating memory location

	for(int i=0;i<rowCount-1;i++)// for row outer loop
	{
		row=sheet.getRow(i+1);//because we dont want here so it will start from 1st array
		
		for(int j=0;j<colCount;j++) //this will give column
		{
			//XSSFCell cell = row.getCell(j);
			
			System.out.println(row.getCell(j));
			
	}
	}

	return data;


		
					
					
					
					
					
					
					
					
					
					
					
		}
		

	}



