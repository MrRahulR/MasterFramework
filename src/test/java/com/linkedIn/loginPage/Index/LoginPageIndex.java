package com.linkedIn.loginPage.Index;

import org.testng.annotations.Test;

import com.linkedIn.init.Common;
import com.linkedIn.init.SeleniumInit;

public class LoginPageIndex extends SeleniumInit {

	Common common = new Common(driver);
	
	public static int row_num = 0;
	
	@Test
	public void verifyRegisterPage(){
		
		row_num = 7;
		
		extent.startTest(common.getTestDetails(row_num, 0) + ": " + common.getTestDetails(row_num, 1));
		
		loginPageIndexPage.verify_Register_Page();
		
	}
	
	

}
