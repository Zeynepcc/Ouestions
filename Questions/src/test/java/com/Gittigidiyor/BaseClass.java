package com.Gittigidiyor;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	
	
    public static WebDriver driver;
    WebDriverWait wait ;

    @Before
    public void baglantiSagla(){
    	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.gittigidiyor.com/");
    }
    
    @After
    public void baglantiKes(){
        driver.quit();
    }
    public String FindElement(String link)
    {
    	WebElement loginLink = driver.findElement(By.xpath(link));
    	return loginLink.getText();
    }
    public void setById(String id, String value) throws InterruptedException{
    	
    	//WebDriverWait wait = new WebDriverWait(driver,30);
        driver.findElement(By.id(id)).clear();
        driver.findElement(By.id(id)).sendKeys(value);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id))).sendKeys(value);
    }
    public void clickById(String id) throws InterruptedException{
    	
    	Thread.sleep(3000);
        driver.findElement(By.id(id)).click();
    }
    public void getURL(String URL) throws InterruptedException{
    	
    	Thread.sleep(3000);
    	driver.get(URL);
    	
    }
}
