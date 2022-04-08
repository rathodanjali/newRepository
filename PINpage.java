package kiteappusingpropertyFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PINpage {
@FindBy(id="pin") private WebElement PIN;
@FindBy(xpath="//button[@type='submit']")private WebElement continuebutton;

public PINpage(WebDriver driver){
	PageFactory.initElements(driver,this);
}
public void enterpin(String Pin) {
	PIN.sendKeys(Pin);
	}
public void clickcontinuebutton() {
	continuebutton.click();
	
}
}
	

