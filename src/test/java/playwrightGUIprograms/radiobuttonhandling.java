package playwrightGUIprograms;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class radiobuttonhandling {

	public static void main(String[] args) throws InterruptedException {

		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(200));
		Page page=browser.newPage();
		
		page.navigate("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		page.locator("#male").click();
		Thread.sleep(5000);
		page.locator("#female").click();
		
	}

}
