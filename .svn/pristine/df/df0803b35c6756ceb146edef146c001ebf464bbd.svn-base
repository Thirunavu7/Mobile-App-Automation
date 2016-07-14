package PageObject_Component;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class PageObject_OnprepRegister {
	
	@FindBy(className="android.view.View")
	List<WebElement> viewElement;

	public PageObject_OnprepRegister(AppiumDriver driver){
		PageFactory.initElements(driver,this);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	public void clickRegister(){
		System.out.println("size : "+viewElement.size());
		//viewElement.get(23).click();
	}
}
