package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class PriorityTest {

	public WebDriver driver = null;
	
//	@BeforeTest
//	public void BTest(){
//		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
//		driver =  new ChromeDriver();
//		driver.get("http://www.google.com");
//	}
	
	@Test(priority=1)
	public void Test1(){
		System.out.println("Test One");
	}
	
	@Test(priority=1)
	public void Test2(){
		System.out.println("Test Two");
	}
	
	@Test(priority=0)
	public void Test3(){
		System.out.println("Test Three");
	}
	
	@Test(priority=1)
	public void Test4(){
		System.out.println("Test Four");
	}
	
//	@AfterTest
//	public void ATest(){
//		driver.close();
//	}
	
// Notes: -1, 0, 1234 ......, Alphabetically, With priority if same
}
