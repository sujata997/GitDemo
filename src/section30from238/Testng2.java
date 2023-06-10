package section30from238;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testng2 {
	@Test(dataProvider="getData")//it will wait unitl 40 seconds
	public void Demo2(String Un,String pwd) {
		System.out.println("Good");
		System.out.println(Un);
		System.out.println(pwd);
		
	}
	
	
	
	@DataProvider
	public Object[][] getData() {
		Object data[][]=new Object[2][2];
		
		//1st set
		data [0][0]="fstusername";
		data [0][1]= "lastusername";
		
		//2nd set
		data[1][0]="secondusername";
		data[1][1]="secondpwd";
		
		return data;
	}
	@BeforeTest
	public void bfTest() {
		System.out.println("I will excute first");
	}

	
}
