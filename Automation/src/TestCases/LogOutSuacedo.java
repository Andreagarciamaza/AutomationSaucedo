package TestCases;

import Pages.Dashboard;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.LogOut;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class LogOutSuacedo {
	

public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		
	
		//Creating object of Login page
		LoginPage login = new LoginPage(driver);
		
		//Creating object of Dashboard
		Dashboard dashboard = new Dashboard(driver);
		
		//Creatoig object of LogOut
		LogOut logout = new LogOut(driver);
		
		//Click on Login button
		login.clickLogin();
		
		//Enter username & password
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		
		//Click on login button
		login.clickLogin();
		Thread.sleep(3000);
		
		//Click on Menu button
		dashboard.ClickMenuButton();
		Thread.sleep(7000);
		
	
		
		//Click on Logout button
		logout.clickLogout();
		Thread.sleep(4000);
		
		//Validate if HomePage header Container ID is present
		logout.checkIfElementExists();
		Thread.sleep(4000);
		//Validate object inside login page
		
		
		
		
	
		System.out.println("Success Execution for 'LogOutSuacedo'");
		
		
		
               //Close browser instance
		
               driver.quit();
	}

}