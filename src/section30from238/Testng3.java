package section30from238;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng3 {
	
	@BeforeClass
	public void BfCls() {
		System.out.println("I Will Execute Before methods");
	}
	@BeforeMethod
	public void bfMethod()
	{
		System.out.println("I will execute before each and every method 1st");
	}
	
	@Test
	public void MobileLoginCarloan() {
		System.out.println("MoileLoginCar");
	}
	

	@Test(groups={"Smoke"})
	public void MobilesingninCarloan() {
		System.out.println("MoilesigninCar");
	}

	@Test(enabled=false)//this will skip the test if you dont want to run
	public void MobilesignoutCarloan() {
		System.out.println("MoilesignoutCar");
	}
	
	@Test
	public void WebLoginCarLoan() {
		System.out.println("WebLoginCar");
		
	}
	
	@Test()
	public void ApiLoginCarLoan() {
		System.out.println("ApiLoginCarLoan");
	}
	@AfterMethod
	public void afMethod() {
		System.out.println("I will execute after each nd every  method");
	}
	
	@AfterClass
	public void afCls()
	{
		System.out.println("I wil execute after all method");
	}

}
