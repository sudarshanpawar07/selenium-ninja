package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionScript {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[local-name()='path'][contains(@d,'M414 321.94')]")).click();

		//driver.findElement(By.xpath("//section[text()='Hidden division']"));
	}

}
