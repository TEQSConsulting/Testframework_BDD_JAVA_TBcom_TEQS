package com.testingBoard.steps_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_Step_definitions {

    @Given("user is on the library login page")
    public void user_is_on_the_library_login_page() {
        System.out.println("user is on the library login page");
    }




    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("User enters Librarian username");

    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("User enters Librarian password");

    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("user should see the dashboard");


    }


    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("user enters student name");
    }

    @When("user enters student password")
    public void userEntersStudentPassword() {
        System.out.println("user enters student password");
    }

    @When("user enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("user enters admin username");
    }

    @When("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("user enters admin password");
    }
}
