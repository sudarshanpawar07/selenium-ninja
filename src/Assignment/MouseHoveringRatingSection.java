package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoveringRatingSection {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		driver.findElement(By.xpath("//p[text()= 'UI Testing Concepts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Mouse Hover']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Ratings']")).click();
		Thread.sleep(2000);
		WebElement star5 = driver.findElement(By.xpath("//input[@value='5']/following-sibling::*[local-name()='svg']"));

		act.moveToElement(star5).perform();
		driver.findElement(By.xpath("//textarea[@placeholder='Description']")).sendKeys("Nice Product");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text() = 'Submit']")).click();
		driver.close();
	}

}
