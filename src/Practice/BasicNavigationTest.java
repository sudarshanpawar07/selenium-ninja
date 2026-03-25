package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigationTest {
	public static void main(String[] args) throws InterruptedException {
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		// enter into a WebPage
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		// enter into another webpage
		driver.navigate().to("https://www.fireflink.com/");
		Thread.sleep(2000);
		// backward the page
		driver.navigate().back();
		Thread.sleep(2000);
		// forward the page
		driver.navigate().forward();
		Thread.sleep(2000);
		// refresh the page
		driver.navigate().refresh();
		Thread.sleep(2000);
		// close the browser
		driver.close();

	}

}
