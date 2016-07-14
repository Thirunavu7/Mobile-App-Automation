package com.mobile.testing;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MobileCaller {
  
 AndroidDriver driver;
	
  @BeforeTest
  public void beforeMethod() throws MalformedURLException {
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability("deviceName", "My Phone");
	  capabilities.setCapability("platformName", "android");
	  capabilities.setCapability("platformVersion", "5.0.1");
	  
	  capabilities.setCapability("appPackage", "com.android.dialer");
	  capabilities.setCapability("appActivity", "com.android.dialer.DialtactsActivity");
	  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
  }
  
  @Test
  public void testCallerApp() {
	  String actualPhone = "97 46 006087";

	  driver.findElementById("com.android.dialer:id/floating_action_button").click();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.findElementById("com.android.dialer:id/digits").sendKeys("9746006087");
	  
	  String phoneText = driver.findElementById("com.android.dialer:id/digits").getText();
	  System.out.println("My phone number is "+phoneText);
	  Assert.assertEquals(actualPhone,phoneText);
	  driver.findElement(By.id("com.android.dialer:id/dialpad_floating_action_button")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  List<WebElement> simNos = driver.findElementsById("com.motorola.android.providers.userpreferredsim:id/icon");
	  System.out.println("My Total sim size"+simNos.size());
	  simNos.get(0).click();
	  
	  String expphone = driver.findElement(By.id("com.android.dialer:id/phoneNumber")).getText();
	  Assert.assertEquals(actualPhone, expphone);
	  
	  driver.manage().timeouts().implicitlyWait(4, TimeUnit.MINUTES);
	/*  WebElement callendbutton = driver.findElementById("com.android.dialer:id/floating_end_call_action_button");
	  Assert.assertEquals(true, callendbutton.isDisplayed());
	  callendbutton.click();*/
  }

  
  @AfterTest
  public void afterMethod() {
  driver.quit();
  }

}
