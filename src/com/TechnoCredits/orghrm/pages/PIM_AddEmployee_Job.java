package com.TechnoCredits.orghrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.TechnoCredits.orghrm.base.PreDefinedActions;

public class PIM_AddEmployee_Job extends PreDefinedActions {
	
	public String AddEmployeeWizard_Job_getHeaderDetails() {

		String header = "";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/span[text()='Add Employee Wizard']//parent::div//parent::li//following-sibling::li[2]//span[text()='Job']")));
		header = driver.findElement(By.xpath("//div/span[text()='Add Employee Wizard']//parent::div//parent::li//following-sibling::li[2]//span[text()='Job']")).getText();
		header = driver.findElement(By.xpath("//div/span[text()='Add Employee Wizard']")).getText() + " " + header;
		return header;
	}

}
