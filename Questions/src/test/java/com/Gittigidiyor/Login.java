package com.Gittigidiyor;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import junit.framework.Assert;

public class Login extends BaseClass {
	
	//zt1997 zeynepturhan0

    @Test
    public void loginTest() throws InterruptedException{

    	getURL("https://www.gittigidiyor.com/uye-girisi");
        setById("L-UserNameField", "zeynepturhan0");
        setById("L-PasswordField", "zt1997");
        clickById("gg-login-enter");
        Thread.sleep(2000);
        assertEquals(driver.getTitle(), "GittiGidiyor – Türkiye'nin Öncü Alýþveriþ Sitesi");
    }

}
