package com.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriverManager.chromedriver().setup();
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("http://www.seleniumhq.org");
 
String currenturl= driver.getCurrentUrl();
System.out.println("currenturl" +currenturl);

String title=driver.getTitle();
 
System.out.println("title  -"  +title);

String pagesource=driver.getPageSource();
System.out.println("pagesource -" +pagesource);
	}

}
