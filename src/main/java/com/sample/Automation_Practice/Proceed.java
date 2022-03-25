package com.sample.Automation_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed {
public WebDriver driver;
public Proceed(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[@title='Proceed to checkout']")
private static WebElement proceed;
public WebElement getproceed()
{
	return proceed;
}
@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
private static WebElement proceed1;
public WebElement getproceed1()
{
	return proceed1;
}
@FindBy(name="processAddress")
private static WebElement process;
public WebElement getprocess()
{
	return process;
}
@FindBy(id="cgv")
private static WebElement check;
public WebElement getcheck()
{
	return check;
}
@FindBy(name="processCarrier")
private static WebElement carrier;
public WebElement getcarrier()
{
	return carrier;
}
@FindBy(xpath="//a[contains(@title,'bank')]")
private static WebElement bank;
public WebElement getbank()
{
return bank;	
}
@FindBy(xpath="//span[contains(text(),'order')]/parent::button")
private static WebElement order;
public WebElement getorder()
{
return order;	
}

}
