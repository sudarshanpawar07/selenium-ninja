package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GiftCardUsingLocators {
	public static void main(String[] args) throws InterruptedException {
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
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Add to cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("Tejas Dhole");
		Thread.sleep(2000);
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("tejasdhole05@gmail.com");
		driver.findElement(By.id("giftcard_2_Message")).sendKeys("Happy Birthaday");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("addtocart_2_EnteredQuantity"));
		ele.clear();
		driver.findElement(By.id("addtocart_2_EnteredQuantity")).sendKeys("2");
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#add-to-cart-button-2")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Shopping cart")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("removefromcart")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("updatecart")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("ico-logout")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
