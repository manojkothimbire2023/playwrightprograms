package BasicFirstprograms;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class selector2 {

	public static void main(String[] args) throws InterruptedException {
Playwright playwright=Playwright.create();
Browser browser =playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
Page page=browser.newPage();
page.navigate("https://demo.guru99.com/test/newtours/register.php");
Thread.sleep(2000);
page.locator("input[name='firstName']").fill("manoj");
Thread.sleep(2000);

page.locator("input[name='lastName']").fill("kumar");
Thread.sleep(2000);

page.locator("input[name='phone']").fill("123456789");
Thread.sleep(2000);

page.locator("//input[@name='userName']").fill("manoj@123456789");
Thread.sleep(2000);

page.close();



	}

}
