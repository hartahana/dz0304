package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class StartPage {

    WebDriver driver;

    private By searchField = By.xpath("//input[@class=\"input__control input__input mini-suggest__input\"]");

    public StartPage(WebDriver driver) {
        this.driver = driver;
        };

    public void search(String searchString) {
        driver.findElement(searchField).sendKeys(searchString);
        driver.findElement(searchField).sendKeys(Keys.ENTER);

        }

    }
