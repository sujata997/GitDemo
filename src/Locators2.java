import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		String name="connect";
		System.setProperty("WebDriver.Chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password=getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		//Assert.assertEquals(driver.findElements(By.cssSelector("div[class='login-container'] h2")),"Hello "+name+",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();

	}

	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordtext=(driver.findElement(By.cssSelector("form p")).getText());
		System.out.println(passwordtext);
		//Please use temporary password 'rahulshettyacademy' to Login.
	String[] passwordarray=	passwordtext.split("'");
	//0th index =//Please use temporary password
	//1th index= rahulshettyacademy' to Login.
	//String[] passwordarray2 = passwordarray[1].split("'");
	//passwordarray2[0];
	//0th index=rahulshettyacademy
	//1th index= to Login.
	String password=passwordarray[1].split("'")[0];
	return password;
		
		
	}
	
	
}
