package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {

	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public Dashboard(WebDriver driver) {
		this.driver=driver;
	}
	
	//Locators for the page dashboard
	
	By MenuButton = By.id("react-burger-menu-btn");
	
		
	
		//Method to click on menu button
		public void ClickMenuButton() {
			driver.findElement(MenuButton).click();
		}
		

		//Validate if Dashboard is loaded
				public void checkIfDashboardLoaded() {
					driver.findElement(MenuButton).click();
		
				}
						
		
		
		
	}
