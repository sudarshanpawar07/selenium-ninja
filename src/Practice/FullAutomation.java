package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import UtilityClass.Base;

public class FullAutomation extends Base {
	public static void main(String[] args) throws InterruptedException {

		preCondition();
		Thread.sleep(2000);
		login();
		driver.findElement(By.linkText("Books")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		logOut();
		Thread.sleep(2000);
		postCondition();

	}

}
