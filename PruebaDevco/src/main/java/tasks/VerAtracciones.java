package tasks;

import models.DatosAtracciones;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.Wait;
import org.openqa.selenium.Keys;
import userinterfaces.AtraccionesPage;
import userinterfaces.MainPage;

public class VerAtracciones implements Task {

    private DatosAtracciones datosAtracciones;

    public VerAtracciones(DatosAtracciones datosAtracciones) {
        this.datosAtracciones = datosAtracciones;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MainPage.ATRACCIONES),
                Click.on(AtraccionesPage.DESTINO),
                SendKeys.of(datosAtracciones.getDestino()).into(AtraccionesPage.DESTINO),
                Hit.the(Keys.ENTER).into(AtraccionesPage.DESTINO),
                Click.on(AtraccionesPage.BUSCAR_BOTON),
                Click.on(AtraccionesPage.TOUR),
                Click.on(AtraccionesPage.SELECCIONAR),
                Click.on(AtraccionesPage.TICKETS),
                Scroll.to(AtraccionesPage.SIGUIENTE));


    }

    public static VerAtracciones enLaPagina(DatosAtracciones datosAtracciones) {
        return new VerAtracciones(datosAtracciones);
    }
}
