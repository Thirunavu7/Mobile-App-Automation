package com.mobile.testing;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwipeScreener {
  
  AndroidDriver driver;
	
  @BeforeMethod
  public void beforeMethod() throws MalformedURLException {
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability("deviceName", "Nexus 4");
	  capabilities.setCapability("platformName", "Android");
	  capabilities.setCapability("platformVersion", "4.2.2");
	  capabilities.setCapability("appPackage", "com.motorola.camera");
	  capabilities.setCapability("appActivity", "com.motorola.camera.Camera");
	  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
  }

  @Test(priority = 1)
  public void testSwipeScreen() {
	  Dimension window_size = driver.manage().window().getSize();
	  System.out.println("WindowSize="+window_size);
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  int startx = (int)(window_size.width*0.2);
	  int endx = (int)(window_size.width*0.8);
	  int starty = (int)(window_size.height/2);
	  //driver.executeScript("windows.scrollBy(0,200)", "");
  }
  
  @Test
  public void testCamera(){
	   driver.findElementById("com.motorola.camera:id/preview_surface").click();
	  //driver.sendKeyEvent(KeyEvent);
	   }
  
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
