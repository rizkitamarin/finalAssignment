package AssignmentTamarin.run_automation;

import org.testng.annotations.Test;

import AssigmentTamarin.base.BaseTestUI;
import AssignmentTamarin.SauceDemoPage.LoginPage;
import AssignmentTamarin.menu_action.WebMenus;



public class WebTest {
	public class WebTests extends BaseTestUI {

		@Test
		public void endToEnd() throws InterruptedException {
			WebMenus.loginMenu(LoginPage.username, LoginPage.password);
			WebMenus.addToCart();
			long currentTimestamp = System.currentTimeMillis();
			String firstName = "Unique Name ";
			String lastName = String.valueOf(currentTimestamp);
			WebMenus.inputPersonalDetails(firstName, lastName, "13930");
		}
	}
}
