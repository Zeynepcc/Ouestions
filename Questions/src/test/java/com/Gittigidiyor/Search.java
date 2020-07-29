package com.Gittigidiyor;

import org.junit.Test;

import org.junit.Assert;

public class Search extends BaseClass {
	

	   
	   @Test
	    public void searchTest() throws InterruptedException{
		     
		    getURL("https://www.gittigidiyor.com/");
		    setById("search_word","Samsung");
		    clickById("textSearch_ara");
		    Assert.assertEquals("Samsung", FindElement("//*[@id=\"search-result-info\"]/div[1]/div/div/h1/span"));
		   
		    

	   }
	   
	   
	 }