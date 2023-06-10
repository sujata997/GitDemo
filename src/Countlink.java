import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countlink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> count = driver.findElements(By.tagName("a"));
		System.out.println(count.size());
		
		//limiting the driver only for footer down area
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size()); //control in footer area only
		
		//3. to get to coloumsize in footerarea //limiting the scope of 1st coloum in side footer area
		WebElement columdriver = footerdriver.findElement(By.xpath("//div//table//tbody//tr//td[1]//ul"));
		                     System.out.println(columdriver.findElements(By.tagName("a")).size());
		                     
		//4.click on each link in the coloum and check if pages are opening
		                     for(int i=1;i<columdriver.findElements(By.tagName("a")).size();i++) {
		                    	 
		                    	 //ctrl +enter link will open in new tab
		                    	 String clickonlinktab = Keys.chord(Keys.CONTROL,Keys.ENTER);
		                    	 
		                    	 
		                    	 columdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab); //to perform key event we have to send in sendkeys
		                    	 Thread.sleep(5000l);
		                     } //open all the tabs
		                     
		                     Set<String> abc = driver.getWindowHandles();//4
		                    Iterator<String> it = abc.iterator(); //iterator will help to move new tab
		                    
		                    
		                    while(it.hasNext()) { //index is present or not 
		                    	driver.switchTo().window(it.next()); //will give actual index
		                    	System.out.println(driver.getTitle());
		                    }
		                     
		                     
		

	}

}
