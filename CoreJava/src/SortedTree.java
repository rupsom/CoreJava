import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SortedTree {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		SortedSet<String> sites = new TreeSet<>();
//		sites.add("Ami");
//		sites.add("Tumi");
//		sites.add("Ricky");
//		sites.add("Mimi");
//		
//		System.out.println("Sorted Set: " + sites);
			
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://id.atlassian.com/");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rrouth@onprocess.com");
		
		driver.findElement(By.xpath("//span[contains(text(),'Continue')]")).click();
		
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");
		
		driver.findElement(By.xpath("//span[contains(text(),'Log in')]")).click();
		
		driver.navigate().to("https://optbts.atlassian.net/browse/ICM-4492/");
	
//		driver.findElement(By.xpath("//select[@name='ctl00$MainContent$ddlDatabase']")).click();
		
		
		//Home Page
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenk");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		
//		//Details Page
//		Thread.sleep(100000);
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Contacts']"))).click();
//		driver.findElement(By.xpath("//input[@type='image']")).click();
//		
		driver.findElement(By.id("customfield_10200-val")).click();
		WebElement dropdown = driver.findElement(By.id("customfield_10200"));
		Select select = new Select(dropdown);
		List <WebElement> list = select.getOptions();
		
		System.out.println(list.size());
			
		ArrayList <String> al=new ArrayList <String>();
		
		for(WebElement e:list)
		{
			al.add(e.getText());
			if(e.getText().contains("[1003]")){
				System.out.println("1003 available");
			}
		}
		
//        al.add("Ami");
//        al.add("Ricky");
//        al.add("Somoparna");
		
        SortedTree alDemo=new SortedTree();
        System.out.println("Is Sorted in ascending:"+alDemo.checkSorting(al));

//        driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
        
        // /html/body/div[6]/div[1]/div[1]/div[3]/div/table/tbody/tr[2]/td[2]
        
//        String before_xpath = "/html/body/div[6]/div[1]/div[1]/div[3]/div/table/tbody/tr[";
//        String after_xpath = "]/td[2]";
//        
//        int i = 2;
//        
//        while(isElementPresent("before_xpath"+i+"after_xpath")){
//        	 String cName = driver.findElement(By.xpath("before_xpath"+i+"after_xpath")).getText();
//        	 
//        	 if(cName.equalsIgnoreCase("Helen Bennett")){
//        		 System.out.println("Found Name");
//        	 }
//        	 
//        	 String country = driver.findElement(By.xpath("before_xpath"+i+"after_xpath".replace("td[2]", "td[3]"))).getText();
//        	 
//        	 if(cName.equalsIgnoreCase("UK")){
//        		 System.out.println("Found Country");
//        	 }
//        	 
//        	 i++;
//        }
	}
	
	boolean checkSorting(ArrayList<String> arraylist){
        boolean isSorted=true;
        for(int i=1;i < arraylist.size();i++){
            if(arraylist.get(i-1).compareTo(arraylist.get(i)) > 0){
                isSorted= false;
                break;
            }
        }
        return isSorted;
    }
	
	public static boolean isElementPresent(String xpathVal){
		int count = driver.findElements(By.xpath(xpathVal)).size();
		
		if(count == 0)
			return false;
		else
			return true;
	}
}
