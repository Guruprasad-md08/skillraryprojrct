package pomFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	@FindBy(id="add")
	private WebElement plusbtn;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addbtn;
	
	public AddToCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddbtn() {
		return plusbtn;
	}
	
	public void addtocart()
	{
		addbtn.click();
	}
}
