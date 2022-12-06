package com.Teletica.proyecto;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsTest {
	private WebDriver driver;
    By noticiaLinkLocator = By.linkText("Gigantesco incendio ya consumió 60% de recicladora en La Guácima");
    By seccionNoticiaPageLocator = By.xpath("//*[@id=\"content\"]/div[4]/article/div/div[1]/div/h1");



   



   @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.teletica.com/");    
        
    }



   @Test
    public void testNoticia() throws InterruptedException {
        driver.findElement(noticiaLinkLocator).click();
        Thread.sleep(2000);
        
        driver.findElement(seccionNoticiaPageLocator);
        
    }
}
