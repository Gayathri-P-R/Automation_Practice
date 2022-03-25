package com.sample.Automation_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Subcategory_page {
	public WebDriver driver;
	public Subcategory_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[text()='Tops'])[3]")
	private static WebElement tops;
	public WebElement gettops()
	{
		return tops;
	}
	@FindBy(xpath="(//a[text()='T-shirts'])[4]")
	private static WebElement tshirt;
	public WebElement gettshirt()
	{
		return tshirt;
	}
	
	

}
