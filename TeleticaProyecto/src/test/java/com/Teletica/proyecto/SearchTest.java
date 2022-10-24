package com.Teletica.proyecto;


import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {
private WebDriver driver;
	
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.teletica.com/");
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testTeletica() {
 		driver.findElement(By.xpath("//a[@class=\"icon icon-search\"]")).click();
 		WebElement searchbox = driver.findElement(By.xpath("//input[@id=\"Query\"]"));
 		searchbox.clear();
 		searchbox.sendKeys("Noticias de futbol");
 		searchbox.submit();
 		
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
	}
}
