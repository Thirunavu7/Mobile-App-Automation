package Scenario_Component;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import PageObject_Component.PageObject_OnprepRegister;

import com.mobile.testing.BaseClass_Server;

public class Scenario_Onprep_Register extends BaseClass_Server {

	Logger log = Logger.getLogger(Scenario_Onprep_Register.class);
	
	@Test
	public void testRegister() throws IOException, InterruptedException{
		startAppiumServer();
		setDeviceCapabilities();
		PageObject_OnprepRegister poj_register = new PageObject_OnprepRegister(driver);
		poj_register.clickRegister();
		stopAppiumServer();
	}
}
