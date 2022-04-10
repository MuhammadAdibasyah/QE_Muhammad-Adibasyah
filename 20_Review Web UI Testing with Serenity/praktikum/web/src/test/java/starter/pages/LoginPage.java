package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    private By buttonLoginOnBookstore(){
        return By.xpath("//button[@id='login']");
    }

    private By formLogin(){
        return By.id("userForm");
    }

    private By usernameField(){
        return By.xpath("//input[@id='userName']");
    }

    private By passwordField(){
        return By.xpath("//input[@id='password']");
    }

    private By classLogin(){
        return By.className("form-label");
    }

    @Step
    public void clickLoginButtonOnBookstore(){
        $(buttonLoginOnBookstore()).click();
    }

    @Step
    public boolean validationOnLoginPage(){
        return $(formLogin()).isDisplayed();
    }

    @Step
    public void inputUsername(String username){
        $(usernameField()).type(username);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        enter();
    }

    @Step
    public boolean validationAfterLogin(){
        return $(classLogin()).isDisplayed();
    }
}
