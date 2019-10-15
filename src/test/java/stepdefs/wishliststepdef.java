package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class wishliststepdef {
    @Given("^I open Giftshop website$")
    public void iOpenGiftshopWebsite() {
    }

    @When("^I search for the gift item$")
    public void iSearchForTheGiftItem() {
    }

    @And("^I select Gift item \"([^\"]*)\"$")
    public void iSelectGiftItem(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click on Add to wishlist icon$")
    public void iClickOnAddToWishlistIcon() {

    }

    @Then("^item is added to wishlist$")
    public void itemIsAddedToWishlist() {
    }
}


