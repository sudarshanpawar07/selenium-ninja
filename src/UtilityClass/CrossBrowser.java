package UtilityClass;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowser {
	public static void main(String[] args) {
		String browser = "firefox";
		
		if (browser.equals("chrome")) {
			ChromeDriver driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			FirefoxDriver driver = new FirefoxDriver();
		} else if (browser.equals("safari")) {
			SafariDriver driver = new SafariDriver();
		} else if (browser.equals("edge")) {
			EdgeDriver driver = new EdgeDriver();
		} else {
			ChromeDriver driver = new ChromeDriver();
		}
	}

}
