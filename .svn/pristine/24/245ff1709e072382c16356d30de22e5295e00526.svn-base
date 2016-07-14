package Generic_Component;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base_Class {
	public Process process;	
	public AppiumDriver driver;
	
	//@BeforeMethod
	public void Start_appium_serv() throws IOException, InterruptedException
	{
		String Start_server="E:\\Appium\\node.exe E:\\Appium\\node_modules\\appium\\bin\\appium.js";
		Runtime runtime = Runtime.getRuntime();
		process=runtime.exec(Start_server);
		
		if(process!=null)
		{
			System.out.println("Appium started");
		}
		else
		{
			System.out.println("NOT started");
		}
		
		Thread.sleep(15000);
	}
	
	
	public void initBrowser() throws InterruptedException, IOException
	{
		
		DesiredCapabilities Capabilities= new DesiredCapabilities();
		Capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		Capabilities.setCapability("deviceName", "SM-G350E");
		Capabilities.setCapability("platformName", "Android");
		Capabilities.setCapability("platformVersion", "4.4.2");
		
		//identify app
		Capabilities.setCapability("appPackage", "com.android.chrome");
		Capabilities.setCapability("appActivity", "com.google.android.apps.chrome.ChromeTabbedActivity");

		 driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), Capabilities);
		 
		 Thread.sleep(3000);
		 Utility_Class c1= new Utility_Class(); 
		 
		 driver.get(c1.reading_properties("URL"));
		
		
		
		
	}
	
	
	//@AfterMethod
	public void stop_appium_serv()
	{
		if(process!=null)
		{
			process.destroy();
			System.out.println("Appium Stopped");
		}
	}

}
