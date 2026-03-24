package WebDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) throws InterruptedException {
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// enter into Webpage
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		// enter into another webpage
		driver.navigate().to("https://www.wearcomet.com/");
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
