package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.AccountPage;

public class Verify implements Question<Boolean> {

    public static Question<Boolean> userLoggedIn;

    private String data ;

    public Verify(String data) {
        this.data = data;
    }

    public static Verify userLoggedIn(String data) {
        return new Verify(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String mensajeEsperado = Text.of(AccountPage.USER_ACCOUNT).viewedBy(actor).asString();
        boolean result;

        if (mensajeEsperado.equals(data)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
