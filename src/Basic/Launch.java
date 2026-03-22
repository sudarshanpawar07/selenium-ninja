package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.grid.Main;

public class Launch {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
	

		try {
			driver.get("https://www.myntra.com/");
			Thread.sleep(2000);
			driver.manage().window().fullscreen();
			System.out.println("First Window Title : " + driver.getTitle());
			Thread.sleep(5000);
		}
		finally {
			driver.quit();
		}

	}
}
