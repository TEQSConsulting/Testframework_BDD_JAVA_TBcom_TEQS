package com.testingBoard.steps_definitions;

import com.testingBoard.pages.LoginRegisterPage;
import com.testingBoard.utilities.ConfigurationReader;
import com.testingBoard.utilities.Driver;
import com.testingBoard.utilities.WebDriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


    public class TestingBoardStepDefinitions {
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage();



        @Given("{string} visits the website")
        public void visits_the_website(String string) {
            Driver.getDriver(ConfigurationReader.getProperty("browser")).get(ConfigurationReader.getProperty("url"));
            loginRegisterPage.CookieAcceptButton.click();
        }

        @When("{string} clicks Login\\/ Register button")
        public void clicks_login_register_button(String string) {
            loginRegisterPage.loginRegisterButton.click();
        }

        @When("{string} sees the username and password box")
        public void sees_the_username_and_password_box(String string) {
            loginRegisterPage.loginRegistrationHeading.isDisplayed();
        }

        @Then("{string} enters the username and password")
        public void enters_the_username_and_password(String string) {

            if(string == "TEQS_TestUser1_Sub"){
            loginRegisterPage.inputUserName.sendKeys(ConfigurationReader.getProperty("emailSubsciber1"));
            loginRegisterPage.inputPassword.sendKeys(ConfigurationReader.getProperty("passwordSubscribers1"));
        }
            if(string=="TEQS_TestUser2_Sub"){
                loginRegisterPage.inputUserName.sendKeys(ConfigurationReader.getProperty("emailSubsciber2"));
                loginRegisterPage.inputPassword.sendKeys(ConfigurationReader.getProperty("passwordSubscribers2"));
            }else if(string =="TEQS_TestUser3_Contr ") {
                loginRegisterPage.inputUserName.sendKeys(ConfigurationReader.getProperty("emailContributer"));
                loginRegisterPage.inputPassword.sendKeys(ConfigurationReader.getProperty("passwordContributer"));
            }
        }

        @Then("{string} clicks on AnmeldenButton")
        public void clicks_on_anmelden_button(String string) {
            loginRegisterPage.LoginAnmeldenButton.sendKeys(Keys.ENTER);
        }
        @Then("Login\\/Register Button disappears")
        public void login_register_button_disappears() {
    }
    }

