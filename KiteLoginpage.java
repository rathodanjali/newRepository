package kiteappusingpropertyFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginpage {

@FindBy(id="userid")private WebElement userID;	
@FindBy(id="password")private WebElement pwd;
@FindBy(xpath="//button[@type='submit']")private WebElement loginbutton;

public KiteLoginpage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	
}
public void enteruserid(String uid) {
	userID.sendKeys(uid);
}
public void enterpass(String pass) {
	pwd.sendKeys(pass);
	
}
public void clickonlogin() {
	loginbutton.click();
}
}
