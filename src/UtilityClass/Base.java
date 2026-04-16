package UtilityClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Base {
	public static WebDriver driver = null;

	public static void preCondition() {
		String browser = "firefox";

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} 
		else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else {
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
	}

	public static void login() {

		// click on the login
		driver.findElement(By.className("ico-login")).click();

		// enter into the email text web element
		driver.findElement(By.className("email")).sendKeys("sudarshanpawar05@gmail.com");

		// enter into the password text webElement
		driver.findElement(By.name("Password")).sendKeys("Sudarshan@1234");

		// click on the remember me checkbox web element
		driver.findElement(By.id("RememberMe")).click();

		// click on the login button
		driver.findElement(By.className("login-button")).click();
	}

	public static void logOut() {
		driver.findElement(By.className("ico-logout")).click();

	}

	public static void postCondition() {
		driver.close();
	}

}
