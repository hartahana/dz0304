package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class ResultSearchPage {

    WebDriver driver;
    //private By javaPage = By.xpath("//a[@href=\"Java | Oracle\"");
    private By javaPage = By.xpath("//a[@href=\"https://www.java.com/\"]");
//    private By javaText = By.xpath("//div[@class=\"jvd0x1\"]/a/span");


    public ResultSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnJavaPage() {
        driver.findElement(javaPage).click();
    };

//    public void Compare(){
//      String text = javaText.findElement(driver).getText();
//      String trueText = "Загрузить Java Бесплатно";
//
//      if(text.equals(trueText)){
//          System.out.println("Проверка пройдена");
//      }
//      else {
//          System.out.println("Проверка не пройдена");
//      }
//
//    }
//
}
