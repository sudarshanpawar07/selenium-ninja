package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragMultipleSection {
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
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()= 'Drag Multiple']")).click();
		Thread.sleep(2000);
		
		WebElement mobileCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement mobileCover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement mobileTarget = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		
		act.click(mobileCover).click(mobileCharger).perform();
		Thread.sleep(1000);
	
	}

}
