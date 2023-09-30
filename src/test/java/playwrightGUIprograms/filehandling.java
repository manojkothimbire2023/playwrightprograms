package playwrightGUIprograms;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class filehandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(200));
		Page page=browser.newPage();
		page.navigate("https://trytestingthis.netlify.app/");
		Thread.sleep(3000);
		ElementHandle browse=page.querySelector("//input[@id='myfile']");
	
		browse.setInputFiles(Paths.get("C:\\Users\\admin\\Desktop\\pg.txt"));

	}

}
