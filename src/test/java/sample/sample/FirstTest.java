package sample.sample;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BasicFunctions;
import Features.SchedulePageFeatures;

public class FirstTest {

	public static WebDriver driver=null;
	public static WebDriverWait wait=null;
	SchedulePageFeatures scpageFeate;
	@BeforeClass
	public void before() {
		
		BasicFunctions.openBrowser();
		driver=BasicFunctions.driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		scpageFeate=new SchedulePageFeatures();
		driver.get("https://www.zoomcare.com/schedule");
		scpageFeate.PerformSearch();
		
	}
	@AfterClass
	public void after() {
		
		driver.quit();
	}
	
	
	@Test
	public void first() {
		
		
	}
	
}
