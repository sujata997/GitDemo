import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	Thread.sleep(1000);
		driver.findElement(By.cssSelector(".paxinfo")).click();//tagname.classattribut
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		//Thread.sleep(1000);
		int i=1;
		while(i<3) {
		driver.findElement(By.cssSelector("#hrefIncChd")).click();//tagname#id
		//Thread.sleep(1000);
		i++;
		

	}
		driver.findElement(By.cssSelector("input[value='Done']")).click();//cutomise
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

}
}
