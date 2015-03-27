package com.linkedIn.loginPage.Index;

import org.testng.annotations.Test;

import com.linkedIn.init.Common;
import com.linkedIn.init.SeleniumInit;
import com.linkedIn.init.TestData;

public class LoginPageIndex extends SeleniumInit {

	Common common = new Common(driver);

	public static int row_num = 0;

	@Test
	public void verifyRegisterPage() {

		row_num = 7;

		extent.startTest(common.getTestDetails(row_num, 0) + ": "
				+ common.getTestDetails(row_num, 1));

		loginPageIndexPage.verify_Register_Page();

	}

	@Test
	public void verifyLabelinPage() {

		row_num = 8;

		extent.startTest(common.getTestDetails(row_num, 0) + ": "
				+ common.getTestDetails(row_num, 1));

		loginPageIndexPage.verify_Label_in_Page();

	}

	@Test
	public void verifyMendatoryFields() {

		row_num = 9;

		extent.startTest(common.getTestDetails(row_num, 0) + ": "
				+ common.getTestDetails(row_num, 1));

		loginPageIndexPage.verify_Mendatory_Fields();

	}

	@Test
	public void verifyJoinnowButton() {

		row_num = 10;

		extent.startTest(common.getTestDetails(row_num, 0) + ": "
				+ common.getTestDetails(row_num, 1));

		loginPageIndexPage.verify_JoinNow_Button();

	}

	@Test
	public void clickJoinnowButton() {

		row_num = 11;

		extent.startTest(common.getTestDetails(row_num, 0) + ": "
				+ common.getTestDetails(row_num, 1));

		loginPageIndexPage.click_JoinNow_Button();

	}

	@Test
	public void textboxEditFunctionality() {

		row_num = 13;

		extent.startTest(common.getTestDetails(row_num, 0) + ": "
				+ common.getTestDetails(row_num, 1));

		loginPageIndexPage.textbox_Edit_Functionality();

	}

	@Test(dataProvider = "invalidnames", dataProviderClass = TestData.class)
	public void invalidFirstname(String name,int row_number) {
		
		row_num = row_number;

		extent.startTest(common.getTestDetails(row_num, 0) + ": "
				+ common.getTestDetails(row_num, 1));

		loginPageIndexPage.verify_firstname(name);

	}

	/*@Test(dataProvider = "invalidlnames", dataProviderClass = TestData.class)
	public void invalidLastName(String name, int cases) {

		mycommon.log_case("TESTCASE_"
				+ cases
				+ " : To verify that Last Name field should have only characters.");

		mycommon.log_step(" Step 1 : Open URL (http://www.linkedin.com) ");

		CreateNewAccount_Verification.openURL();

		CreateNewAccount_IndexPage.verify_lastname(currentTest, name);

		mycommon.log_testover();

	}

	@Test(dataProvider = "invalidmailid", dataProviderClass = TestData.class)
	public void invalid_emailid(String name, int cases) {

		mycommon.log_case("TESTCASE_" + cases
				+ " : To verify that user is enter valid emailid.");

		mycommon.log_step(" Step 1 : Open URL (http://www.linkedin.com) ");

		CreateNewAccount_Verification.openURL();

		CreateNewAccount_IndexPage.verify_emailid(currentTest, name);

		mycommon.log_testover();

	}

	@Test(dataProvider = "invalidpassword", dataProviderClass = TestData.class)
	public void invalid_password(String name, int cases) {

		mycommon.log_case("TESTCASE_" + cases
				+ " : To verify that user is enter valid Password.");

		mycommon.log_step(" Step 1 : Open URL (http://www.linkedin.com) ");

		CreateNewAccount_Verification.openURL();

		CreateNewAccount_IndexPage.verify_password(currentTest, name);

		mycommon.log_testover();

	}

	@Test
	public void register_success() {

		mycommon.log_case("TESTCASE_39 : To verify that user is see register successful page after enter valid data");

		mycommon.log_step(" Step 1 : Open URL (http://www.linkedin.com) ");

		CreateNewAccount_Verification.openURL();

		CreateNewAccount_IndexPage.validdata();

		mycommon.log_testover();

	}

	@Test
	public void tab_functionality() {

		mycommon.log_case("TESTCASE_40 : To verify that user is see register successful page after enter valid data");

		mycommon.log_step(" Step 1 : Open URL (http://www.linkedin.com) ");

		CreateNewAccount_Verification.openURL();

		CreateNewAccount_IndexPage.verifyTabKey();

	}

	@Test
	public void onclick_functionality() {

		mycommon.log_case("TESTCASE_41 : To verify that user is see register successful page after enter valid data");

		mycommon.log_step("Step 1 : Open URL (http://www.linkedin.com) ");

		CreateNewAccount_Verification.openURL();

		CreateNewAccount_IndexPage.verify_onclickfunctionality();

		mycommon.log_testover();

	}

	@Test
	public void verify_validation_msg() {

		mycommon.log_case("TESTCASE_42 : To verify that validation message appear properly");

		mycommon.log_step(" Step 1 : Open URL (http://www.linkedin.com) ");

		CreateNewAccount_Verification.openURL();

		CreateNewAccount_IndexPage.verify_validation();

		mycommon.log_testover();

	}

	@Test
	public void useragreement_link() {

		mycommon.log_case("TESTCASE_43 : To verify that User Agreement link is working properly");

		mycommon.log_step(" Step 1 : Open URL (http://www.linkedin.com) ");

		CreateNewAccount_Verification.openURL();

		CreateNewAccount_IndexPage.verify_ua_link();

		mycommon.log_testover();

	}

	@Test
	public void privacypolicy_link() {

		mycommon.log_case("TESTCASE_44 : To verify that Privacy Policy link is working properly");

		mycommon.log_step("Step 1 : Open URL (http://www.linkedin.com) ");

		CreateNewAccount_Verification.openURL();

		CreateNewAccount_IndexPage.verify_pp_link();

		mycommon.log_testover();

	}

	@Test
	public void cookiepolicy_link() {

		mycommon.log_case("TESTCASE_45 : To verify that Cookie Policy link is working properly");

		mycommon.log_step("Step 1 : Open URL (http://www.linkedin.com) ");

		CreateNewAccount_Verification.openURL();

		CreateNewAccount_IndexPage.verify_cp_link();

		mycommon.log_testover();

	}
*/
}
