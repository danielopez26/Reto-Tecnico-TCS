package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.VerifyShoppingCart;
import tasks.AddProduct;

import java.util.List;

public class AddProductStepDefinitions {

    @And("^add product of speaker of shopping cart$")
    public void add_product_of_speaker_of_shopping_cart() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddProduct.shopping());
    }

    @Then("^check out product$")
    public void check_out_product(List<String> data) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyShoppingCart.products(data)));
    }

}

