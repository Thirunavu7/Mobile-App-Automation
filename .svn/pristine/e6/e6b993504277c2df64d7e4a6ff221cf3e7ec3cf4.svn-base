package com.mobile.testing;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChromeRunner {
	
  AndroidDriver driver;
  
  @BeforeMethod
  public void beforeMethod() throws MalformedURLException {
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability("deviceName","Nexus 4");
	  capabilities.setCapability(CapabilityType.BROWSER_NAME,"Chrome");
	  capabilities.setCapability("platformName", "Android");
	  capabilities.setCapability("platformVersion", "4.2.2");
	  capabilities.setCapability("packageName", "com.android.chrome");
	  capabilities.setCapability("activityName", "org.chromium.chrome.browser.ChromeTabbedActivity");
	  
	  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
  }

  @Test
  public void testChrome() {
	  driver.get("http://www.google.com");
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	/*  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.findElementByClassName("q").sendKeys("Teamsuccesso");
	  driver.findElementByClassName("_Mle").click();
	  Assert.assertEquals(true, driver.getPageSource().contains("Teamsuccesso"));*/
  }
  
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
