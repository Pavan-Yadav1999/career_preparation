package newPackage;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		int j=0;
		String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot","Carrot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		List<WebElement>products=driver.findElements(By.cssSelector("h4.product-name"));
		List itemsNeededList=Arrays.asList(itemsNeeded);
		for(int i=0; i<=products.size(); i++)
		{
			String[] name=products.get(i).getText().split("-");
			String formattedName=name[0].trim();
			if(itemsNeededList.contains(formattedName))
			
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsNeeded.length)
				{
					break;
				}
			}
			
			
			
			
		}
		
		

	}

}
