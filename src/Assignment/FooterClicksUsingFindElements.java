package Assignment;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterClicksUsingFindElements {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		// find all elements
		List<WebElement> follow = driver.findElements(
				By.xpath("//div[@class='column follow-us']/ul/li/a"));

		// store URL
		List<String> urls = new ArrayList<>();

		for (WebElement e : follow) {
			urls.add(e.getAttribute("href"));
		}

		// navigate using get()
		for (String url : urls) {

			driver.get(url);   
			Thread.sleep(2000);

			driver.navigate().back();
			Thread.sleep(2000);
		}

		driver.quit();
	}
}