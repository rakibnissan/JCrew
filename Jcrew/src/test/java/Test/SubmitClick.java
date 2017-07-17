package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Pages.PopUpSubmit;

public class SubmitClick {
	WebDriver driver = new FirefoxDriver();
	
	@Test
	public void toClickSubmit(){
		driver.get("https://www.jcrew.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PopUpSubmit PS = new PopUpSubmit(driver);
		PS.SubmitClick();
		driver.close();
		
		
	}
	
	

}
