package PageObject_Component;

import io.appium.java_client.AppiumDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject_OnprepLogin {
	WebDriverWait wait;
	
	@FindBy(className = "android.widget.EditText")
	List<WebElement> textbox;
	
	@FindBy(className = "android.widget.Button")
	List<WebElement> buttons;
	
	@FindBy(id ="login-email")
	WebElement emailtxtbox;
	
	@FindBy(id ="login-password")
	WebElement passwdtxtbox;
	
	@FindBy(id ="com.ionicframework.testbudhaapp841309/login-btn")
	WebElement loginbtn;
	
	@FindBy(id="_label-0")
	WebElement emailLabel;
	
	@FindBy(className = "android.widget.Image")
	WebElement imageElement;
	
	@FindBy(className="android.view.View")
	List<WebElement> viewElement;
	
	@FindBy(id = "com.ionicframework.testbudhaapp841309/fb-login-btn")
	WebElement fblogin;
	
	@FindBy(id="name")
	WebElement name;
	
	public PageObject_OnprepLogin(AppiumDriver driver) {
	PageFactory.initElements(driver, this);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit
			.SECONDS);
	 wait = new WebDriverWait(driver, 10);
	}
	
	public void getTextboxSize(){
		int textboxSize = textbox.size();
		System.out.println("TextBox size = "+textboxSize);
		System.out.println("emailID:"+textbox.get(0));
	}
	
	public void enterEmail(String username) throws InterruptedException{
		viewElement.get(4).click();
		viewElement.get(4).sendKeys(username);
	}
	
	public void enterPassword(String password){
		viewElement.get(5).click();
		viewElement.get(5).sendKeys(password);
	}
	
	public void getButtonSize(){
		System.out.println("Buttons = "+buttons.size());
	}
	
	public void clickLogin(AppiumDriver driver){
		viewElement.get(23).click();
		driver.navigate().back();
	}
	
	
	public void clickEmail(){
		emailtxtbox.click();
	}
	
	public void clickPassword(){
		passwdtxtbox.click();
	}
	
	public void clickemailLabel(){
		emailLabel.click();
	}
	
	public void clickImageElement(){
		imageElement.click();
	}
	
	public void viewElement(){
		for(int i=1;i<viewElement.size();i++)
		{
			System.out.println("view Elements : "+viewElement.get(i).getText());
		}
	}
	
	
	public String displayName(){
		System.out.println("Hi name : "+name.getText());
		return name.getText();
	}
	
	
	public void clickFBLogin(){
		fblogin.click();
	}
	
}
