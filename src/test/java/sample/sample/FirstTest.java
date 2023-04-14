package sample.sample;

import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.BasicFunctions;
import Features.SchedulePageFeatures;
import Pages.SchedulePage;

public class FirstTest {

	public static WebDriver driver = null;
	public static WebDriverWait wait = null;
	SchedulePageFeatures scpageFeate;

	@BeforeClass
	public void before() throws InterruptedException {

		BasicFunctions.openBrowser();
		driver = BasicFunctions.driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		scpageFeate = new SchedulePageFeatures();
		driver.get("https://www.zoomcare.com/schedule");
		Thread.sleep(8000);
		scpageFeate.PerformSearch();

	}

	@AfterClass
	public void after() {

		 driver.quit();
	}

	/*
	 * 
	 * 
	 * 
	 * */
	
	
	@Test
	public void first() throws InterruptedException {

		SchedulePage scpage = scpageFeate.returnSchedulePage();
		scpage.getViewClinicalServicesButton().get(0).click();
		Thread.sleep(1000);
		boolean flag = scpage.getIllnessInjuryServiceProvided().isDisplayed();
		Assert.assertTrue(flag, "Service filter not working fine");
	}

	@Test
	public void second() throws InterruptedException {

		SchedulePage scpage = scpageFeate.returnSchedulePage();
		String address = scpage.getClinicAddress1().getText() + "" + scpage.getClinicAddress2().getText();
		scpage.getOpenMapIcon().click();
		Thread.sleep(1000);
		String currentWindowHandle = driver.getWindowHandle();
		Set<String> windowHanldes = driver.getWindowHandles();
		for (String handle : windowHanldes) {
			if (!handle.equals(currentWindowHandle)) {
				driver.switchTo().window(handle);
			}
		}
		Thread.sleep(2000);
		String gmapLocationAddress = scpage.getLocationTextBoxGmap().getAttribute("aria-label");
		String all[] = gmapLocationAddress.split(",");
		boolean flag = true;
		for (int i = 1; i < all.length - 1; i++) {
			System.out.println(all[i] + "   in " + address);
			if (!address.contains(all[i].trim())) {
				System.out.println("in for " + i);
				flag = false;
			}
		}
		System.out.println(gmapLocationAddress + "-----------" + address);
		Assert.assertTrue(flag);
	}

	@Test
	public void third() throws InterruptedException {
		SchedulePage scpage = scpageFeate.returnSchedulePage();
		scpage.getClinicCareButton().click();
		Thread.sleep(1000);
		Assert.assertTrue(scpage.getViewClinicalServicesButton().size()!=0,"We are not on clinic care page");
		Assert.assertTrue(scpage.getVideoIcon().size()==0,"We are not on clinic care page");
		scpage.getVideoCareButton().click();
		Thread.sleep(1000);
		Assert.assertTrue(scpage.getVideoIcon().size()!=0,"We are not on video care page");	
	}

}