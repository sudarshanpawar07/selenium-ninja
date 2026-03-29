package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinjaRegisterModule {
	public static void main(String[] args) throws InterruptedException {

		// open the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		// enter into webpage
		driver.get("https://tutorialsninja.com/demo/");
		// click on my account
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(2000);

		// click on the register
		driver.findElement(By.linkText("Register")).click();

		driver.findElement(By.id("input-firstname")).sendKeys("shivpratap");

		driver.findElement(By.id("input-lastname")).sendKeys("Kashid");

		driver.findElement(By.id("input-email")).sendKeys("shivpratapkashid01@gmail.com");

		driver.findElement(By.id("input-telephone")).sendKeys("8765238956");

		driver.findElement(By.id("input-password")).sendKeys("Shivpratap@123");

		driver.findElement(By.id("input-confirm")).sendKeys("Shivpratap@123");

		driver.findElement(By.name("agree")).click();

		driver.findElement(By.cssSelector("input[value = 'Continue']")).click();
		Thread.sleep(2000);

		driver.close();

	}

}
