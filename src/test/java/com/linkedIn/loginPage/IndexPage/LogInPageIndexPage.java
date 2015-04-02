package com.linkedIn.loginPage.IndexPage;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.linkedIn.init.Common;
import com.linkedIn.loginPage.Verification.AbstractPage;
import com.linkedIn.loginPage.Verification.LoginPageVerification;
import com.relevantcodes.extentreports.LogStatus;

public class LogInPageIndexPage extends AbstractPage {

	public LogInPageIndexPage(WebDriver driver) {
		super(driver);

	}

	Common common = new Common(driver);

	LoginPageVerification loginPageVerfication = new LoginPageVerification(
			driver);

	/*----------------------- List of web elements/xpaths of page -----------------------*/

	@FindBy(xpath = ".//*[@id='btn-submit']")
	private WebElement joinNow_button;

	@FindBy(xpath = ".//*[@id='firstName-coldRegistrationForm']")
	private WebElement firstName_text;

	@FindBy(xpath = ".//*[@id='lastName-coldRegistrationForm']")
	private WebElement lastName_text;

	@FindBy(xpath = ".//*[@id='control_gen_1']/li[1]/label")
	private WebElement emailId_label;

	@FindBy(xpath = ".//*[@id='control_gen_1']/li[2]/label")
	private WebElement passwd_label;

	@FindBy(xpath = ".//*[@id='email-coldRegistrationForm']")
	private WebElement emailId_text;

	@FindBy(xpath = ".//*[@id='password-coldRegistrationForm']")
	private WebElement passwd_text;

	@FindBy(xpath = ".//*[@id='global-error']/div")
	private WebElement validation_message;

	List<WebElement> textfields = new ArrayList<WebElement>();

	/*----------------------- Test execution methods  -----------------------*/

	public void verify_Register_Page() {

		extent.log(LogStatus.INFO,
				"<a href=\"http://www.linkedin.com\"> Open URL </a>");

		common.pause(1);

		extent.log(LogStatus.INFO, "Observe page");

		common.pause(2);

		loginPageVerfication.verificationMethod(emailId_text,
				"Verify EmaiId field");

		common.pause(1);

		loginPageVerfication.verificationMethod(passwd_text,
				"Verify Password field");

		common.pause(1);

		loginPageVerfication.verificationMethod(joinNow_button,
				"Verify \"Join Now\" button");

		common.pause(1);

	}

	public void verify_Label_in_Page() {

		extent.log(LogStatus.INFO,
				"<a href=\"http://www.linkedin.com\"> Open URL </a>");

		common.pause(1);

		extent.log(LogStatus.INFO, " Observe labels of page");

		common.pause(2);

		loginPageVerfication.verificationMethod(emailId_label,
				"Verify EmaiId field");

		common.pause(1);

		loginPageVerfication.verificationMethod(passwd_label,
				"Verify Password field");

		common.pause(1);
	}

	public void verify_Mendatory_Fields() {

		extent.log(LogStatus.INFO,
				"<a href=\"http://www.linkedin.com\"> Open URL </a>");

		common.pause(1);

		extent.log(LogStatus.INFO, "Observe mendatory fields for registration");

		common.pause(2);

		loginPageVerfication.verificationMethod(firstName_text,
				"Verify first name field");

		common.pause(1);

		loginPageVerfication.verificationMethod(lastName_text,
				"Verify last name field");

		common.pause(1);

		loginPageVerfication.verificationMethod(emailId_text,
				"Verify emailid field");

		common.pause(1);

		loginPageVerfication.verificationMethod(passwd_text,
				"Verify password field");

		common.pause(1);

	}

	public void verify_JoinNow_Button() {

		extent.log(LogStatus.INFO,
				"<a href=\"http://www.linkedin.com\"> Open URL </a>");

		common.pause(1);

		extent.log(LogStatus.INFO, " Verify \"Join Now\" button");

		common.pause(2);

		loginPageVerfication.verificationMethod(joinNow_button,
				"Verify \"Join Now\" button");

		common.pause(1);

	}

	public void click_JoinNow_Button() {

		extent.log(LogStatus.INFO,
				"<a href=\"http://www.linkedin.com\"> Open URL </a>");

		common.pause(1);

		extent.log(LogStatus.INFO, " Click \"Join Now\" button");

		common.pause(2);

		try {
			joinNow_button.click();
		} catch (NoSuchElementException nse) {

		}

		common.pause(2);

		loginPageVerfication.verificationMethod(validation_message,
				"Verification message is verify.");

		common.pause(1);

	}

	public void textbox_Edit_Functionality() {

		extent.log(LogStatus.INFO,
				"<a href=\"http://www.linkedin.com\"> Open URL </a>");

		common.pause(1);

		extent.log(LogStatus.INFO, " Enter values in text fields");

		common.pause(1);

		sendValuesTextfields();

		common.pause(1);

		extent.log(LogStatus.INFO, " Observe value in text fields");

		common.pause(1);

		if (getValuesTextfields().equals("Editable")) {

			extent.log(LogStatus.INFO, "All textfields are editable");
		}

		common.pause(1);

	}

	public void verify_firstname(String name) {

		extent.log(LogStatus.INFO,
				"<a href=\"http://www.linkedin.com\"> Open URL </a>");

		String first_name = name;

		common.pause(2);

		firstName_text.sendKeys(first_name);

		extent.log(LogStatus.INFO, "Enter First Name: <strong><em>"
				+ first_name + "");

		common.pause(2);

		sendData("Enter Last Name: <strong><em>", lastName_text);

		enterRandomMail();

		enterRandomPassword();

		extent.log(LogStatus.INFO, " Click \"Join Now\" button");

		joinNow_button.click();

		common.pause(2);

		loginPageVerfication.verificationMethod(validation_message,
				"Verification message is verify.");

		common.pause(2);

	}

	public void verify_lastname(String name) {

		extent.log(LogStatus.INFO,
				"<a href=\"http://www.linkedin.com\"> Open URL </a>");

		String last_name = name;

		sendData("Enter First Name: <strong><em>", firstName_text);

		common.pause(2);

		lastName_text.sendKeys(last_name);

		extent.log(LogStatus.INFO, "Enter Last Name: <strong><em>" + last_name
				+ "");

		common.pause(2);

		enterRandomMail();

		enterRandomPassword();

		extent.log(LogStatus.INFO, " Click \"Join Now\" button");

		joinNow_button.click();

		common.pause(2);

		loginPageVerfication.verificationMethod(validation_message,
				"Verification message is verify.");

		common.pause(2);

	}

	public void verify_emailid(String emailId) {

		extent.log(LogStatus.INFO,
				"<a href=\"http://www.linkedin.com\"> Open URL </a>");

		String email_id = emailId;

		sendData("Enter First Name: <strong><em>", firstName_text);

		common.pause(2);

		sendData("Enter Last Name: <strong><em>", lastName_text);

		common.pause(2);

		emailId_text.sendKeys(email_id);

		extent.log(LogStatus.INFO, "Enter Emailid : <strong><em>" + email_id
				+ "");

		common.pause(2);

		enterRandomPassword();

		extent.log(LogStatus.INFO, " Click \"Join Now\" button");

		joinNow_button.click();

		common.pause(2);

		loginPageVerfication.verificationMethod(validation_message,
				"Verification message is verify.");

		common.pause(2);

	}

	public void verify_password(String password) {

		extent.log(LogStatus.INFO,
				"<a href=\"http://www.linkedin.com\"> Open URL </a>");

		String Password = password;

		sendData("Enter First Name: <strong><em>", firstName_text);

		common.pause(2);

		sendData("Enter Last Name: <strong><em>", lastName_text);

		common.pause(2);

		enterRandomMail();

		common.highlightsElement(passwd_text);

		extent.log(LogStatus.INFO, "Enter Password : <strong><em>" + Password
				+ "");

		passwd_text.sendKeys(Password);

		common.pause(2);

		extent.log(LogStatus.INFO, " Click \"Join Now\" button");

		joinNow_button.click();

		common.pause(2);

		loginPageVerfication.verificationMethod(validation_message,
				"Verification message is verify.");

		common.pause(2);

	}

	public void verify_with_validData() {

		extent.log(LogStatus.INFO,
				"<a href=\"http://www.linkedin.com\"> Open URL </a>");

		sendData("Enter First Name: <strong><em>", firstName_text);

		common.pause(2);

		sendData("Enter Last Name: <strong><em>", lastName_text);

		common.pause(2);

		enterRandomMail();

		common.pause(2);

		common.highlightsElement(passwd_text);

		enterRandomPassword();

		common.pause(2);

		extent.log(LogStatus.INFO, " Click \"Join Now\" button");

		joinNow_button.click();

		common.pause(2);

		loginPageVerfication.datavalidation_success(validation_message,"User successfully registered with entered data!");

		common.pause(2);

	}

	/*----------------------- MISC methods of test execution -----------------------*/

	public void sendData(String text, WebElement element) {

		String data = CreatRandomNames(5);

		element.sendKeys(data);

		extent.log(LogStatus.INFO, text + data + "");

		common.pause(2);

	}

	public void enterRandomMail() {

		String email = createRandommail(7);

		emailId_text.sendKeys(email);

		extent.log(LogStatus.INFO, "Enter Emailid : <strong><em>" + email + "");

		common.pause(2);
	}

	public void sendValuesTextfields() {

		textfields.add(firstName_text);
		textfields.add(lastName_text);
		textfields.add(emailId_text);
		textfields.add(passwd_text);

		for (WebElement textfield : textfields) {

			common.highlightsElement(textfield);
			textfield.sendKeys("Editable");

			common.pause(1);

		}
	}

	public void enterRandomPassword() {

		String password = CreateRandomPassword();

		passwd_text.sendKeys(password);

		extent.log(LogStatus.INFO, "Enter Password : <strong><em>" + password
				+ "");

		common.pause(2);
	}

	public String getValuesTextfields() {

		String value = null;

		textfields.add(firstName_text);
		textfields.add(lastName_text);
		textfields.add(emailId_text);
		textfields.add(passwd_text);

		for (WebElement textfield : textfields) {

			value = textfield.getText();

			common.pause(1);

		}

		return value;
	}

	public String createRandommail(int number) {

		StringBuffer smail = new StringBuffer();
		smail.append(RandomStringUtils.randomAlphabetic(number)
				+ "@mailinator.com");

		String mail = smail.toString();

		common.pause(2);

		return mail;
	}

	public String CreatRandomNames(int number) {

		String name = RandomStringUtils.randomAlphabetic(number);

		return name;
	}

	public String CreateRandomPassword() {
		String password;

		password = CreatRandomNames(4) + "@"
				+ common.randomNumericValueGenerate(999);

		return password;
	}

}
