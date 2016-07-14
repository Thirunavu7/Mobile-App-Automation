package Scenario_Component;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import PageObject_Component.PageObject_OnprepTakeTest;

import com.mobile.testing.BaseClass_Server;

public class Scenario_OnPrep_TakeTest  extends BaseClass_Server {
	
	Logger logger = Logger.getLogger(Scenario_OnPrep_TakeTest.class);
	
  @Test
  public void testTake() throws IOException, InterruptedException {
	  startAppiumServer();
	  setDeviceCapabilities();
	  PageObject_OnprepTakeTest pojtaketest = new PageObject_OnprepTakeTest(driver);
	  pojtaketest.getTestListSize();
	  //pojtaketest.dragElements(driver);
	  pojtaketest.getButtonSize();
	  stopAppiumServer();
  }
  
  
}
