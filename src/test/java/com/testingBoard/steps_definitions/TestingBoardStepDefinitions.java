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

import java.nio.charset.StandardCharsets;


public class TestingBoardStepDefinitions {
        LoginRegisterPage loginRegisterPage = new LoginRegisterPage();

        @Given("{string} visits the website")
        public void visits_the_website(String string) throws InterruptedException {
            //Driver.getDriver(ConfigurationReader.getProperty("browser")).get(ConfigurationReader.getProperty("url"));
            String Testvar = ConfigurationReader.getProperty("browser");
            System.out.println("Testvar: " + Testvar);

            String tempurl = ConfigurationReader.getProperty("url");
            System.out.println("tempurl: " + tempurl);
            Driver.getDriver().get(tempurl);
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
            loginRegisterPage.inputUserName.sendKeys(ConfigurationReader.getProperty("email_TEQS_TestUser1_Sub"));
            loginRegisterPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password_TEQS_TestUser1_Sub"));
            break;
            case "Contributor":
            loginRegisterPage.inputUserName.sendKeys(ConfigurationReader.getProperty("email_TEQS_TestUser3_Contr"));
            loginRegisterPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password_TEQS_TestUser3_Contr"));
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

        @Given("{string} visits the website with credentials")
        public void visits_the_website_with_credentials(String string) throws InterruptedException {
            //Driver.getDriver(ConfigurationReader.getProperty("browser")).get(ConfigurationReader.getProperty("url"));
            String Testvar = ConfigurationReader.getProperty("browser");
            System.out.println("Testvar: " + Testvar);

            String tempurl = ConfigurationReader.getProperty("url");
            System.out.println("tempurl: " + tempurl);
            Driver.getDriver().get(tempurl);
            Thread.sleep(4000);
            loginRegisterPage.CookieAcceptButton.click();
        }


        @Given("user enters {string} or User enters {string} as Login")
        public void user_enters_or_user_enters_as_login() {
            switch("user"){

                case "Subscriber":
                    loginRegisterPage.inputUserName.sendKeys(ConfigurationReader.getProperty("email_TEQS_TestUser1_Sub"));

                    loginRegisterPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password_TEQS_TestUser1_Sub"));
                    break;
                case "Contributor":
                    loginRegisterPage.inputUserName.sendKeys(ConfigurationReader.getProperty("email_TEQS_TestUser3_Contr"));
                    loginRegisterPage.inputPassword.sendKeys(ConfigurationReader.getProperty("password_TEQS_TestUser3_Contr"));
                    break;
                default:
                    System.out.println("Es liegt ein Problem vor, denn es wurde kein passender Browser gefunden!");
                    break;
            }
        }


        @When("user clicks Login\\/ Register button")
        public void user_clicks_login_register_button() {

        }
        @When("user sees the username and password box")
        public void user_sees_the_username_and_password_box() {

        }
        @Then("user enters the username and password")
        public void user_enters_the_username_and_password() {

        }
        @Then("user clicks on AnmeldenButton")
        public void user_clicks_on_anmelden_button() {

        }
        @Then("Loin\\/Register Button disappears")
        public void loin_register_button_disappears() {

        }
    }

