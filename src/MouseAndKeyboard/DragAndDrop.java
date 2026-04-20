package MouseAndKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Static.html");
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.id("node"));
		WebElement target = driver.findElement(By.id("droparea"));
		act.dragAndDrop(source, target).perform();
		Thread.sleep(2000);
		// without using drag& drop method i performed same task
		act.clickAndHold(source).release(target).perform();

		Thread.sleep(2000);
		WebElement mongo = driver.findElement(By.id("mongo"));
		act.dragAndDrop(mongo, target).perform();
		Thread.sleep(2000);
		WebElement angular = driver.findElement(By.id("angular"));
		act.dragAndDrop(angular, target).perform();
		Thread.sleep(2000);

		driver.close();

	}

}
