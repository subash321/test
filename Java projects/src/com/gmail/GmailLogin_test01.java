
package com.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class GmailLogin_test01 {
 
public static void main(String[] args){
 
//Firefox browser instantiation
WebDriver driver = new FirefoxDriver();
 
//Loading the gmail URL
driver.get("https://accounts.google.com/ServiceLogin?hl=en&continue=https://www.google.co.in/%3Fgws_rd%3Dcr");
 
//User name input field identification and data entered
WebElement usernametext = driver.findElement(By.name("Email"));
usernametext.sendKeys("esob.321321@gmail.com"); //put your actual username
 
//Password input field identification and data entered
WebElement passwordtext = driver.findElement(By.name("Passwd"));
passwordtext.sendKeys("chandrachandra"); //put your actual password
 
//Sign in button identification and click it
WebElement signinbutton = driver.findElement(By.name("signIn"));
signinbutton.click();
 
//Closing the browser
driver.close();
 
}
}