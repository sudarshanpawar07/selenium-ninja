package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByTitle {
	public static void main(String[] args) throws Exception {
		String expected_title = "Demo Web Shop";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		String actual_title = driver.getTitle();
		if (actual_title.equals(expected_title)) {
			System.out.println("Title of webpage is correct");
		} else {
			driver.close();
			throw new Exception("Title of WebPage is not correct");
		}

		driver.close();

	}

}
