package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyLaunch {
	public static void main(String[] args) {
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// enter into a webPage
		driver.get("https://www.swiggy.com/");
		// close the browser
		driver.close();

	}

}
