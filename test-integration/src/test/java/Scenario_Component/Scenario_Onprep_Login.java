package Scenario_Component;

import java.io.IOException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.log4testng.Logger;

import PageObject_Component.PageObject_OnprepLogin;

import com.mobile.testing.BaseClass_Server;

public class Scenario_Onprep_Login extends BaseClass_Server {

	static Logger log = Logger.getLogger(Scenario_Onprep_Login.class);
	SoftAssert sassert = new SoftAssert();
	
	@Test
	public void testLogin() throws IOException, InterruptedException{
		startAppiumServer();
		setDeviceCapabilities();
		PageObject_OnprepLogin poj_login = new PageObject_OnprepLogin(driver);
		poj_login.enterEmail("teamsuccesso123@gmail.com");
		poj_login.enterPassword("password");
		poj_login.clickLogin(driver);
		stopAppiumServer();
	}

	@Test(dataProvider= "dp_validLogin", dataProviderClass = DataProvider_Component.DataProvider_OnprepLogin.class)
	public void testLogin_ValidSearch(String username, String password) throws IOException, InterruptedException{
		startAppiumServer();
		setDeviceCapabilities();
		PageObject_OnprepLogin poj_login = new PageObject_OnprepLogin(driver);
		poj_login.enterEmail(username);
		poj_login.enterPassword(password);
		poj_login.clickLogin(driver);
		/*String actualResult = poj_login.displayName();
		if(actualResult.equals(expResult)){
			log.info("PASS - Test");
		}
		else{
			sassert.fail("FAIL - Test");
		}*/
		sassert.assertAll();
		stopAppiumServer();
	}
	
}
