import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Sortingwebtableusingstream116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
	//click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//capture all webelements into new original list
		List<WebElement> elementlist = driver.findElements(By.xpath("//tr/td[1]"));
		
		//capture text of all webelements into new(original)list
		List<String>originallist=elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
		
	//sort on the original list of step 3->sorted set
	List<String>newlist=	originallist.stream().sorted().collect(Collectors.toList());
	
//compare original list vs soreted list
	Assert.assertTrue(originallist.equals(newlist));

	 List<String> price;
	//scan the name column with geText->BEans->print the price of beans
	do
	{  List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]")); //if i wont givw here we will gwt staleelementrefrenceException
		price= rows.stream().filter(s->s.getText().contains("Rice"))
          .map(s->getPriceVeggie(s)).collect(Collectors.toList());
        price.forEach(a->System.out.println(a));
        if(price.size()<1) {
        	driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
        }
	}while(price.size()<1); //if it becomes false it will stop the loop
	}

	private static String getPriceVeggie(WebElement s) {
		// TODO Auto-generated method stub
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
