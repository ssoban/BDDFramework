package stepDefinitions;

import com.learning.base.Baseclass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import pages.HomePage;


public class SeleniumWebSteps extends Baseclass {

    public static final Logger log = Logger.getLogger(SeleniumWebSteps.class);
    HomePage omePage = new HomePage(driver);
    @Given("^User redirects to the site.$")
    public void user_redirects_to_the_site() {
    log.info("Redirection done");
    }
    @Then("^Verify website title$")
    public void verify_website_title() {

        log.info("Redirection was successful");
    }
    @And("^Verify website current url$")
    public void verify_website_current_url() {

        log.info("Url is verified");
    }
    @Given("^User click on Droppable option under interactions section$")
    public void user_click_on_droppable_option_under_interactions_section() {

    }
    @Then("^User perform drag and drop function.$")
    public void user_perform_drag_and_drop_function() {

    }
    @Then("^Verify Drop here changed to Dropped.$")
    public void verify_drop_here_changed_to_dropped() {

    }

    @Given("^User click on Selectable option under interactions section$")
    public void user_click_on_selectable_option_under_interactions_section() {

    }
    @Then("^User click on item1,item3 and item7.$")
    public void user_click_on_item1_item3_and_item7() {

    }
    @Given("^User click on Controlgroup option under widgets section$")
    public void user_click_on_controlgroup_option_under_widgets_section() {

    }
    @Then("^User click Automatic and insurance radio button.$")
    public void user_click_automatic_and_insurance_radio_button() {

    }
    @Then("^Verify click on standard and Insurance radio button.$")
    public void verify_click_on_standard_and_insurance_radio_button() {

    }
    @Then("^Verify user click on Book Now!$")
    public void verify_user_click_on_book_now() {

    }


    @Given("tap on [EN BuWon]")
    public void tapOnENBuWon() {
    }

    @Then("Verify the title")
    public void verifyTheTitle() {
    }

    @And("Verify the text [Hello, can you...., ]")
    public void verifyTheTextHelloCanYou() {
    }

    @And("Select Prefered Car as {string}")
    public void selectPreferedCarAsMercedes() {
    }

    @And("Tap on [Send me your name!]")
    public void tapOnSendMeYourName() {
    }

    @And("Verify the text [This is my....]")
    public void verifyTheTextThisIsMy() {
    }

    @And("Click on link<here> at the boWom and check if the default Prefered Car selected is {string}")
    public void clickOnLinkHereAtTheBoWomAndCheckIfTheDefaultPreferedCarSelectedIsVolvo() {
    }

    @And("Verify the text [Welcome to register... ]")
    public void verifyTheTextWelcomeToRegister() {
    }

    @And("Check if the Name field is pre-populated with {string}")
    public void checkIfTheNameFieldIsPrePopulatedWithMrBurns() {
    }

    @And("Check if {string} is selected as Programming Language by default Fill in the fields with new values")
    public void checkIfRubyIsSelectedAsProgrammingLanguageByDefaultFillInTheFieldsWithNewValues() {
    }

    @And("Select {string}")
    public void selectIAcceptAdds() {
    }

    @And("Tap on Register User \\(verify)")
    public void tapOnRegisterUserVerify() {
    }

    @And("Tap on [Register User]")
    public void tapOnRegisterUser() {
    }

    @Given("Tap on [Show Progress Bar for a while]")
    public void tapOnShowProgressBarForAWhile() {
    }

    @Given("Tap on [Displays a Toast]")
    public void tapOnDisplaysAToast() {
    }

    @Given("Tap on [Display Popup Window]")
    public void tapOnDisplayPopupWindow() {
    }

    @And("Tap on [Dismiss]")
    public void tapOnDismiss() {
    }

    @Given("Tap on [Press to throw unhandled excep.on]")
    public void tapOnPressToThrowUnhandledExcepOn() {
    }

    @Given("Type {string} in Type to throw unhandled exception.")
    public void typeTestInTypeToThrowUnhandledException() {
    }
}
