package com.Teletica.proyecto;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LiveTest {
	    
	    private WebDriver driver;
	    By registerLinkLocator = By.linkText("EN VIVO");
	    



	   @Before
	    public void setUp() throws Exception {
	        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.teletica.com/");    
	    }   

	   @Test
	    public void test() throws InterruptedException {
	    driver.findElement(registerLinkLocator).click();
	    driver.findElement(By.xpath("//a[@href=\"/vivo?canal=teletica-7\"]")).click();

	        
	    
	    }



	}

