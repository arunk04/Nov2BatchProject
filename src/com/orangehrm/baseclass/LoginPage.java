package com.orangehrm.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginPage  extends Constants{
@FindBy(id="txtUsername")
WebElement username;
@FindBy(id="txtPassword")
WebElement password;
@FindBy(id="btnLogin")
WebElement login;
public void loginPanel(String u,String p)
{
	username.sendKeys(u);
	password.sendKeys(p);
	login.click();
}

}
