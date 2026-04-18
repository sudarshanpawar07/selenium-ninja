package SelectDropDown;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAll {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("file:///C:/Users/Lenovo/Downloads/demo%20(2).html");
        Thread.sleep(2000);
        List<WebElement> options = driver.findElements( By.xpath("//select[@id='multiple_cars']/option"));
               
        for (WebElement option : options) {
            option.click();
            Thread.sleep(1000);
        }

        Thread.sleep(2000);
        driver.close();
    }
}
