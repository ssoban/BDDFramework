Feature: Verify jquery selenium functionality

  @Background:
  Scenario: Verify user launch application
    Given User successfully able to launcg application

  @appium
  Scenario: Verify the title.
  Given verify the title
  And  verify the elements on the screen


  @appium
  Scenario: Verify Droppable functionality.
  Launch applica.on -> Tap on [EN BuWon] -> Select op.on [No, no] -> Check if the homepage is displayed

  @appium
  Scenario: Verify Droppable functionality.
  Launch applica.on -> Tap on Chrome logo buWon -> Verify the .tle -> Verify the text [Hello, can you...., ]
  Enter your name in the text box
  Select Prefered Car as 'Mercedes'
  Tap on [Send me your name!]
  Verify the text [This is my....]
  Verify your name and prefered car selected from the previous screen.
  Click on link<here> at the boWom and check if the default Prefered Car selected is 'Volvo'


  @appium
  Scenario: Verify Droppable functionality.
  Launch applica.on -> Tap on File logo buWon -> Verify the .tle -> Verify the text [Welcome to register... ]
  Verify the elements on the screen
  Check if the Name field is pre-populated with 'Mr. Burns'
  Check if 'Ruby' is selected as Programming Language by default Fill in the fields with new values
  Select 'I accept adds'
  Tap on Register User (verify)
  Verify the user details on the next screen
  Tap on [Register User]
  Check if the screen navigates to the home screen.

  @appium
  Scenario: Verify Droppable functionality.
  Launch applica.on -> Tap on [Show Progress Bar for a while] Wait for the loader to disappear
  Verify the elements on the user registra.on screen

  @appium
  Scenario: Verify Droppable functionality.
  Launch applica.on -> Tap on [Displays a Toast] Verify the toast text

  @appium
  Scenario: Verify Droppable functionality.
  Launch applica.on -> Tap on [Display Popup Window] Tap on [Dismiss]

  @appium
  Scenario: Verify Droppable functionality.
  Launch applica.on -> Tap on [Press to throw unhandled excep.on] Verify home screen .tle

  @appium
  Scenario: Verify Failed functionality.
  Given Type 'test' in Type to throw unhandled exception.
  And  Verify home screen title