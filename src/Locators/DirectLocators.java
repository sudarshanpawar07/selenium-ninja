package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirectLocators {
	public static void main(String[] args) throws InterruptedException {

		// open the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// enter into web page
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		// find the element
		WebElement searchfield = driver.findElement(By.tagName("input"));
		// perform action on the webElement
		searchfield.sendKeys("Laptop");
		Thread.sleep(2000);

		// close the browser
		driver.close();

	}

}
