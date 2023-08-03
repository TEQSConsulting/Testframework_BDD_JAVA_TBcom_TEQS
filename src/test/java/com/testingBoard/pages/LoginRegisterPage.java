package com.testingBoard.pages;

import com.testingBoard.utilities.ConfigurationReader;
import com.testingBoard.utilities.Driver;
import com.testingBoard.utilities.WebDriverFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class LoginRegisterPage {
    public LoginRegisterPage(){
        PageFactory.initElements(Driver.getDriver(ConfigurationReader.getProperty("browser")),this);

          }



    @FindBy(xpath ="//a[contains(text(),' Login / Register')]")
    public WebElement loginRegisterButton;

    @FindBy(xpath = "//a[@id='cn-accept-cookie']")
    public WebElement CookieAcceptButton;

    @FindBy(name = "h2")
    public WebElement loginRegistrationHeading;

    @FindBy(xpath = "//input[@name='log']")
    public WebElement inputUserName;

    @FindBy(xpath = "//input[@id='user_pass']")
    public WebElement inputPassword;

    @FindBy(xpath = "input[@value='Anmelden']")
    public WebElement LoginAnmeldenButton;



}


