package utils;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	
	public static void captureScreenshot(WebDriver drivers,String testID) throws IOException
		{
			SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH mm SS");
			Date date=new Date();
			String screenshotNameFormat = "Test"+ testID + " " + formatter.format(date);
			
			File screenshot = ((TakesScreenshot)drivers).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(screenshot, new File("C:\\Users\\suraj\\OneDrive\\Desktop"
											+ "\\VCTC\\selenium screenshot\\by systemdate\\"+screenshotNameFormat+".png"));
		}
	
//	public static String dataFromExcel(String sheet,int row,int col) throws EncryptedDocumentException, IOException 
//	{
//		
//		String path = "D:\\SOFTWARE\\selenium\\data.xlsx";
//		
//		FileInputStream file = new FileInputStream(path);
//		  
//	    double name =  WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(col).getNumericCellValue();
//	    
//	    
//	    return dataFromExcel(sheet, row, col);
//		
//	}

}
