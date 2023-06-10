import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignementwebTablescrollbar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//1. how many row is present in web table
		//2.how many column is present in web Table
		//3. get content of second row
		
	WebElement table = driver.findElement(By.id("product"));	//limiting the scope of webdriver into table
	
	System.out.println(table.findElements(By.tagName("tr")).size()); // to get the count of row no
	
	System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size()); // to get count of coulumn no
	
	List<WebElement> secondrowtable = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));// limititing the scope of tabledriver to colum driver
	
	int count = secondrowtable.size();
	
	for(int i=0;i<=count;i++) {
		
		String text = secondrowtable.get(i).getText();
	System.out.println(text);
	
	}
//System.out.println(	secondrowtable.get(0).getText());//to get 1 column text
//System.out.println(	secondrowtable.get(1).getText());
//System.out.println(	secondrowtable.get(2).getText());



	
		

	}

}
