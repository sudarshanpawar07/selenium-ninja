package PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyByRobotClass {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("small-searchterms")).click();
		Robot bot = new Robot();
		bot.keyPress(KeyEvent.VK_S);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_P);
		Thread.sleep(1000);
		bot.keyRelease(KeyEvent.VK_S);
		bot.keyRelease(KeyEvent.VK_P);
		driver.quit();
	}

}
