package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class BankOfAmericaLaunch {
	public static void main(String[] args) {
		// open the Browser
		ChromeDriver driver = new ChromeDriver();
		
		// maximize the browser
		driver.manage().window().maximize();
		// enter into an webpage
		driver.get("https://www.bankofamerica.com/");
		
		// close the browser
		driver.close();
	}

}
