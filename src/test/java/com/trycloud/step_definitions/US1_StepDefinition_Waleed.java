package com.trycloud.step_definitions;

import com.trycloud.pages.US1_Page_Waleed;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US1_StepDefinition_Waleed {

    US1_Page_Waleed us1_page_waleed = new US1_Page_Waleed();

    @Given("user on the login page")
    public void userOnTheLoginPage( ){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }

    @When("user use username {string} and passcode {string}")
    public void userUseUsernameAndPasscode(String str1, String str2) {
        us1_page_waleed.username.sendKeys(str1);
        us1_page_waleed.password.sendKeys(str2);
    }


    @When("user click the login button")
    public void user_click_the_login_button() {
       us1_page_waleed.loginButton.click();
    }

    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));
    }


}
