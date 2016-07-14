package com.mobile.testing;
import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MobileAppTest_FlipKart {

	private AndroidDriver driver;
	private WebDriverWait wait;

	@BeforeMethod
	public void setUp() throws MalformedURLException {
		File apkFile = new File("F:\\Mobile\\flipkart.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", "");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "5.0.2");
		capabilities.setCapability("deviceName", "my phone");
		capabilities.setCapability("app", apkFile.getAbsolutePath());
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				capabilities);
	}

	@Test
	public void testFlipkartInvalidLoginDetails() throws InterruptedException {
		Thread.sleep(30000);
		Assert.assertTrue(driver.getPageSource().contains("New"));
		driver.findElement(By.id("com.flipkart.android:id/etPass")).sendKeys(
				"passwordsd");
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.id("com.flipkart.android:id/btn_mlogin")));
		driver.findElement(By.id("com.flipkart.android:id/btn_mlogin")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.id("com.flipkart.android:id/incorrect_login_text")));
		WebElement errorMsg = driver.findElement(By
				.id("com.flipkart.android:id/incorrect_login_text"));
		Assert.assertTrue(errorMsg.isDisplayed());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
