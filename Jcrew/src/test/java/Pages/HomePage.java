package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	public WebDriver driver;
	
	public HomePage(WebDriver driver){
		this.driver=driver;
		
	}
	public SignIn GoToSignInPage (){
		driver.findElement(By.xpath("//*[@data-reactid='34']")).click();
		return new SignIn(driver);
		
	}
	
	

}
