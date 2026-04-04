package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathPractice {
	public static void main(String[] args) throws InterruptedException {
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// enter into web page
		driver.navigate().to("https://demowebshop.tricentis.com/");
//		Thread.sleep(2000);
//		WebElement man = driver.findElement(By.xpath("//strong[text() = 'Manufacturers']"));
//		System.out.println(man.getText());
//
//		// Xpath by Group of Index
//		driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
//		Thread.sleep(2000);

		String digitalpage = driver.findElement(By.xpath("//a[contains(text() , 'Digital downloads')]")).getText();
		System.out.println(digitalpage);
		Thread.sleep(2000);
//		// xpath by text function
//		driver.findElement(By.xpath("//a[contains(text() , 'Digital downloads')]")).click();
//		Thread.sleep(2000);

//		// xpath by Group of index
//		driver.findElement(By.xpath("(//a[contains(text() , 'Digital downloads')])[1]")).click();
//		Thread.sleep(2000);

		// xpath by contains attribute
		driver.findElement(By.xpath("//input[contains(@class ,'search-box-text ')]")).sendKeys("Mobile");
		Thread.sleep(2000);

		driver.close();
	}

}
