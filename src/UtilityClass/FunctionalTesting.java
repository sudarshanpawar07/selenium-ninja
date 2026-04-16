package UtilityClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalTesting extends Base {

	public static void testCase1() throws InterruptedException {
		System.out.println("TestCase 1");
		preCondition();
		Thread.sleep(2000);
		login();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Mouse");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		logOut();
		Thread.sleep(2000);
		postCondition();
		Thread.sleep(2000);
	}

	public static void testCase2() throws InterruptedException {
		System.out.println("TestCase 2");

		preCondition();
		Thread.sleep(2000);
		login();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		Thread.sleep(2000);
		WebElement album3 = driver
				.findElement(By.xpath("//a[text() = '3rd Album']/../following-sibling::div[3]/div/span"));

		System.out.println(album3.getText());
		Thread.sleep(2000);
		WebElement music2 = driver.findElement(By.xpath("//a[text() = 'Music 2']/../../div[3]/div/span"));

		System.out.println(music2.getText());
		Thread.sleep(2000);
		WebElement music3 = driver.findElement(By.xpath("(//a[text() = 'Music 2']/../../div[3]/div/span)[2]"));

		System.out.println(music3.getText());
		Thread.sleep(2000);

		logOut();
		Thread.sleep(2000);
		postCondition();
		Thread.sleep(2000);
	}

	public static void testCase3() throws InterruptedException {
		System.out.println("TestCase 3");
		preCondition();
		Thread.sleep(2000);
		login();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		Thread.sleep(2000);

		List<WebElement> addToCart = driver.findElements(By.xpath("//input[@value = 'Add to cart']"));
		for (WebElement webElement : addToCart) {
			webElement.click();
			Thread.sleep(2000);
		}
		driver.findElement(By.xpath("//span[@class='cart-label']")).click();
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='product-unit-price']"));
		List<WebElement> removeProduct = driver.findElements(By.xpath("//input[@name='removefromcart']"));

		double maxPrice = 0;
		int maxIndex = 0;

		for (int i = 0; i < price.size(); i++) {

			String priceText = price.get(i).getText().trim(); // "1.00"
			double currentPrice = Double.parseDouble(priceText);

			if (currentPrice > maxPrice) {
				maxPrice = currentPrice;
				maxIndex = i;

			}
		}

		removeProduct.get(maxIndex).click();

		driver.findElement(By.xpath("//input[@name='updatecart']")).click();

		Thread.sleep(2000);

		logOut();
		postCondition();
	}

	public static void testCase4() throws InterruptedException {
		System.out.println("TestCase 4");
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//
//		driver.get("https://demowebshop.tricentis.com/");
		preCondition();
		Thread.sleep(2000);

		// find all elements
		List<WebElement> follow = driver.findElements(By.xpath("//div[@class='column follow-us']/ul/li/a"));

//		// store URL
//		List<String> urls = new ArrayList<>();
//
//		for (WebElement e : follow) {
//			urls.add(e.getAttribute("href"));
//		}
//
//		// navigate using get()
//		for (String url : urls) {
//
//			driver.get(url);   
//			Thread.sleep(2000);
//
//			driver.navigate().back();
//			Thread.sleep(2000);
//		}

		// second approach
		for (WebElement webElement : follow) {

			String text = webElement.getText();

			webElement.click();
			Thread.sleep(2000);

			if (text.equals("RSS")) {
				driver.navigate().back();
				Thread.sleep(2000);
			}
		}
		Thread.sleep(2000);
//		driver.quit();
		postCondition();
	}

	public static void testCase5() throws InterruptedException {
		System.out.println("TestCase 5");
		preCondition();
		Thread.sleep(2000);
		login();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Mouse");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		logOut();
		Thread.sleep(2000);
		postCondition();
		Thread.sleep(2000);
	}

}
