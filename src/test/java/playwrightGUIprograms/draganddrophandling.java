package playwrightGUIprograms;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class draganddrophandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(200));
		Page page=browser.newPage();
		page.navigate("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		
		page.locator("//a[text()=' BANK ']").dragTo(page.locator("//ol[@id='bank']//li"));
		Thread.sleep(2000);
		page.locator("//a[text()=' SALES ']").dragTo(page.locator("//ol[@id='loan']"));

	}

}
