package com.sample.Automation_Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_data 
{
	public static String cellvalue;
	public static String read_particular_data(String path, int cellindex, int rowindex) throws IOException
	{
	File file=new File(path);
	FileInputStream fis= new FileInputStream(file);
	Workbook workbook=new XSSFWorkbook(fis);
	Sheet sheet=workbook.getSheetAt(0);
	Row row=sheet.getRow(0);
	Cell cell=row.getCell(0);
	CellType celltype=cell.getCellType();
	if(celltype.equals(CellType.STRING))
	{
		double cellval=cell.getNumericCellValue();
		int icellval=(int)cellval;
		 cellvalue=Integer.toString(icellval);
	}
	else if(celltype.equals(CellType.STRING))
	{
		 cellvalue=cell.getStringCellValue();
	}
	return cellvalue;
}
}
