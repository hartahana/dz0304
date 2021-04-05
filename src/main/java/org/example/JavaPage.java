package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class JavaPage {

    WebDriver driver;
    private By javaText = By.xpath("//div[@class=\"jvd0x1\"]/a/span");

    public JavaPage(WebDriver driver) {
        this.driver = driver;
    }

    ;

    public void Compare() {
        String text = driver.findElement(javaText).getText();
        String trueText = "Загрузить Java Бесплатно";

        if (text.equals(trueText)) {
            System.out.println("Проверка пройдена");
        } else {
            System.out.println("Проверка не пройдена");
        }
    }

}
