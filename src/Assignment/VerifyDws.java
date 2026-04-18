package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyDws {
	public static void main(String[] args) throws Exception {
		String Expepted_Url="https://demowebshop.tricentis.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		String Actual_Url=driver.getCurrentUrl();
		if(Expepted_Url.equals(Actual_Url)) {
			System.out.println("I am in dws Homepage and test case is pass");
		}
		else {
			driver.close();
			throw new Exception("I am not in DWS page and Test Case is Fail");
		}
		Thread.sleep(2000);
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(4000);
		String Actual_Title=driver.getTitle();
		if(Actual_Title.contains("Demo Web Shop")) {
		    System.out.println("I am in Login page and test case is PASS");
		}
		else {
			driver.close();
			throw new Exception("I am not in login page and test case is fail");
		}
		Thread.sleep(5000);
		driver.close();
	}

}