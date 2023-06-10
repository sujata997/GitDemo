import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameanddraganddropTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		//to count howw many frame is present in web page
		System.out.println(driver.findElements(By.cssSelector("iframe[class='demo-frame']")).size());
		//switching to frame using index
		driver.switchTo().frame(0); //0 means 1st frame
		//switching to frame using webelement
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		driver.findElement(By.id("draggable")).click();
		Actions a=new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform(); //for excuting action element
		driver.switchTo().defaultContent();//to come outfrom frame
		driver.close();
		

	}

}
