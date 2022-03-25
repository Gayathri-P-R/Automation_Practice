package com.sample.Automation_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Item {
	public WebDriver driver;
	public Select_Item(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Faded')]")
	private static WebElement itshirt;
	public WebElement getitshirt()
	{
		return itshirt;
	}
	@FindBy(id="quantity_wanted")
	private static WebElement tshirtcnt;
	public WebElement gettshirtcnt()
	{
		return tshirtcnt;
	}
	@FindBy(id="group_1")
	private static WebElement shirtsize;
	public WebElement getsize()
	{
		return shirtsize;
	}
	@FindBy(name="Blue")
	private static WebElement shirtcolor;
	public WebElement getcolor()
	{
		return shirtcolor;
	}
	@FindBy(name="Submit")
	private static WebElement submit;
	public WebElement getsubmit()
	{
		return submit;
	}
}
