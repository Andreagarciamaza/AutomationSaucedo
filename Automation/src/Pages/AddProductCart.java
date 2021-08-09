package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProductCart {

	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public AddProductCart(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locators for Add Product Btn
	
	By AddProduct = By.id("add-to-cart-sauce-labs-backpack");
	
		
	
			

		//Click on AddProduct Btn to select a product
				public void addproductCartSaucedemo() {
					driver.findElement(AddProduct).click();
		
				}
						
		
		
		
	}

	