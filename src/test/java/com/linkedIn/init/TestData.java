package com.linkedIn.init;

import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider(name = "invalidnames")
	public static Object[][] invalidnames() {

		return new Object[][] { { "",15 }, { " Rahul",16 }, { "R@hu!_",17 },
				{ "Rah Ul",18 } };
	}

	@DataProvider(name = "invalidlnames")
	public static Object[][] invalidlnames() {

		return new Object[][] { { "" }, { " Rahul" }, { "R@hu!_" },
				{ "Rah Ul" } };
	}

	@DataProvider(name = "invalidmailid")
	public static Object[][] invalidmailid() {

		return new Object[][] {

		{ " rahul.pandya@mailinator.com" }, { "rahul.pndya@" },
				{ "rahul pandya@mailinator.com" },
				{ "rahul.pandyamailinator.com" }, { "@mailinator.com" },
				{ "rahul.pandya00@@mailinator.com" },
				{ "rahul..pandya@mailinator.com" },
				{ "rahul.pandya@-mailinator.com" },
				{ "#$%^%^&%#^&*@mailinator.com" },
				{ "Rahul Pandya <rahul.pandya@mailinator.com>" },
				{ "rahul.pandya00@mailinator." }, { "rahul.pandya@web.net" },
				{ "rahul.pandya@111.com" },
				{ "rahul.pandya@mailinator.com (Rahul Pandya)" },
				{ "rahul.pandya@mailinatorhotmail.com" },
				{ "rahul.pandya@xyz.com" }, { "" },
				{ "pandya.rahul00@gmail.com" }

		};
	}

	@DataProvider(name = "invalidpassword")
	public static Object[][] invalidpassword() {

		return new Object[][] { { "Jammmiieee" }, { "123456", 34 },
				{ "emailid", 35 }, { "", 36 }, { "ra12@", 37 },
				{ "rahulpa12", 38 } };
	}

}
