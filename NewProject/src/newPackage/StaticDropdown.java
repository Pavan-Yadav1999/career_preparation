  package newPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Testing\\Setup\\chromedriver-win64\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
  		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
  		
  		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
  		Select dropdown = new Select(staticDropdown);
  		
  		//get all dropdown options text
  		List<WebElement> options = dropdown.getOptions();
  		
  		for(WebElement option : options)
  		{
  			System.out.println(option.getText());
  			
  		}
  		dropdown.selectByIndex(3);
  		System.out.println(dropdown.getFirstSelectedOption().getText());
  		
  		dropdown.selectByVisibleText("AED");
  		System.out.println(dropdown.getFirstSelectedOption().getText());
  		
  		dropdown.selectByValue("INR"); //attribute value
  		System.out.println(dropdown.getFirstSelectedOption().getText());
  		
  		
  		

	}

}
