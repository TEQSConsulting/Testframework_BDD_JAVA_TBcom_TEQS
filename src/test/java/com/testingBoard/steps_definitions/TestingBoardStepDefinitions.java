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
        public void visits_the_website(String string) throws InterruptedException {
            //Driver.getDriver(ConfigurationReader.getProperty("browser")).get(ConfigurationReader.getProperty("url"));
            String Testvar = ConfigurationReader.getProperty("browser");
            System.out.println("Testvar: " + Testvar);

            String tempurl = ConfigurationReader.getProperty("url");
            System.out.println("tempurl: " + tempurl);
            Driver.getDriver(ConfigurationReader.getProperty("browser")).get(tempurl);
            Thread.sleep(4000);
            loginRegisterPage.CookieAcceptButton.click();
        }

        @When("{string} clicks Login\\/ Register button")
        public void clicks_login_register_button(String string) {
            loginRegisterPage.loginRegisterButton.click();
        }

        @When("{string} sees the username and password box")
        public void sees_the_username_and_password_box(String string) {
            System.out.println("loginRegisterPage.inputUserName.isDisplayed() = " + loginRegisterPage.inputUserName.isDisplayed());
            System.out.println("loginRegisterPage.inputPassword.isDisplayed() = " + loginRegisterPage.inputPassword.isDisplayed());
        }

        @Then("{string} enters the username and password")
        public void enters_the_username_and_password(String string) {
            switch(string){

            case "Subscriber":
            loginRegisterPage.inputUserName.sendKeys(ConfigurationReader.getProperty("emailSubsciber1"));
            loginRegisterPage.inputPassword.sendKeys(ConfigurationReader.getProperty("passwordSubscribers1"));
            break;
            case "Contributor":
            loginRegisterPage.inputUserName.sendKeys(ConfigurationReader.getProperty("emailContributer"));
            loginRegisterPage.inputPassword.sendKeys(ConfigurationReader.getProperty("passwordContributer"));
            break;
            default:
            System.out.println("Es liegt ein Problem vor, denn es wurde kein passender Browser gefunden!");
            break;
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

