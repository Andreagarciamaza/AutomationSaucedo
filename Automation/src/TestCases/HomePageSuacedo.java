package TestCases;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class HomePageSuacedo {
	
	public static void main(String[] args) throws InterruptedException {
		
		HomePage home = new HomePage();
		home.HomePageValidation();
		
		//Success Test message
		
		System.out.println("Success Execution for 'HomePageSuacedo'");

}
	
}
 

	
	









