import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignementhandleuiform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("sujata");
		driver.findElement(By.name("email")).sendKeys("sujo.sujata@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Sujata@123");
		driver.findElement(By.id("exampleCheck1")).click();
      WebElement option = driver.findElement(By.id("exampleFormControlSelect1"));
      Select s=new Select(option);
      s.selectByIndex(1);
      driver.findElement(By.id("inlineRadio1")).click();
      driver.findElement(By.name("bday")).sendKeys("09091997");
      driver.findElement(By.cssSelector(".btn.btn-success")).click();
      System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
    // String text= driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText();
     //System.out.println(text);
     //Assert.assertEquals(text,"Success! The Form has been submitted successfully!.\r\n"

   //   + "                  ");
	}

}
