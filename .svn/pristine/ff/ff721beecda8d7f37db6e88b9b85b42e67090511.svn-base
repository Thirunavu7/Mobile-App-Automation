package com.mobile.testing;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;

import Generic_Component.ExcelReadWrite;

public class ExcelWriter {

	public static void main(String[] args) throws IOException {
	
		ExcelReadWrite xl =  new ExcelReadWrite("E:\\poi-test22.xls");
		HSSFSheet sheet1  = xl.Setsheet("book1");
		int rowcount = xl.getrowcount(sheet1);
		System.out.println(rowcount+"RC");
		
		for(int xlrow=1;xlrow<5;xlrow++){
			//String readvalue = xl.Readvalue(sheet1, xlrow, "A");
			/*System.out.println("ReadValue="+readvalue);
			xl.writecell(sheet1, xlrow, "A", "Hi");
			xl.save_excel("E:\\poi-test22.xls");
			*/
			String[] arr_search= new String[1];
			arr_search[0]=xl.Readvalue(sheet1, xlrow, "A");
			System.out.println(arr_search[0]);
			if(arr_search[0].equals("Hic")){
				System.out.println("In and IF"+arr_search[0]);
				xl.writecell(sheet1, xlrow, "B", "PASS");
				xl.save_excel("E:\\poi-test22.xls");
			}
			else{
				System.out.println("In and Else"+arr_search[0]);
				xl.writecell(sheet1, xlrow, "B", "FAIL");
				xl.save_excel("E:\\poi-test22.xls");
			}
		}
	}

}
