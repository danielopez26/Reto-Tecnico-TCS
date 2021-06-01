package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Verify;
import tasks.Join;
import tasks.Launch;

import java.util.List;

public class RegisterUserStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^The user enters to the page$")
    public void the_user_enters_to_the_page() {
        OnStage.theActorCalled("Daniel").wasAbleTo(Launch.advantageDemoPage());
    }

    @When("^create new account$")
    public void create_new_account(List<String> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Join.dataToRegister(data));
    }

    @Then("^verify account$")
    public void verify_account(String respuesta) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verify.userLoggedIn(respuesta)));
    }

}
