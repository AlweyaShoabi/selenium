package travel;

import com.tt.Base.BasePage;
import com.tt.ui.Browser;

public class HomePage extends BasePage{
	
	String visaXP="//span[@class='ink animate']";
	
	public HomePage(Browser browser) {
		super(browser);
	}
	
	 public void clickOnBtn() {
	    	browser.getObjectByXP(visaXP);
	    	browser.click();
	    }
	

}
