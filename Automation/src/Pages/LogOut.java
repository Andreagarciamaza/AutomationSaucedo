package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LogOut {

	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public LogOut(WebDriver driver) {
		this.driver=driver;
	}
	

	
	By logOutBtn = By.id("logout_sidebar_link");
	//Locator for login button
	By loginBtn = By.id("login-button");
	
	
	//Method to click on Logout button 
	public void clickLogout() {
		driver.findElement(logOutBtn).click();
	}
	
	
	
	
	
	//Method to validate
		public void checkIfElementExists() {
			driver.findElement(loginBtn).click();
		}
		
	
	
	
	
		
	}