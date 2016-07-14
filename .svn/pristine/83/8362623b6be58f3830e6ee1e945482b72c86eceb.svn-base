package PageObject_Component;

import io.appium.java_client.AppiumDriver;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject_AvailableCourses {

	@FindBy(className="android.support.v7.app.ActionBar$Tab")
	List<WebElement> alltabs;
	
	
	@FindBy(id="com.teamsuccesso.edusuccesso:id/gameName")
	List<WebElement> availablegames;
	
	
	@FindBy(id="com.teamsuccesso.edusuccesso:id/firstText")
	WebElement nocoursetext;
	
	@FindBy(id="com.teamsuccesso.edusuccesso:id/toolbar")
	WebElement toolbarwindow;
	
	@FindBy(className="android.widget.TextView")
	List<WebElement> applicationTitle;
	
	
	public PageObject_AvailableCourses(AppiumDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickAvailableCourse()
	{
		alltabs.get(1).click();
	}
	
	public void displayAllAvailableCourses(){
		for (int i = 0; i < availablegames.size(); i++) {
			availablegames.get(i).isDisplayed();	
		}
	}
	
	public void clickInstalledCourses(){
		alltabs.get(0).click();
	}
	
	public void displayInstalledCourses(){
		nocoursetext.isDisplayed();
	}
	
	public void viewAvailableCourses(){
		clickAvailableCourse();
		displayAllAvailableCourses();
	}
	
	public void viewInstalledCourses(){
		clickInstalledCourses();
		displayInstalledCourses();
	}
	
	public void displayToolBar(){
		toolbarwindow.isDisplayed();
	}
	
	public String getApplicationTitle(){
		return applicationTitle.get(0).getText();
	}
	
}
