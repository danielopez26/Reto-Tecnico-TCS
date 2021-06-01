package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.VerifyEdit;
import tasks.Edit;

import java.util.List;

public class FillUpFormStepDefinitions {

    @And("^edit account details$")
    public void edit_account_details(List<String> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(Edit.dataToEdit(data));

    }

    @Then("^account details verify (.+)$")
    public void account_details_verify_that(List <String> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyEdit.userLogged(data)));

    }
}
