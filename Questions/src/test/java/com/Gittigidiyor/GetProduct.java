package com.Gittigidiyor;

import org.junit.Test;

import org.junit.Assert;

public class GetProduct extends BaseClass{
	
	
	  @Test
	   public void GetProductTest() throws InterruptedException
	   {
		   
		   getURL("https://www.gittigidiyor.com/");
		   setById("search_word","Apple");
		   clickById("textSearch_ara");
		   int deger = Integer.parseInt(FindElement("//*[@id=\"search-result-info\"]/div[1]/div/div/span[2]/span").toString());
		   boolean state = true;
		   if(deger <= 0)
		   {
			  state = false;
		   }
		   Assert.assertTrue(state);
	   }
}
