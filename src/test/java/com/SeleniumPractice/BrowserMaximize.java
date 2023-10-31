package com.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserMaximize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.youtube.com/results?search_query=redsongs");
//		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver=new EdgeDriver();
//		
//		driver.get("https://www.youtube.com/results?search_query=redsongs");
//		driver.manage().window().maximize();

		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start - maximized");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/results?search_query=redsongs");
		
		
		
		
	}

}
