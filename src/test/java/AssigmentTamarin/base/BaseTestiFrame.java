package AssigmentTamarin.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import AssignmentTamarin.run_automation.IDriverManager;
import AssignmentTamarin.utils.BrowserActions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTestiFrame implements IDriverManager {
	public WebDriver driver;
	public WebDriverWait explicitWait;

	@Override
	@BeforeMethod
	public void setUpSystemUnderTest() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		explicitWait = new WebDriverWait(driver, Duration.ofMinutes(1));

		BrowserActions.setDriver(driver);
		BrowserActions.setExplicitWait(driver);
		driver.get("https://yopmail.com/en/");
	}

	@Override
	@AfterMethod(alwaysRun = true)
	public void cleanUp(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
			File screenshotFile= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File(System.getProperty("user.dir") + File.separator + result.getName() + ".png"));
		}

		driver.quit();
	}
}
