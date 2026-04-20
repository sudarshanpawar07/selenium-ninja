package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		Thread.sleep(2000);
		List<WebElement> album = driver.findElements(By.xpath("//a[text()='3rd Album']"));
		if (album.size() > 0) {
			System.out.println("I am in digital dowmload page");
			WebElement sortBy = driver.findElement(By.id("products-orderby"));
			Select sel = new Select(sortBy);
			List<WebElement> options = sel.getOptions();
			int i = 0;
			for (WebElement web : options) {
				sortBy = driver.findElement(By.id("products-orderby"));
				sel = new Select(sortBy);
				List<WebElement> selected = sel.getAllSelectedOptions();
				System.out.println("Currently selected: " + selected);
				sel.selectByIndex(i++);
				Thread.sleep(2000);
			}
		} else {
			driver.close();
			throw new Exception("I am not in digital download page and Testcase is fail");
		}
		driver.close();
	}

}