package com.mobile.testing;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EdusuccessoGamerApp extends BaseClass_Server{
	
	Logger log = Logger.getLogger(EdusuccessoGamerApp.class);
	SoftAssert sassert;
	
	@BeforeMethod
	public void setup(){
		sassert =  new SoftAssert();	
	}

	@BeforeTest
	public void start_server() throws IOException, InterruptedException {
		log.info("Started Executing DesiredCapabilities");
		setDeviceCapabilities();
	}
	
	public void halt() throws InterruptedException{
		Thread.sleep(1000);
	}

	@Test(priority = 1)
	public void testEdusuccessoHomeScreen() {
		WebElement toolbar = driver.findElement(By
				.id("com.teamsuccesso.edusuccesso:id/toolbar"));
		sassert.assertEquals(true, toolbar.isDisplayed());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		sassert.assertAll();
		log.info("testHomeScreen PASS");
	}

	@Test(priority = 2)
	public void testEdusuccessoTitle() throws InterruptedException{
		String appTitle = "EduSuccesso";
		List<WebElement> textViewList = driver.findElementsByClassName("android.widget.TextView");
		sassert.assertEquals(appTitle, textViewList.get(0).getText());
		swipeLeft();
		halt();
		swipeRight();
		sassert.assertAll();
		log.info("testTitle PASS");
	}

	@Test(priority = 3)
	public void testViewInstalledCourses() throws InterruptedException {
		halt();
		WebElement courseName = driver.findElement(By
				.id("com.teamsuccesso.edusuccesso:id/className"));
		sassert.assertEquals(true, courseName.isDisplayed());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement coursePercent = driver.findElement(By
				.id("com.teamsuccesso.edusuccesso:id/completed"));
		sassert.assertEquals(true, coursePercent.isDisplayed());
		sassert.assertAll();
		log.info("testInstalledCourses PASS");
	}

	@Test(priority = 4)
	public void testViewAvailableCourses() {
		List<WebElement> availableTabs = actionBar();
		availableTabs.get(1).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		verifyBuyCourseisPresent();
		sassert.assertAll();
		log.info("testAvailableCourses PASS");
	}
	
	@Test(priority = 5)
	public void testViewAvailableCoursesBySwiping(){
		WebElement toolbar = driver.findElement(By
				.id("com.teamsuccesso.edusuccesso:id/toolbar"));
		sassert.assertEquals(true, toolbar.isDisplayed());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Dimension win_size = driver.manage().window().getSize();
		int startx = (int)(win_size.width* 0.8);
		int endx = (int)(win_size.width * 0.2);
		int starty = (int)(win_size.height/2);
		driver.swipe(startx, starty, endx, starty, 1000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		verifyBuyCourseisPresent();
		sassert.assertAll();
		log.info("testAvailableCoursesBySwiping PASS");
	}
	
	@Test(priority = 6)
	public void testViewTimeSheet() {
		clickmenuIcon();
		List<WebElement> menuElements = driver.findElements(By
				.id("android:id/text1"));
		menuElements.get(1).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement timeSheet = driver
				.findElementById("com.teamsuccesso.edusuccesso:id/labelTimesheet");
		sassert.assertEquals(true, timeSheet.isDisplayed());
		WebElement physicsTime = driver.findElementById("com.teamsuccesso.edusuccesso:id/physicsTime");
		sassert.assertEquals(true, physicsTime.isDisplayed());
		WebElement mathsTime = driver.findElementById("com.teamsuccesso.edusuccesso:id/mathsTime");
		sassert.assertEquals(true, mathsTime.isDisplayed());
		clickBack();
		swipeLeft();
		sassert.assertAll();
		log.info("testViewTimeSheet FAIL");
	}


	@Test(priority = 7)
	public void testviewGamesinCourseandAskQuestion(){
		List<WebElement> availableTabs = actionBar();
		availableTabs.get(0).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> courselist = driver.findElementsByClassName("android.widget.RelativeLayout");
		courselist.get(0).click();
		WebElement gameName = driver.findElementById("com.teamsuccesso.edusuccesso:id/gameName");
		sassert.assertEquals(true, gameName.isDisplayed());
		WebElement questionElement = driver.findElementById("com.teamsuccesso.edusuccesso:id/fab");
		questionElement.isDisplayed();
		sassert.assertEquals(true, questionElement.isDisplayed());
		questionElement.click();
		WebElement askQuestion = driver.findElementById("com.teamsuccesso.edusuccesso:id/chat_text");
		sassert.assertEquals(true, askQuestion.isDisplayed());
		askQuestion.sendKeys("Hey ! Could you please explain more about this game");
		WebElement clickSend = driver.findElementById("com.teamsuccesso.edusuccesso:id/button_send");
		clickSend.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElementById("com.teamsuccesso.edusuccesso:id/chat_bubble").isDisplayed();
		askQuestion.sendKeys("Hey ! How many levels are there in Cartesian Co-ordinates ?");
		clickSend.click();
		driver.hideKeyboard();
		sassert.assertEquals(true, askQuestion.isDisplayed());
		for(int i=1;i<=2;i++)
		clickBack();
		sassert.assertAll();
		log.info("testViewGamesinCourse&AskQuestion PASS");
	}
	
	
	@Test(priority = 8)
	public void testViewReports() {
		WebElement toolbar = driver.findElement(By
				.id("com.teamsuccesso.edusuccesso:id/toolbar"));
		sassert.assertEquals(true, toolbar.isDisplayed());
		clickmenuIcon();
		List<WebElement> menuElements = driver.findElements(By
				.id("android:id/text1"));
		sassert.assertEquals(3, menuElements.size());
		
		menuElements.get(0).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement reportName = driver
				.findElementById("com.teamsuccesso.edusuccesso:id/labelReport");
		sassert.assertEquals(true, reportName.isDisplayed());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement mathsreport = driver
				.findElementById("com.teamsuccesso.edusuccesso:id/mathsLabel");
		sassert.assertEquals(true, mathsreport.isDisplayed());
		mathsreport.click();
		WebElement mathsdetreport = driver
				.findElementById("com.teamsuccesso.edusuccesso:id/labelPhysicsChapter1PeopleNo");
		sassert.assertEquals(true,mathsdetreport.isDisplayed());
		clickBack();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		clickBack();
		swipeLeft();
		sassert.assertAll();
		log.info("testViewReports PASS");
	}
	
	
	private void verifyBuyCourseisPresent() {
		List<WebElement> buyCourse = driver.findElements(By
				.id("com.teamsuccesso.edusuccesso:id/gameName"));
		for(int i=0;i<buyCourse.size();i++)
		{
			sassert.assertEquals(true, buyCourse.get(i).isDisplayed());
		}
	}
	
	private List<WebElement> actionBar() {
		List<WebElement> availableTabs = driver
				.findElementsByClassName("android.support.v7.app.ActionBar$Tab");
		return availableTabs;
	}
	
	private void clickmenuIcon() {
		WebElement menuButton = driver
				.findElementByClassName("android.widget.ImageButton");
		menuButton.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	private void clickBack() {
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	private void swipeLeft() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Dimension win_size = driver.manage().window().getSize();
		int startx = (int)(win_size.width* 0.8);
		int endx = (int)(win_size.width * 0.2);
		int starty = (int)(win_size.height/2);
		driver.swipe(startx, starty, endx, starty, 1000);		
	}
	
	private void swipeRight(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Dimension windowSize = driver.manage().window().getSize();
		int startx = (int)(windowSize.width*0.8);
		int endx = (int)(windowSize.width*0.2);
		int starty = (int)(windowSize.height/2);
		driver.swipe(endx, starty, startx, starty, 1000);
	}

	@AfterTest
	public void afterMethod() {
		driver.quit();
	}

}
