package playwrightGUIprograms;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class screenshothanding {

	public static void main(String[] args) throws InterruptedException {
Playwright playwright=Playwright.create();
Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(200));
Page page=browser.newPage();
page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(3000);
page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("C:\\Users\\admin\\Desktop\\screenshot\\orangehrm1.png")));
page.close();
	}

}
