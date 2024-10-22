package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

public class EndToEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Testing\\Setup\\chromedriver-win64\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
  		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
  		
  		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
  		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
  		driver.findElement(By.xpath("//a[@value='DEL']")).click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

  		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();//  		Thread.sleep(3000);
  		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
  		driver.findElement(By.id("divpaxinfo")).click();
  		Thread.sleep(2000);
  		for(int i=1; i<5; i++) {
  		driver.findElement(By.id("hrefIncAdt")).click();

  		}
  		driver.findElement(By.id("btnclosepaxoption")).click();
//  		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).click(), "5 Adult");
  		
  		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
