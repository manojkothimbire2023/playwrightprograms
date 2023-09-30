package playwrightGUIprograms;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class doubleclickhandling {

	public static void main(String[] args) throws InterruptedException {

Playwright playwright=Playwright.create();
Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(200));
Page page=browser.newPage();
page.navigate("https://demoqa.com/buttons");
Thread.sleep(2000);

page.locator("#doubleClickBtn").dblclick();
Thread.sleep(2000);



	}

}
