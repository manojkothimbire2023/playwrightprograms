package playwrightGUIprograms;

import java.awt.Point;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.BoundingBox;

public class VerifytheXandYcoordinateofElement {

	public static void main(String[] args) {

		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(200));
		Page page=browser.newPage();
		page.navigate("https://www.google.com/");
		Locator searchtextbox=page.locator("textarea#APjFqb");
		BoundingBox p=searchtextbox.boundingBox();
		System.out.println(p.x);
		System.out.println(p.y);
		
		BoundingBox S=searchtextbox.boundingBox();
		System.out.println(S.height);
		System.out.println(S.width);
		page.close();
		
	}

}
