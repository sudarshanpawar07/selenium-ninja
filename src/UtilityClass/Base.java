package UtilityClass;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static ChromeDriver driver = null;

	public static void preCondition() {
		driver = new ChromeDriver();
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
