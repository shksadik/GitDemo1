package com.SeleniumPractice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCalendars {

	public static void main(String[] args)throws Exception {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
//
//		
//driver.findElement(By.id("first_date_picker"));
//
//driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar]//a[text()="+day+"]")).click();
// 
//
//
//driver.findElement(By.id("second_date_picker"));
//
//driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()=30]")).click();

String targetdate="05/Feb/2024";

Calendar calendar=Calendar.getInstance();

SimpleDateFormat targetdateformat =new SimpleDateFormat("dd/MMM/yyyy");
Date formattedtargetdate = targetdateformat.parse(targetdate);
calendar.setTime(formattedtargetdate);
System.out.println(formattedtargetdate);
int targetmonth=calendar.get(calendar.MONTH);
int targetyear=calendar.get(calendar.YEAR);
int targetday =calendar.get(calendar.DAY_OF_MONTH);

driver.findElement(By.id("first_date_picker"));

String currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
calendar.setTime( new SimpleDateFormat("MMM yyyy").parse(currentDate));

int currentMonth=calendar.get(Calendar.MONTH);
int currentYear=calendar.get(Calendar.YEAR);  


while(currentMonth < targetmonth || currentYear < targetyear)  {
	driver.findElement(By.className("ui-datepicker-PREV")).click();
	 currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
	calendar.setTime( new SimpleDateFormat("MMM yyyy").parse(currentDate));
	System.out.println(formattedtargetdate);
	currentMonth=calendar.get(calendar.MONDAY);
	 currentYear=calendar.get(calendar.YEAR);
	
	
}
driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar]//a[text()="+targetday+"]")).click();
  	


	}

}
