package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class RedTapeLaunch {
	public static void main(String[] args) {
		// open the browser
		ChromeDriver driver = new ChromeDriver();

		// maximize the browser
		driver.manage().window().maximize();

		// enter into a WebPage
		driver.get(
				"https://redtape.com/collections/footwear-men?srsltid=AfmBOoq1K2h58Ylvhd4qUrVqVCaV79Wh4VMEOp9yN5eIiiZFsMCMLPjs");

		// close the browser

		driver.close();
	}

}
