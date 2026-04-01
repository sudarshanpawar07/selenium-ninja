package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
	public static void main(String[] args) throws InterruptedException {
		// open the browser
				ChromeDriver driver = new ChromeDriver();
				// maximize the browser
				driver.manage().window().maximize();
				// enter into web page
				driver.navigate().to("https://demowebshop.tricentis.com/");
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div[1]/ul/li[1]/a")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("")).click();
	}

}
