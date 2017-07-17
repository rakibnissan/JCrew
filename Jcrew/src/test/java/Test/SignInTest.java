package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.PopUpSubmit;
import Pages.SignIn;

public class SignInTest {
WebDriver driver = new FirefoxDriver();
	
	@Test
	public void TestSignIn(){
		driver.get("https://www.jcrew.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PopUpSubmit PS = new PopUpSubmit(driver);
		HomePage hp = new HomePage(driver);
		SignIn si = new SignIn(driver);
		
		PS.SubmitClick();
		hp.GoToSignInPage();
		si.TestSignIn();
		driver.close();
	}
}
