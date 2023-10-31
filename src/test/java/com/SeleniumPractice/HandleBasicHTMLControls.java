package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class HandleBasicHTMLControls {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(3000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("hindichbx")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("registerbtn")).click();
		System.out.println(driver.findElement(By.id("msg")).getText());
		Thread.sleep(3000);
		driver.findElement(By.linkText("click here to navigate to the home page")).click();
		

	}

}
