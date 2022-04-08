package kiteappusingpropertyFile;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClasses.Base2;
import utilityPackage.Utility2;

public class KiteAppTestclassPropertyFile extends Base2{
  
  
 
	    KiteLoginpage login;
		PINpage pin;
		HomePage home;
		int TCID=11;
		@BeforeClass
		public void launchingBrowser() throws IOException, EncryptedDocumentException, InterruptedException
		{
			launchBrowser();
			
			login= new KiteLoginpage(driver);
			pin= new PINpage(driver);
			home= new HomePage(driver);
		}
		
		@BeforeMethod
		public void LoginToKiteApp() throws IOException, EncryptedDocumentException, InterruptedException
		{
			login.enteruserid(Utility2.getDataFromPropertyFile("UN"));
			login.enterpass(Utility2.getDataFromPropertyFile("PWD"));
			login.clickonlogin();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
			pin.enterpin(Utility2.getDataFromPropertyFile("PIN"));
			pin.clickcontinuebutton();
		}
		
		@Test
	  public void validateUserID() throws IOException, EncryptedDocumentException, InterruptedException 
	  {
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 String expectedUserID = Utility2.getDataFromPropertyFile("UN");
		 String actualUserID = home.getActualusername();
	    // Assert.fail();
		 Assert.assertEquals(expectedUserID, actualUserID,"Actual and Expected UserID not matching ");
		 //UtilityUsingPropertyFile.takeScreenshot(driver, TCID);
		 
	  }
		
		@AfterMethod
		public void logoutFromKiteApp(ITestResult result) throws InterruptedException, IOException
		{
			if(result.getStatus()==result.FAILURE)
			{
				Utility2.takeScreenshot(driver, TCID);
			}
			else
			{
				Reporter.log("TC is passed",true);
				
			}
			
			//home.logout();
		}
		
		@AfterClass
		public void closingBrowser()
		{
			closebrowser();
		}
	
  
  }

