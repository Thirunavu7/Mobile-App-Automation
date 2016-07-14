package Scenario_Component;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObject_Component.PageObject_TimeSheet;

import com.mobile.testing.BaseClass_Server;

public class Scenario_TimeSheet extends BaseClass_Server{

	Logger log = Logger.getLogger(Scenario_TimeSheet.class);
	SoftAssert sassert = new SoftAssert();
	
	@Test
	public void testTimeSheet() throws IOException, InterruptedException{
		int menuListSize = 3;
		String timesheetHeadingexpected ="timesheetforthepastweek";
		log.info("Executing the TestCase TimeSheet");
		startAppiumServer();
		setDeviceCapabilities();
		PageObject_TimeSheet timesheet_POJ = new PageObject_TimeSheet(driver);
		timesheet_POJ.displayHeader();
		timesheet_POJ.clickMenuIcon();
		sassert.assertEquals(menuListSize, timesheet_POJ.getMenuListSize());
		timesheet_POJ.clickTimesheet();
		timesheet_POJ.displayTimesheetHeading();
		String timesheetHeading = timesheet_POJ.getTimesheetHeading();
		timesheetHeading = timesheetHeading.replace(" ", "");
		timesheetHeading = timesheetHeading.toLowerCase();
		sassert.assertEquals(timesheetHeading, timesheetHeadingexpected);
		timesheet_POJ.displayMathsTime();
		timesheet_POJ.displayPhysicsTime();
		sassert.assertAll();
		stopAppiumServer();
	}
	
}
