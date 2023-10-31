package com.SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathPractice {

	//public static WebDriver driver=new ChromeDriver();

	//private static final JavascriptExecutor driver2 = null;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
	
	
		
//		chapter3
//		driver.findElement(By.xpath("//a[@id='w3loginbtn']")).click();
//		driver.findElement(By.xpath("//a[@title=\"Search W3Schools\"]")).click();
		
		
//		chapter5
//	driver.findElements(By.xpath("//input[@maxlength=10 and @name=\"name\" ]"));
//	driver.findElement(By.xpath("//input[@maxlength!=10]"));
//	List<WebElement> values=driver.findElements(By.xpath("//input[not(@maxlength=10)]"));
//	
//		System.out.println(values.size());
//	
//	chapter6 xpath with index
		
//		driver.findElement(By.xpath("//table[@id='contactlist']/tbody/tr[2]"));
//		driver.findElement(By.xpath("//table[@id='contactlist']/tbody/tr/td[15]"));
			
		
//		chapter7 xpath conditios
		
//		driver.findElement(By.xpath("//a[text()='Sign in']"));
		
//		driver.findElement(By.xpath("//h1[text()='Register']"));
		
//		driver.findElement(By.xpath("//label[text()='Email']"));
		
//		driver.findElement(By.xpath("//a[contains(text(),'Sign in into account')]"));
		
//		driver.findElement(By.xpath("//div[contains(@class,'container signin')]"));
		
//		driver.findElement(By.xpath("//a[starts-with(text(),'Sign in into ')]"));
		
//		driver.findElement(By.xpath("//label[normalize-space(text()='First Name')]"));
//		driver.findElement(By.xpath("(//table[@id=\"contactList\"]/tbody/tr)[last()]"));
		
//		System.out.println(driver.findElements(By.xpath("(//table[@id='contactList']/tbody/tr)[position()>2]")).size());
		
		
//  driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']"));
		
		
//		highlight(driver,driver.findElement(By.xpath("//h1[text()='Register']")));
//		
//		highlight(driver, driver.findElement(By.xpath("//a[contains(.,'Sign in into account')]")));
//		highlight(driver, driver.findElement(By.xpath("//td[starts-with(.,'Maria')]")));
//		highlight(driver,driver.findElement(By.xpath("//label[normalize-space(.)='First Name']")));

//		highlight(driver,driver.findElement(By.xpath("//div[@class='container']/child::h1")));
//		highlight(driver,driver.findElement(By.xpath("//h1[text()='Register']/..")));

//highlight(driver,driver.findElement(By.xpath("//table[@id='contactList']//td[18]")));
//	
//	List<WebElement> elements= driver.findElements(By.xpath("//table[@id='contactList']//td"));
//	for (WebElement element : elements)
//		{
//			highlight(driver, element);
//		}
//		highlight(driver, driver.findElement(By.xpath("//label[text()='Last Name']")));
//		highlight(driver, driver.findElement(By.xpath("//label[text()='Password']")));
		
//		highlight(driver, driver.findElement(By.xpath("//div[contains(@class, 'container signin')]")));
		
//		highlight(driver, driver.findElement(By.xpath("//div[starts-with(@class,'container ')]")));
		
//		highlight(driver, driver.findElement(By.xpath("//label[normalize-space(text())='First Name']")));
		
		
//		highlight(driver, driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr)[last()]")));
		
//		highlight(driver, driver.findElement(By.xpath("(//table[@id='contactList']/tbody/tr)[position()=4 ]")));
		
//		highlight(driver, driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input")));
//		highlight(driver, driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[1]")));
		
		
//		highlight(driver, driver.findElement(By.xpath("//td[text()='Francisco Chang']/preceding-sibling::td")));
		
//		highlight(driver, driver.findElement(By.xpath("//table[@id='contactList']/child::tbody/child::tr[3]")));
//		highlight(driver, driver.findElement(By.xpath("//table[@id='contactList']/child::tbody/child::tr")));
		
//		highlight(driver,driver.findElement(By.xpath("//td[text()='Roland Mendel']/parent::tr")));
		
//		highlight(driver, driver.findElement(By.xpath("//td[text()='Francisco Chang']/parent::tr")));
	
//		highlight(driver, driver.findElement(By.xpath("//label[text()='Password']/following::input[1]")));
//		highlight(driver, driver.findElement(By.xpath("//label[text()='Password']/preceding::input[1]")));
		highlight(driver, driver.findElement(By.xpath("//label[text()='Last Name']/preceding::input")));
		
	}
		
	
	
	public static void highlight(WebDriver driver,WebElement element) {
		JavascriptExecutor jsExecutor= (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style','border:2px solid red; background:yellow')",element);
	}
   
	}


