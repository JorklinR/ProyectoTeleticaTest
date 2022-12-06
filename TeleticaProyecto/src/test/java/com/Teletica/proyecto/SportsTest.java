package com.Teletica.proyecto;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SportsTest {

	    
	    private WebDriver driver;
	    By registerLinkLocator = By.linkText("DEPORTES");
	    //By registerPageLocator = By.xpath("By");
	    //By registerLinkLocator1 = By.linkText("QATAR2022");
	    @Before
	    public void setUp() throws Exception {
	        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.teletica.com/");
	    }
        
	   @Test
	    public void test() throws InterruptedException {

	    WebElement hoverable = driver.findElement(By.xpath("//a[@href=\"/deportes\"]"));
        new Actions(driver)
                .moveToElement(hoverable)
                .perform();

	    }
}
