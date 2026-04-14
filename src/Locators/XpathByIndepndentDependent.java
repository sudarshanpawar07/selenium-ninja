package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndepndentDependent {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		Thread.sleep(2000);

		WebElement album3 = driver
				.findElement(By.xpath("//a[text() = '3rd Album']/../following-sibling::div[3]/div/span"));

		System.out.println(album3.getText());
		Thread.sleep(2000);
		WebElement music2 = driver
				.findElement(By.xpath("//a[text() = 'Music 2']/../../div[3]/div/span"));

		System.out.println(music2.getText());
		Thread.sleep(2000);
		WebElement music3 = driver
				.findElement(By.xpath("(//a[text() = 'Music 2']/../../div[3]/div/span)[2]"));

		System.out.println(music3.getText());
		Thread.sleep(2000);
		driver.close();
	}

}
