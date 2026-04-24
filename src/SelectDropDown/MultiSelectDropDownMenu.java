package SelectDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDownMenu {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Lenovo/Downloads/demo%20(2).html");
		Thread.sleep(2000);
		WebElement multiSelect = driver.findElement(By.id("multiple_cars"));
		Select sel = new Select(multiSelect);
		sel.selectByVisibleText("Audi");
		Thread.sleep(2000);
		sel.selectByValue("bmw");
		Thread.sleep(2000);
		sel.selectByIndex(3);
		Thread.sleep(5000);
		if (sel.isMultiple()) {
			sel.deselectAll();
			throw new Exception("sdfghj");
		}
		driver.close();

	}

}