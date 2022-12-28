package testRunner;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.StepGroup;
import pomFeatures.CoreJavaPage;
import pomFeatures.SkillraryLogin;
import pomFeatures.searchresultpage;

public class TestCase3 extends StepGroup {

	@Test
	public void TC3() throws IOException, InterruptedException
	{
		SkillraryLogin skl=new SkillraryLogin(driver );
		skl.searchbox(pdata.getPropertyData("searchtext"));
		skl.searchbtn();
		searchresultpage res=new searchresultpage(driver);
		res.corejavalink();
		CoreJavaPage java = new CoreJavaPage(driver);
		java.closebtn();
		driverutilitiess.Switchtoframe(driver);
		java.play();
		java.pause();
		
		
	}
}
