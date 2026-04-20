package MouseAndKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		// act.contextClick(rightClick).perform();
		Thread.sleep(2000);
		WebElement copy = driver.findElement(By.xpath("//span[text() = 'Copy']"));
		// act.click(copy).perform();
		Thread.sleep(2000);
		act.contextClick(rightClick).click(copy).perform();
	}

}
