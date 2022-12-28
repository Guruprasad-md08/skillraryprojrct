package pomFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLogin {
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath="( //a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoapp;
	
	@FindBy(name="q")
	private WebElement searchtb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement search;
	
	
	public SkillraryLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void gears()
	{
		gearsbtn.click();
	}

	public void dempapp()
	{
		demoapp.click();
	}
	
	public void searchbox(String text)
	{
		searchtb.sendKeys(text);
		
	}
	
	public void searchbtn()
	{
		search.click();
		
	}
}
