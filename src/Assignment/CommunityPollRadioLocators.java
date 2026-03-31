package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommunityPollRadioLocators {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		// maximize the browser
		driver.manage().window().maximize();

		// enter into a webpage
		driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.id("pollanswers-1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pollanswers-2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pollanswers-3")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("pollanswers-4")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
