package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class CometLaunch {
	public static void main(String[] args) {
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// enter into an webpage
		driver.get(
				"https://www.wearcomet.com/?utm_source=google&utm_medium=google_ads&utm_campaign=google_ads_brand_search_header_28-07&tw_source=google&tw_adid=667115964436&tw_campaign=20365005964&tw_kwdid=kwd-10610121&gad_source=1&gad_campaignid=20365005964&gbraid=0AAAAAp7wtpXhsgatl1KGjN1mqkK_uWzzn&gclid=CjwKCAjwg_nNBhAGEiwAiYPYA8uoj5it6GaJ1giYPvLCeh-zBMRkRNhmHFC4rmKuSEJrvJcTHWxLJRoClXkQAvD_BwE");
		// close the browser
		driver.close();
	}
}
