package PopUp;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleChildWindow {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");

        // Parent window
        String parent = driver.getWindowHandle();

        // Click to open child window
        driver.findElement(By.id("browserButton")).click();

        // Get all windows
        Set<String> windows = driver.getWindowHandles();

        for (String win : windows) {
            if (!win.equals(parent)) {
                driver.switchTo().window(win);
                System.out.println("Child Title: " + driver.getTitle());
            }
        }

        // Close child and return
        driver.close();
        driver.switchTo().window(parent);

        System.out.println("Parent Title: " + driver.getTitle());

        driver.quit();
    }
}