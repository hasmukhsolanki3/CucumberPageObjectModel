@Search-Cars
Feature: Acceptance testing to validate car search functionality
  In order to calidate the car search functionality
  As a user
  Will do acceptance testing

  @Search-Cars-Positive
  Scenario: Validate car search page
    Given I am on homepage "https://www.carsguide.com.au" of CarsGuide site
    When I move to the Menu
      | Menu       |
      | buy + sell |
      | reviews    |
    And click on "Search Cars"
    And select carBrand as "BMW" from AnyMake dropdown
    And select carModel as "1 SERIES" from SelectModel dropdown
    And select location as "Australia" from SelectLocation dropdown
    And select price as "$1,000" from Price dropdown
    And I click on Find_My_Next_Car button
    Then I should see list of searched cars
    And the page title should be "Bmw 1 Series Under 1000 for sale | carsguide"
