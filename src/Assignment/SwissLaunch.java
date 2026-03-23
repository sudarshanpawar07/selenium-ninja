package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class SwissLaunch {
	public static void main(String[] args) {
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// enter into an webpage
		driver.get("https://www.snb.ch/en/");
		// close the browser
		driver.close();
	}

}
