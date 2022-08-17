Feature: Menu Management

  @SmokeTest
  Scenario: Add a menu item
    Given I have a menu item with name "Cucumber Sandwich" and price 20
    When I add that menu item
    Then Menu item with name "Cucumber Sandwich" should be added

  @RegularTest
  Scenario: Add a second menu item
    Given I have a menu item with name "Cucumber Salad" and price 20
    When I add that menu item
    Then Menu item with name "Cucumber Salad" should be added

  @RegularTest @NightlyRunTest
  Scenario: Add a third menu item
    Given I have a menu item with name "Chicken Sandwich" and price 20
    When I add that menu item
    Then Menu item with name "Chicken Sandwich" should be added