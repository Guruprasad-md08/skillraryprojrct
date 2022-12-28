package testRunner;



import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomFeatures.AddToCart;
import pomFeatures.SkillraryLogin;
import pomFeatures.demoapplogin;

public class Runner extends StepGroup{
	//public WebDriver driver ;
	
	@Test
	public void Test1() throws InterruptedException
	{
		SkillraryLogin skl=new SkillraryLogin(driver );
		skl.gears();
		skl.dempapp();
		Thread.sleep(5000);
		demoapplogin demo=new demoapplogin(driver);
		driverutilitiess.switchtotab(driver);
		driverutilitiess.mousehover(driver, demo.getCourse());
		demo.seleniumtraining();
		AddToCart addcart = new AddToCart(driver);
		driverutilitiess.doubleclick(driver, addcart.getAddbtn());
		addcart.addtocart();
		driverutilitiess.alertpopup(driver);
	
	}
	

}
