package SelectDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropdownMenu {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Downloads/demo%20(2).html");
		Thread.sleep(2000);
		WebElement singleSelect = driver.findElement(By.id("standard_cars"));
		Select sel = new Select(singleSelect);
		sel.selectByVisibleText("Toyota");
		if (sel.isMultiple()) {
			sel.deselectByVisibleText("Toyota");
			System.out.println("Deselect is performed..");
		} else {
			System.out.println("Deselect is not performed...");
			System.out.println("Because dropdown Menu is a sigleSelect");
		}
		Thread.sleep(5000);
		driver.close();
	}

}