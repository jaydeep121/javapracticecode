package seleniumPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {
	public static WebDriver driver;
	public static void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ic0064\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public static void scenario1() {
		    driver.get("http://automationpractice.com/index.php?id_category=8&controller=category");
		    WebElement	dropdownElement=driver.findElement(By.id("selectProductSort"));
		    Select select=new Select(dropdownElement);
		   //select.selectByIndex(5);
		    //select.selectByVisibleText("Product Name: Z to A");
		    select.selectByValue("Price: Highest first");
		    System.out.println("value selected");
		    driver.close();
		    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	public static void scenario2() {
		 driver.get("http://automationpractice.com/index.php?id_category=8&controller=category");
		 WebElement checkBox=driver.findElement(By.xpath("//input[@id='layered_category_9']"));
		 checkBox.click();
		 boolean flag=checkBox.isSelected();
		 if(flag) {
			System.out.println("checkbox is checked"); 
		 }
		 else {
			 System.out.println("checkbox is unchecked");
		 }
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 driver.close();
	}
	public static void schenario3(String email) {
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.id("email_create")).sendKeys(email);
		driver.findElement(By.xpath("//form[@id='create-account_form']//span")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("firstname");
		driver.findElement(By.id("customer_lastname")).sendKeys("lastname");
		driver.findElement(By.id("passwd")).sendKeys("Test@123");
		WebElement daysElement=driver.findElement(By.id("days"));//
		WebElement monthsElement=driver.findElement(By.id("months"));
		WebElement yearsElement=driver.findElement(By.id("years"));
		Select selectDate=new Select(daysElement);
		selectDate.selectByIndex(3);
		Select selectMonth=new Select(monthsElement);
		selectMonth.selectByIndex(2);
		Select selectyear=new Select(yearsElement);
		selectyear.selectByIndex(4);
		driver.findElement(By.id("firstname")).sendKeys("addressFirstName");
		driver.findElement(By.id("lastname")).sendKeys("addressLastName");
		driver.findElement(By.id("company")).sendKeys("company");
		driver.findElement(By.id("address1")).sendKeys("address1");
		driver.findElement(By.id("address2")).sendKeys("address2");
		driver.findElement(By.id("city")).sendKeys("city");
		WebElement stateElement=driver.findElement(By.id("id_state"));	
		Select selectState=new Select(stateElement);
		selectState.selectByIndex(3);
		driver.findElement(By.id("postcode")).sendKeys("00000");
		WebElement countryElement=driver.findElement(By.id("id_country"));	
		Select selectCountry=new Select(countryElement);
		selectCountry.selectByIndex(1);
		driver.findElement(By.id("phone_mobile")).sendKeys("9988001122");	
		driver.findElement(By.id("alias")).sendKeys("alias");
		driver.findElement(By.xpath("//button[@id='submitAccount']")).click();	
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		System.out.println("sign up done");
		driver.close();
	
	}
	public static void main(String arg[]) {
		setUp();
		//scenario1();
		//scenario2();
		schenario3("anuj565@yopmail.com");
	}

}
