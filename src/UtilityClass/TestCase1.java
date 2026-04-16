package UtilityClass;

import org.openqa.selenium.By;

public class TestCase1 extends Base {
	public static void main(String[] args) throws InterruptedException {

		preCondition();
		Thread.sleep(2000);
		login();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Mouse");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		logOut();
		Thread.sleep(2000);
		postCondition();
		Thread.sleep(2000);

	}

}
