package com.Gittigidiyor;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class AddCard extends BaseClass{
	
	
	@Test
	public void AddCardTest() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		clickById("homepage-gf-all-deals");
		js.executeScript("window.scrollBy(0,800)");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[3]/div/div[2]/div[3]/div/ul/li[1]/a/div/p"))).click();
		js.executeScript("window.scrollBy(0,900)");
		clickById("add-to-basket");
		Thread.sleep(5000);
		driver.navigate().to("https://www.gittigidiyor.com/sepetim");
		Assert.assertEquals("1", FindElement("//*[@id=\"title-box\"]/div/div[2]/p/span"));

		
		
	}
	
	

}
