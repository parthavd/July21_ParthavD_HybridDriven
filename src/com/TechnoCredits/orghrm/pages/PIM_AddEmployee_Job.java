package com.TechnoCredits.orghrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.TechnoCredits.orghrm.base.PreDefinedActions;

public class PIM_AddEmployee_Job extends PreDefinedActions {

	public String AddEmployeeWizard_Job_getHeaderDetails() {

		String header = "";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//div/span[text()='Add Employee Wizard']//parent::div//parent::li//following-sibling::li[2]//span[text()='Job']")));
		header = driver.findElement(By.xpath(
				"//div/span[text()='Add Employee Wizard']//parent::div//parent::li//following-sibling::li[2]//span[text()='Job']"))
				.getText();
		header = driver.findElement(By.xpath("//div/span[text()='Add Employee Wizard']")).getText() + " " + header;
		return header;
	}

	public PIM_AddEmployee_Job addRegion(String region) {
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Region']//parent::div//span[@class='caret']//following-sibling::input")));
		try {
		element.click();
		}catch(ElementClickInterceptedException e) {
			element.click();
		}
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
		js.executeScript("arguments[0].click()", element);*/
		
		WebElement option = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Region']//parent::div//span[text()='" + region + "']")));
		try {
			option.click();
			}catch(ElementClickInterceptedException e) {
				option.click();
			}
	//	js.executeScript("arguments[0].click()", option);
		return this;
	}

	public PIM_AddEmployee_Job addFTE(String FTE) {

		driver.findElement(By.xpath("//label[text()='FTE']//parent::div//span[@class='caret']//following-sibling::input")).click();
		driver.findElement(By.xpath("//label[text()='FTE']//parent::div//span[contains(text(),'" + FTE + "')]"))
				.click();
		return this;
	}

	public PIM_AddEmployee_Job addTemporaryDepartment(String dept) {

		driver.findElement(By.xpath("//label[text()='Temporary Department']//parent::div//span[@class='caret']//following-sibling::input"))
				.click();
		driver.findElement(
				By.xpath("//label[text()='Temporary Department']//parent::div//span[contains(text(),'" + dept + "')]"))
				.click();
		return this;
	}

	public void clickSave() {

		driver.findElement(By.xpath("//div[@id='wizard-nav-button-section']/button[text()='Save']")).click();
	}

	public boolean isSuccessMessageDisplayed() {

		WebElement successMessageElement = driver.findElement(By.xpath("//div[@class='toast-message']"));
		wait.until(ExpectedConditions.visibilityOf(successMessageElement));
		return successMessageElement.isDisplayed();

	}

}
