package playwrightGUIprograms;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class checkboxhanding {

	public static void main(String[] args) {
Playwright playwright=Playwright.create();
Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(200));
Page page=browser.newPage();
page.navigate("https://testautomationpractice.blogspot.com/");

//page.locator("#sunday").click();

List<ElementHandle> checkboxes=page.querySelectorAll("//input[@class='form-check-input' and @type='checkbox']");
System.out.println(checkboxes.size());
/*for(ElementHandle ckbox:checkboxes)
	
{
	ckbox.click();
}
*/
for(ElementHandle ckbox:checkboxes)
{
	String chbox=ckbox.getAttribute("id");
	if((chbox.equals("sunday") )|| (chbox.equals("saturday")))
	{
		ckbox.click();
	}
}

	}

	}


