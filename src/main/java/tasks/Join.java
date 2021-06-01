package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.CreateAccountPage;
import userinterface.MainPage;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Join implements Task {

    private List<String> data;

    public Join(List<String>  data) {
        this.data=data;
    }

    private MainPage mainPage;
    private CreateAccountPage createAccountPage;


    public static Join dataToRegister(List<String> data){
        return Tasks.instrumented(Join.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MainPage.USER_ICON, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(MainPage.USER_ICON),
                WaitUntil.the(MainPage.NAME, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(MainPage.CREATE_ACCOUNT),
                Enter.theValue(data.get(0)).into(CreateAccountPage.USER_NAME),
                Enter.theValue(data.get(1)).into(CreateAccountPage.EMAIL),
                Enter.theValue(data.get(2)).into(CreateAccountPage.PASSWORD),
                Enter.theValue(data.get(2)).into(CreateAccountPage.PASSWORD_CONFIRM),
                Enter.theValue(data.get(3)).into(CreateAccountPage.FIRST_NAME),
                Enter.theValue(data.get(4)).into(CreateAccountPage.LAST_NAME),
                Enter.theValue(data.get(5)).into(CreateAccountPage.PHONE_NUMBER),
                SelectFromOptions.byVisibleText(data.get(6)).from(CreateAccountPage.COUNTRY),
                Enter.theValue(data.get(7)).into(CreateAccountPage.CITY),
                Enter.theValue(data.get(8)).into(CreateAccountPage.ADDRESS),
                Enter.theValue(data.get(9)).into(CreateAccountPage.STATE),
                Enter.theValue(data.get(10)).into(CreateAccountPage.POSTAL_CODE),
                Click.on(CreateAccountPage.AGREE),
                Click.on(CreateAccountPage.REGISTER),
                Click.on(MainPage.USER_ICON),
                Click.on(MainPage.ACCOUNT)
        );

    }
}
