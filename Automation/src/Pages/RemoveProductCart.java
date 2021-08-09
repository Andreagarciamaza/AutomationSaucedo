package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemoveProductCart {

	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public RemoveProductCart(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locators for Remove product from Cart
	
	By RemoveProduct = By.id("remove-sauce-labs-backpack");
	
		
	
			

	//Click on Remove Btn to select a product
				public void RemoveproductCartSaucedemo() {
					driver.findElement(RemoveProduct).click();
		
				}
						
		
		
		
	}

	