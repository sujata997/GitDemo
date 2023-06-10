import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class SeleniumLatestfeature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameditbox = driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameditbox)).getText());
	WebElement dob = driver.findElement(By.cssSelector("[for='dateofBirth']"));
	driver.findElement(with(By.tagName("input")).below(dob)).click();
	WebElement rdb = driver.findElement(By.id("inlineRadio1"));
	System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());

	}

}
