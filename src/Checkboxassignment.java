import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.findElement(By.id("checkBoxOption1")).click();
		//Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();

		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print True

		driver.findElement(By.id("checkBoxOption1")).click();



		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print false
		
	 List<WebElement> text = driver.findElements(By.cssSelector("input[name*='checkBox']"));
	 int text1=text.size();
	 System.out.println(text1);
	 Assert.assertEquals(text1, 3);
	}

}
