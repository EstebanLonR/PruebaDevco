package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;
import userinterfaces.AtraccionesPage;

public class ValidarPagoAtraccion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Enabled.of(AtraccionesPage.TOTAL_PAGO).viewedBy(actor).asBoolean();
    }

    public static ValidarPagoAtraccion enLaPagina(){
        return new ValidarPagoAtraccion();
    }
}
