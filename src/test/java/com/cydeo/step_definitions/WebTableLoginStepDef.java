package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLoginStepDef {
    WebTableLoginPage webTableLoginPage=new WebTableLoginPage();
    @When("user enters username {string}")
    public void user_enters_username(String username) {

        webTableLoginPage.inputUserName.sendKeys(username);

    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {
        webTableLoginPage.inputPassword.sendKeys(password);

    }
    @When("user click login button")
    public void user_click_login_button() {
        webTableLoginPage.loginBtn.click();

    }
    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));

    }

    @Given("User is in webTable Login page")
    public void userIsInWebTableLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.app.url"));
    }

    @When("user entres the username{string} and The password {string} to login")
    public void userEntresTheUsernameAndThePasswordToLogin(String arg0, String arg1) {
        webTableLoginPage.login(arg0,arg1);
    }

    @When("user enters bellow data")
    public void userEntersBellowData(Map<String, String> credentials) {
        webTableLoginPage.login(credentials.get("username"),credentials.get("password"));

    }
}
