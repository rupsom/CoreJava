package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

public class DesiredCapabilitiesTrst {

public WebDriver driver = null;
	
	@BeforeTest
	public void BTest(){
		
		// Certificate adding
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		driver =  new ChromeDriver(cap);
		driver.get("http://www.google.com");
	}



	@AfterTest
	public void ATest(){
	driver.close();
	}
}
