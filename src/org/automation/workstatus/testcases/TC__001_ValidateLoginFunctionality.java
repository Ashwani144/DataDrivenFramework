package org.automation.workstatus.testcases;

import org.automation.workstatus.base.DriverInstance;
import org.automation.workstatus.pages.LoginPage;
import org.testng.annotations.Test;

public class TC__001_ValidateLoginFunctionality extends DriverInstance {
	
	@Test()
	public void tc_001login_functionality(){
		
		LoginPage login=new LoginPage(driver);
		login.enterUsername("uname");
		login.enterPassword("passwoord");
		login.clickonProceedToLogin();
	}
	


}
