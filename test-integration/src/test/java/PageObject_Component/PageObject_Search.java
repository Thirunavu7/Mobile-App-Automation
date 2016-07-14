package PageObject_Component;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
public class PageObject_Search {
	@FindBy(id="srchword")
	WebElement search_txtbox;
	
	@FindBy(css="input[type='submit'][class='srchbtn_n']")
	WebElement search_btn;
	
	@FindBy(css="body > div > div:nth-child(8) > form > div > p.sorrymsg")
	WebElement Invalid_msg;
	
	@FindBy(xpath="/html/body/div/div[2]/span[2]")
	WebElement Valid_msg;
	
	//constructor to initaite
	public PageObject_Search(AppiumDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void Enter_search(String Value)
	{
		search_txtbox.sendKeys(Value);
	}
	
	public void Click_search()
	{
		search_btn.click();
	}
	
	public String getinvalidmsg()
	{
		return Invalid_msg.getText();
	}
	
	public String getValidmsg()
	{
		return Valid_msg.getText();
		
	}
	
	public void CommonprocessSearch(String Search_Item)
	{
		Enter_search(Search_Item);
		Click_search();
	}

}
