package com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
//System.out.println(driver.findElement(By.id("continue")).getTagName());

//System.out.println(driver.findElement(By.id("continue")).getAttribute("type"));
//WebElement usernametxt=driver. findElement(By.id("ap_email"));
//usernametxt.sendKeys("s.sadikbasha143@gmail.com");
//System.out.println(usernametxt.getAttribute("value"));

//driver.findElement(By.xpath("//input[@id='login_field']/preceding-sibling::label")).getText();
System.out.println(driver.findElement(By.id("continue")).getCssValue("background_color")) ;


driver.quit();

	}

}
