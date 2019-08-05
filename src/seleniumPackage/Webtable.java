package seleniumPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	
	public static WebDriver driver;
	public static void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ic0064\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public static void getRowValue() {
		driver.get("http://demo.guru99.com/test/table.html");
		List<WebElement> rowElements=driver.findElements(By.xpath("//table//tbody//tr"));
		int rowSize=rowElements.size();
		System.out.println("row size is "+rowSize);
		for(int i=1;i<=rowSize;i++) {
			List<WebElement> cellElements=driver.findElements(By.xpath("//table//tbody//tr["+i+"]//td"));
			System.out.println("in "+i+"row "+cellElements.size()+" cell present");
			for(int j=0;j<cellElements.size();i++) {
				System.out.println("cell value at"+j+"==="+cellElements.get(j).getText());
			}
		}
	}
	public static void getTableData() {
		driver.get("http://demo.guru99.com/test/table.html");
		String beforeXpath="//table//tbody//tr[1]//td[";
		String afterXpath="]";
		for(int i=1;i<=3;i++) {
			String cellvalue=driver.findElement(By.xpath(beforeXpath+i+afterXpath)).getText();
			System.out.println(cellvalue);
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public static void main(String arg[]) {
		setUp();
		getRowValue();
		//getTableData();
		}	
	}
	


