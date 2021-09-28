package com.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;

    public static void launch_chrome(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void openURL(String URL){
        driver.get(URL);
    }

    public static void Close_Chrome(){
        driver.close();
    }

    public static void smallWait(){
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void MediumWait(){
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void LongWait(){
        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void CustomWait(int milliSeconds){
        try {
            Thread.sleep(milliSeconds);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void implicitWait(int Seconds){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public String getPageTittle(){
        return driver.getTitle();
    }

    public String getPageUrl(){
        return driver.getCurrentUrl();
    }
    public static void ClickOnElementByID(String locator){
        driver.findElement(By.id(locator)).click();
    }

    public static void ClickOnElementByCSS(String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }
    public static void typeOnElementByID(String locator,String value){
        driver.findElement(By.id(locator)).sendKeys(value);
    }
    public static void typeOnElementByCSS(String locator,String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }
    public static void clearElementByID(String locator){
        driver.findElement(By.id(locator));
    }
    public static void clearElementByCSS(String locator){
        driver.findElement(By.cssSelector(locator));
    }
    public static void switchToIFrame(String locator){
        driver.switchTo().frame(locator);
    }
}

