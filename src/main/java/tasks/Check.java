package tasks;

import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.Click;
import userinterface.MainPage;

public class Check implements Task {

    private MainPage mainPage;

    public static Check information(){
        return Tasks.instrumented(Check.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MainPage.USER_ICON),
                Click.on(MainPage.ACCOUNT)
        );

    }
}
