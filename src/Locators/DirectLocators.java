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
		// WebElement searchfield = driver.findElement(By.tagName("input"));
		// perform action on the webElement
//		searchfield.sendKeys("Laptop");
//		Thread.sleep(2000);

//		WebElement searchfieldById = driver.findElement(By.id("small-searchterms"));
//		searchfieldById.sendKeys("Laptop");

//		Thread.sleep(2000);
//		WebElement register = driver.findElement(By.className("ico-register"));
//		register.click();
//		WebElement searchbtn = driver.findElement(By.className("button-1"));
//		searchbtn.click();
//		Thread.sleep(2000);

//		driver.findElement(By.name("q")).sendKeys("chocolate");
//		Thread.sleep(2000);
		// id Locator
//		driver.findElement(By.id("small-searchterms")).sendKeys("unique");
//		Thread.sleep(2000);
//		linkText Locator
//		driver.findElement(By.linkText("Register")).click();
//		Thread.sleep(2000);
//		paritallyLinkText
		driver.findElement(By.partialLinkText("Shopping ")).click();
		Thread.sleep(2000);
		// close the browser
		driver.close();

	}

}
