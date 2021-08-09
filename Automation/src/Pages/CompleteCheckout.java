package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompleteCheckout {

	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public CompleteCheckout(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locators for Remove product from Cart
	
	By ShoppingCartBtn = By.className("shopping_cart_link");
	By CheckoutBtn = By.id("checkout");
	By FillCheckoutFirstName = By.id("first-name");	
	By FillCheckoutLastName = By.id("last-name");	
	By FillCheckoutZip = By.id("postal-code");
	By ContinueButton = By.id("continue");
	By FinishButton = By.id("finish");		

	//Click on Complete Checkout Button
				public void ShoppingCartBtn() {
					driver.findElement(ShoppingCartBtn).click();
		
				}
						
				//Click on Checkout Button
				public void CheckoutBtn() {
					driver.findElement(CheckoutBtn).click();
		
				}
				
				
				//Fill CheckoutYourInformation First Name
				public void FillCheckoutFirstName(String firstname) {
					driver.findElement(FillCheckoutFirstName).sendKeys(firstname);
		
				}
				
				//Fill CheckoutYourInformation Last Name
				public void FillCheckoutLastName(String lastname) {
					driver.findElement(FillCheckoutLastName).sendKeys(lastname);
		
				}
				
				//Fill CheckoutYourInformation Zip
				public void FillCheckoutZip(String zip) {
					driver.findElement(FillCheckoutZip).sendKeys(zip);
		
				}
				
				//Click on Continue Button
			
				public void ContinueButton() {
					driver.findElement(ContinueButton).click();
		
				}
				
				
			
				//Click on Finish Btn
				public void FinishButton() {
					driver.findElement(FinishButton).click();
		
				}
			
		
	}

	