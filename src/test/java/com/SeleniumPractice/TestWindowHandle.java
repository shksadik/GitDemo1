package com.SeleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWindowHandle {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//		driver.findElement(By.id("newWindowBtn")).click();
//		Thread.sleep(3000);
//		String parentWindowHandle= driver.getWindowHandle();
//		System.out.println("parent windowHandle- "+parentWindowHandle);
//		Set<String> WindowHandles=driver.getWindowHandles();
//		for (String WindowHandle : WindowHandles);{
//			System.out.println("windowhandle");
//			driver.quit();
		
		String parentWindowHadle = driver.getWindowHandle();
		System.out.println("parent window handle- " +parentWindowHadle +driver.getTitle());
		driver.findElement(By.id("newTabBtn")).click();
		Set<String>windowHandles=driver.getWindowHandles();
		for(String WindowHandle : windowHandles) {
			if (WindowHandle.equals(parentWindowHadle));
			driver.switchTo().window(WindowHandle);
			System.out.println(driver.findElement(By.id("output")).getText());
			driver.findElement(By.id("alertbox")).click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			System.out.println(driver.findElement(By.id("output")).getText());
			Thread.sleep(3000);
			driver.close();
			
				
			}
		}
		
		
		
		
		}
		
			

	


