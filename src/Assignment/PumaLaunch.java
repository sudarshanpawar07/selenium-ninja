package Assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class PumaLaunch {
	public static void main(String[] args) {
		// open the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// enter into webpage
		driver.get(
				"https://in.puma.com/in/en?utm_source=GGL-SEA&utm_medium=BS&utm_campaign=BS_GGL_SEA_IN_STAG_agency_1000067495857508873&gad_source=1&gad_campaignid=22200704844&gbraid=0AAAAADiCiZciP6TS2p-4N0Rm5ztw_itOC&gclid=CjwKCAjwg_nNBhAGEiwAiYPYAx7_D2hoSYtoKRfnoMfegLo17TXSPaB63iESHmzCw52kE6-c3tnoIxoC8LIQAvD_BwE");
		// close the browser
		driver.close();
	}
}
