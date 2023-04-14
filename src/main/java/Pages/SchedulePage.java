package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import lombok.Getter;
import lombok.Setter;

public class SchedulePage {

	
	
	
	
	
	@FindBy(how = How.XPATH,using="//div[text()='Portland, OR']")
	private WebElement portLandLocation;
	
	@FindBy(how = How.XPATH,using="//div[text()='Illness/Injury']")
	private WebElement IllnessInjuryService;
	
	@FindBy(how = How.XPATH,using="//div[text()='Search']")
	private WebElement searchButton;
	
	
	
	@FindBy(how = How.XPATH,using="//div[@data-testid='quickSelector.location.popover']/div")
	private WebElement locationDropdown;
	
	@FindBy(how = How.XPATH,using="//div[@data-testid='quickSelector.service.popover']/div")
	private WebElement serviceDropdown;
	
	@FindBy(how = How.XPATH,using="//div[@data-testid='quickSelector.date.popover']/div")
	private WebElement dateDropdown;
	@FindBy(how = How.XPATH,using="((//div[@data-testid='quickSelector.date.popover']/div)[2]//div[@tabindex and not(@aria-disabled)])[5]")
	private WebElement dayAfterTommorrowDate;
	
	public SchedulePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 15),this);
	}

	public WebElement getLocationDropdown() {
		return locationDropdown;
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
