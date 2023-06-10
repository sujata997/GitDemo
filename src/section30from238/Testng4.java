package section30from238;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng4 {
	@BeforeSuite
	public void bfSuite()
	{
		System.out.println("I Will execute no 1 ");
	}
	@Test(groups={"Smoke"})
	public void MobileLoginHomeloan() {
		System.out.println("MoileLoginCar");
	}
	@Parameters({"URL"})
	@Test
	public void WebLoginHomeLoan(String urlname) {
		System.out.println("WebLoginCar");
		System.out.println(urlname);
		
	}
	
	@Test(dependsOnMethods= {"WebLoginHomeLoan"})//if you want to execute in order yu have to use dependa on method
	public void ApiLoginHomeLoan() {
		System.out.println("ApiLoginCarLoan");
	}
@AfterSuite
public void afSutie() {
	System.out.println("I will execute at from last no1");
}
}
