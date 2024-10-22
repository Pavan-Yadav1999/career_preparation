package newPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\DELL\\Desktop\\Testing\\Setup\\chromedriver-win64\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?tag=msndeskabkin-21&ref=pd_sl_7qhce485bd_e&adgrpid=1322714095756137&hvadid="
				+ "82669897710514&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=116073&hvtargid=kwd-82670512756912:loc-90&hydadcr=14453_2334184");
		Actions a = new Actions(driver);
		
		WebElement move = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().
		keyDown(Keys.SHIFT).doubleClick().sendKeys("hello").build().perform();
		a.moveToElement(move).contextClick().build().perform();
	}

}
