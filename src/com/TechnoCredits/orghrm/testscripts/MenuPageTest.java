package com.TechnoCredits.orghrm.testscripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.TechnoCredits.orghrm.base.PreDefinedActions;
import com.TechnoCredits.orghrm.pages.LoginPage;
import com.TechnoCredits.orghrm.pages.MenuPage;

public class MenuPageTest {
	
	@BeforeClass
	public void start() {
		PreDefinedActions.start();
	}
	
	@Test
	public void checkNavigation_PIM_AddEmp() {
		
		LoginPage loginPage = new LoginPage();
		loginPage.setUserName("admin").setPassword("@t9maHZGO1").clickLogin();
		MenuPage menuPage = new MenuPage();
		menuPage.navigateTo("PIM-Add Employee");
	}
	
	
	public void close() {
		PreDefinedActions.close();
	}

}
