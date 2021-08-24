package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;
import userinterfaces.ReservaPage;

public class ValidarCompletarReserva implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Enabled.of(ReservaPage.COMPLETA_LA_RESERVA).viewedBy(actor).asBoolean();
    }

    public static ValidarCompletarReserva enLaPagina(){
        return new ValidarCompletarReserva();
    }
}
