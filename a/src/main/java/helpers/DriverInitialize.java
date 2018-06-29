package helpers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import utility.ExcelUtility;

import com.sun.javafx.PlatformUtil;

import config.Configuration.browser;
import config.Configuration.excelSetUp;

@SuppressWarnings("restriction")
public class DriverInitialize {

	public static WebDriver driver;

	public static void driverInitlize() {

		System.out.println("Called openBrowser");
		boolean ff_true = false;
		boolean ie_true = false;
		boolean chrome_true = false;
		if (driver == null) {
			// getting browse variable from the Configuration class
			if (browser.browse.equalsIgnoreCase("ff")) {
				ff_true = true;
			} else if (browser.browse.equalsIgnoreCase("ie")) {
				ie_true = true;
			} else if (browser.browse.equalsIgnoreCase("chrome")) {
				chrome_true = true;
				System.out.println("chrome is true");
			}
		}
		if (chrome_true == false || ie_true == false || ff_true == false) {
			if (chrome_true == true) {
				if (PlatformUtil.isMac()) {
					System.setProperty("webdriver.chrome.driver",
							"chromedriver");
				}
				if (PlatformUtil.isWindows()) {
					System.setProperty("webdriver.chrome.driver",
							"chromedriver.exe");
					System.out.println("Chrome property set");
				}
				if (PlatformUtil.isLinux()) {
					System.setProperty("webdriver.chrome.driver",
							"chromedriver_linux");
				}
				// instantiate Chrome Driver
				driver = new ChromeDriver();
				System.out.println("Chrome driver instantiate");
			} else if (ff_true == true) {
				if (PlatformUtil.isMac()) {
					// need to download driver
					System.setProperty("webdriver.gecko.driver", "geckodriver");
				}
				if (PlatformUtil.isWindows()) {
					// need to download driver
					System.setProperty("webdriver.gecko.driver",
							"geckodriver.exe");
				}
				if (PlatformUtil.isLinux()) {
					// need to download driver
					System.setProperty("webdriver.gecko.driver",
							"geckodriver_linux");
				}
				// instantiate Firefox Driver
				driver = new FirefoxDriver();
				System.out.println(driver);
			} else if (ie_true == true) {
				if (PlatformUtil.isMac()) {
					// need to download driver
					System.setProperty("webdriver.ie.driver", "iexploredriver");
				}
				if (PlatformUtil.isWindows()) {
					// need to download driver
					System.setProperty("webdriver.ie.driver",
							"iexploredriver.exe");
				}
				if (PlatformUtil.isLinux()) {
					// need to download driver
					System.setProperty("webdriver.ie.driver",
							"iexploredriver_linux");
				}
				// instantiate Internet Explorer Driver
				driver = new InternetExplorerDriver();
			}
		}
		// As selenium provided lot of different driver so based on need we can
		// add more also like safari etc.
		// set implicit wait for 5 Sec
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// maximize browser
		driver.manage().window().maximize();

		try {
			ExcelUtility.setExcelFile(excelSetUp.excelLocaation
					+ excelSetUp.workbookName, "LoginTests");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Below is the syntax which is used to check if the element is displayed or
	// not. It returns false when the element is not present in DOM.
	public boolean isElementDisplayed(WebDriver driver, By by) {
		WebElement element = driver.findElement(by);
		return element.isDisplayed();
	}
}
