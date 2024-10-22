package newPackage;

import java.util.Iterator;
import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinktextCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerDriver.findElements(By.tagName("a")).size()); // to find footer driver linktext size
		
		WebElement columndriver= footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size()); //checking column linktext size
		
		for (int i=1; i<columndriver.findElements(By.tagName("a")).size(); i++)
		{
			String clickonLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab); //click the links on separate tab
			Thread.sleep(3000);
		}
		
		Set<String> window = driver.getWindowHandles();
		Iterator<String>it = window.iterator();
		
		while(it.hasNext())
		{
		 driver.switchTo().window(it.next());
		 System.out.println(driver.getTitle());
		}
		
		
		
		
		
		

	}

}
