package com.mobile.testing;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GameTest_BitBarSample {

	AndroidDriver driver;
	WebDriverWait wait;

	@Test
	public void testGameApp() throws MalformedURLException {
		File app = new File("F:\\Mobile\\apps\\BitbarSampleApp.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", "");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.2.2");
		capabilities.setCapability("deviceName", "my phone");
		capabilities.setCapability("app", app.getAbsolutePath());
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				capabilities);
		checkDashboard();
		testValidCriteria();
		//wait = new WebDriverWait(driver, 30);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().back();
		testInvalidCriteria();
		driver.navigate().back();
		testInvalidCriteria2();
	}

	private void checkDashboard() {
		//wait = new WebDriverWait(driver, 30);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement textElement = driver
				.findElement(By
						.xpath("//android.widget.TextView[@text='What is the best way to test your application against over one hundred devices?']"));
		Assert.assertTrue(textElement.isDisplayed());
	}

	private void testInvalidCriteria2() {
		//wait = new WebDriverWait(driver, 30);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement radioElement3 = driver
				.findElement(By
						.xpath("//android.widget.RadioButton[@text='Buy 101 devices']"));
		radioElement3.click();
		wait = new WebDriverWait(driver, 30);
		clickAnswer();
		wrongAnswerDisplayed();
	}

	private void clickAnswer() {
		WebElement answerButton = driver.findElement(By
				.xpath("//android.widget.Button[@text='Answer']"));
		answerButton.click();
	}

	private void wrongAnswerDisplayed() {
		wait = new WebDriverWait(driver, 30);
		WebElement textElement = driver.findElement(By
				.xpath("//android.widget.TextView[@text='Wrong Answer!']"));
		Assert.assertTrue(textElement.isDisplayed());
	}

	private void testInvalidCriteria() {
		wait = new WebDriverWait(driver, 30);
		WebElement radioElement2 = driver
				.findElement(By
						.xpath("//android.widget.RadioButton[@text='Ask mom for help']"));
		radioElement2.click();
		wait = new WebDriverWait(driver, 30);
		clickAnswer();
		wrongAnswerDisplayed();

	}

	private void testValidCriteria() {
		wait = new WebDriverWait(driver, 50);
		WebElement radioElement = driver
				.findElement(By
						.xpath("//android.widget.RadioButton[@text='Use Testdroid Cloud']"));
		radioElement.click();
		wait = new WebDriverWait(driver, 30);
		WebElement nameElement = driver
				.findElement(By
						.xpath("//android.widget.EditText[@text='Please type your name to proceed']"));
		nameElement.sendKeys("thiru");
		wait = new WebDriverWait(driver, 30);
		clickAnswer();
		wait = new WebDriverWait(driver, 30);
		WebElement textElement = driver.findElement(By
				.xpath("//android.widget.TextView[@text='You are right!']"));
		Assert.assertTrue(textElement.isDisplayed());
	}

}
