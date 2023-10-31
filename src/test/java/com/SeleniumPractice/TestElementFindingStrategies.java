package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver; 


public class TestElementFindingStrategies {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		Thread.sleep(3000);
		highlight(driver,driver.findElement(By.id(login_field)));
		Thread.sleep(3000);
		highlight(driver,driver.findElement(By.name("password")));
		Thread.sleep(3000);
		highlight(driver,driver.findElement(By.className("header-logo")));
		Thread.sleep(3000);
		highlight(driver,driver.findElement(By.linkText("Forget password?")));
		Thread.sleep(3000);
		highlight(driver,driver.findElement(By.partialLinkText("Create an")));
		Thread.sleep(3000);
		highlight(driver,driver.findElement(By.tagName("h1")));
		Thread.sleep(3000);
		highlight(driver,driver.findelement(By.xpath("//label[contains(text(),'username or email address')]")));
		Thread.sleep(3000);
		highlight(driver,driver.findElement(By.cssSelector("input[name='commit']")));
	}
	public static void highlight(WebDriver driver,WebElement element) 
		JavascriptExecutor jsExecutor =(javascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')";}

} 
