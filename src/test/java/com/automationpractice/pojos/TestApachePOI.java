package com.automationpractice.pojos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestApachePOI {
	
	//XSSFWorkbook - they work with excel files after 2007+ years
	
	//hSSFWorkbook = they work with excel files pre 2007 years
	
	
	public static void main (String[] args) throws IOException {
		
		FileInputStream f = new FileInputStream("data.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(f);
		
		XSSFSheet sheet = wb.getSheet("data");
		
		XSSFRow headerRow = sheet.getRow(0);
		
		XSSFCell cell = headerRow.getCell(2);
		
		
		
		int  noOfRows = sheet.getLastRowNum();
		
		int noOfColumns = sheet.getLastRowNum();
		
		
		
		for (int i = 0; i<noOfRows; i++) {
			for (int j = 0; j<noOfColumns; j++) {
				
			XSSFCell cell2 = sheet.getRow(i).getCell(j);
			System.out.print(cell2 + "\t");
			
		}
			
			System.out.println();
	}
	
	}
	
	
	
	
	
	

}
