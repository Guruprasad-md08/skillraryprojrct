package pomFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaPage {
	
	@FindBy(linkText = "X")
	private WebElement close;
	/*
	@FindBy(xpath="//button[contains(@class,'PlayButton_module_playButton__1a9572b1 ')]")
	private WebElement play;
	
	@FindBy(xpath="//span[text()='Pause']")
	private WebElement pause;
	*/
	@FindBy(xpath="//button[@aria-label='Play']")
	private WebElement play;
	
	@FindBy(xpath="//button[@aria-label='Pause']")
	private WebElement pause;
	public CoreJavaPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void closebtn()
	{
		close.click();
	}
	
	public void play()
	{
		play.click();
	}
	public void pause()
	{
		pause.click();
	}
	
}
