package UtilityClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

class RemoveHighestPriceProduct extends Base {
	public static void main(String[] args) throws InterruptedException {
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

}
