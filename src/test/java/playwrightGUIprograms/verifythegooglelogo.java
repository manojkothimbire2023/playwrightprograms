package playwrightGUIprograms;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class verifythegooglelogo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
Playwright playwright= Playwright.create();
Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(200));
Page page=browser.newPage();
page.navigate("https://www.google.com/");
Thread.sleep(2000);
 Locator logo= page.locator("img.lnXdpd");
 if(logo.isVisible())
 {
	 System.out.println("test pass");
 }
 else
 {
	 System.out.println("test is failed");
 }

page.close();

	}

}
