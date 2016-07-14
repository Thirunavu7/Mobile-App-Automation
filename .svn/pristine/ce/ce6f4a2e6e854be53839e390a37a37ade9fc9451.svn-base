package Scenario_Component;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObject_Component.PageObject_AvailableCourses;

import com.mobile.testing.BaseClass_Server;

public class Scenario_Course extends BaseClass_Server{

	Logger log = Logger.getLogger(Scenario_Course.class);
	SoftAssert sassert = new SoftAssert();
	
	@Test
	public void testHomeScreenTitleInstalledCoursesandAvailableCourses() throws IOException, InterruptedException{
		String appTitle = "EduSuccesso";
		log.info("Executing TestCase testHomeScreenTitleInstalledCoursesandAvailableCourses : ");
		startAppiumServer();
		setDeviceCapabilities();
		PageObject_AvailableCourses availableco_POJ = new PageObject_AvailableCourses(driver);
		availableco_POJ.displayToolBar();
		String applicationTitle = availableco_POJ.getApplicationTitle();
		sassert.assertEquals(appTitle, applicationTitle);
		availableco_POJ.viewAvailableCourses();
		availableco_POJ.viewInstalledCourses();
		sassert.assertAll();
		log.info("test homescreen title and Courses are successfull ...");
		stopAppiumServer();
	}
}
