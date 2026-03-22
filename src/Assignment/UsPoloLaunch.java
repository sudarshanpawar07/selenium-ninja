package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsPoloLaunch {
	public static void main(String[] args) {
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// enter into the webPage
		driver.get(
				"https://uspoloassn.in/collections/men-footwear?srsltid=AfmBOopjKh_xkinr1HyVNifQi73WPzPM35w3XjO2yibBxjIGZ4LBNahS");
		// close the browser
		driver.close();
	}
}
