package com.TechnoCredits.orghrm.pages;

import org.openqa.selenium.By;

import com.TechnoCredits.orghrm.base.PreDefinedActions;

public class PIM_AddEmployee_PersonalDetails extends PreDefinedActions {

	public String AddEmployeeWizard_getHeaderDetails() {

		String header = "";
		header = driver.findElement(By.xpath("//span[@data-tooltip='Add Employee Wizard']")).getText();
		header = header + " " + driver.findElement(By.xpath("//span[@data-tooltip='Personal Details']")).getText();
		return header;
	}

}
