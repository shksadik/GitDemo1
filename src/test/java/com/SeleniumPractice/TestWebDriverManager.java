package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestWebDriverManager {

	public static void main(String[] args)  {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.fb.com/");
	
	}

}
