package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args)  throws Exception {
   WebDriverManager.chromedriver().setup();
  	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.fb.com/");
		

JavascriptExecutor jsExecutor=(JavascriptExecutor) driver;
//WebElement element=(WebElement) jsExecutor.executeScript("return document.evaluate(\"//input[@id='email']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue;");
//element.sendKeys("css");

//jsExecutor.executeScript("document.getElementsByTagName('input')[3].value='sadikbasha';  ");
//jsExecutor.executeScript("document.querySelector('#email').value='css'; ");
// jsExecutor.executeScript("document.evaluate(\"//input[@id='email']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.value='sadik' ; ");

//jsExecutor.executeScript("document.getElementsByName('login')[0].click();");

//jsExecutor.executeScript("document.getElementById('email').value='s.sadikbasha143@gmail.com';");
//jsExecutor.executeScript("document.getElementById('pass').value='Sadik@01'; ");
//jsExecutor.executeScript("document.getElementsByName('login')[0].click(); ");


//jsExecutor.executeScript("document.getElementById('email').style.border='5px red solid';");
//Thread.sleep(3000);
//jsExecutor.executeScript("document.getElementById('email').style.background='yellow' ; ");

 jsExecutor.executeScript("document.getElementById('email').setAttribute('style','border:3px red solid;background:yellow');");

//jsExecutor.executeScript("window.scrollTo(0,500)");
//Thread.sleep(3000);
//
//jsExecutor.executeScript("window.scrollBy(500,1000)");

//jsExecutor.executeScript("document.getElementById('ty_footer').scrollIntoView();");
		  
//WebElement username=driver.findElement(By.id("email"));
//jsExecutor.executeScript("arguments[0].setAttribute('style','border:3px red solid;background:yellow');", username);

 

	}
}
	
