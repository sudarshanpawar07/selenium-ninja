package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraSearch {
	public static void main(String[] args) throws InterruptedException {
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		// enter into a myntra
		driver.get("https://www.myntra.com/");

		// find the element
		WebElement input = driver.findElement(By.className("desktop-searchBar"));
		input.sendKeys("Comet sneakers");
		Thread.sleep(2000);

		// click on the search bar
		WebElement search = driver.findElement(By.className("desktop-submit"));
		search.click();
		Thread.sleep(2000);

		driver.close();

	}

}
