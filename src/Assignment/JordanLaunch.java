package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class JordanLaunch {
	public static void main(String[] args) {
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the screen
		driver.manage().window().maximize();
		// Enter into an webpage
		driver.get(
				"https://www.superkicks.in/collections/nike-air-jordan?srsltid=AfmBOornCrq3JvuJ1nE6Is68H3ArDSxb5O7AqIgwTM5UolCTOavlK8QD");
		// close the browser
		driver.close();

	}

}
