import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestionrahulsheetypracticepage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("Uni");
		Thread.sleep(2000);
		
	List<WebElement> autosugg = driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));
	System.out.println(autosugg.size());
	for(int i=0;i<autosugg.size();i++) {
		if( autosugg.get(i).getText().equalsIgnoreCase("United kingdom")) {
		
	
		
		autosugg.get(i).click();
		}
	}
		/* Thread.sleep(2000);

		    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

		    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

		   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); //to get the value from edit text box

	}*/
	}

}
