package tasks;

import interactions.CambiarVentana;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.CochesPage;
import userinterfaces.MainPage;

public class BusquedaCoche implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MainPage.COCHES),
                Scroll.to(CochesPage.DESTACADOS),
                Click.on(CochesPage.LUGAR),
                CambiarVentana.conTitulo("Alquiler de coches en Londres: reserva coches de alquiler baratos"),
                Click.on(CochesPage.ABRIR_CALENDARIO),
                Click.on(CochesPage.FECHA_UNO),
                Click.on(CochesPage.BUSCAR),
                Click.on(CochesPage.MOSTRAR_COCHES),
                Click.on(CochesPage.Click),
                Click.on(CochesPage.COCHES_GRANDES),
                Click.on(CochesPage.ESCOGER_COCHE),
                CambiarVentana.conTitulo("Alquiler de Coches London en Londres, Reino Unido a precios rebajados con Booking.com."),
                Scroll.to(CochesPage.RESERVA)



        );
    }

    public static BusquedaCoche enLaPagina() {
        return new BusquedaCoche();
    }
}
