package kiteappusingpropertyFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath="//span[@class='user-id']")private WebElement username;
    @FindBy(xpath="//a[@target='_self']")private WebElement logoutbutton;
    
  public  HomePage (WebDriver driver){
 
 PageFactory.initElements(driver,this); 
 } 
public String getActualusername() {
	String actualusername=username.getText();
	
	
	return actualusername;
	} 
public void logoutbutton() throws InterruptedException {
	username.click();
	Thread.sleep(1000);
	logoutbutton.click();
	
}
}
