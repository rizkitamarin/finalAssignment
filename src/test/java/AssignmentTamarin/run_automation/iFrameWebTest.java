package AssignmentTamarin.run_automation;

import org.testng.annotations.Test;

import AssigmentTamarin.base.BaseTestiFrame;
import AssignmentTamarin.iFramePage.YopmailPage;
import AssignmentTamarin.menu_action.iFrameWebMenus;

public class iFrameWebTest {

	public class WebTests extends BaseTestiFrame {

		@Test
		public void endToEnd() throws InterruptedException {
			iFrameWebMenus.login(YopmailPage.email);
			iFrameWebMenus.switchiFrame(YopmailPage.frameId);
			iFrameWebMenus.getBodyText();

		}

}
	}
