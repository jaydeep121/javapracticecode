package seleniumPackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	
	public static WebDriver driver;
	public static void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ic0064\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public static void webTablePrint() {
		driver.get("file:///C:/Users/ic0064/Desktop/webtable.html");;
		//Print all headers of web table.
		String beforeXpath="//table//tbody//tr[1]//th[";
		String afterXpath="]";
		System.out.println("*****Table Header*****");
		for(int i=1;i<=4;i++) {
			String tableHeader=driver.findElement(By.xpath(beforeXpath+i+afterXpath)).getText();
			System.out.print(tableHeader+" | ");
		}
		System.out.println();
		System.out.println("**********Totoal Row******************");	
		List<WebElement> rowElemets=driver.findElements(By.xpath("//table//tbody//tr"));
		//Retrieve and print number of rows in a web table.
		System.out.println("Total row - "+rowElemets.size());
		List<WebElement> columnElements=driver.findElements(By.xpath("//table//tbody//tr[2]//td"));
		//Find number of columns for each row:
		System.out.println("Number of column - "+columnElements.size());
		for(int i=2;i<=rowElemets.size();i++) {
			String firstXpaht="//table//tbody//tr[";
			String secondXpath="]//td[";
			String thirdXpath="]";
			for(int j=1;j<columnElements.size();j++) {
				String finalXpath=firstXpaht+i+secondXpath+j+thirdXpath;
				String text=driver.findElement(By.xpath(finalXpath)).getText();
				System.out.print(text+" , ");
			
			}
			System.out.println();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.close();
	}
	public static void getBookAuthor() {
		driver.get("file:///C:/Users/ic0064/Desktop/webtable.html");;
		//Retrieve name of book whose author is Parmod
		System.out.println("*****get pramod book*****");
		String firstXpathOfAuthor="//table//tbody//tr[";
		String secondXpathOfAuthor="]//td[4]";
		String firstXpathOfSubject="//table//tbody//tr[";
		String secondXpathOfSubjectr="]//td[2]";
		HashMap<String, String> hs=new HashMap<String,String>();
		List<WebElement> rowCount=driver.findElements(By.xpath("//table//tbody//tr"));
		for(int i=2;i<=rowCount.size();i++) {
			String finalXpathOfSubject=firstXpathOfSubject+i+secondXpathOfSubjectr;
			String finalXpathOfAuthor=firstXpathOfAuthor+i+secondXpathOfAuthor;
			hs.put(driver.findElement(By.xpath(finalXpathOfAuthor)).getText(),driver.findElement(By.xpath(finalXpathOfSubject)).getText());
			}
		System.out.println("hasmap elements : "+hs);
		if(hs.containsKey("Parmod")) {
			System.out.println("pramod book - "+hs.get("Parmod"));
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.close();
	}
	public static void getBookBelowOrEqual1500() {
		driver.get("file:///C:/Users/ic0064/Desktop/webtable.html");
		//List all books whose price is less than or equal to 1500
		String firstXpathOfprice="//table//tbody//tr[";////table//tbody//tr[2]//td[3]
		String secondXpathOfPrice="]//td[3]";
		String firstXpathOfSubject="//table//tbody//tr[";
		String secondXpathOfSubjectr="]//td[2]";
		Map<Integer, String> map=new HashMap<Integer, String>();
		List<WebElement> rowCount=driver.findElements(By.xpath("//table//tbody//tr"));
		for(int i=2;i<=rowCount.size();i++) {
			String finalXpathOfPrice=firstXpathOfprice+i+secondXpathOfPrice;
			String finalXpathOfSubject=firstXpathOfSubject+i+secondXpathOfSubjectr;
			String key=driver.findElement(By.xpath(finalXpathOfPrice)).getText();
			String value=driver.findElement(By.xpath(finalXpathOfSubject)).getText();
			int keyint=Integer.parseInt(key);
			map.put(keyint,value);
		}
		System.out.println(map);
		System.out.println("Book's less than and equal to 1500 ");
		for(Entry<Integer, String> e:map.entrySet()) {
			int keyValue=e.getKey();
			if(keyValue<=1500) {
				System.out.print(e.getValue()+" | ");
			}
		}
	}
	public static void getLastRow() {
		//Print last second row of table.
		driver.get("file:///C:/Users/ic0064/Desktop/webtable.html");
		List<WebElement> lastRows=driver.findElements(By.xpath("//table//tbody//tr"));
		System.out.println(lastRows.size());
		for(int i=1;i<=lastRows.size();i++) {
			if(i==lastRows.size()) {
			String fisrtRowXpath="//table//tbody//tr[";
			String secondXpath="]//td[";
			String lastRowXpath="]";
			List<WebElement> lastCols=driver.findElements(By.xpath("//table//tbody//tr[2]//td"));	
			for(int j=1;j<=lastCols.size();j++) {
				String finalRowXpath=fisrtRowXpath+i+secondXpath+j+lastRowXpath;
				String text=driver.findElement(By.xpath(finalRowXpath)).getText();
				System.out.print(text+" || ");
				}
			}
		}
	}
	public static void getTotalBookCost() {
		//Print total cost of all books listed in table.
		driver.get("file:///C:/Users/ic0064/Desktop/webtable.html");
		int totalBookCost=0;
		List<WebElement> priceCols=driver.findElements(By.xpath("//table//tbody//tr//td[3]"));
		String fisrtXpathOfPrice="//table//tbody//tr[";
		String secondXpathOfPrice="]//td[3]";
		for(int i=2;i<=priceCols.size()+1;i++) { 
			String finalXpathOfPrice=fisrtXpathOfPrice+i+secondXpathOfPrice;
			String priceValue=driver.findElement(By.xpath(finalXpathOfPrice)).getText();
			System.out.println(i+" position book pirce :  "+priceValue);
			totalBookCost=Integer.parseInt(priceValue)+totalBookCost;	
		}
		System.out.println("Total Book Cost - "+totalBookCost);
	}
	public static void getCellValue() {
		//Retrieving cell value of specific column of specific row.
		driver.get("file:///C:/Users/ic0064/Desktop/webtable.html");
		List<WebElement> rows=driver.findElements(By.xpath("//table/tbody//tr"));
		List<WebElement> cols=driver.findElements(By.xpath("//table/tbody//tr[2]//td"));
		for(int i=2;i<=rows.size();i++) {
			for(int j=1;j<=cols.size();j++) {
				String firstXpath="//table/tbody//tr[";
				String secondXpath="]//td[";
				String thirdXpath="]";
				String finalXpath=firstXpath+i+secondXpath+j+thirdXpath;
				String text=driver.findElement(By.xpath(finalXpath)).getText();
				System.out.print(text+" | ");
			}
			System.out.println();
		}	
	}
	public static void main(String arg[]) {
		setUp();
		//webTablePrint();
		//getBookAuthor();
		//getBookBelowOrEqual1500();
		//getLastRow();
		getTotalBookCost();
		//getCellValue();
	}
}
