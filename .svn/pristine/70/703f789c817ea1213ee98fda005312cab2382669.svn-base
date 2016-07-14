package DataProvider_Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.testng.annotations.DataProvider;

import Generic_Component.ExcelReadWrite;

public class DataProvider_OnprepLogin {
	
	@DataProvider(name="dp_validLogin")
	public static Iterator<String[]> getValidSearchData() throws IOException{
		List<String[]> excelReadWriteFunc = ExcelReadWriteFunc("valid_login");
		return excelReadWriteFunc.iterator();
	}

	@DataProvider(name="dp_invalidLogin")
	public static Iterator<String[]> getInvalidSearchData() throws IOException{
		List<String[]> excelReadWriteFunc = ExcelReadWriteFunc("invalid_login");
		return excelReadWriteFunc.iterator();
	}
	
	private static List<String[]> ExcelReadWriteFunc(String script) throws IOException {
		//path for an excel sheet
		ExcelReadWrite xls = new ExcelReadWrite("E:\\OnprepData1.xls");
		//set the sheet with xls sheet name
		HSSFSheet scenario_login = xls.Setsheet("Scenario_Login");
		//Get the rowCount for your Excel
		int rowcount = xls.getrowcount(scenario_login);
		System.out.println("Row Count of your Excel Sheet ="+rowcount);
		//Create a string array in a List dataType
		List<String[]> list_loginData = new ArrayList<String[]>();
		for (int xlRow = 1; xlRow < rowcount; xlRow++) 
		{
			String ExecuteFlag = xls.Readvalue(scenario_login, rowcount, "Execute_Flag");
			xls.Readvalue(scenario_login, rowcount, "Result_Status");
			if(ExecuteFlag.equals("Y"))
				{
				String[] arraylist = new String[2];
				arraylist[0]= xls.Readvalue(scenario_login, rowcount, "UserName");
				System.out.println("Array List [0] :"+arraylist[0]);
				arraylist[1]= xls.Readvalue(scenario_login, rowcount, "Password");
				System.out.println("Array List [1] :"+arraylist[1]);
				boolean list_login = list_loginData.add(arraylist);
				System.out.println("List:"+list_login);
				xls.writecell(scenario_login, rowcount, "Result_Status", "Test pass");
				xls.save_excel("E:\\OnprepData1.xls");
				}
		}
		return list_loginData;
	}


}
