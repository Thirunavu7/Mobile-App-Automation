package PageObject_Component;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject_OnprepTakeTest {
	

	@FindBy(className = "android.widget.Button")
	List<WebElement> menuButton;
	
	
	@FindBy(className = "android.view.View")
	List<WebElement> testList;
	
	
	
	public PageObject_OnprepTakeTest(AppiumDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	public void getTestListSize(){
		int testList_size = testList.size();
		System.out.println("test list size= "+testList_size);
	}
	
	public void getButtonSize(){
		int button_size = menuButton.size();
		System.out.println("buttonsize = "+button_size);
	}
	
	public void clickTest(){
		testList.get(4).click();
	}

	public void dragElements(AppiumDriver driver){
		new TouchAction((MobileDriver) driver).longPress(testList.get(1)).moveTo(testList.get(5)).release().perform();
		System.out.println("drag done");
		
	}
}
