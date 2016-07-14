package Scenario_Component;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_Component.Base_Class;
import PageObject_Component.PageObject_Search;


public class Scenario_Search extends Base_Class{
	static Logger log= Logger.getLogger(Scenario_Search.class);
	SoftAssert sAssert = new SoftAssert();
	
	@Test(dataProvider="dp_InvalidSearch",dataProviderClass=DataProvider_Component.DataProvider_Search.class,groups={"smoke"})
	public void testInvalidSearch(String TC_ID,String Order, String Search_Item, String Exp_Res) throws InterruptedException, IOException
	{
		log.info("Executing the Testcase  " + TC_ID +"and the order is  " +Order);
		Start_appium_serv();
		initBrowser();
		PageObject_Search BS_pob= new PageObject_Search(driver);
		BS_pob.CommonprocessSearch(Search_Item);
		String Actual_Result = BS_pob.getinvalidmsg();
		if(Actual_Result.equals(Exp_Res))
		{
			log.info("Passed as Expected and Actual msg was same");
		}
		else
		{
			log.info("Failed as Expected was  " +Exp_Res+ "  Actual msg was   "+Actual_Result );
			sAssert.fail("Failed as Expected was  " +Exp_Res+ "  Actual msg was   "+Actual_Result);
		}
		sAssert.assertAll();
		stop_appium_serv();
		
	}
	
	@Test(dataProvider="dp_ValidSearch",dataProviderClass=DataProvider_Component.DataProvider_Search.class)
	public void testvalidSearch(String TC_ID,String Order, String Search_Item, String Exp_Res) throws InterruptedException, IOException
	{
		log.info("Executing the Testcase  " + TC_ID +"and the order is  " +Order);
		initBrowser();
		PageObject_Search BS_pob= new PageObject_Search(driver);
		BS_pob.CommonprocessSearch(Search_Item);
		String Actual_Result = BS_pob.getValidmsg();
		if(Actual_Result.equals(Exp_Res))
		{
			log.info("Passed as Expected and Actual msg was same");
		}
		else
		{
			log.info("Failed as Expected was  " +Exp_Res+ "  Actual msg was   "+Actual_Result );
			sAssert.fail("Failed as Expected was  " +Exp_Res+ "  Actual msg was   "+Actual_Result);
		}
		
		
		sAssert.assertAll();
		
	}
	
	


}
