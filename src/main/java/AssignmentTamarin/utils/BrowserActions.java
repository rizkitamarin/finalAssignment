package AssignmentTamarin.utils;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BrowserActions {
	private static WebDriverWait explicitWait;
	private static WebDriver driver;


	public static void setDriver(WebDriver driver) {
		BrowserActions.driver = driver;
	}

	public static void setExplicitWait(WebDriver driver){
		explicitWait = new WebDriverWait(driver, Duration.ofMinutes(1));
	}

	public static void clickElementByXpath(String elementXpath) {
		WebElement elementByXpath = explicitWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(elementXpath))));
		elementByXpath.click();
	}

	public static void clickElementByID( String elementID) {
		WebElement elementByID = explicitWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(elementID))));
		elementByID.click();
	}

	public static void clickElementByCSS( String elementCSS) {
		WebElement elementByCSS = explicitWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(elementCSS))));
		elementByCSS.click();
	}

	public static void switchiFrame( String elementID) {
		WebElement elementByID = explicitWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(elementID))));
		driver.switchTo().frame(elementByID);
	}

	public static void sendKeysToElementByID(String elementID, String keys) {
		WebElement elementByID = explicitWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(elementID))));
		elementByID.sendKeys(keys);
	}

	public static void sendKeysToElementByXpath(String elementXpath, String keys) {
		WebElement elementByXpath = explicitWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(elementXpath))));
		elementByXpath.sendKeys(keys);
	}

	public static void setKeyboardKeyByID(String elementID, Keys keys) {
		WebElement elementByID = explicitWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(elementID))));
		elementByID.sendKeys(keys);
	}

	public static void performRightClickByID(String elementID) {
		Actions mouseAction = new Actions(driver);
		mouseAction.contextClick(driver.findElement(By.id(elementID))).perform();
	}

	public static String getTextOfElementById(String elementId) {
		WebElement elementInPage = explicitWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(elementId))));
		return elementInPage.getText();
	}

	public static String getTextOfElementByCSS(String elementCSS) {
		WebElement elementInPage = explicitWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(elementCSS))));
		return elementInPage.getText();
	}

	public static String getTextOfElementByXpath(String elementXpath) {
		WebElement elementInPage = explicitWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(elementXpath))));
		return elementInPage.getText();
	}


	public static boolean checkIsDisplayedById(String elementId) {
		try {
			List<WebElement> elementCount = driver.findElements(By.id(elementId));
			if (elementCount.isEmpty()) {
				return false;
			} else {
				return true;
			}
		} catch(WebDriverException e) {
			return false;
		}
	}

}
