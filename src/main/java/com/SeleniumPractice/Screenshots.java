package com.SeleniumPractice;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
//		File sourceFile=driver.getScreenshotAs(OutputType.FILE);
//		File destFile=new File("./Screenshots/img.jpg");
//		FileUtils.copyFile(sourceFile, destFile);
//		System.out.println("Screeonshots saved succesfully");
//		driver.quit();
		
//		driver.get("https://www.amazon.in/");
//		byte[] bytearray =driver.getScreenshotAs(OutputType.BYTES);
//		File destFile=new File("./Screenshots/img1.jpg");
//		FileOutputStream fos=new FileOutputStream(destFile);
//		fos.write(bytearray);
//		fos.close();
//		System.out.println("Screeonshots saved succesfully");
//		driver.quit();
//		
		
//		driver.get("https://www.flipkart.com/");
//		String Base64  =driver.getScreenshotAs(OutputType.BASE64);
//		byte[] bytearray=java.util.Base64.getDecoder().decode(Base64);
//		File destFile=new File("./Screenshots/img1.jpg");
//		FileOutputStream fos=new FileOutputStream(destFile);
//		fos.write(bytearray);
//		fos.close();
//		System.out.println("Screeonshots saved succesfully");
//		driver.quit();
		
		
//		driver.get("https://www.facebook.com/");
//		TakesScreenshot takescreenshot=(TakesScreenshot) driver;
//		File sourceFile=takescreenshot.getScreenshotAs(OutputType.FILE);
//		File destFile=new File("./Screenshots/img.jpg");
//		FileUtils.copyFile(sourceFile, destFile);
//		System.out.println("Screeonshots saved succesfully");
//		driver.quit();
//		
		
		
		driver.get("https://www.amazon.in/");
		TakesScreenshot takescreenshot=(TakesScreenshot) driver;
		
		byte[] bytearray =takescreenshot.getScreenshotAs(OutputType.BYTES);
		File destFile=new File("./Screenshots/img1.jpg");
		FileOutputStream fos=new FileOutputStream(destFile);
		fos.write(bytearray);
		fos.close();
		System.out.println("Screeonshots saved succesfully");
		driver.quit();
		
		
	}

}
