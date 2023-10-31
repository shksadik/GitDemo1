package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleFrames {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("sadik");
		Thread.sleep(3000);
		driver.switchTo().frame("frm1");
		Select courseNamedropdown=new Select(driver.findElement(By.id("course")));
		courseNamedropdown.selectByVisibleText("Dot Net");
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("shaik");
		
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frm1");
		Select coursenamedropdown=new Select(driver.findElement(By.id("course")));
		coursenamedropdown.deselectByVisibleText("java");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
	
		driver.findElement(By.id("name")).sendKeys("audrey");
		
		
		
		
		
		
		

	}

}
