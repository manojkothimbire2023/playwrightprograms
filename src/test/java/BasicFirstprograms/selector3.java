package BasicFirstprograms;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class selector3 {

	public static void main(String[] args) throws InterruptedException {

		Playwright playwright=Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
		Page page=browser.newPage();
		Thread.sleep(3000);
		
		page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		page.locator("input[name='username']").fill("Admin");
		Thread.sleep(2000);
		page.locator("input[name='password']").fill("admin123");
		Thread.sleep(2000);
		page.click("button[type='submit']");
		
	}

}
