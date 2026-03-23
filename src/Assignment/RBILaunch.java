package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class RBILaunch {
	public static void main(String[] args) {
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// enter into webpage
		driver.get("https://www.rbi.org.in/");
		// close the browser
		driver.close();
	}

}
