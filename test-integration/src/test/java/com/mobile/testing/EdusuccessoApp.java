package com.mobile.testing;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EdusuccessoApp extends BaseClass_Server{
	
	@Test
	public void testEdusuccessoHomeScreen() throws IOException, InterruptedException{
		startAppiumServer();
		setDeviceCapabilities();
		
		WebElement toolbar = driver.findElement(By
				.id("com.teamsuccesso.edusuccesso:id/toolbar"));
		Assert.assertEquals(true, toolbar.isDisplayed());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		stopAppiumServer();
	}

}
