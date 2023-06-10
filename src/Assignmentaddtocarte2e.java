import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignmentaddtocarte2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("password")).sendKeys("learning");
		//driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		driver.findElement(By.xpath("//label[@class='customradio']/input[@value='user']/following-sibling::span")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(7000));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		//driver.switchTo().alert().dismiss();
		WebElement text = driver.findElement(By.cssSelector("select[class='form-control']"));
		Select s=new Select(text);
		s.selectByVisibleText("Consultant");
		driver.findElement(By.id("terms")).click();
			driver.findElement(By.id("signInBtn")).click();
		List<WebElement> product = driver.findElements(By.cssSelector(".card-footer .btn")); //parent child class attribute
		
		for(int i=0;i<product.size();i++) {
			product.get(i).click();
			
			
			
		}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		driver.findElement(By.partialLinkText("Checkout")).click();
		
	}

}
