package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByWebelementUsingFindElements {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		List<WebElement> data = driver.findElements(By.xpath("//input[@name='pollanswers-']"));
		// System.out.println(data);
		if (data.size() != 0) {
			System.out.println("I am in a dws Page");
		} else {
			driver.close();
			throw new Exception("I am not in a dws Page");
		}
		driver.close();
	}

}
