package com.TechnoCredits.orghrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.TechnoCredits.orghrm.base.PreDefinedActions;

public class PIM_AddEmployee_PersonalDetails extends PreDefinedActions {

	public String AddEmployeeWizard_getHeaderDetails() {

		String header = "";
		header = driver.findElement(By.xpath("//span[@data-tooltip='Add Employee Wizard']")).getText();
		header = header + " " + driver.findElement(By.xpath("//span[@data-tooltip='Personal Details']")).getText();
		return header;
	}

	public PIM_AddEmployee_PersonalDetails AddEmployeeWizard_PersonalDetails(String hobbies) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//h4[text()='Important']//parent::div//materializecss-decorator[@form='schemaForm.form[0]']//label[text()='Hobbies']//parent::div")));
		driver.findElement(By.xpath(
				"//h4[text()='Important']//parent::div//materializecss-decorator[@form='schemaForm.form[0]']//label[text()='Hobbies']//parent::div/input"))
				.sendKeys(hobbies);
		return this;
	}

	public void clickNext() {

		driver.findElement(By.xpath("//div[@id='wizard-nav-button-section']//button[text()='Next']")).click();

	}

}
