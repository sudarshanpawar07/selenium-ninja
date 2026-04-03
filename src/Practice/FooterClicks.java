package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterClicks {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);

		driver.navigate().to("https://www.facebook.com/nopCommerce");
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);

		driver.navigate().to("https://x.com/nopCommerce");
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);

		driver.navigate().to("https://www.youtube.com/user/nopCommerce");
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);

		driver.navigate().to("https://workspaceupdates.googleblog.com/");
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);

		driver.close();

	}

}
