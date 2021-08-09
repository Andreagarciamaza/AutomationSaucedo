package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Dashboard;
import Pages.HomePage;
import Pages.LoginPage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class LoginSaucedemo {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\daniel.catano\\eclipse-workspace\\Automation\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		
	
		//Creating object of Login page
		LoginPage login = new LoginPage(driver);
		
		//Creating object of Dashboard
		Dashboard dashboard = new Dashboard(driver);
		
		
		
		//Enter username & password
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		
		//Click on Login button
				login.clickLogin();
		
				//Click in Menu Button and Validate if homepage is loaded
		dashboard.ClickMenuButton();
		Thread.sleep(6000);
		//Validate object inside login page
		
		
		//Click on logOut button
		//		dashboard.clickLogout();
		//		Thread.sleep(3000);
		
		
	
				System.out.println("Success Execution for 'LoginSaucedo'");
		
		
		
               //Close browser instance
		
               driver.quit();
	}

}