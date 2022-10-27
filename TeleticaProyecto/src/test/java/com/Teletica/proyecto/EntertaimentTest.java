package com.Teletica.proyecto;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EntertaimentTest {
	
	 private WebDriver driver;
	    By sectionLinkLocator = By.linkText("ENTRETENIMIENTO");
	    By sectionPageLocator = By.xpath("//*[@id=\"content\"]/div[4]/div[1]/div/div/h1");



	   @Before
	    public void setUp() throws Exception {
	        
	        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.teletica.com/");
	    }

	   @Test
	    public void testEntretenimiento() throws InterruptedException {
	        driver.findElement(sectionLinkLocator).click();
	        Thread.sleep(5000);
	        driver.findElement(sectionPageLocator);

	   }

	}


