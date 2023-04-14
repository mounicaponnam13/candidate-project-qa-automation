package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicFunctions {

	
	public static WebDriver driver=null;
	
	public static void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mouni\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}
}
