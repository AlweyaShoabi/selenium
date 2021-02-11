package travel;

import java.util.HashMap;

import com.tt.Base.BaseTest;
import com.tt.ui.Browser;



public class TravelMainPage extends BaseTest {
	
	HomePage hp=null;
	
public TravelMainPage() {
		
	}

	@Override
	public void initializeTest(String url, String testName) {
		browser=new Browser();
		browser.initBrowser();
		browser.launchBrowser(url);
		
		hp=new HomePage(browser);
		
		testData=new HashMap();
		
	}

	@Override
	public void executeTest() {
		hp.clickOnBtn();		
	}

	@Override
	public void setTestData(String... arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prepareTestData(String filePath) {
		// TODO Auto-generated method stub
		
	}

}
