package com.sample.Automation_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	public WebDriver driver;
	public Login_page(WebDriver driver2)
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='login']")
	private  WebElement login;
public WebElement getlogin()
{
	return login;
}

@FindBy(id="email")
private WebElement email;
public WebElement getemail()
{
return email;	
}

@FindBy(id="passwd")
private WebElement password;
public WebElement getpassword()
{
	return password;
}

@FindBy(id="SubmitLogin")
private WebElement submit;
public WebElement getsubmit()
{
	return submit;
}
}
