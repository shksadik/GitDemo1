package com.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDowns {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
//		driver.findElement(By.id("course"));
//		WebElement courseElement=driver.findElement(By.id("course"));
//		Select courseNameDropdown= new Select(courseElement);
//		courseNameDropdown.selectByIndex(1);
//		Thread.sleep(3000);  
//		courseNameDropdown.selectByValue("net");
//		Thread.sleep(3000);
//		courseNameDropdown.selectByVisibleText("javascript");
//		Thread.sleep(3000);
		
		 
		WebElement IdeElement=driver.findElement(By.id("ide"));
		Select IdeDropdown=new Select(IdeElement);
		List<WebElement> idedropdownOptiomns=IdeDropdown.getOptions();
		for(WebElement option : idedropdownOptiomns) {
		System.out.println(option.getText());	
		}
		IdeDropdown.selectByIndex(0);
		Thread.sleep(3000);
		IdeDropdown.selectByValue("ij");
		Thread.sleep(3000);
		IdeDropdown.selectByVisibleText("NetBeans");
		Thread.sleep(3000);
		IdeDropdown.deselectByVisibleText("Intellij IDEA");
		
		List<WebElement> selectedOptions = IdeDropdown.getAllSelectedOptions();
		for(WebElement selectedOption : selectedOptions) {
			System.out.println("Selected visible Text - " + selectedOption.getText());
			
		}
		
				
		
		
	}

}
 