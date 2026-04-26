package Practice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleScriptScreenshot {

    public static void main(String[] args) throws IOException {

        // 1. Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Open website
        driver.get("https://www.google.com");

        // 3. Perform some action 
        driver.findElement(By.name("q")).sendKeys("Selenium Screenshot");

        // 4. Take screenshot 
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);

        String fileName = "test_" + System.currentTimeMillis() + ".png";
        File dest = new File("./screenshots/" + fileName);

        Files.copy(src.toPath(), dest.toPath());

        System.out.println("Screenshot taken successfully");

        // 5. Close browser
        driver.quit();
    }
}