package newPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Testing\\Setup\\chromedriver-win64\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
  		driver.manage().window().maximize();
  		driver.get("https://www.google.com");
  		driver.navigate().to("https://www.rahulshettyacademy.com/AutomationPractice/");
  		driver.navigate().back();
  		driver.navigate().forward();

	}

}
