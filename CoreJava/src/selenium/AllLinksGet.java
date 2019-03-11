package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksGet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		WebElement findOut = driver.findElement(By.name("q"));
		findOut.sendKeys("Selenium Webdriver");
		findOut.sendKeys(Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		//List<WebElement> list = driver.findElements(By.tagName("a"));
		//List<WebElement> list = driver.findElements(By.xpath("//a[contains(text(),'selenium')]"));
		List<WebElement> list = driver.findElements(By.tagName("h3"));
		Thread.sleep(30000);
		System.out.println(list.size());
		
		for(WebElement s : list){
			System.out.println(s.getText()+ " ----------------- "+s.getAttribute("href"));
		}
	}

}
