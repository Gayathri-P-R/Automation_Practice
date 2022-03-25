package com.sample.Automation_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	public WebDriver driver;
	public Home_Page(WebDriver driver2)
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Women']")
	private static WebElement WomenElement;
	public WebElement getWomenElement()
	{
		return WomenElement;
	}
	
}
