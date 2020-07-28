package com.Gittigidiyor;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Search extends BaseClass {
	

	   
	   @Test
	    public void searchTest() throws InterruptedException{
		     
		    getURL("https://www.gittigidiyor.com/");
		    setById("search_word","Samsung");
		    clickById("textSearch_ara");
		    Assert.assertEquals("Samsung", FindElement("//*[@id=\"search-result-info\"]/div[1]/div/div/h1/span"));
		   
		    

	   }
	   
	   
	 }