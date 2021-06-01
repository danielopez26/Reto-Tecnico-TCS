package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.ShoppingProductPage;

public class AddProduct implements Task {



    public static AddProduct shopping(){
        return Tasks.instrumented(AddProduct.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ShoppingProductPage.SPEAKERS),
                Click.on(ShoppingProductPage.BOSE),
                Click.on(ShoppingProductPage.ADDCART),
                Click.on(ShoppingProductPage.SHOPPINGCART)
        );

    }
}
