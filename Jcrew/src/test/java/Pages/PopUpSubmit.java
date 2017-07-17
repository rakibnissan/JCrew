package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopUpSubmit {
	
	public WebDriver driver;
	
	public PopUpSubmit (WebDriver driver){
		
		this.driver= driver;
	}
	
	public HomePage SubmitClick(){
		
		driver.findElement(By.xpath("//*[@id='global__email-capture']/section/div[3]/span")).click();
		return new HomePage(driver);
	}
	
	

}
