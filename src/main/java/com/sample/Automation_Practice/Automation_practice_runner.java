package com.sample.Automation_Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Automation_practice_runner extends Automation_Practice_base
{	
	public static WebDriver driver=driver_configuration("chrome");
	public static Page_object_manager pom= new Page_object_manager(driver);
	public static Logger log= Logger.getLogger(Automation_practice_runner.class); 
	  public static void main( String[] args ) throws InterruptedException, IOException
    {
    	getUrl("http://automationpractice.com/index.php");
    	log.info("URL Launched");
		onclick(pom.getInstancelp().getlogin());
		sendkeys(pom.getInstancelp().getemail(),read_particular_data("C:\\Users\\kannan\\OneDrive\\Desktop\\Java\\TestData.xlsx",1,0));
		sendkeys(pom.getInstancelp().getpassword(),read_particular_data("C:\\Users\\kannan\\OneDrive\\Desktop\\Java\\TestData.xlsx",1,1));
		onclick(pom.getInstancelp().getsubmit());
		log.info("Logged in successfully");
		onclick(pom.getInstancehp().getWomenElement());
		onclick(pom.getInstancesp().gettops());
		onclick(pom.getInstancesp().gettshirt());
		onclick(pom.getInstancesi().getitshirt());
		onclear(pom.getInstancesi().gettshirtcnt());
		sendkeys(pom.getInstancesi().gettshirtcnt(),"2");
		dropdown(pom.getInstancesi().getsize(),"Index","1");
		onclick(pom.getInstancesi().getcolor());
		Thread.sleep(3000);
		onclick(pom.getInstancesi().getsubmit());
		log.info("Items added to cart");
		Thread.sleep(7000);
		onclick(pom.getInstancep().getproceed());
		onclick(pom.getInstancep().getproceed1());
		onclick(pom.getInstancep().getprocess());
		onclick(pom.getInstancep().getcheck());
		Thread.sleep(2000);
		onclick(pom.getInstancep().getcarrier());
		onclick(pom.getInstancep().getbank());
		onclick(pom.getInstancep().getorder());
		log.info("Order is placed successfully");
		
		screenshot("System.getProperty(\"user.dir\")+\"\\Screenshot\\adactin.png");
		
		
    }
}
