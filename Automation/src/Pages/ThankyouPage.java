package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThankyouPage {

	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public ThankyouPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locators for Backhome bTN
	
	By BackHomeButton = By.id("back-to-products");
	

	//Click on Complete Checkout Button
				public void ValidateThankyouPage() {
					driver.getPageSource().contains("Your order has been dispatched, and will arrive just as fast as the pony can get there!");
				
		
				}
				
				
				//Click on BackHome Btn
				public void BackHomeButton() {
					driver.findElement(BackHomeButton).click();
				
				}
}
				

	