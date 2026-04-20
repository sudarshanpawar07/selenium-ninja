package MouseAndKeyboard;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CountOfDragDropElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Static.html");
		Thread.sleep(2000);
		Actions act = new Actions(driver);

		WebElement target = driver.findElement(By.id("droparea"));
		Random rand = new Random();
		int angular = 0, mongo = 0, node = 0;
		for (int i = 0; i < 9; i++) {
			List<WebElement> list = new ArrayList<>();

			list.add(driver.findElement(By.id("angular")));
			list.add(driver.findElement(By.id("mongo")));
			list.add(driver.findElement(By.id("node")));

			WebElement ele = list.get(rand.nextInt(list.size()));

			act.dragAndDrop(ele, target).perform();
			Thread.sleep(1000);

			if (ele.getAttribute("id").equals("angular")) {
				angular++;
			} else if (ele.getAttribute("id").equals("mongo")) {
				mongo++;
			} else {
				node++;
			}

		}
		System.out.println("Angular  : " + angular + ", : Mongo : " + mongo + ", Node : " + node);
		driver.close();
	}

}
