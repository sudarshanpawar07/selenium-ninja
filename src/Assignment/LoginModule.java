package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginModule {
	public static void main(String[] args) throws InterruptedException {

		// open the browser
		ChromeDriver driver = new ChromeDriver();

		// maximize the browser
		driver.manage().window().maximize();

		// enter into a webpage
		driver.get("https://demowebshop.tricentis.com/");

		// click on the login
		driver.findElement(By.className("ico-login")).click();

		// enter into the email text web element
		driver.findElement(By.className("email")).sendKeys("sudarshanpawar05@gmail.com");
		Thread.sleep(2000);

		// enter into the password text webElement
		driver.findElement(By.name("Password")).sendKeys("Sudarshan@1234");
		Thread.sleep(2000);

		// click on the remember me checkbox web element
		driver.findElement(By.id("RememberMe")).click();
		Thread.sleep(2000);

		// click on the login button
		driver.findElement(By.className("login-button")).click();

		Thread.sleep(3000);

		driver.close();

	}

}
