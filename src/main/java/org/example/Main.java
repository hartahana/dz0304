package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://Users/sshtareva/Desktop/prog/chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chromeDriver.get("https://ya.ru/");

        StartPage startPage = new StartPage(chromeDriver);
        startPage.search("java");
        ResultSearchPage resultSearchPage = new ResultSearchPage(chromeDriver);
        resultSearchPage.clickOnJavaPage();
        JavaPage javaPage = new JavaPage(chromeDriver);
        javaPage.Compare();
        }
    }
