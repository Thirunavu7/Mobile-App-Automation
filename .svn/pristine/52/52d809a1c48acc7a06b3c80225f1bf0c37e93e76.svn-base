package com.mobile.testing;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
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

public class DragSortDemoApp {

	AndroidDriver driver;
	String acString = "Brad Mehldau";

	@BeforeTest
	public void setup() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Moto G-2");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "5.0.1");

		capabilities.setCapability("appPackage", "com.mobeta.android.demodslv");
		capabilities.setCapability("appActivity",
				"com.mobeta.android.demodslv.Launcher");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				capabilities);
	}

	@Test(priority = 1)
	public void test_DragandDrop() {
		
		List<WebElement> activityTitleList = extractedActivityTitles();
		activityTitleList.get(0).click();
		boolean windowDisplayed = driver.findElement(
				By.id("com.mobeta.android.demodslv:id/drag_handle"))
				.isDisplayed();
		Assert.assertTrue(windowDisplayed);
		List<WebElement> dragElementList = driver
				.findElementsById("com.mobeta.android.demodslv:id/drag_handle");
		new TouchAction((MobileDriver) driver)
				.longPress(dragElementList.get(0))
				.moveTo(dragElementList.get(3)).release().perform();
		String expString = driver
				.findElementsById("com.mobeta.android.demodslv:id/text").get(3)
				.getText();
		Assert.assertEquals(acString, expString);
		clickBack();
	}

	

	@Test(priority=2)
	public void test_Heteroheight() {
		List<WebElement> extractedActivityTitles = extractedActivityTitles();
		extractedActivityTitles.get(1).click();
		List<WebElement> selectionList = driver
				.findElementsById("com.mobeta.android.demodslv:id/drag_handle");
		new TouchAction((MobileDriver) driver).longPress(selectionList.get(0))
				.moveTo(selectionList.get(4)).release().perform();
		String exString = driver
				.findElementsById(
						"com.mobeta.android.demodslv:id/artist_name_textview")
				.get(4).getText();
		Assert.assertEquals(acString, exString);
		clickBack();
	}

	@Test(priority=3)
	public void test_WarpAround(){
		List<WebElement> extractedActivityTitles = extractedActivityTitles();
		extractedActivityTitles.get(2).click();
		List<WebElement> selectItems = driver.findElementsById("com.mobeta.android.demodslv:id/drag_handle");
		new TouchAction((MobileDriver)driver).longPress(selectItems.get(0)).moveTo(selectItems.get(4)).release().perform();
		String expString = driver.findElementsById("com.mobeta.android.demodslv:id/text").get(4).getText();
		System.out.println("warpOP "+expString);
		Assert.assertEquals("Afghanistan", expString);
		clickBack();
	}
	
	
	@Test(priority = 4)
	public void test_CursorBacked(){
		List<WebElement> extractedActivityTitles = extractedActivityTitles();
		extractedActivityTitles.get(5).click();
		List<WebElement> textNames = driver.findElementsById("com.mobeta.android.demodslv:id/text");
		Assert.assertEquals(acString, textNames.get(0).getText());
		List<WebElement> removeButtons = driver.findElementsById("com.mobeta.android.demodslv:id/click_remove");
		removeButtons.get(0).click();
		Assert.assertEquals("Joshua Redman", textNames.get(0).getText());
		clickBack();
	}
	
	@Test(priority = 5)
	public void test_MultipleChoiceMode(){
		List<WebElement> extractedActivityTitles = extractedActivityTitles();
		new TouchAction((MobileDriver) driver).press(extractedActivityTitles.get(4)).moveTo(extractedActivityTitles.get(0)).release().perform();
		extractedActivityTitles.get(4).click();
		List<WebElement> nameList = driver.findElementsById("com.mobeta.android.demodslv:id/text");
		nameList.get(0).click();
		nameList.get(2).click();
		nameList.get(4).click();
		List<WebElement> removeButtons = driver.findElementsById("com.mobeta.android.demodslv:id/click_remove");
		removeButtons.get(1).click();
		removeButtons.get(3).click();
		Assert.assertEquals("Chick Corea", nameList.get(1).getText());
		clickBack();
	}
	
	@Test(priority = 6)
	public void test_singleChoiceMode(){
		List<WebElement> extractedActivityTitles = extractedActivityTitles();
		new TouchAction((MobileDriver) driver).press(extractedActivityTitles.get(4)).moveTo(extractedActivityTitles.get(0)).release().perform();
		extractedActivityTitles.get(5).click();
		List<WebElement> nameList = driver.findElementsById("com.mobeta.android.demodslv:id/text");
		nameList.get(0).click();
		WebElement secondname = nameList.get(1);
		secondname.click();
		System.out.println("value sec name checked="+secondname.getAttribute("checked"));
		Assert.assertEquals("true", secondname.getAttribute("checked"));
		Assert.assertEquals("false", nameList.get(0).getAttribute("checked"));
		clickBack();
	}
	
	private List<WebElement> extractedActivityTitles() {
		List<WebElement> activityTitleList = driver
				.findElementsById("com.mobeta.android.demodslv:id/activity_title");
		return activityTitleList;
	}
	
	private void clickBack() {
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
