package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VrifyByUrl {
	public static void main(String[] args) throws InterruptedException {
		String expected_url = "https://demowebshop.tricentis.com";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(expected_url);
		Thread.sleep(2000);
		String actual_result = driver.getCurrentUrl();
		if (actual_result.equals(expected_url)) {
			System.out.println("I am in dws Homepage");
		} else {
			System.out.println("I am not in dws Homapage");
		}

		driver.close();

	}

}
