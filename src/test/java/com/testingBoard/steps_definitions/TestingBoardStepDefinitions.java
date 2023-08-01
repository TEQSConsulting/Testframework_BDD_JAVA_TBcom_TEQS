package com.testingBoard.steps_definitions;

import com.testingBoard.pages.LoginRegisterPage;
import com.testingBoard.utilities.ConfigurationReader;
import com.testingBoard.utilities.WebDriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


    public class TestingBoardStepDefinitions {
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage();

        @Given("subscriber visits the website")
        public void subscriber_visits_the_website() {
            WebDriver driver = WebDriverFactory.getDriver("Chrome");
            driver.get(ConfigurationReader.getProperty("url"));
            loginRegisterPage.CookieAcceptButton.click();



        }
        @When("subscriber clicks Login\\/ Register button")
        public void subscriber_clicks_login_register_button() {
            loginRegisterPage.loginRegisterButton.click();

        }


        @When("subscriber sees the username and password box")
        public void subscriber_sees_the_username_and_password_box() {
            loginRegisterPage.loginRegistrationHeading.isDisplayed();

        }
        @Then("subscriber enters the username and password")
        public void subscriber_enters_the_username_and_password() {
            loginRegisterPage.inputUserName.sendKeys(ConfigurationReader.getProperty("emailSubsciber1"));
        }
        @Then("subscriber clicks on AnmeldenButton")
        public void subscriber_clicks_on_anmelden_button() {
            loginRegisterPage.inputPassword.sendKeys(ConfigurationReader.getProperty("passwordSubscribers1"));

        }
        @Then("Login\\/Register Button disappears")
        public void login_register_button_disappears() {
            loginRegisterPage.LoginAnmeldenButton.sendKeys(Keys.ENTER);

        }
    }


