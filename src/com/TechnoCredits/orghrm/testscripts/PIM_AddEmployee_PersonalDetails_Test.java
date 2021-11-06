package com.TechnoCredits.orghrm.testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.TechnoCredits.orghrm.base.PreDefinedActions;
import com.TechnoCredits.orghrm.pages.LoginPage;
import com.TechnoCredits.orghrm.pages.MenuPage;
import com.TechnoCredits.orghrm.pages.PIM_AddEmployee;
import com.TechnoCredits.orghrm.pages.PIM_AddEmployee_Job;
import com.TechnoCredits.orghrm.pages.PIM_AddEmployee_PersonalDetails;

public class PIM_AddEmployee_PersonalDetails_Test {

	@BeforeClass
	public void start() {
		PreDefinedActions.start();
	}

	@Test
	public void PIM_AddEmployee_PersonalDetails_Test() throws InterruptedException {
		LoginPage loginPage = new LoginPage();
		loginPage.setUserName("admin").setPassword("@t9maHZGO1").clickLogin();
		MenuPage menuPage = new MenuPage();
		menuPage.navigateTo("PIM-Add Employee");
		PIM_AddEmployee pim_AddEmployee = new PIM_AddEmployee();
		pim_AddEmployee.Add_EmployeeName("EmpFirstName", "EmpLastName").Add_Location("Australian Regional HQ")
				.clickNext();
		PIM_AddEmployee_PersonalDetails pd = new PIM_AddEmployee_PersonalDetails();
		pd.AddEmployeeWizard_PersonalDetails("Cooking").clickNext();
		PIM_AddEmployee_Job pIM_AddEmployee_Job = new PIM_AddEmployee_Job();
		String expectedHeader = "Add Employee Wizard Job";
		String actualHeader = pIM_AddEmployee_Job.AddEmployeeWizard_Job_getHeaderDetails();
		Assert.assertEquals(expectedHeader, actualHeader);
	}

	@AfterClass
	public void close() {
		PreDefinedActions.close();
	}

}
