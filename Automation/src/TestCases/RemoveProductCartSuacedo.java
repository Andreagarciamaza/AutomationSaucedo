package TestCases;

import Pages.RemoveProductCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.RemoveProductCart;
import Pages.AddProductCart;
import Pages.Dashboard;
import Pages.HomePage;
import Pages.LoginPage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
public class RemoveProductCartSuacedo {
	
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

		driver.get("https://www.saucedemo.com/");
		
	
		//Creating object of Login page
		LoginPage login = new LoginPage(driver);
		
		//Creating object of Dashboard
		Dashboard dashboard = new Dashboard(driver);
		//Creating object of Dashboard
				AddProductCart addproductCartSaucedemo = new AddProductCart(driver);

		//Creating object of RemoveProductCart
		RemoveProductCart RemoveproductCartSaucedemo = new RemoveProductCart(driver);
		
		
		
		//Enter username & password
		login.enterUsername("standard_user");
		Thread.sleep(1000);
		login.enterPassword("secret_sauce");
		Thread.sleep(1000);
		//Click on Login button
				login.clickLogin();
				
				//Click in Menu Button and Validate if homepage is loaded
	//	dashboard.ClickMenuButton();
		Thread.sleep(5000);
		//Validate object inside login page
		
		
		
		
		
		
		
		
		
		
		
		//Click on AddToCard Btn
		addproductCartSaucedemo.addproductCartSaucedemo();
		Thread.sleep(8000);
		//Click on Remove Btn
		RemoveproductCartSaucedemo.RemoveproductCartSaucedemo();
		Thread.sleep(8000);
		
	
				System.out.println("Success Execution for 'RemoveProductsCartSaucedemo'");
		
		
		
               //Close browser instance
		
               driver.quit();
	}

}