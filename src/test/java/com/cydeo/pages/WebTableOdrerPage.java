package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTableOdrerPage extends BasePage{
    public WebTableOdrerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (name="product")
    public WebElement product;


    @FindBy(name = "name")
    public WebElement nameInput;

    @FindBy(name = "street")
    public WebElement streetInput;

    @FindBy(name = "city")
    public WebElement cityInput;

    @FindBy(name = "state")
    public WebElement stateInput;

    @FindBy(name = "zip")
    public WebElement zipInput;

    @FindBy(name="card")
    public List<WebElement > cardType;

    @FindBy(name = "cardNo")
    public WebElement cardnoInput;

    @FindBy(xpath = "//input[@name='cardExp']")
    public WebElement cardexpInput;

    @FindBy(css = "button[type='submit']")
    public WebElement button;

    @FindBy(name = "quantity")
    public WebElement quantityInput;
    
}
