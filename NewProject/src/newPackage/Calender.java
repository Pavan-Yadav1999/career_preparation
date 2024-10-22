package newPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companion/");
//		Thread.sleep(3000);
		
		driver.findElement(By.id("form-field-travel_comp_date")).click();
//		driver.findElement(By.xpath(".//*[@id='travel_comp_date']")).click();
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,500)");
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
		{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		 List<WebElement> dates=driver.findElements(By.className("flatpickr-day "));
		 
		 
		 
		 int count = driver.findElements(By.className("flatpickr-day ")).size();
		 
		 for (int i=0; i<count; i++)
		 {
			 String Text = driver.findElements(By.className("flatpickr-day ")).get(i).getText();
			 if(Text.equalsIgnoreCase("29"))
			 {
				 driver.findElements(By.className("flatpickr-day ")).get(i).click();
				 return;
			 }
		 }
	}

}
