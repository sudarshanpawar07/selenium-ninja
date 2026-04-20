package MouseAndKeyboard;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement men = driver.findElement(By.xpath("//a[text() = 'Men']"));

		act.moveToElement(men).perform();
		Thread.sleep(2000);

		WebElement trackpant = driver.findElement(By.xpath("//a[text()= 'Track Pants & Joggers']"));
		act.click(trackpant).perform();
		Thread.sleep(2000);
		driver.close();

	}

}
