package com.sample.Automation_Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_Practice_base {
	public static WebDriver driver;
	public static String cellvalue;
public static WebDriver driver_configuration(String type)
{	if(type.equalsIgnoreCase("chrome"))
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kannan\\OneDrive\\Desktop\\Java\\Selenium-java\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
}
else if(type.equalsIgnoreCase("Firefox"))
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\kannan\\OneDrive\\Desktop\\Java\\Selenium-java\\chromedriver.exe");
	driver= new ChromeDriver();
}
	return driver;
}

public static void getUrl(String url)
{
	driver.get(url);
}

public static void sendkeys(WebElement element,String value)
{
	element.sendKeys(value);
}

public static void onclick(WebElement element)
{
	element.click();
}

public static void onclear(WebElement element)
{
	element.clear();
}
public static void dropdown(WebElement element, String type,String value)
{
	Select s= new Select(element);
	if(type.equalsIgnoreCase("Index"))
	{	
		int val=Integer.parseInt(value);
		s.selectByIndex(val);
	}
	else if(type.equalsIgnoreCase("Value"))
	{
		s.selectByValue(value);
	}
	else if(type.equalsIgnoreCase("Text"))
	{
		s.selectByVisibleText(value);
	}
}
public static void screenshot(String path) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File destn=new File(path);
	FileUtils.copyFile(source, destn);
}

public static String read_particular_data(String path, int rowindex, int cellindex ) throws IOException
{
File file=new File(path);
FileInputStream fis= new FileInputStream(file);
Workbook workbook=new XSSFWorkbook(fis);
Sheet sheet=workbook.getSheetAt(0);
Row row=sheet.getRow(rowindex);
Cell cell=row.getCell(cellindex);
CellType celltype=cell.getCellType();
if(celltype.equals(CellType.NUMERIC))
{
	double cellval=cell.getNumericCellValue();
	int icellval=(int)cellval;
	 cellvalue=Integer.toString(icellval);
	System.out.println(cellvalue);
}
else if(celltype.equals(CellType.STRING))
{
	 cellvalue=cell.getStringCellValue();
	 System.out.println(cellvalue);
}
workbook.close();
return cellvalue;

}

}
