Feature: Verify Regres.in  functionality


  @sanity
  Scenario: Verify Get API functionality.

   Given  Verify if the status code is 200
   Then Verify the value of first_name for "id": 10 is ‘Byron’
    And Verification Successful

  @sanity
  Scenario: Verify Post API functionality.
  Given Verify if the status code is 201
  Then Verify if the id is generated
  And Verify the response json scheme