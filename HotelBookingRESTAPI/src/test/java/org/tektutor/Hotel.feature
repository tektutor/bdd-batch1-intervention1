Feature: Develop a Hotel Booking REST API

    Scenario: Should be able to retrieve all hotel room booking done as on today
     Given I have 5 booking details in booking table
      When I invoke the hotel booking REST API with GET method
      Then I expect response code "200"
      And I expect "5" booking records as response