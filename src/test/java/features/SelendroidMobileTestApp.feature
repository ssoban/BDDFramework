Feature: Verify jquery selenium functionality

  @Background:
  Scenario: Verify user launch application
    Given User successfully able to launcg application

  @appium
  Scenario: Verify the elements on screen
  Given verify the title
  And  verify the elements on the screen


  @appium
  Scenario: Verify Homepage  functionality.
  Given  Tap on [EN BuWon]
  And Select op.on [No, no]
  Then Check if the homepage is displayed

  @appium
  Scenario: Verify Prefered car functionality.
  Given  Tap on Chrome logo buWon -> Verify the .tle
  Then Verify the text [Hello, can you...., ]
  And Enter your name in the text box
  And Select Prefered Car as 'Mercedes'
  And Tap on [Send me your name!]
  And Verify the text [This is my....]
 And  Verify your name and prefered car selected from the previous screen.
  And Click on link<here> at the boWom and check if the default Prefered Car selected is 'Volvo'


  @appium
  Scenario: Verify  user  landed on registration Screen .
  Given  Tap on File logo buWon
  And Verify the title
  And Verify the text [Welcome to register... ]
  And  Verify the elements on the screen
  And Check if the Name field is pre-populated with 'Mr. Burns'
  And Check if 'Ruby' is selected as Programming Language by default Fill in the fields with new values
  And Select 'I accept adds'
  And Tap on Register User (verify)
  And Verify the user details on the next screen
  And Tap on [Register User]
  And Check if the screen navigates to the home screen.

  @appium
  Scenario: Verify User Registration  Screen elements.
 Given Tap on [Show Progress Bar for a while]
  Then Wait for the loader to disappear
 And  Verify the elements on the user registration screen

  @appium
  Scenario: Verify Toast message.
 Given Tap on [Displays a Toast]
  And Verify the toast text

  @appium
  Scenario: Verify Popup dismiss functionality.
  Given Tap on [Display Popup Window]
  And Tap on [Dismiss]

  @appium
  Scenario: Verify Press to throw unhandled exception functionality.
 Given Tap on [Press to throw unhandled excep.on]
  And Verify home screen title

  @appium
  Scenario: Verify unhandled exception by entering values functionality.
  Given Type 'test' in Type to throw unhandled exception.
  And  Verify home screen title