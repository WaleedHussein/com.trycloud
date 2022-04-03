package com.trycloud.pages;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US1_Page_Waleed {

    public US1_Page_Waleed(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@aria-label='Talk']")
    public WebElement talkModule;

    @FindBy(xpath = "//input[@placeholder='Search conversations or users']")
    public WebElement talkSearchBox;

//    @FindBy(xpath = "//span[contains(.,'User170')]")
    @FindBy(xpath = "//a[@aria-label='Conversation, User171']")
    public WebElement user171;

    @FindBy(xpath = "//div[@placeholder='Write message, @ to mention someone …']")
    public WebElement messageBox;

    @FindBy(xpath = "//button[@class='new-message-form__button submit icon-confirm-fade']")
    public WebElement messageSubmitButton;

    @FindBy(xpath = "//div[starts-with(@id, 'message')]")
    public List<WebElement> postedMessage;



    public void loginToDashboard(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        username.sendKeys(ConfigurationReader.getProperty("username"));
        password.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();

    }




}
