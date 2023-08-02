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



        @Given("{string} visits the website")
        public void visits_the_website(String string) {
            WebDriver driver = WebDriverFactory.getDriver("Chrome");
            driver.get(ConfigurationReader.getProperty("url"));
            loginRegisterPage.CookieAcceptButton.click();
        }

        @When("\"user \"clicks Login\\/ Register button")
        public void user_clicks_login_register_button() {
            loginRegisterPage.loginRegisterButton.click();
        }

        @When("{string} sees the username and password box")
        public void sees_the_username_and_password_box(String string) {
            loginRegisterPage.loginRegistrationHeading.isDisplayed();
        }

        @Then("\"user\"enters the username and password")
        public void user_enters_the_username_and_password() {
            loginRegisterPage.inputUserName.sendKeys(ConfigurationReader.getProperty("emailSubsciber1"));
            loginRegisterPage.inputPassword.sendKeys(ConfigurationReader.getProperty("passwordSubscribers1"));
        }

        @Then("\"user \"clicks on AnmeldenButton")
        public void user_clicks_on_anmelden_button() {
            loginRegisterPage.LoginAnmeldenButton.sendKeys(Keys.ENTER);

        }
        @Then("Login\\/Register Button disappears")
        public void login_register_button_disappears() {
    }
    }

