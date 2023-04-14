package Features;

import org.openqa.selenium.WebDriver;

import Base.BasicFunctions;
import Pages.SchedulePage;

public class SchedulePageFeatures {

	private WebDriver driver=null;
	private SchedulePage scpage;
	
	public void PerformSearch() throws InterruptedException {
		scpage.getLocationDropdown().click();
		Thread.sleep(1000);
		scpage.getPortLandLocation().click();
		Thread.sleep(1000);
		scpage.getServiceDropdown().click();
		Thread.sleep(1000);
		scpage.getIllnessInjuryService().click();
		Thread.sleep(1000);
		scpage.getDateDropdown().click();
		Thread.sleep(1000);
		scpage.getDayAfterTommorrowDate().click();
		Thread.sleep(1000 );
	}
	
	public SchedulePageFeatures() {
		
		driver=BasicFunctions.driver;
		scpage=new SchedulePage(driver);
		// TODO Auto-generated constructor stub
		
	}
	
	public SchedulePage returnSchedulePage() {
		return scpage;
	}
}