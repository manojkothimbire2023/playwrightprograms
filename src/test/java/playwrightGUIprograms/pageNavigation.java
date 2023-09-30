package playwrightGUIprograms;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class pageNavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Playwright playwright=Playwright.create();
Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(200));
Page page=browser.newPage();
page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(2000);
page.goBack();

Thread.sleep(2000);
page.goForward();
Thread.sleep(2000);


	}

}
