package Basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class StartupScript {
	public static void main(String[] args) {
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// enter into DemoWebShop page
		driver.get("https://demowebshop.tricentis.com/");
		// close the browser
		driver.close();

	}

}
