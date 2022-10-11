package stepDefinitions;

import com.learning.base.Base_setup_Appium;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AppiumHomePage;

public class SelendroidappSteps  extends Base_setup_Appium {

    AppiumHomePage appiumHomePage = new AppiumHomePage(appDriver);


    @Given("^User successfully able to launch application$")
    public void User_successfully_able_to_launch_ppplication() {

    }

    @Given("^verify the title$")
    public void verify_the_title() {
        appiumHomePage.verifyTitle();
    }
    @And("^verify the elements on the screen$")
    public void verify_the_elements_on_the_screen() {
     appiumHomePage.verifyElementsOnScreen();
    }

    @Given("^tap on [EN BuWon]$")
    public void tap_on_en_bu_won() {
     appiumHomePage.clickOnEnButton();
    }
    @And("select option [No, no]")
    public void selectOptionNoNo() {

    }
    @Then("^Check if the homepage is displayed$")
    public void check_if_the_homepage_is_displayed() {

    }

    @Given("^Tap on Chrome logo buWon$")
    public void tap_on_chrome_logo_bu_won() {
        appiumHomePage.ClickOnChrome();
    }

    @Then("^Verify the text [Hello, can you...., ]$")
    public void verify_the_text_hello_can_you() {
        appiumHomePage.verifyChromeScreen();
    }
    @Then("^Enter your name in the text box$")
    public void enter_your_name_in_the_text_box() {

    }
    @Then("^Select Prefered Car as Mercedes")
    public void select_prefered_car_as() {

    }
    @Then("^Tap on [Send me your name!]$")
    public void tap_on_send_me_your_name() {

    }
    @Then("^Verify the text [This is my....]$")
    public void verify_the_text_this_is_my() {

    }
    @Then("^Verify your name and prefered car selected from the previous screen.$")
    public void verify_your_name_and_prefered_car_selected_from_the_previous_screen() {

    }

    @And("^Click on link<here> at the boWom and check if the default Prefered Car selected is Volvo$")
    public void clickOnLinkHereAtTheBoWomAndCheckIfTheDefaultPreferedCarSelectedIsVolvo() {
    }
    @Given("^Tap on File logo buWon$")
    public void tap_on_file_logo_bu_won() {
        appiumHomePage.clickOnFile();
    }

    @And("^Verify the text [Welcome to register... ]$")
    public void verify_the_text_welcome_to_register() {
        appiumHomePage.registerNewUSer();
    }
    @And("^Verify the elements on the Register screen$")
    public void verify_the_elements_on_the_Register_screen() {

    }
    @And("^Check if the Name field is pre-populated with Mr. Burns$")
    public void check_if_the_name_field_is_pre_populated_with() {

    }
    @And("^Check if Ruby is selected as Programming Language by default Fill in the fields with new values$")
    public void check_if_is_selected_as_programming_language_by_default_fill_in_the_fields_with_new_values() {

    }
    @And("^Select I accept adds$")
    public void select() {

    }
    @And("^Tap on Register User$")
    public void tap_on_register_user_verify() {

    }
    @And("^Verify the user details on the next screen$")
    public void verify_the_user_details_on_the_next_screen() {
        appiumHomePage.verifyNeRegisterDetails();
    }
    @And("^Tap on [Register User]$")
    public void tap_on_register_user() {

    }
    @And("^Check if the screen navigates to the home screen.$")
    public void check_if_the_screen_navigates_to_the_home_screen() {

    }


    @Given("^Tap on [Show Progress Bar for a while]$")
    public void tap_on_show_progress_bar_for_a_while() {
        appiumHomePage.clickOnProgressBar();
    }
    @Then("^Wait for the loader to disappear$")
    public void wait_for_the_loader_to_disappear() {

    }
    @Then("^Verify the elements on the user registration screen$")
    public void verify_the_elements_on_the_user_registration_screen() {

    }

    @Given("^Tap on [Displays a Toast]$")
    public void tap_on_displays_a_toast() {
        appiumHomePage.clickOnDisplayToast();

    }
    @Given("^Verify the toast text$")
    public void verify_the_toast_text() {

    }

    @Given("^Tap on [Display Popup Window]$")
    public void tap_on_display_popup_window() {
        appiumHomePage.clickOnPopupWindow();
    }
    @Given("^Tap on [Dismiss]$")
    public void tap_on_dismiss() {

    }

    @Given("^Tap on [Press to throw unhandled excep.on]$")
    public void tap_on_press_to_throw_unhandled_excep_on() {
        appiumHomePage.pressToThrowUnhandledException();
    }
    @Given("^Verify home screen title$")
    public void verify_home_screen_title() {

    }

    @Given("^Type test in Type to throw unhandled exception.$")
    public void type_in_type_to_throw_unhandled_exception() {
        appiumHomePage.typeToThrowUnhandledException();
    }


}
