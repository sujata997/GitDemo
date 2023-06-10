import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Broken Url
		//step 1 - Is to get all urls tied up to the links using selenium
		//Java method will call all urls and get you the  status code
		// if status code is>400 then that url is not working-linkh which tied to url is broken
		driver.findElement(By.cssSelector("a[href*='SoapUI']")).getAttribute("href");

	}

}
