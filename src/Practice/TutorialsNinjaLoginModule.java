package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinjaLoginModule {
	public static void main(String[] args) throws InterruptedException {

		// open the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		// enter into webpage
		driver.get("https://tutorialsninja.com/demo/");
		// click on my account
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(2000);

		// click on the login
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(2000);
		// enter data into email textfield webelement
		driver.findElement(By.name("email")).sendKeys("sudarshanpawar7171@gmail.com");
		Thread.sleep(2000);
		// enter data into password textfield webelement
		driver.findElement(By.id("input-password")).sendKeys("Sudarshan@123");
		Thread.sleep(2000);

		// click on the login button
		// driver.findElement(By.cssSelector("input[value='Login']")).click();
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);

		driver.close();

	}

}
