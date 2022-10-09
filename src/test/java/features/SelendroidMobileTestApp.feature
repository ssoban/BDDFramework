Feature: Verify jquery selenium functionality

  @Background:
  Scenario: Verify user is on Website
    Given User redirects to the site.
    Then Verify website title
    And Verify website current url

  @sanity
  Scenario: Verify Droppable functionality.
    Given User click on Droppable option under interactions section
    Then User perform drag and drop function.
    And  Verify Drop here changed to Dropped.