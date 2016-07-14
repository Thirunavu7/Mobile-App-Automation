package com.mobile.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SchoolTest {
	
	
	WebDriver driver;
  @BeforeTest
  public void setUp() {
	  driver = new FirefoxDriver();
	 
  }
  
  @Test
  public void test1(){
	  driver.get("http://cbseaff.nic.in/cbse_aff/schdir_Report/userview.aspx");
	  System.out.println("test");
  }
  
  
  @AfterTest
  public void tearDown(){
	  driver.quit();
  }
}
