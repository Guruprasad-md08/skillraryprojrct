package pomFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testing {
	@FindBy(id="Cucumber")
	private WebElement cucuber;
	
	@FindBy(xpath="(//img[@class='product'])[2]")
	private WebElement selenium;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement fb;

	public Testing(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getCucuber() {
		return cucuber;
	}

	public WebElement getSelenium() {
		return selenium;
	}

	public WebElement getFb() {
		return fb;
	}
	public void facebook()
	{
		fb.click();
	}
}
