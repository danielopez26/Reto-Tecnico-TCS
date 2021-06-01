package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.CreateAccountPage;
import userinterface.MainPage;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoggedIn implements Task {

    public static Performable login;
    private MainPage mainPage;
    private CreateAccountPage createAccountPage;

    private List<String> datos;

    public static LoggedIn login(List<String> datos){
        return Tasks.instrumented(LoggedIn.class,datos);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MainPage.USER_ICON, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(MainPage.USER_ICON ),
                WaitUntil.the(MainPage.NAME, isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue(datos.get(0)).into(MainPage.NAME),
                Enter.theValue(datos.get(1)).into(MainPage.PASSWORD_USER),
                Click.on(MainPage.SIGNIN)
        );

    }
}
