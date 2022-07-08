package com.cydeo.step_definitions;

import com.cydeo.pages.AllOrdersPage;
import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.pages.WebTableOdrerPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebTableOrderStepDef {
WebTableLoginPage webTableLoginPage=new WebTableLoginPage();
    WebTableOdrerPage webTableOdrerPage=new WebTableOdrerPage();

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.app.url"));
        webTableLoginPage.login("Test","Tester");
        webTableOdrerPage.orderUrl.click();
    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String productType) {
        Select select=new Select(webTableOdrerPage.product);
        select.selectByVisibleText(productType);

    }
    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer quantity) {
        webTableOdrerPage.quantityInput.clear();
        webTableOdrerPage.quantityInput.sendKeys(quantity+"");

    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String fullName) {
webTableOdrerPage.nameInput.sendKeys(fullName);
    }
    @When("user enters street {string}")
    public void user_enters_street(String street) {
        webTableOdrerPage.streetInput.sendKeys(street);


    }
    @When("user enters city {string}")
    public void user_enters_city(String city) {
        webTableOdrerPage.cityInput.sendKeys(city);
    }
    @When("user enters state {string}")
    public void user_enters_state(String state) {
        webTableOdrerPage.stateInput.sendKeys(state);

    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
        webTableOdrerPage.zipInput.sendKeys(string);

    }
    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String string) {
        List<WebElement> cardType = webTableOdrerPage.cardType;
        for (WebElement webElement : cardType) {
            if(webElement.getAttribute("value").equalsIgnoreCase(  string)){
                webElement.click();
                break;
            }

        }


    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
        webTableOdrerPage.cardnoInput.sendKeys(string);

    }
    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
        webTableOdrerPage.cardexpInput.sendKeys(string);

    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
        webTableOdrerPage.button.click();

    }
    AllOrdersPage allOrdersPage=new AllOrdersPage();
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String expectedName) {
        Assert.assertEquals(expectedName,allOrdersPage.nameFirstRow.getText());


    }


}
