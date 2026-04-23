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
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//section[@class='poppins text-[15px]'])[8]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[@class='poppins text-[14px]']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Drag Multiple']")).click();
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		
		WebElement Mcharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement Mcover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement Mtarget = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		act.click(Mcharger).click(Mcover).dragAndDrop(Mcharger, Mtarget).perform();
		Thread.sleep(2000);
		
		WebElement Lcharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement Lcover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		WebElement Ltarget = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		act.click(Lcharger).click(Lcover).dragAndDrop(Lcharger, Ltarget).perform();
		Thread.sleep(4000);
		
		driver.quit();
	}

}
