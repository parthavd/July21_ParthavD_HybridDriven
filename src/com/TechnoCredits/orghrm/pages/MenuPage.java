package com.TechnoCredits.orghrm.pages;

import org.openqa.selenium.By;

import com.TechnoCredits.orghrm.base.PreDefinedActions;

public class MenuPage extends PreDefinedActions {

	public void navigateTo(String str) {

		String[] strArr = str.split("-");
		for (String element : strArr) {
			driver.findElement(By.xpath("//span[text()='" + element + "']")).click();
		}
	}

}
