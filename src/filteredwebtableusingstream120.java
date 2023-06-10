import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class filteredwebtableusingstream120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Chrome.driver","./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		//enter rice in search box
		//it shoud display with matching rice filter rice thing
		List<WebElement> veggies = driver.findElements(By.id("//tr/td[1]"));//collect all elements those are matching with Rice
		// 1 result
		/*List<WebElement> filteredveggies = veggies.stream().filter(veggie->veggie.getText().contains("Rice"))
				.collect(Collectors.toList());// 1 result
		//we are comparing both should have same size of get text then it will get pass else it b should fail
		Assert.assertEquals(veggies.size(), filteredveggies.size());*/
		for(WebElement veg:veggies) {
		String text=veg.getText();
		System.out.println(text);
		if(text.contains("Rice")) {
			//System.out.println("its passed");//why its not printong
			
		}
			
		}
		
	}
		

}
