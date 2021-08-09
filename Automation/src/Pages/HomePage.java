package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;




public class HomePage {
	
	public void HomePageValidation() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\daniel.catano\\eclipse-workspace\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//page load wait
	     driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.saucedemo.com/");
		
		
		
		//Close browser instance
               driver.quit();	
	
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		
               
	


}
	
    
}

	
	


