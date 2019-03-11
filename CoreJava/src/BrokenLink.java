import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class BrokenLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String homepage = "https://accounts.google.com";
		driver.get(homepage);
		
		String url = "";
		HttpURLConnection huc = null;
		int respCode = 200;
		
		List<WebElement> lists = driver.findElements(By.tagName("a"));
		
		Iterator<WebElement> e = lists.iterator();
		
		while(e.hasNext()){
			url = e.next().getAttribute("href");
			
			System.out.println(url);
			
			if(url == null || url.isEmpty()){
				System.out.println("URL is empty");
				continue;
			}
			
			if(!url.startsWith(homepage)){
				System.out.println("URL belongs to another domain");
				continue;
			}
			
			try{
				huc = (HttpURLConnection)(new URL(url).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				respCode = huc.getResponseCode();
				
				if(respCode >=400){
					System.out.println("Broken url is "+url);
				}
				else
					System.out.println("No URL is broken");
			}
			catch (MalformedURLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            } catch (IOException e2) {
                // TODO Auto-generated catch block
                e2.printStackTrace();
            }
		}
		
		driver.quit();
	}
}
