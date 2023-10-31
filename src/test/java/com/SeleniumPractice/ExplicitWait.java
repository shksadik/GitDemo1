package com.SeleniumPractice;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver, 5,500);
		
		driver.get("https://testproject.io/");
		String parentwindow=driver.getWindowHandle();
		
		driver.findElement(By.linkText("Login")).click();
		Set<String> windowhandles =driver.getWindowHandles();
		for(String windowhandle: windowhandles) {
			if(!windowhandle.equals(parentwindow)) {
				driver.switchTo().window(windowhandle);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
				driver.findElement(By.id("username")).sendKeys("hyr tutorials");
				
			}
		}
		
		
		

	}

}
