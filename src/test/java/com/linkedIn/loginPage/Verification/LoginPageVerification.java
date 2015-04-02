package com.linkedIn.loginPage.Verification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.linkedIn.init.Common;
import com.relevantcodes.extentreports.LogStatus;

public class LoginPageVerification extends AbstractPage {

	public LoginPageVerification(WebDriver driver) {
		super(driver);
	}

	Common common = new Common(driver);

	static String test_result = "";

	public void verificationMethod(WebElement element,
			String VerificationMessage) {

		try {
			if (element.isDisplayed()) {
				extent.log(LogStatus.PASS, VerificationMessage);
			} else {
				test_result = "failed";
				extent.log(LogStatus.FAIL, "Verification message isn't verify.");
			}
		} catch (Exception e) {
			extent.log(LogStatus.FAIL, "Verification message is verify.");
		}

	}

	public void datavalidation_success() {

		common.pause(2);

		try {

			if (driver.getTitle().contains("Largest")) {

				extent.log(LogStatus.FAIL, "Error! , User failed to register..");
				common.pause(2);
			} else {

				test_result = "failed";
				extent.log(LogStatus.PASS,
						"Success! , User registered successfully to LinkedIn.");
				common.pause(2);
			}

		} catch (Exception e) {

			test_result = "failed";
			extent.log(LogStatus.FAIL, "Error! , User failed to register..");
			common.pause(2);

		}

	}

	public void onclick_verify() {

		common.pause(2);

		try {

			if (driver.getTitle().contains("Largest")) {

				extent.log(LogStatus.FAIL, "Error! , User failed to register..");
				common.pause(2);
			} else {

				test_result = "failed";
				extent.log(LogStatus.PASS,
						"Success! , User registered successfully to LinkedIn.");
				common.pause(2);
			}

		} catch (Exception e) {

			test_result = "failed";
			extent.log(LogStatus.FAIL, "Error! , User failed to register..");
			common.pause(2);

		}

	}

	public void verifyValidationMessage(WebElement element) {

		try {
			if (element.isDisplayed()) {
				extent.log(LogStatus.PASS,
						"Validation message is display properly");
			} else {
				test_result = "failed";
				extent.log(LogStatus.FAIL,
						"Validation message isn't display properly");
			}
		} catch (Exception e) {
			extent.log(LogStatus.FAIL,
					"Validation message isn't display properly");
		}

	}

	public void verify_ua() {

		common.pause(2);

		try {

			if (driver.getTitle().contains("User Agreement")) {

				extent.log(LogStatus.PASS,
						"User Agreement link is working properly");
				common.pause(2);
			} else {

				test_result = "failed";
				extent.log(LogStatus.FAIL,
						"User Agreement link isn't working properly");
				common.pause(2);
			}

		} catch (Exception e) {

			test_result = "failed";
			extent.log(LogStatus.FAIL,
					"User Agreement link isn't working properly");
			common.pause(2);

		}

	}

	public void verify_pp() {

		common.pause(2);

		try {

			if (driver.getTitle().contains("Privacy Policy")) {

				extent.log(LogStatus.PASS,
						"Privacy Policy link is working properly");
				common.pause(2);
			} else {

				test_result = "failed";
				extent.log(LogStatus.FAIL,
						"Privacy Policy link isn't working properly");
				common.pause(2);
			}

		} catch (Exception e) {

			test_result = "failed";
			extent.log(LogStatus.FAIL,
					"Privacy Policy link isn't working properly");
			common.pause(2);

		}

	}

	public void verify_cp() {

		common.pause(2);

		try {

			if (driver.getTitle().contains("Cookie Policy")) {

				extent.log(LogStatus.PASS,
						"Cookie Policy link is working properly");
				common.pause(2);
			} else {

				test_result = "failed";
				extent.log(LogStatus.FAIL,
						"Cookie Policy link isn't working properly");
				common.pause(2);
			}

		} catch (Exception e) {

			test_result = "failed";
			extent.log(LogStatus.FAIL,
					"Cookie Policy link isn't working properly");
			common.pause(2);

		}

	}

}