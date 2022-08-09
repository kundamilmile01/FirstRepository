package com.saucedemoUTILITYclasses;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotClass {
	
	static WebDriver driver;
	
public static void screenshootmethod(WebDriver driver) throws IOException 
{
	//date and time format code 
	    Date d = new Date();
	    DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
	    String date = d1.format(d);
	
	
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File destifile = new File("./ScreenshotFolder/filepp" + date + ".jpg");
		FileHandler.copy(sourcefile, destifile);

}
	
	
}
