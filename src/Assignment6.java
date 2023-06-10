import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
		String opt = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
	WebElement dropdown= driver.findElement(By.id("dropdown-class-example"));
	Select ss= new Select(dropdown);
	ss.selectByVisibleText(opt);
	driver.findElement(By.id("name")).sendKeys(opt);
	driver.findElement(By.id("alertbtn")).click();
	String text = driver.switchTo().alert().getText();
	
	if(text.contains(opt)) {
		System.out.println("alert message success");
	}
	else
		System.out.println("Something wrong in excution");
	

	}

}
