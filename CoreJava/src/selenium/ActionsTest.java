package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.glass.events.KeyEvent;

public class ActionsTest {

	public static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		
		// Drag and Drop
		driver.findElement(By.xpath("//a[contains(text(),'Droppable')]")).click();
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		action.dragAndDrop(drag, drop).perform();
		
		// Slider
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[contains(text(),'Slider')]")).click();
		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.xpath("//div[id('slider')]"));
		int width = slider.getSize().getWidth();
		
		WebElement squareOnSlider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		System.out.println(width);
		
		action.clickAndHold(squareOnSlider).moveByOffset((width/2), 0).release(squareOnSlider).build().perform();
		
		// DoubleClick
		Thread.sleep(5000);
		action.doubleClick(squareOnSlider);
		
		// RightClick
		action.contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
//		freeCRMLogin();
//		robotTest();
		xPathTest();
		
	}
	
	public static void xPathTest(){
		driver.navigate().to("http://dcwebuat01/Contact360ICM4245/(S(vx2rzhsu1unpkkjccwk322ew))/about.aspx");
		String xPathText = driver.findElement(By.xpath("//tr/td[text()='OnProcess']"
				+ "/parent::tr/following-sibling::tr[1]/td[text()='OnProcess']")).getText();
		System.out.println(xPathText);
	}
	
	
	
	
	public static void robotTest() throws AWTException{
		Robot robot = new Robot();
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.id("imagesrc")).click();
		
		robot.setAutoDelay(2000);
		
		StringSelection stringSelection = new StringSelection("C:\\Users\\username\\"
				+ "Desktop\\Dispatch\\Disp_reg_2604.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		
		robot.setAutoDelay(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.setAutoDelay(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
	}
	
	
	
	
	
	
	
	
	
	public static void freeCRMLogin() throws InterruptedException{
		driver.navigate().to("http://www.freecrm.com");
		Thread.sleep(5000);
		clickOn(driver, driver.findElement(By.xpath("//input[@value='Login']")), 20);
}
	
	// Explicit Wait
	public static void clickOn(WebDriver driver, WebElement locator, int timeout){
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}

}
