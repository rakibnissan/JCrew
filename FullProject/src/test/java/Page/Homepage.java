package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	public WebDriver driver;
	public Homepage (WebDriver driver){
		this.driver=driver;
	}
public void uploadphoto(){
	
	driver.findElement(By.xpath("//*[@alt='your Profile Photo']")).click();
	driver.findElement(By.xpath("//*[@title='Choose a file to upload']")).click();
	driver.switchTo().activeElement().sendKeys("C:\\Users\\RakibKhan\\Desktop\\FB.PNG");
	driver.findElement(By.xpath("//*[@type='submit'][@value='1'][@data-testid='profilePicSaveButton']")).click();
}
}
