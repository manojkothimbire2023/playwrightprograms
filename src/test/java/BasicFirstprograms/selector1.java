package BasicFirstprograms;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class selector1 {

	public static void main(String[] args) throws InterruptedException {

		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
		Page page=browser.newPage();
		page.navigate("https://trytestingthis.netlify.app/");
		Thread.sleep(5000);
		page.locator("#fname").fill("manoj");
		Thread.sleep(5000);

		page.locator("#lname").fill("kumar");
		Thread.sleep(5000);

		page.close();

	}

}
