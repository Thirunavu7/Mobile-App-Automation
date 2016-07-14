package PageObject_Component;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;

public class PageObject_TimeSheet {
	
	@FindBy(id="com.teamsuccesso.edusuccesso:id/toolbar")
	WebElement toolbarHeader;
	
	@FindBy(className = "android.widget.ImageButton")
	WebElement menuButton;
	
	@FindBy(id="android:id/text1")
	List<WebElement> menuList;
	
	@FindBy(id="com.teamsuccesso.edusuccesso:id/labelTimesheet")
	WebElement timesheetheading;
	
	@FindBy(id="com.teamsuccesso.edusuccesso:id/physicsTime")
	WebElement physicsTimeHeading;
	
	@FindBy(id="com.teamsuccesso.edusuccesso:id/mathsTime")
	WebElement mathsTimeHeading;
	
	public PageObject_TimeSheet(AppiumDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void displayHeader(){
		toolbarHeader.isDisplayed();
	}
	
	public void clickMenuIcon(){
		menuButton.click();
	}
	
	public int getMenuListSize(){
		return menuList.size();
	}
	
	public void clickTimesheet(){
		menuList.get(1).click();
	}
	
	public void displayTimesheetHeading(){
		timesheetheading.isDisplayed();
	}
	
	public String getTimesheetHeading(){
		return timesheetheading.getText();
	}
	
	public void displayPhysicsTime(){
		physicsTimeHeading.isDisplayed();
	}
	
	public void displayMathsTime(){
		mathsTimeHeading.isDisplayed();
	}
	
	
	
}
