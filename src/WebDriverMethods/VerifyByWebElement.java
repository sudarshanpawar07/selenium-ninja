package WebDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByWebElement {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//strong[text() = 'Community poll']"));
			System.out.println("I am in dws Page");
		} catch (Exception e) {
			driver.close();
			throw new Exception("Testcase fail I am not in a dws Page");

		}
		driver.close();
	}

}
