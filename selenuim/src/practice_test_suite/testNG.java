package practice_test_suite;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG {
	@BeforeClass
	public void openBrowser() {
		Reporter.log("open browser", true);
		
	}
	@BeforeMethod
	public void logintoApp()
	{
		Reporter.log("login from application",true);
	}
	
	@Test
	public void verifyPIN ()
	{
		Reporter.log("running verifyPIN TC",true);
	}
	
	@Test
	public void verifyUserID()
	{
		Reporter.log("running verifyUserID TC",true);
	}
	
	@AfterMethod
	public void logputfromApp()
	{
		Reporter.log("logout from application",true);
	}
	
	@AfterClass
	public void closeBrowser() {
		
		Reporter.log("close browser",true);
	}

}
