package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTextFromElement {
	public static void main(String[] args) throws InterruptedException {
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// enter into web page
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement register = driver.findElement(By.className("ico-register"));
		System.out.println(register.getText());
		Thread.sleep(2000);
		
		WebElement poll = driver.findElement(By.cssSelector("[class='block block-poll']>div>strong"));
		System.out.println(poll.getText());
		
		
		driver.close();

	}

}
