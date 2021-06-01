package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import userinterface.AdvantageDemoPage;
import net.serenitybdd.screenplay.actions.Open;


public class Launch implements Task {
    private AdvantageDemoPage advantageDemoPage;

    public static Launch advantageDemoPage (){
        return Tasks.instrumented(Launch.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(advantageDemoPage));
    }
}
