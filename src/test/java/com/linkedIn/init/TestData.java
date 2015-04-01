package com.linkedIn.init;

import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider(name = "invalidnames")
	public static Object[][] invalidnames() {

		return new Object[][] { { "", 15 }, { " Rahul", 16 }, { "R@hu!_", 17 },
				{ "Rah Ul", 22 } };
	}

	@DataProvider(name = "invalidlnames")
	public static Object[][] invalidlnames() {

		return new Object[][] { { "", 18 }, { " Rahul", 19 }, { "R@hu!_", 20 },
				{ "Rah Ul", 21 } };
	}

	@DataProvider(name = "invalidmailid")
	public static Object[][] invalidmailid() {

		return new Object[][] {

		{ " rahul.pandya@mailinator.com", 24 }, { "rahul.pndya@", 25 },
				{ "rahul pandya@mailinator.com", 26 },
				{ "rahul.pandyamailinator.com", 27 },
				{ "@mailinator.com", 28 },
				{ "rahul.pandya00@@mailinator.com", 29 },
				{ "rahul..pandya@mailinator.com", 30 },
				{ "rahul.pandya@-mailinator.com", 31 },
				{ "#$%^%^&%#^&*@mailinator.com", 32 },
				{ "Rahul Pandya <rahul.pandya@mailinator.com>", 33 },
				{ "rahul.pandya00@mailinator.", 34 },
				{ "rahul.pandya@web.net", 35 }, { "rahul.pandya@111.com", 36 },
				{ "rahul.pandya@mailinator.com (Rahul Pandya)", 37 },
				{ "rahul.pandya@mailinatorhotmail.com", 38 },
				{ "rahul.pandya@xyz.com", 39 }, { "", 40 },
				{ "pandya.rahul00@gmail.com", 41 }

		};
	}

	@DataProvider(name = "invalidpassword")
	public static Object[][] invalidpassword() {

		return new Object[][] { { "Jammmiieee", 42 }, { "123456", 43 },
				{ "emailid", 44 }, { "", 45 }, { "ra12@", 46 },
				{ "rahulpa12", 47 } };
	}

}
