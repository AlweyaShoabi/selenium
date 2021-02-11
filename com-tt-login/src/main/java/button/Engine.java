package button;

import com.tt.Base.BaseTest;


public class Engine {
public static void main(String[] args) {
		
		String applicationURL = "https://www.rahulshettyacademy.com/AutomationPractice/";
		
		BaseTest bt=new Running();
		bt.initializeTest(applicationURL, "Radio and check");
		bt.executeTest();

}
}
