package newPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablesAssignment {

	public static void main(String[] args) {
		// To get the column data and row data
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		WebElement table=driver.findElement(By.id("product"));
	System.out.println(table.findElements(By.tagName("tr")).size());
	System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
	
	List<WebElement> columnData=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
	System.out.println(columnData.get(0).getText());
	System.out.println(columnData.get(1).getText());

	}

}
