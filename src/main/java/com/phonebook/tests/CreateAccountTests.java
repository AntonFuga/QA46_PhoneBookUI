package com.phonebook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test
    public void newUserRegistrationPisitiveTest(){
        driver.findElement(By.cssSelector("[href='/login']")).click();
        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("");

        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("Bonjov321");
        //click on Registration
        driver.findElement(By.name("registration")).click();

    }
    //click on login link
    //enter email
    // enter pass
    // click registration button
    //verify SingOut button is displayed

}
