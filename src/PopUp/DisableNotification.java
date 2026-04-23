package PopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableNotification {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(4000);
		driver.quit();

	}

}
