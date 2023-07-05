package org.automation.workstatus.base;

import org.automation.workstatus.utility.Utlity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverInstance {

	public WebDriver driver;

	@BeforeMethod
	public void initiateDriverInstance() throws Exception {
		if (Utlity.fetchPropertyValue("browserName").toString().equalsIgnoreCase("chrome")) {
			// WebDriverManager.chromedriver().setup();
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (Utlity.fetchPropertyValue("browserName").toString().equalsIgnoreCase("firefox")) {
			// WebDriverManager.firefoxdriver().setup();
			driver = new ChromeDriver();
		} else {
			driver = new ChromeDriver();
		}
		
		driver.get("https://app.newstaging.workstatus.io/auth/login");
	}

	@AfterMethod
	public void closeDriverInstance() {
		driver.close();
	}
}
