import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytripcalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/railways/");
		driver.findElement(By.xpath("//label[@class='lbl_input latoBold makeFlex column'] //input[@id='travelDate']")).click();
		//label[class='lbl_input latoBold makeFlex column'] [id='travelDate'] cssSelector

	}

}
