package com.qaselenium;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

@Test
public class BackUse_NewTest {
    Selenium selenium;

    @BeforeClass	
    @Parameters({ "selenium.host", "selenium.port", "selenium.browser","selenium.url" })
    public void beforeClass(String host, String port, String browser, String url) throws InterruptedException {
        this.selenium = new DefaultSelenium(host, Integer.parseInt(port),
                browser, url);
//        Thread.sleep(13569); 
        System.out.println("Selenium");
        this.selenium.start();
        this.selenium.open("");
    }

    @AfterClass
    public void afterClass() {
        this.selenium.close();
        this.selenium.stop();
    }

    @Parameters({ "searchCriteria" })
    public void testGoogleSearch(String criteria) {
    	System.out.println("SeleniumGridtes");
        this.selenium.type("name=q", criteria);
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }   
}