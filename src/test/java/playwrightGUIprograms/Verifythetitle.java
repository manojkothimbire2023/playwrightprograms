package playwrightGUIprograms;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Verifythetitle {

	public static void main(String[] args) throws InterruptedException {
Playwright playwright=Playwright.create();
Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(200));
Page page=browser.newPage();
page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
Thread.sleep(2000);
String Title=page.title();
System.out.println(Title);
String ExpectedTitle="OrangeHRM";

if(Title.equals(ExpectedTitle))
{
	System.out.println("title is matched...");
}
else
{
	System.out.println("Title is not matched..");
}

page.close();
	}

}
