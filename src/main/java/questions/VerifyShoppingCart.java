package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.AccountPage;

import java.util.List;

public class VerifyShoppingCart implements Question<Boolean>{
    public static Question<Boolean> products;



    private List <String> mensaje;

    public VerifyShoppingCart(List <String> mensaje) {
        this.mensaje = mensaje;
    }

    public static VerifyShoppingCart products(List<String> mensaje) {
        return new VerifyShoppingCart(mensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String mensajeEsperado = Text.of(AccountPage.USER_ACCOUNT).viewedBy(actor).asString();
        boolean result;

        if (mensajeEsperado.equals(mensaje.get(0))){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
