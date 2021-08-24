package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;
import userinterfaces.CochesPage;

public class ValidarReservaCoche implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Enabled.of(CochesPage.RESERVA).viewedBy(actor).asBoolean();
    }

    public static ValidarReservaCoche enLaPagina(){
        return new ValidarReservaCoche();
    }
}
