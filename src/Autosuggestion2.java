import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count = options.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++) {
			String text=options.get(i).getText();
			System.out.println(text);
			options.get(0).click();
			
			
			
				
				
			
		}
		
		

	}

}
