package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class ZeptoLaunch {
	public static void main(String[] args) {
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// enter into webpage
		driver.get("https://www.zepto.com/?srsltid=AfmBOoofdx6zTNZdVCk7YNVpKhyj3tRWbR5t2QVgLYNvQzL-L4lGJ3Hd");
		// close the browser
		driver.close();

	}

}
