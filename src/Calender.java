import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#form-field-travel_comp_date")).click();
		
		
	while(!driver.findElement(By.cssSelector("[class='flatpickr-current-month'] [class='cur-month']")).getText().contains("November"))
	{
		driver.findElement(By.cssSelector(".flatpickr-next-month")).click();
	}
		List<WebElement> date = driver.findElements(By.cssSelector(".flatpickr-day "));//grab common atribute //put into list and iterate
		
		int count = date.size();
		for(int i=0;i<count;i++) {
			String text = date.get(i).getText();
			if(text.equalsIgnoreCase("23"))
			{
				date.get(i).click();
				break;
			}
		}

	}

}
