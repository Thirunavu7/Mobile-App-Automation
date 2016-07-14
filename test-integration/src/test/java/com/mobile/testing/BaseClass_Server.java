package com.mobile.testing;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseClass_Server {
	
public 	Process process;
public AppiumDriver driver;
	
String start_server = "C:\\Program Files (x86)\\Appium\\node.exe C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\appium.js";

	public void startAppiumServer() throws IOException, InterruptedException
	{
		System.out.println("Exec Appium Server");
		
		Runtime runtime = Runtime.getRuntime();
		process=runtime.exec(start_server);
		
		if(process != null){
			System.out.println("Appium Started");
		}
		else{
			System.out.println("Appium did not Intialized");
		}
		Thread.sleep(3000);
	}
	
	public void setDeviceCapabilities() throws MalformedURLException, InterruptedException
	{
		//File appFile = new File("F:\\Mobile\\apps\\Mathematics.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Sony");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "5.0.2");
		//capabilities.setCapability("app",appFile.getAbsolutePath());
		capabilities
				.setCapability("appPackage", "com.ionicframework.testbudhaapp841309");
		capabilities.setCapability("appActivity",
				"com.ionicframework.testbudhaapp841309.MainActivity");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		}
	
	public void stopAppiumServer(){
		if(process!=null)
		{
		process.destroy();
		System.out.println("Appium Stopped");
		}
	}

}
