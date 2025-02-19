package test.mobile.stepdefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import test.mobile.pages.RegisterPage;

import java.util.Random;

public class RegisterSteps {
    @Steps
    RegisterPage registerPage;

    //scenario 1
    @Given("android user on landing screen login page")
    public void androidUserOnLandingScreenLoginPage() {
        registerPage.onTheLoginPage();
    }

    @When("android user click to register")
    public void userClickToRegister(){
        registerPage.clickToRegister();
    }

    @And("user input name")
    public void userInputName() {
        registerPage.inputName("ucup");
    }

    @And("user input email")
    public void userInputEmail() {
        Random rand = new Random();
        int number = rand.nextInt(1000000);
        registerPage.inputEmail("user"+String.valueOf(number)+"@gmail.com");
    }

    @And("user input password")
    public void userInputPassword() {
        registerPage.inputPassword("Password!2");
    }

    @And("user click register button")
    public void userClickRegisterButton() {
        registerPage.clickRegisterButton();
    }

    @Then("user back to homepage")
    public void userBackToHomepage() {
        registerPage.backOnTheHomePage();
    }

    //scenario 2
    @And("user not input name")
    public void userNotInputName() {
        registerPage.inputName("");
    }

    @And("user not input email")
    public void userNotInputEmail() {
        registerPage.inputEmail("");
    }

    @And("user not input password")
    public void userNotInputPassword() {
        registerPage.inputPassword("");
    }

    @Then("user get error message")
    public void userGetErrorMessage() {
        registerPage.errorMessageNoEmail();
        registerPage.errorMessageNoName();
        registerPage.errorMessageNoPassword();
    }

    //scenario 3
    @And("user input registered email")
    public void userInputRegisteredEmail() {
        registerPage.inputEmail("debbb@gmail.com");
    }

    @Then("user get error message {string}")
    public void userGetErrorMessage(String error) {
        registerPage.errorMessageRegistered();
    }

    //scenario 4
    @Then("user get error message not input name")
    public void userGetErrorMessageNotInputName() {
        registerPage.errorMessageNoName();
    }

    //scenario 5
    @Then("user get error message not input email")
    public void userGetErrorMessageNotInputEmail() {
        registerPage.errorMessageNoEmail();
    }

    //scenario 6
    @Then("user get error message not input password")
    public void userGetErrorMessageNotInputPassword() {
        registerPage.errorMessageNoPassword();
    }
}
