package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTest{
	
	public static WebDriver driver;
	
	public static void main(String arg[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ic0064\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/table.html");
		for(int i=0;i<3;i++) {
			String beforeXpath="//table//tbody//tr[1]//td[";
			String afterXpaht="]";
		
			
		}
		
	
		/*driver.get("http://automationpractice.com/index.php");
		String title=driver.getTitle();
		System.out.println("home page titile is "+title);
		driver.findElement(By.id("search_query_top")).sendKeys("T-Shirt");
		driver.findElement(By.name("submit_search")).click();
		driver.close();
		System.out.println("browser closed");*/
		
	}
	}
