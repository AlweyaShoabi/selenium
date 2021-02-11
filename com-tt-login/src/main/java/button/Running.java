package button;

import java.util.HashMap;

import com.tt.Base.BaseTest;
import com.tt.ui.Browser;

import pom.PracticePage;

public class Running extends BaseTest {
	Browser browser = null;
	PracticePage pp = null;
	
	public void initializeTest(String url)
	{
		browser = new Browser();
		browser.initBrowser();
		browser.launchBrowser(url);
		pp = new PracticePage(browser);
	}
	public void executeTest() {
		pp.radioBtn();
		pp.checkboxBtn();
		
	}

	

	public void setTestData(String... arg) {
		// TODO Auto-generated method stub
		
	}
	public void setTestData(HashMap<String, String> data) {
		// TODO Auto-generated method stub
	
	}
	public void closingTest() {
		// TODO Auto-generated method stub
		
	}
	public void closeBrowser() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void initializeTest(String url, String testName) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void prepareTestData(String filePath) {
		// TODO Auto-generated method stub
		
	}
	

	
}
