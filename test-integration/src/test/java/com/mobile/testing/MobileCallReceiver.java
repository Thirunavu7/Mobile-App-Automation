package com.mobile.testing;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class MobileCallReceiver {

  AndroidDriver driver;
	
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("deviceName", "My Moto");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformVersion", "5.0.1");

	capabilities.setCapability("appPackage","");
	capabilities.setCapability("appActivity", "");
	
	driver = new AndroidDriver(new URL("http:127.0.0.1:4723/wd/hub"), capabilities);
  }

  @Test(priority = 1)
  public void testCallReceiveSuccessfull() {
	  WebElement answerCall = driver.findElement(By.id("com.android.dialer:id/answerFragment"));
	  Assert.assertEquals(true, answerCall.isDisplayed());
	  Dimension windowsize = driver.manage().window().getSize();
	  System.out.println("WIndow Size ="+windowsize);
	  int startx = (int) (windowsize.width* 0.2) ;
	  System.out.println("start x value ="+startx);
	  int endx = (int)(windowsize.width*0.8);
	  System.out.println("end x value ="+endx);
	  int starty = (int) (windowsize.height/2);
	  System.out.println("start y value ="+starty);
	  driver.swipe(startx, starty, endx, starty, 1000);
  }
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
