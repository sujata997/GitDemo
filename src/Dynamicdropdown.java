import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		////a[@value='BLR']
	//	(//a[@value='MAA'])[2]
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@value='BLR']")).click();
//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();//xpTH by index 
driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();// xpath by child relationship
driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();//handled calender with current date
	}

}
