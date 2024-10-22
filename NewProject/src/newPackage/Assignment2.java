package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Testing\\Setup\\chromedriver-win64\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
  		driver.get("https://rahulshettyacademy.com/angularpractice/");
  		
  		driver.findElement(By.name("name")).sendKeys("pavan");
  		driver.findElement(By.name("email")).sendKeys("pavan@gmail.com");
  		driver.findElement(By.id("exampleInputPassword1")).sendKeys("1234");
  		driver.findElement(By.id("exampleCheck1")).click();
  		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
  		Select abc = new Select(dropdown);
  		abc.selectByVisibleText("Female");
  		driver.findElement(By.id("inlineRadio1")).click();
  		driver.findElement(By.name("bday")).sendKeys("04/02/1999");
  		driver.findElement(By.cssSelector(".btn.btn-success")).click();
  		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
	}

}
