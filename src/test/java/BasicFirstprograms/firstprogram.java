package BasicFirstprograms;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class firstprogram {

	public static void main(String[] args) throws InterruptedException {

Playwright playwright=Playwright.create();
Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
Page page=browser.newPage();

page.navigate("https://playwright.dev/java/docs/intro");
Thread.sleep(5000);
System.out.println(page.title());
page.close();
	}

}
