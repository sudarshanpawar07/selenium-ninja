package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectReadText {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Downloads/demo%20(2).html");
		Thread.sleep(2000);
		WebElement select = driver.findElement(By.id("standard_cars"));
		Select sel = new Select(select);
		List<WebElement> options = sel.getOptions();
		for(WebElement web : options) {
			System.out.println(web.getText());
		}
		Thread.sleep(5000);
		
	}

}