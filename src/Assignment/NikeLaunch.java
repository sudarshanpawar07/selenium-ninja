package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class NikeLaunch {
	public static void main(String[] args) {
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// enter into the webpage
		driver.get("https://www.nike.in/");
		// close the browser
		driver.close();

	}

}
