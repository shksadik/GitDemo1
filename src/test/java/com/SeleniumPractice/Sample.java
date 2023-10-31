package com.SeleniumPractice;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
	JavascriptExecutor jsexecutor=(JavascriptExecutor) driver;
	WebElement username1=driver.findElement(By.id("email"));
	WebElement username2=driver.findElement(By.id("pass"));
	jsexecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red;background:yellow');",username1);



	
				
	}

}
