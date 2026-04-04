package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {
	public static void main(String[] args) throws InterruptedException {

		// open the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// enter into web page
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		// xpath by attribute using click on addtocart gift25
		WebElement gift = driver.findElement(By.xpath("//input[@value ='Add to cart']"));
		gift.click();
		Thread.sleep(2000);

		// xpath by text function using click on register
		driver.findElement(By.xpath("//a[text() = 'Register']")).click();

		// xpath by contains function using click on login
		driver.findElement(By.xpath("//a[contains(@class,'ico-login')]")).click();
		Thread.sleep(2000);

		// xpath by tagname
		driver.findElement(By.xpath("//input")).sendKeys("Laptop");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(2000);

		driver.close();

	}

}
