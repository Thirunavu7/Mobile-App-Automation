package com.mobile.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SafetyWorldTracker {

	WebDriver driver;
	WebDriverWait wait;

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 2000);
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}

	public void loginGmail() throws InterruptedException {
		driver.findElement(By.id("Email")).sendKeys("safetyworld123@gmail.com");
		driver.findElement(By.id("next")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Passwd")).sendKeys("TestBudha!23");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(7000);
	}

	@Test
	public void testMail() throws InterruptedException {
		loginGmail();
		Thread.sleep(10000);
		clickonEmail();
	}

	public void clickonEmail() throws InterruptedException {
		System.out.println("Starting to Click on Email");
		List<WebElement> email = driver
				.findElements(By
						.xpath("//div[@class='xS']/div[@class='xT']/div[@class='y6']/span"));
		System.out.println("Size =" + email.size());
		for (int i = 0; i < email.size(); i++) {
			if (email.get(i).getText()
					.equals("Safety World - User Registration")
					|| email.get(i).getText()
							.equals("Safety World - Contact Information")) {
				email.get(i).click();
				Thread.sleep(7000);
				WebElement userInfo = driver.findElement(By.className("gs"));
				System.out.println("hi user" + userInfo.getText());
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(5000);
			}
		}
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
