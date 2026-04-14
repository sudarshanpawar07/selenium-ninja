package WebDriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsExample {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		// first way to find multiple element using common attribute
//		List<WebElement> poll = driver.findElements(By.name("pollanswers-1"));
//		for (WebElement ele : poll) {
//			ele.click();
//			Thread.sleep(2000);
//
//		}

		// second way to find multiple elements using traversing from common parent to
		// targeted element
		List<WebElement> poll1 = driver.findElements(By.xpath("//ul[@class='poll-options']/li/input"));
		for (WebElement web : poll1) {
			web.click();
			Thread.sleep(2000);
		}

		driver.close();
	}
}
