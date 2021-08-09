package TestCases;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.RemoveProductCart;
import Pages.ThankyouPage;
import Pages.AddProductCart;
import Pages.Dashboard;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.CompleteCheckout;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
public class ThankyouPageSaucedo {
	
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

		//Creating object of CompleteCheckout 
		CompleteCheckout completecheckout = new CompleteCheckout(driver);
		//Creating object of ThankyouPage 
				ThankyouPage thanyoupage = new ThankyouPage(driver);
				
		
		
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
		Thread.sleep(4000);
		//Click ShoppingCartBtn
		completecheckout.ShoppingCartBtn();
		
		Thread.sleep(4000);
		//Click on CHECKOUTBUTTON 
		completecheckout.CheckoutBtn();
		Thread.sleep(4000);
		
		//Fill CheckoutYourInformation First Name
		completecheckout.FillCheckoutFirstName("Andrea");
		Thread.sleep(1000);
		//Add Text on FirstName Field
		completecheckout.FillCheckoutLastName("Garcia");
		Thread.sleep(1000);
		//Add code on zip Field
				completecheckout.FillCheckoutZip("0011243");
				Thread.sleep(4000);
				
				//Click on Continue Button
				completecheckout.ContinueButton();
				Thread.sleep(3000);
				//Click on Finish Button
				completecheckout.FinishButton();
				Thread.sleep(3000);
				//Validate if Thankyou Page Exists
				thanyoupage.ValidateThankyouPage();
				//Click on BackHome Btn
				thanyoupage.BackHomeButton();
				Thread.sleep(5000);
				
				
				
				
				System.out.println("Success Execution for 'CompleteCheckoutSaucedemo'");
		
		
		
               //Close browser instance
		
               driver.quit();
	}

}