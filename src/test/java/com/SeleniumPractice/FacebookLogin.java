package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("s.sadikbasha143@Gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("Sadik@01");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);

	}

}
