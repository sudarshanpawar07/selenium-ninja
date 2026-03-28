package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NykaaSearch {
	public static void main(String[] args) throws InterruptedException {
		// open the browser
		ChromeDriver driver = new ChromeDriver();

		// maximize the browser
		driver.manage().window().maximize();

		// enter into a WebPage
		driver.get("https://www.nykaafashion.com/");

		// find the element
		WebElement search = driver.findElement(By.className("input"));

		// send the input to the filed
		search.sendKeys("Suits for Men");
		Thread.sleep(2000);

		driver.close();
	}

}
