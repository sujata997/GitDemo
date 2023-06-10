package section30from238;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testng1 {
 @Parameters({"URL"})
 @Test
	public void Demo(String urlname) {
		System.out.println("hello");
		System.out.println(urlname);
	}
 @Test(groups={"Smoke"})
 public void secondTest() {
	 System.out.println("bye");
 }
 @Test
 public void getFirst() {
		 System.out.println("i will execute");
		 Assert.assertTrue(false);
	 }
 
 @AfterTest
 public void afTest()
 {
	System.out.println(" i will excute last from the specific Test folder");
 }
}
