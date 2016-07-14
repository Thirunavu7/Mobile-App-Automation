package Scenario_Component;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import PageObject_Component.PageObject_Reports;
import com.mobile.testing.BaseClass_Server;

public class Scenario_Report extends BaseClass_Server {
	
	Logger log = Logger.getLogger(Scenario_Report.class);
	SoftAssert sassert = new SoftAssert();
	int menuListSize = 3;
	String chapterNameexpected = "Chapter 1";
	String noofstudentsexpected = "302 students completed";
	
	@Test
	public void testReportsinEdusuccesso() throws IOException, InterruptedException{
		
		log.info("Executing the testcase testReports :");
		startAppiumServer();
		setDeviceCapabilities();
		PageObject_Reports report_POJ = new PageObject_Reports(driver);
		report_POJ.displayWindow();
		report_POJ.clickMenuButton();
		sassert.assertEquals(menuListSize, report_POJ.getMenuListSize());
		report_POJ.clickReport();
		report_POJ.displayReportHeading();
		report_POJ.displaymathsReport();
		report_POJ.displayphysicsReport();
		report_POJ.clickMathsReport();
		/*report_POJ.displayChapterMathsReport();
		report_POJ.displayStudentMathsReport();
		log.info("ChapterName ="+report_POJ.getChapterName());
		log.info("No.of Students in Chapter ="+report_POJ.getNumofStudents());
		sassert.assertEquals(chapterNameexpected,report_POJ.getChapterName());
		sassert.assertEquals(noofstudentsexpected, report_POJ.getNumofStudents());*/
		sassert.assertAll();
		log.info("test report functionality successfull ...");
		stopAppiumServer();
	}

}
