Feature: Verify jquery selenium functionality


  @sanity
  Scenario: Verify Droppable functionality.
    Given User click on Droppable option under interactions section
    Then User perform drag and drop function.
    And  Verify Drop here changed to Dropped.