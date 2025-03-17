package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test
    public void newUserRegistrationPositiveTest(){
        click(By.cssSelector("[href='/login']"));

        type(By.name("email"), "antonfuga1991@gmail.com");

        type(By.name("password"), "Anton0807!$");
        //click on Registration
        click(By.name("registration"));

        //verify SingOut button is displayed
        Assert.assertTrue(isElementPresent(By.xpath("//button[.='Sign Out']")));

    }

    @Test
    public void existedUserRegistrationNegativeTest(){

        click(By.cssSelector("[href='/login']"));
        type(By.name("email"), "antonfuga1991@gmail.com");

        type(By.name("password"), "Anton0807!$");
        //click on Registration
        click(By.name("registration"));

        //verify Alert is displayed

        Assert.assertTrue(isAlertDisplayed());

    }


    //click on login link
    //enter email
    // enter pass
    // click registration button


}
