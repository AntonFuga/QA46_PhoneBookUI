package com.phonebook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class AddContactTests extends TestBase{
    //login
    @BeforeMethod
    public void preconditions(){
        click(By.cssSelector("[href='/login']"));

        type(By.name("email"), "antonfuga1991@gmail.com");

        type(By.name("password"), "Anton0807!$");

        //click on login button
        click(By.name("login"));
    }

    @Test
    public void addContactPositiveTest(){
        //click on link ADD
        click(By.cssSelector("['href=/add']"));
        //enter name
        type(By.cssSelector("input:nth-child(1)"),"Kerty" );
        //enter Last Name
        type(By.cssSelector("input:nth-child(2)"),"sdg" );
        //enter Phone
        type(By.cssSelector("input:nth-child(3)"),"123456789" );
        //enter email
        type(By.cssSelector("input:nth-child(4)"),"karl@gmail.com" );
        //enter Address
        type(By.cssSelector("input:nth-child(5)"),"Rishon" );
        //enter description
        type(By.cssSelector("input:nth-child(6)"),"QA" );

        //click on Save button
        click(By.cssSelector(".add_from__2rsm2 button"));


        Assert.assertTrue(isContactAdd("Karl"));

    }

    public boolean isContactAdd(String text) {
        List<WebElement> contacts = driver.findElements(By.cssSelector("h2"));
        for (WebElement contact : contacts) {
            if (contact.getText().contains(text)) {
                return true;
            }
        }
        return false;
    }
@AfterMethod
    public void postConditions(){
       driver.findElement(By.cssSelector(".contact-item_card__2SOIM")).click();
       driver.findElement(By.xpath("//button[.='Remove']")).click();
}

    //verify that contact is add
}
