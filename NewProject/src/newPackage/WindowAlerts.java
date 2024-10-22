package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Testing\\Setup\\chromedriver-win64\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
  		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
  		
  		driver.findElement(By.id("name")).sendKeys("Pavan");
  		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
  		System.out.println(driver.switchTo().alert().getText());
  		Thread.sleep(2000);
  		driver.switchTo().alert().accept();
  		
  		driver.findElement(By.id("confirmbtn")).click();
  		System.out.println(driver.switchTo().alert().getText());
  		driver.switchTo().alert().dismiss();
  		

	}

}
