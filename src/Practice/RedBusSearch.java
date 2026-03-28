package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusSearch {
	public static void main(String[] args) throws InterruptedException {
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		// enter into a RedBus
		driver.get("https://www.redbus.in/");

		// find the element
		WebElement from = driver.findElement(By.id("srcinput"));
		from.sendKeys("Swarget");
		Thread.sleep(2000);
//		WebElement to = driver.findElement(By.id("destinput"));
//		to.sendKeys("Mumbai");
//		Thread.sleep(2000);

	}

}
