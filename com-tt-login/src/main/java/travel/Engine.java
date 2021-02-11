package travel;

import com.tt.Base.BaseTest;
import com.tt.util.Env1Properties;



public class Engine {

public static void main(String[] args) {
		
		Env1Properties ep = new Env1Properties("C:\\\\selenium\\\\travel.Properties");
		
		String applicationURL =ep.getPropertyValue("app_url");
		
		BaseTest bt=new TravelMainPage();
		bt.initializeTest(applicationURL, "Verify if my product is logged in");
		bt.executeTest();
}

}
