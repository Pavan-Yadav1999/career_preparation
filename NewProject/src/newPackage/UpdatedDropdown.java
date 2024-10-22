package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Testing\\Setup\\chromedriver-win64\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
  		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
  		driver.findElement(By.id("divpaxinfo")).click();
  		Thread.sleep(2000);
  		
  		int i=1;
  		while(i<5)
  		{
  			driver.findElement(By.id("hrefIncAdt")).click();
  			i++;
  		}
  		driver.findElement(By.id("btnclosepaxoption")).click();
  				
  		
       //Radio buttons--------------------------------
  		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

  		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

  		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

  		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

  		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

  		{

  		System.out.println("its enabled");

  		Assert.assertTrue(true);

  		}

  		else

  		{

  		Assert.assertTrue(false);

  		}

  	

	}

}
