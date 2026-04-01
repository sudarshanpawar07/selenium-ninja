package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchProductUsingXpath {
	public static void main(String[] args) throws InterruptedException {
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// enter into web page
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("sudarshanpawar05@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Sudarshan@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"RememberMe\"]")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).sendKeys("LapTop");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
