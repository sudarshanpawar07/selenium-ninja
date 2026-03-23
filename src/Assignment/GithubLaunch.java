package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class GithubLaunch {
	public static void main(String[] args) {
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// enter into a WebPage
		driver.get("https://github.com/sudarshanpawar07");

	}

}
