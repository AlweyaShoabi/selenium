package sample;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



	public class login implements BaseTest {
		WebDriver driver=null;
		public static void main(String args[]) {
			login lg= new login();
			lg.initializeTest();
			lg.executeTest();
		}
		
		public void initializeTest() {
			
			if(browserType.equalsIgnoreCase("chrome"))
			{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			else if(browserType.equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			  driver.get("https://www.saucedemo.com/");
			 
		}
			
		
		
		public void executeTest() {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-3.141.59\\chromedriver\\chromedriver.exe");
			 WebDriver driver = new  ChromeDriver();
			  driver.get("https://www.saucedemo.com/");
			  WebElement userNameTB = driver.findElement(By.id("user-name"));
			  userNameTB.sendKeys("Alweya");
			  
			  WebElement pass = driver.findElement(By.id("password"));
			  pass.sendKeys("welcome");
			  
			  WebElement loginbtn = driver.findElement(By.id("login-button"));
			  loginbtn.click();
			  
			  WebElement error = driver.findElement(By.xpath("//h3[@data-test-='error']"));
			  String errorMsg=error.getText();
			  
			  if(errorMsg.equals("Epic sadface:Username and password do not match any user in this service"))
				  System.out.println("Test case passed, error message is thrown properly when wrong credential are given");
			  else
				  System.out.println("error occured");
			
		}
		public void setTestData() {
			
		}
		public void closingTest() {
			driver.quit();
			
			
		}
		
		
			
			

		}




