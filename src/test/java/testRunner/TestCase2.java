package testRunner;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomFeatures.SkillraryLogin;
import pomFeatures.Testing;
import pomFeatures.demoapplogin;

public class TestCase2 extends StepGroup{
	
	@Test
	public void TC2() throws IOException, InterruptedException
	{
		SkillraryLogin skl=new SkillraryLogin(driver );
		skl.gears();
		skl.dempapp();
		demoapplogin demo=new demoapplogin(driver);
		driverutilitiess.switchtotab(driver);
		Thread.sleep(2000);
		driverutilitiess.dropdown(demo.getCoursedd(), pdata.getPropertyData("courseddtext"));
		
		Testing test =new Testing(driver);
		driverutilitiess.draganddrop(driver, test.getCucuber(), test.getSelenium());
		Point p = test.getFb().getLocation();
		int x=p.getX();
		int y=p.getY();
		driverutilitiess.scrollbar(driver, x, y);
		test.facebook();
	}
	

}
