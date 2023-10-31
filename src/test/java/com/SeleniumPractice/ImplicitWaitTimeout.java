package com.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitTimeout {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
	
		driver.findElement(By.id("btn2")).click();
		driver.findElement(By.id("txt2")).sendKeys("sadik1");
		
		

	}

}
