package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) throws InterruptedException {
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// enter into web page
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

//		driver.findElement(By.id("small-searchterms")).sendKeys("lipstick");
//
//		driver.findElement(By.cssSelector("input[value='Search']")).click();
//		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("lipstick");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector(".button-1.search-box-button")).click();
		Thread.sleep(3000);

		driver.close();

	}

}
