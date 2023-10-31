package com.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test2 {
	
	public static void main(String[] args)throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/ " );
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
	}
	


	

}
