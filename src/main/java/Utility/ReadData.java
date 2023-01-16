package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {
	
	public static String ReadDataPropertyFile(String value) throws Exception
	{
		Properties p = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Project17Sep\\TestData\\Cofig.properties");
	    p.load(file);
	    return p.getProperty(value);
	}  
	public static String testData(int row,int cel) throws Exception
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Project17Sep\\TestData\\TestData.xlsx");
	   Sheet excel = WorkbookFactory.create(file).getSheet("Sheet1");
	   String value = excel.getRow(row).getCell(cel).getStringCellValue();
	    return value;
	
	}

}
