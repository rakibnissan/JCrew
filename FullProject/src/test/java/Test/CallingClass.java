package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Page.Homepage;
import Page.SignInpage;

public class CallingClass {

	
		WebDriver driver = new FirefoxDriver ();
		
		@Test
		
		public void PhotoUpload(){
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
			SignInpage S = new SignInpage(driver);
			Homepage H= new Homepage(driver);
			S.gotoHomePage();
			H.uploadphoto();
			
			
			
		}

	

}
