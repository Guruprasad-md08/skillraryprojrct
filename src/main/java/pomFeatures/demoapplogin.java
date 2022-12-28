package pomFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demoapplogin {
	@FindBy(id="course")
	private WebElement course;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtrainingbtn;
	
	public demoapplogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="addresstype")
	private WebElement coursedd;
	

	public WebElement getCoursedd() {
		return coursedd;
	}
	public WebElement getCourse() {
		return course;
			
	}
	public void seleniumtraining()
	{
		seleniumtrainingbtn.click();
	}
}
