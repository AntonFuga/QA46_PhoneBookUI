package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test

    public void loginPositiveTests(){
        click(By.cssSelector("[href='/login']"));

        type(By.name("email"), "antonfuga1991@gmail.com");

        type(By.name("password"), "Anton0807!$");

        //click on login button
        click(By.name("login"));

        //verify SingOut button is displayed
        Assert.assertTrue(isElementPresent(By.xpath("//button[.='Sign Out']")));
    }

}
