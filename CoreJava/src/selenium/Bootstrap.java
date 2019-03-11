package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Bootstrap {

	public static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		List <WebElement> list = 
				driver.findElements(By.xpath("//ul[contains(@class, 'multiselect-container')]//li//a//label"));
		
		System.out.println(list.size());
		
		Thread.sleep(10000);
		
		for(WebElement i: list){
			System.out.println(i.getText());
			if(i.getText().equalsIgnoreCase("Angular")){
				if(i.isSelected()== false || i.isSelected()== true){
					i.click();
				} 
				break;
			}
		}
	}

}
