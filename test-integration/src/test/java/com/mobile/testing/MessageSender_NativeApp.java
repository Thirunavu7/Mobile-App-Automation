package com.mobile.testing;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MessageSender_NativeApp {
	
	AndroidDriver driver;
	String expected = "97913295";
	String phoneNumber = "97913295";
	
	@BeforeMethod
	public void beforeMethod() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "MOTO G 2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.2.2");
		capabilities.setCapability("appPackage", "com.android.mms");
		capabilities.setCapability("appActivity", "com.android.mms.ui.ComposeMessageActivity");
		
		driver = new  AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
	
	@Test
	public void testMessageSender() {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElementById("com.android.mms:id/recipients_editor").sendKeys(phoneNumber);
		
		
		driver.findElementById("com.android.mms:id/embedded_text_editor").sendKeys("Hi Thiru Happy Automation Testing");
		driver.findElementById("com.android.mms:id/send_button_sms").click();		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> simElements = driver.findElementsById("com.android.mms:id/icon");
		simElements.get(0).click();
		driver.sendKeyEvent(AndroidKeyCode.BACK);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement frameLayout = driver.findElementById("android:id/action_bar_container");
		List<WebElement> frameButtons = frameLayout.findElements(By.className("android.widget.ImageButton"));
		frameButtons.get(0).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<WebElement> recepientsList = driver.findElementsById("com.android.mms:id/from");
		String recepient = recepientsList.get(0).getText();
		Assert.assertTrue(recepient.equals(expected));
		
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
