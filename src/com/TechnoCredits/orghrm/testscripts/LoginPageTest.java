package com.TechnoCredits.orghrm.testscripts;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.TechnoCredits.orghrm.base.PreDefinedActions;
import com.TechnoCredits.orghrm.pages.LoginPage;

public class LoginPageTest {

	@BeforeClass
	public void start() {

		PreDefinedActions.start();
	}

	@Test
	public void checkSuccessfulLogin() {

		LoginPage loginPage = new LoginPage();
		loginPage.setUserName("admin").setPassword("@t9maHZGO1").clickLogin();

		String expectedText = "Dashboard";
		String actualText = loginPage.validateLogin();

		Assert.assertEquals(expectedText, actualText);

	}

	public void close() {

		PreDefinedActions.close();

	}

}
