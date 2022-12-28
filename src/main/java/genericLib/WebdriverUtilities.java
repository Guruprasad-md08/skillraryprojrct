package genericLib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtilities {
	
	public void dropdown(WebElement ele, String text)
	{
		Select sel = new Select(ele);
		sel.selectByVisibleText(text);
	}
	
	public void mousehover(WebDriver driver, WebElement ele)
	{
		Actions action=new Actions(driver);
		action.moveToElement(ele).perform();
	}
	public void doubleclick(WebDriver driver, WebElement ele)
	{
		Actions action=new Actions(driver);
		action.doubleClick(ele).perform();
	}
	public void rightclick(WebDriver driver, WebElement ele)
	{
		Actions action=new Actions(driver);
		action.contextClick(ele).perform();
	}
	public void draganddrop(WebDriver driver, WebElement src,WebElement dest)
	{
		Actions action=new Actions(driver);
		action.dragAndDrop(src, dest).perform();
	}
	public void alertpopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void Switchtoframe(WebDriver driver)
	{
		driver.switchTo().frame(0);
	}
	public void SwitchBacktoframe(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	public void scrollbar(WebDriver driver, int x , int y)
	{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy("+x+","+y+")");
		
	}
	public void switchtotab(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for(String b :child) {
			driver.switchTo().window(b);
		}
			
	}
}
