package genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StepGroup {
	public WebDriver driver;
	public PropertyFile pdata = new PropertyFile();
	public WebdriverUtilities  driverutilitiess= new WebdriverUtilities();
	
	@BeforeMethod
	public void OpenApp() throws IOException {
		WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(pdata.getPropertyData("url"));
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
	}
	
	
	@AfterMethod
	public void CloseApp(ITestResult res) throws IOException
	{
		int status=res.getStatus();
		
		//status=1>>>>>pass
		//status=2>>>>>fail
		
		String name=res.getName();
		if(status==2)
		{
		Screenshot s=new  Screenshot();
		s.getscreenshot(driver, name);
		
		}	
		driver.quit();
	}
	
	
	
}
