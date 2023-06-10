import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandlesassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Set<String> windows = driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		String parentwindow = it.next();
		String childwindow = it.next();
		driver.switchTo().window(childwindow); //because by default it will present outside so we have to mention explicit
		System.out.println(driver.findElement(By.xpath("//div//h3")).getText());
		driver.switchTo().window(parentwindow);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());

	}

}
