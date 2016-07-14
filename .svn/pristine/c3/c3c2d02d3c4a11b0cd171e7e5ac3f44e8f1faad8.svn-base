package PageObject_Component;

import io.appium.java_client.AppiumDriver;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject_Reports {

	@FindBy(id="com.teamsuccesso.edusuccesso:id/toolbar")
	WebElement toolbarheader;
	
	@FindBy(className="android.widget.ImageButton")
	WebElement menubutton;
	
	@FindBy(id="android:id/text1")
	List<WebElement> menulist;
	
	@FindBy(id="com.teamsuccesso.edusuccesso:id/labelReport")
	WebElement reportheading;
	
	@FindBy(id="com.teamsuccesso.edusuccesso:id/mathsLabel")
	WebElement reportmathsheading;
	
	@FindBy(id="com.teamsuccesso.edusuccesso:id/physicsLabel")
	WebElement reportPhysicsheading;
	
	@FindBy(id="com.teamsuccesso.edusuccesso:id/labelPhysicsChapter1")
	WebElement chapterMathsReport;
	
	@FindBy(id="com.teamsuccesso.edusuccesso:id/labelPhysicsChapter1PeopleNo")
	WebElement studentsMathsReport;
	
	public PageObject_Reports(AppiumDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void displayWindow(){
		toolbarheader.isDisplayed();
	}
	
	public void clickMenuButton(){
		menubutton.click();
	}
	
	public int getMenuListSize(){
		return menulist.size();
	}
	
	public void clickReport(){
		menulist.get(0).click();
	}
	
	public void displayReportHeading(){
		reportheading.isDisplayed();
	}
	
	public void displaymathsReport(){
		reportmathsheading.isDisplayed();
	}
	
	public void displayphysicsReport(){
		reportPhysicsheading.isDisplayed();
	}
	
	public void clickMathsReport(){
		reportmathsheading.click();
	}
	
	public void displayChapterMathsReport(){
		chapterMathsReport.isDisplayed();
	}
	
	public void displayStudentMathsReport(){
		studentsMathsReport.isDisplayed();
	}
	
	public String getChapterName(){
		return chapterMathsReport.getText();
	}
	
	public String getNumofStudents(){
		return studentsMathsReport.getText();
	}
	
}
