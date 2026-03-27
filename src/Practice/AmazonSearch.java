package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;        // ADD THIS
import org.openqa.selenium.support.ui.ExpectedConditions;   // ADD THIS
import java.time.Duration;                                   // ADD THIS

public class AmazonSearch {

	public static void main(String[] args) throws InterruptedException {

		// Open Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Open Amazon
		driver.get("https://www.amazon.in");

		// ADD THIS - Wait for page to load
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// CHANGE THIS - Wait until Search Box is visible
		WebElement searchBox = wait.until(
			ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox"))
		);

		// Type Product Name
		searchBox.sendKeys("Nothing Phone 4a");

		Thread.sleep(3000);

		// Close Browser
		driver.quit();

	}
}