package Features;

import org.openqa.selenium.WebDriver;

import Base.BasicFunctions;
import Pages.SchedulePage;

public class SchedulePageFeatures {

	private WebDriver driver=null;
	private SchedulePage scpage;
	
	public void PerformSearch() {
		scpage.getLocationDropdown().click();
		scpage.getLo
	}
	
	public SchedulePageFeatures() {
		
		driver=BasicFunctions.driver;
		scpage=new SchedulePage(driver);
		// TODO Auto-generated constructor stub
		
	}
}
