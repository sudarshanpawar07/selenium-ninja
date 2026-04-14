package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderClicksUsingFindElements {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
//"//div[@class = 'header-links']/ul/li/a"
		List<WebElement> headerClick = driver.findElements(By.xpath("//div[@class = 'header-links']/ul/li/a"));

//		System.out.println(headerClick);
		for (WebElement webEle : headerClick) {
			webEle.click();
			Thread.sleep(2000);
			driver.navigate().back();
			Thread.sleep(1000);

		}

		driver.close();

	}

}
