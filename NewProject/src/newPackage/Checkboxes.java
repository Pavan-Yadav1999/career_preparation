package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Testing\\Setup\\chromedriver-win64\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
  		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
  		
  		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
 		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
  		
  		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
  		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
  		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
  		
  		
//  		System.out.println(driver.findElement(By.cssSelector("input[type=checkbox]")).size());
  		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}
