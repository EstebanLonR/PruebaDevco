package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;
import userinterfaces.SearchPage;

public class ValidarAlojamientosEncontrados implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Enabled.of(SearchPage.MENSAJE_ALOJAMIENTOS).viewedBy(actor).asBoolean();
    }

    public static ValidarAlojamientosEncontrados enLaPagina(){
        return new ValidarAlojamientosEncontrados();
    }
}
