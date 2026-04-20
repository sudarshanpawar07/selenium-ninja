package MouseAndKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseScrolling {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		Actions act = new Actions(driver);

//		WebElement google = driver.findElement(By.xpath("//a[text() = 'Google+']"));
//		act.scrollToElement(google).perform();

//		scrolling based on tareted element
//		WebElement facebook = driver.findElement(By.xpath("//a[text() = 'Facebook']"));
//
//		act.scrollToElement(facebook).perform();
//		facebook.click();

//		scrolling based on x and Y Axis
		act.scrollByAmount(0, 500).perform();
		Thread.sleep(2000);
		WebElement facebook = driver.findElement(By.xpath("//a[text() = 'Facebook']"));
		facebook.click();

	}

}
