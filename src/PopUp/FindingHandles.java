package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindingHandles {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
		Actions act = new Actions(driver);
		act.scrollToElement(facebook).perform();
		Thread.sleep(2000);
		facebook.click();
		Thread.sleep(2000);
		Set<String> child1 = driver.getWindowHandles();
		System.out.println(child1);
		for (String str : child1) {
			driver.switchTo().window(str);

		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'_r_')]")).sendKeys("9075396378");
		Thread.sleep(2000);

		driver.quit();

	}

}
