package com.TechnoCredits.orghrm.testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.TechnoCredits.orghrm.base.PreDefinedActions;
import com.TechnoCredits.orghrm.pages.LoginPage;
import com.TechnoCredits.orghrm.pages.MenuPage;
import com.TechnoCredits.orghrm.pages.PIM_AddEmployee;
import com.TechnoCredits.orghrm.pages.PIM_AddEmployee_PersonalDetails;

public class PIM_AddEmployee_Test {

	@BeforeClass
	public void start() {
		PreDefinedActions.start();
	}

	@Test
	public void check_Add_Employee_Next() throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		loginPage.setUserName("admin").setPassword("@t9maHZGO1").clickLogin();
		MenuPage menuPage = new MenuPage();
		menuPage.navigateTo("PIM-Add Employee");
		PIM_AddEmployee pim_AddEmployee = new PIM_AddEmployee();
		pim_AddEmployee.Add_EmployeeName("EmpFirstName", "EmpLastName").Add_Location("Australian Regional HQ")
				.clickNext();
		String expectedHeaderText = "Add Employee Wizard Personal Details";
		PIM_AddEmployee_PersonalDetails pimAddEmpPersonalDetails = new PIM_AddEmployee_PersonalDetails();
		String actualHeaderText = pimAddEmpPersonalDetails.AddEmployeeWizard_getHeaderDetails();
		Assert.assertEquals(expectedHeaderText, actualHeaderText);
	}

	@AfterClass
	public void close() {
		PreDefinedActions.close();
	}
}
