package com.TechnoCredits.orghrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.TechnoCredits.orghrm.base.PreDefinedActions;

public class PIM_AddEmployee extends PreDefinedActions {

	public PIM_AddEmployee Add_EmployeeName(String firstName, String lastName) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='first-name-box']")));
		driver.findElement(By.xpath("//input[@id='first-name-box']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@id='last-name-box']")).sendKeys(lastName);
		return this;
	}

	public PIM_AddEmployee Add_Location(String location) {
		driver.findElement(By.xpath("//div[contains(text(), 'Select')]")).click();
		driver.findElement(By.xpath("//a//span[contains(text(),'" + location + "')]")).click();
		return this;
	}

	public void clickNext() {
		driver.findElement(By.xpath("//button[@id='modal-save-button']")).click();
	}

}
