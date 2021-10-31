package com.TechnoCredits.orghrm.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PreDefinedActions {

	protected static WebDriver driver;

	public static void start() {

		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		System.out.println("STEP:  Launch the Chrome browser");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("STEP:  Launch the Org HRM website");
		driver.get("https://kdani-trials72.orangehrmlive.com/auth/login");
		driver.manage().window().maximize();
	}

	public void start(String url) {

		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		System.out.println("STEP:  Launch the Chrome browser");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("STEP:  Launch the Org HRM website");
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void close() {
		driver.close();
	}

	public void quit() {
		driver.quit();
	}
}
