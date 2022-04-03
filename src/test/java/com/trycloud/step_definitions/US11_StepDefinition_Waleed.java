package com.trycloud.step_definitions;

import com.trycloud.pages.US1_Page_Waleed;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.joda.time.DateTime;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US11_StepDefinition_Waleed {

    US1_Page_Waleed us1_page_waleed = new US1_Page_Waleed();
    String message;
    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        us1_page_waleed.loginToDashboard();
    }

    @When("the user clicks the Talk module")
    public void the_user_clicks_the_module() {
        us1_page_waleed.talkModule.click();

    }
    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,string);
    }

    @And("user search user from the search box")
    public void userSearchUserFromTheSearchBox() {
        us1_page_waleed.talkSearchBox.sendKeys("user171");
        us1_page_waleed.user171.click();
    }

    @And("user write a message")
    public void userWriteAMessage() {
        message = "test" + DateTime.now();
        us1_page_waleed.messageBox.sendKeys(message);
    }

    @And("user clicks to submit button")
    public void userClicksToSubmitButton() {
        BrowserUtils.sleep(1);
        us1_page_waleed.messageSubmitButton.click();
    }

    @Then("the user should be able to see the message is displayed on the conversation log")
    public void theUserShouldBeAbleToSeeTheMessageIsDisplayedOnTheConversationLog() {
        WebElement lastMessage = us1_page_waleed.postedMessage.get(us1_page_waleed.postedMessage.size() - 1);
        Assert.assertEquals(message, lastMessage.getText());
    }
}
