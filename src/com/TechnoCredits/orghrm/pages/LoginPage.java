package com.TechnoCredits.orghrm.pages;

import org.openqa.selenium.By;

import com.TechnoCredits.orghrm.base.PreDefinedActions;

public class LoginPage extends PreDefinedActions {

	public LoginPage setUserName (String userName) {
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(userName);
		return this;
	}
	
	public LoginPage setPassword (String password) {
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
		return this;
	}
	
	public void clickLogin() {
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	}
	
	public String validateLogin() {
		return driver.findElement(By.xpath("//ul//li[text()='Dashboard']")).getText();
	}
	
	
	
	
}
