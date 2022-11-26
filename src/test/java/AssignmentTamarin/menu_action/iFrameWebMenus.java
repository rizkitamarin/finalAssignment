package AssignmentTamarin.menu_action;

import AssignmentTamarin.iFramePage.YopmailPage;
import AssignmentTamarin.utils.BrowserActions;

public class iFrameWebMenus {

	public static void login(String username) throws InterruptedException {
		BrowserActions.sendKeysToElementByID(YopmailPage.emailField, username);
		BrowserActions.clickElementByCSS(YopmailPage.arrowBtn);

	}

	public static void switchiFrame(String frameName) throws InterruptedException{
		BrowserActions.switchiFrame(frameName);
		System.out.println("Navigated to frame with name " + frameName);
	}

	public static void getBodyText() {
		String bodyText = BrowserActions.getTextOfElementByCSS(YopmailPage.bodyEmailCSS);
		System.out.println("Body : " + bodyText);
	}
}
