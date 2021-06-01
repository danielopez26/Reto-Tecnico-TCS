package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.AccountDetailsPage;
import userinterface.AccountPage;
import userinterface.CreateAccountPage;

import java.util.List;

public class Edit implements Task {

    private List<String>  data;

    public Edit(List<String>  data) {
        this.data=data;
    }


    public static Edit dataToEdit(List<String> data){
        return Tasks.instrumented(Edit.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(data.get(0)).into(AccountDetailsPage.FIRST_NAME),
                Enter.theValue(data.get(1)).into(AccountDetailsPage.LAST_NAME),
                Enter.theValue(data.get(2)).into(AccountDetailsPage.PHONE_NUMBER),
                SelectFromOptions.byVisibleText(data.get(3)).from(AccountDetailsPage.COUNTRY),
                Enter.theValue(data.get(4)).into(AccountDetailsPage.CITY),
                Enter.theValue(data.get(5)).into(AccountDetailsPage.ADDRESS),
                Enter.theValue(data.get(6)).into(AccountDetailsPage.STATE),
                Enter.theValue(data.get(7)).into(AccountDetailsPage.POSTAL_CODE),
                Click.on(AccountDetailsPage.SAVE)
        );

    }
}
