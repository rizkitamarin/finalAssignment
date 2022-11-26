package AssignmentTamarin.menu_action;

import org.testng.Assert;

import AssignmentTamarin.SauceDemoPage.CartPage;
import AssignmentTamarin.SauceDemoPage.InformationPage;
import AssignmentTamarin.SauceDemoPage.LoginPage;
import AssignmentTamarin.SauceDemoPage.OverviewPage;
import AssignmentTamarin.SauceDemoPage.ProductPage;
import AssignmentTamarin.SauceDemoPage.ThankYouPage;
import AssignmentTamarin.utils.BrowserActions;

public class WebMenus {

	static String itemName = "";

	public static void loginMenu(String username, String password) throws InterruptedException {
		BrowserActions.sendKeysToElementByID(LoginPage.username_fieldId, username);
		BrowserActions.sendKeysToElementByID(LoginPage.password_fieldId, password);
		BrowserActions.clickElementByID(LoginPage.login_btnId);
}
	public static void addToCart () {
		String itemName = BrowserActions.getTextOfElementById(ProductPage.item_textId);
		BrowserActions.clickElementByID(ProductPage.addToCart_btnId);
		BrowserActions.clickElementByID(ProductPage.cart_btnId);
		String itemNameCheck = BrowserActions.getTextOfElementByXpath(CartPage.item_textXpath);
		Assert.assertEquals(itemNameCheck, itemName);
		BrowserActions.clickElementByID(CartPage.checkout_Btn);
	}

	public static void inputPersonalDetails(String firstName, String lastName, String postCode) {
		BrowserActions.sendKeysToElementByID(InformationPage.firstName_fieldId, firstName);
		BrowserActions.sendKeysToElementByID(InformationPage.lastName_fieldId, lastName);
		BrowserActions.sendKeysToElementByID(InformationPage.postCode_fieldId, postCode);
		BrowserActions.clickElementByID(InformationPage.continue_btnId);
	}

	public static void transaction() {
		String selectedItemName = BrowserActions.getTextOfElementById(OverviewPage.selected_item_textId);
		Assert.assertEquals(selectedItemName, itemName);
		BrowserActions.clickElementByID(OverviewPage.finish_btn);
		BrowserActions.checkIsDisplayedById(ThankYouPage.thanks_textId);
	}




}
