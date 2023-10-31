package com.SeleniumPractice;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoadTimeout {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
driver.manage().window().maximize();

Instant starttime= Instant.now();
System.out.println(starttime.toString());

driver.get("http://www.amazon.in/");
Instant endtime=Instant.now();
System.out.println(endtime.toString());
Duration duration=Duration.between(starttime, endtime);
System.out.println("pageload time:"+duration.toSeconds()+"seconds");
System.out.println(driver.getTitle());
driver.quit();




		
		
		

	}

}
