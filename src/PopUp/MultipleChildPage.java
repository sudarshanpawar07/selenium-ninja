package PopUp;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleChildPage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		String parent = driver.getWindowHandle();

		WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
		Actions act = new Actions(driver);
		act.scrollToElement(facebook).perform();
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//a[@target = '_blank']"));

		for (WebElement web : links) {
			web.click();
			Thread.sleep(500);

		}
		Thread.sleep(2000);
		Set<String> childs = driver.getWindowHandles();
		System.out.println(childs);
		String ytUrl = "http://www.youtube.com/user/nopCommerce";
		for (String str : childs) {
			driver.switchTo().window(str);
			String actual_Url = driver.getCurrentUrl();
			if (actual_Url.equals(ytUrl)) {
				Thread.sleep(1000);
				driver.findElement(By.name("search_query")).sendKeys("MrBeast");
				Thread.sleep(3000);
			}

		}

		Thread.sleep(2000);
	}

}
