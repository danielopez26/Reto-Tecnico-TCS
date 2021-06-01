package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Verify;
import tasks.Check;
import tasks.Join;
import tasks.Launch;
import tasks.LoggedIn;

import java.util.List;

public class SignInUserStepDefinitions {



    @When("^sing in$")
    public void sing_in(List<String> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(LoggedIn.login(datos));
    }

    @And("^see my account$")
    public void see_my_account() {
        OnStage.theActorInTheSpotlight().attemptsTo(Check.information());
    }

}
