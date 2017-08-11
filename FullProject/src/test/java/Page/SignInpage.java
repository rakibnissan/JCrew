package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInpage {
	
	public WebDriver driver;
	public SignInpage (WebDriver driver){
		
		this.driver=driver;
	}
	public Homepage gotoHomePage(){
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("rakibkhan@asa.edu");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Bangladesh");
		driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
		//driver.findElement(By.xpath("//*[@id='bluebar_profile_and_home']/div[1]/div/a")).click();
		driver.findElement(By.xpath("//*[@href='https://www.facebook.com/profile.php?id=100021456212194'][@title='Profile']")).click();
		return new Homepage(driver);
	}
}
