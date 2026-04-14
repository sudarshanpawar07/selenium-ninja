package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTagName {
	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);

		WebElement newS = driver.findElement(By.xpath("(//strong)[4]"));

		System.out.println(newS.getText());
		Thread.sleep(2000);
		driver.close();
	}

}
