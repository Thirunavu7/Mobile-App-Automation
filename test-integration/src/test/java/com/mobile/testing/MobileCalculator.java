package com.mobile.testing;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MobileCalculator {
 
	AndroidDriver driver;
	
  @BeforeMethod
  public void beforeMethod() throws MalformedURLException {
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability("deviceName", "Nexus 4 API");
	  capabilities.setCapability("platformName", "Android");
	  capabilities.setCapability("platformVersion", "4.2.2");
	  
	  capabilities.setCapability("appPackage", "com.android.calculator2");
	  capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
	  
	  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
  }

  @Test
  public void testCalc() {
	  driver.findElementByName("4").click();
	  driver.findElementByName("+").click();
	  driver.findElementByName("4").click();
	  driver.findElementByName("=").click();
	  String act_text = driver.findElement(By.className("android.widget.EditText")).getText();
	  System.out.println("outputtt"+act_text);
	  Assert.assertEquals("8",act_text);
  }
  
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
