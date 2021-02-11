package pakage;

import org.openqa.selenium.By;		
	
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.*;

public class click {

	public static void main(String[] args) throws InterruptedException  {
	
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"//driver//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");	
		driver.manage().window().maximize();
        WebElement radio1 = driver.findElement(By.xpath("//input[@value='radio1']"));							
        WebElement radio2 = driver.findElement(By.xpath("//input[@value='radio2']"));							
        		
        //Radio Button1 is selected		
        radio1.click();			
        System.out.println("Radio Button Option 1 Selected");					
        		
        //Radio Button1 is de-selected and Radio Button2 is selected		
        radio2.click();			
        System.out.println("Radio Button Option 2 Selected");					
        		
        // Selecting CheckBox		
        WebElement option1 = driver.findElement(By.id("checkBoxOption1"));							
           
     // This will Toggle the Check box 		
        option1.click();			

        // Check whether the Check box is toggled on 		
        if (option1.isSelected()) {					
            System.out.println("Checkbox is Toggled On");					

        } else {			
            System.out.println("Checkbox is Toggled Off");					
        }		
		

}		

	
		
	
			
			
	}	
		
		

		
				

	


