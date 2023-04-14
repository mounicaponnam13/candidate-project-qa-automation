package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import lombok.Getter;
import lombok.Setter;

public class SchedulePage {

	
	
	
		
	@FindBy(how = How.XPATH,using="//div[text()='Portland, OR']")
	private WebElement portLandLocation;
	
	public WebElement getPortLandLocation() {
		return portLandLocation;
	}

	public WebElement getIllnessInjuryService() {
		return IllnessInjuryService;
	}
	
	public WebElement getFamilyMedicineService() {
		return familyMedicineService;
	}


	public WebElement getSearchButton() {
		return searchButton;
	}


	@FindBy(how = How.XPATH,using="//div[text()='Illness/Injury']")
	private WebElement IllnessInjuryService;
	
	@FindBy(how = How.XPATH,using="//div[text()='Family Medicine']")
	private WebElement familyMedicineService;
	
	
	@FindBy(how = How.XPATH,using="//div[text()='Search']")
	private WebElement searchButton;
	
	
	
	@FindBy(how = How.XPATH,using="//div[@data-testid='quickSelector.location.popover']/div")
	private WebElement locationDropdown;
	
	@FindBy(how = How.XPATH,using="//div[@data-testid='quickSelector.service.popover']/div")
	private WebElement serviceDropdown;
	
	@FindBy(how = How.XPATH,using="//div[@data-testid='quickSelector.date.popover']/div")
	private WebElement dateDropdown;
	@FindBy(how = How.XPATH,using="((//div[@data-testid='quickSelector.date.popover']/div)[2]//div[@tabindex and not(@aria-disabled)])[4]")
	private WebElement dayAfterTommorrowDate;
	
	
	@FindBy(how = How.XPATH,using="//div[@data-testid='clinic card header']/following-sibling::div/div[text()='Illness/Injury']")
	private WebElement IllnessInjuryServiceProvided;

	@FindBy(how = How.XPATH,using="//div[text()='View Clinic Services']")
	private List<WebElement> ViewClinicalServicesButton;
	
	
	@FindBy(how = How.XPATH,using="//i[@aria-label='Clinic distance from location']")
	private WebElement openMapIcon;
	
	@FindBy(how = How.XPATH,using="//div[@id='directions-searchbox-1']/div//input")
	private WebElement locationTextBoxGmap;
	
	@FindBy(how = How.XPATH,using="//button[@data-testid='virtualClinicBox']")
	private WebElement ClinicCareButton;
	
	@FindBy(how = How.XPATH,using="//button[@data-testid='virtualVideoBox']")
	private WebElement VideoCareButton;
	
	public WebElement getClinicCareButton() {
		return ClinicCareButton;
	}

	public WebElement getVideoCareButton() {
		return VideoCareButton;
	}

	


	@FindBy(how = How.XPATH,using="//div[@data-testid='video-icon']")
	private List<WebElement> videocIcon;
	
	
	public List<WebElement> getVideoIcon() {
		return videocIcon;
	}
	
	
	
	public WebElement getLocationTextBoxGmap() {
		return locationTextBoxGmap;
	}

	public WebElement getOpenMapIcon() {
		return openMapIcon;
	}

	public WebElement getClinicAddress1() {
		return ClinicAddress1;
	}

	public WebElement getClinicAddress2() {
		return ClinicAddress2;
	}

	public WebElement getGoogleMapPageLocationTextbox() {
		return GoogleMapPageLocationTextbox;
	}


	@FindBy(how = How.XPATH,using="//div[text()='View Clinic Services']/../preceding-sibling::div/div[1]/div[1]")
	private WebElement ClinicAddress1;
	@FindBy(how = How.XPATH,using="//div[text()='View Clinic Services']/../preceding-sibling::div/div[1]/div[2]")
	private WebElement ClinicAddress2;
	
	@FindBy(how = How.XPATH,using="//div[@id='directions-searchbox-1']/div//input")
	private WebElement GoogleMapPageLocationTextbox;
	
	public SchedulePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15),this);
	}

	public WebElement getLocationDropdown() {
		return locationDropdown;
	}

	public WebElement getIllnessInjuryServiceProvided() {
		return IllnessInjuryServiceProvided;
	}

	public List<WebElement> getViewClinicalServicesButton() {
		return ViewClinicalServicesButton;
	}

	public WebElement getServiceDropdown() {
		return serviceDropdown;
	}


	public WebElement getDateDropdown() {
		return dateDropdown;
	}


	public WebElement getDayAfterTommorrowDate() {
		return dayAfterTommorrowDate;
	}
	

}