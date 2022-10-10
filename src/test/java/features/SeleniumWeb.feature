Feature: Verify jquery selenium functionality

  @Background:
  Scenario: Verify user is on Website
    Given User redirects to the site.
    Then Verify website title
    And Verify website current url

  @selenium
  Scenario: Verify Droppable functionality.
    Given User click on Droppable option under interactions section
    Then User perform drag and drop function.
    And  Verify Drop here changed to Dropped.

  @selenium
  Scenario: Verify Selectable functionality.
    Given User click on Selectable option under interactions section
    Then User click on item1,item3 and item7.


  @selenium
  Scenario: Verify Control Group Functionality.
    Given User click on Controlgroup option under widgets section
    Then User click Automatic and insurance radio button.
    And  Verify click on standard and Insurance radio button.
    And Verify user click on Book Now!



