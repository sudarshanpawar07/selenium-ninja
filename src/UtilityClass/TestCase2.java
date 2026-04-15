package UtilityClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestCase2 extends Base {
	public static void main(String[] args) throws InterruptedException {
		preCondition();
		Thread.sleep(2000);
		login();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		Thread.sleep(2000);
		WebElement album3 = driver
				.findElement(By.xpath("//a[text() = '3rd Album']/../following-sibling::div[3]/div/span"));

		System.out.println(album3.getText());
		Thread.sleep(2000);
		WebElement music2 = driver.findElement(By.xpath("//a[text() = 'Music 2']/../../div[3]/div/span"));

		System.out.println(music2.getText());
		Thread.sleep(2000);
		WebElement music3 = driver.findElement(By.xpath("(//a[text() = 'Music 2']/../../div[3]/div/span)[2]"));

		System.out.println(music3.getText());
		Thread.sleep(2000);

		logOut();
		Thread.sleep(2000);
		postCondition();
		Thread.sleep(2000);
	}

}
