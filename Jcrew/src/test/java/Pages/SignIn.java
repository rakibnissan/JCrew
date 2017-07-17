package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {
	public WebDriver driver;
	
	public SignIn(WebDriver driver){
		this.driver=driver;
		
	}
	public void TestSignIn (){
		driver.findElement(By.xpath("//*[@id='sidecarUser']")).sendKeys("rakibnissan@gmail.com");
		driver.findElement(By.xpath("//*[@id='sidecarPassword']")).sendKeys("Bangladesh");
		driver.findElement(By.xpath("//*[@id='sidecarRemember']")).click();
		
		driver.findElement(By.xpath("//*[@id='page__signin']/article/section[1]/div/form[2]/button")).click();
		
		
	}
	
	

}
