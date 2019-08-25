@Used-Cars
Feature: Acceptance testing to validate Used car search functionality
  In order to validate the used car search functionality
  As a user
  Will do acceptance testing

  @Used-Cars-Positive
  Scenario: Validate Used car search page
    Given I am on homepage "https://www.carsguide.com.au" of CarsGuide site
    When I move to the Menu
      | Menu       |
      | buy + sell |
      | reviews    |
    And click on "Used" link on Used Car Page
    And select carBrand as "AUDI" from AnyMake dropdown on Used Car Page
    And select car Model on Used Car Page
    	| carModel |
    	| A4			 |
    	| A3       |
    And select location as "SA - All" from SelectLocation dropdown on Used Car Page
    And select price as "$2,000" from Price dropdown on Used Car Page
    And I click on Find_My_Next_Car button on Used Car Page
    Then I should see list of searched cars on Used Car Page
    And the page title should be "Used Audi A4 Under 2000 for Sale SA | carsguide"
