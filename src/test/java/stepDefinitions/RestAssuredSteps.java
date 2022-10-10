package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.log4j.Logger;
import pages.RestAPICalls;

public class RestAssuredSteps {
    public static final Logger log = Logger.getLogger(RestAssuredSteps.class);
    RestAPICalls restAPICalls = new RestAPICalls();

    @Given("^Verify if the status code is 200")
    public void verify_if_the_status_code_is200() {
        restAPICalls.GetUser();
    }
    @Then("^Verify the value of first_name for \"id\": 10 is ‘Byron’$")
    public void verify_the_value_of_first_name_for_is_byron() {

    }
    @Then("^Verification Successful$")
    public void verification_successful() {

    }

    @Given("^Verify if the status code is 201$")
    public void verify_if_the_status_code_is_201() {
        restAPICalls.CreateUsr();
    }
    @Then("^Verify if the id is generated$")
    public void verify_if_the_id_is_generated() {

    }
    @Then("^Verify the response json scheme$")
    public void verify_the_response_json_scheme() {

    }


}
