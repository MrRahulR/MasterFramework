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
	public void invalidFirstname(String name, int row_number) {

		row_num = row_number;

		extent.startTest(common.getTestDetails(row_num, 0) + ": "
				+ common.getTestDetails(row_num, 1));

		loginPageIndexPage.verify_firstname(name);

	}

	@Test(dataProvider = "invalidlnames", dataProviderClass = TestData.class)
	public void invalidLastName(String name, int row_number) {

		row_num = row_number;

		extent.startTest(common.getTestDetails(row_num, 0) + ": "
				+ common.getTestDetails(row_num, 1));

		loginPageIndexPage.verify_lastname(name);

	}

	@Test(dataProvider = "invalidmailid", dataProviderClass = TestData.class)
	public void invalid_emailid(String emailId, int row_number) {

		row_num = row_number;

		extent.startTest(common.getTestDetails(row_num, 0) + ": "
				+ common.getTestDetails(row_num, 1));

		loginPageIndexPage.verify_emailid(emailId);

	}

	@Test(dataProvider = "invalidpassword", dataProviderClass = TestData.class)
	public void invalid_password(String password, int row_number) {

		row_num = row_number;

		extent.startTest(common.getTestDetails(row_num, 0) + ": "
				+ common.getTestDetails(row_num, 1));

		loginPageIndexPage.verify_password(password);

	}

	@Test
	public void register_success() {

		row_num = 51;

		extent.startTest(common.getTestDetails(row_num, 0) + ": "
				+ common.getTestDetails(row_num, 1));

		loginPageIndexPage.verify_with_validData();

	}

	@Test
	public void tab_functionality() {

		row_num = 52;

		extent.startTest(common.getTestDetails(row_num, 0) + ": "
				+ common.getTestDetails(row_num, 1));

		loginPageIndexPage.verifyTabKeyFunctionality();

	}

	@Test
	public void onclick_functionality() {

		row_num = 53;

		extent.startTest(common.getTestDetails(row_num, 0) + ": "
				+ common.getTestDetails(row_num, 1));

		loginPageIndexPage.verifyOnclickfunctionality();

	}

	@Test
	public void verify_validation_msg() {

		row_num = 54;

		extent.startTest(common.getTestDetails(row_num, 0) + ": "
				+ common.getTestDetails(row_num, 1));

		loginPageIndexPage.verify_validationMessage();

	}

	@Test
	public void useragreement_link() {

		row_num = 55;

		extent.startTest(common.getTestDetails(row_num, 0) + ": "
				+ common.getTestDetails(row_num, 1));

		loginPageIndexPage.verify_ua_link();

	}

	@Test
	public void privacypolicy_link() {

		row_num = 55;

		extent.startTest(common.getTestDetails(row_num, 0) + ": "
				+ common.getTestDetails(row_num, 1));

		loginPageIndexPage.verify_pp_link();

	}

	@Test
	public void cookiepolicy_link() {

		row_num = 55;

		extent.startTest(common.getTestDetails(row_num, 0) + ": "
				+ common.getTestDetails(row_num, 1));

		loginPageIndexPage.verify_cp_link();

	}

}