package section30from238;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String download=	System.getProperty("user.dir");//simply this will give path of your project F:\javaProgramme\Udemy this path it will give
		System.setProperty("WebDriver.Chrome.driver", "./driver/chromedriver.exe");
		//giving the knoweldge to chrome that download our file to our  own project
		ChromeOptions options= new ChromeOptions(); //will  set the all prefrences given by user
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		chromePrefs.put("profile.default_content_settings.popups", 0);

		chromePrefs.put("download.default_directory", download);

		options.setExperimentalOption("prefs",chromePrefs );//we have to set prefrences
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.ilovepdf.com/pdf_to_jpg");
		driver.findElement(By.id("pickfiles")).click();
		Thread.sleep(3000);
		//to call exe file
		Runtime.getRuntime().exec("C:\\Users\\admin\\Documents\\Check\\Fileupload.exe");//here it will excute exe file and file will upload
		Thread.sleep(5000);
		driver.findElement(By.id("processTask")).click();
		//downloading the file 
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pickfiles")));
		driver.findElement(By.id("pickfiles")).click();
		//step to know file is downloaded or not
		Thread.sleep(5000);
		File f=new File(download+"/ilovepdf_pages-to-jpg.zip");
		if(f.exists())
		{
			Assert.assertTrue(f.exists());
			if(f.delete())
				System.out.println("file delete");
		}
		
		

	}

}
