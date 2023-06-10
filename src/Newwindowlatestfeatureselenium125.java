import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newwindowlatestfeatureselenium125 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//scenario : step 1 navigate to https://rahulshettyacademy.com/angularpractice/
	//step 2	fill the "name" field with first course name avilable at https://www.rahulshettyacademy.com/
		
		System.setProperty("WebDriver.Chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);//using the method we can open new tab in same window or new window we can open
		//but by default control is outside of window To bring control in current window we have to do get ids of each window
	Set<String> windowids = driver.getWindowHandles();
		Iterator<String> it = windowids.iterator();
		String parentid = it.next();
		String childwindowid = it.next();
		driver.switchTo().window(childwindowid);
		driver.get("https://www.rahulshettyacademy.com/");
		String text = driver.findElements(By.xpath("a[href*='https://courses.rahulshettyacademy.com/p']")) ////h2/a
		.get(1).getText();
		driver.switchTo().window(parentid);
	WebElement nameeditbox = driver.findElement(By.name("name"));
		//driver.quit();
	//Taking scrrenshot a particular webelement where testcase got failed
	nameeditbox.sendKeys(text);
File filesrc = nameeditbox.getScreenshotAs(OutputType.FILE); //screenshot stored in file object to get in physical we are using FileUtils()method
FileUtils.copyFile(filesrc, new File("logo.png"));

//get height and width
System.out.println(nameeditbox.getRect().getDimension().getHeight());
System.out.println(nameeditbox.getRect().getDimension().getWidth());


	}

}
