package org.automation.workstatus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUsername(String uname) {
		driver.findElement(By.id("mat-input-1")).sendKeys("ashwani.pandey@mail.vinove.com");
	}
	
	public void enterPassword(String passwoord) {
		driver.findElement(By.id("mat-input-2")).sendKeys("Pass@123");
	}
	
	public void clickonProceedToLogin() {
		driver.findElement(By.xpath("//span[text()=' Proceed To Login ']")).click();
	}
}
