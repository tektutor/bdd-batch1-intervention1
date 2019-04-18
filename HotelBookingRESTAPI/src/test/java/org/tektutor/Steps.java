package org.tektutor;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

    @Given("I have {int} booking details in booking table")
    public void i_have_booking_details_in_booking_table(Integer int1) {
    }

    @When("I invoke the hotel booking REST API with GET method")
    public void i_invoke_the_hotel_booking_REST_API_with_GET_method() {
    }

    @Then("I expect response code {string}")
    public void i_expect_response_code(String string) {
    }

    @Then("I expect {string} booking records as response")
    public void i_expect_booking_records_as_response(String string) {
    }
}