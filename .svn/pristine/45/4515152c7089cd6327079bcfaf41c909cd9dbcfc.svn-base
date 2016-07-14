package com.mobile.testing;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProiverForEdusuccesso {
	static Logger log = Logger.getLogger(DataProiverForEdusuccesso.class);
	
	@Test(dataProvider = "getinfo")
	public static void SetData(String a, String b){
		log.info("Executing Logger");
		System.out.println("1="+a);
		System.out.println("2="+b);
	}

	@Test(dataProvider = "getuserInfo")
	public void setData(String userName, String userPassword){
		log.info("Executing the logger User Info");
		System.out.println("Hi "+userName);
		System.out.println("Your password is"+userPassword);
	}
	
	
	@DataProvider(name="getinfo")
	public Object[][] getData(){
		
		Object[][] data = new Object[2][2];
		
		data[0][0] = "InstalledCourse";
		data[0][1] = "CartesianCoordinates";
		
		
		data[1][0] = "Available course";
		data[1][1] = "Mathematics";
				
			
		return data;
	}
	
	
	@DataProvider(name = "getDataAdd")
	public Object[][] getDataAdd(){
		
		Object[][] dataAdd = new Object[2][2];
		dataAdd[0][0] = 22;
		dataAdd[0][1] =21;
		dataAdd[1][0] = 2;
		dataAdd[1][1] = 4;
		return dataAdd;
	}
	
	@DataProvider(name="getuserInfo")
	public Object[][] getuserInfo(){
		Object[][] dataUser = new Object[2][2];
		dataUser[0][0] = "Thiru";
		dataUser[0][1] = "Thiru123";
		
		return null;
		
	}
	
	
	
	/*@Test(dataProvider="getDataAdd",dataProviderClass=com.mobile.testing.DataProiverForEdusuccesso.class)
	public void testEduAdd(int a, int b){
		int expres = 43;
		Calc c = new Calc();
		int actualres = c.add(a, b);
		System.out.println("acttt"+actualres);
		sassert.assertEquals(actualres, expres);
	}*/
	


}
