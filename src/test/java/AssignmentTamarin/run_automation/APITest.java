package AssignmentTamarin.run_automation;

import org.testng.annotations.Test;

import AssignmentTamarin.menu_action.APIMenus;
import AssignmentTamarin.static_api.staticApi;

public class APITest {
	
	@Test
	public void SignUp() {
		APIMenus.registrasi(staticApi.payload());
	}

}
