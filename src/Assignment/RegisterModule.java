package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterModule {
	public static void main(String[] args) throws InterruptedException {

		// open the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// Enter into webpage
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		// Enter click on register
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(2000);
		// select the gender radio webelement
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(2000);
		// enter into firstName textfield webelement
		driver.findElement(By.id("FirstName")).sendKeys("Sudarshan");
		Thread.sleep(2000);
		// enter into LastName textfield webelement
		driver.findElement(By.id("LastName")).sendKeys("Pawar");
		Thread.sleep(2000);
		// enter into Email textfield webelement
		driver.findElement(By.id("Email")).sendKeys("sudarshanpawar04@gmail.com");
		Thread.sleep(2000);
		// enter into Password textfield webelement
		driver.findElement(By.id("Password")).sendKeys("Sudarshan@1234");
		Thread.sleep(2000);
		// enter into ConfirmPassword textfield webelement
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Sudarshan@1234");
		Thread.sleep(2000);
		// click on the Register Button webelement
		driver.findElement(By.name("register-button")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
