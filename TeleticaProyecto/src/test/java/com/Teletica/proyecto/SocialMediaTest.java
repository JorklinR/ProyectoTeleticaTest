package com.Teletica.proyecto;


import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SocialMediaTest {
	
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
 		driver.findElement(By.className("facebook")).click();
 		
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		
	}

}
