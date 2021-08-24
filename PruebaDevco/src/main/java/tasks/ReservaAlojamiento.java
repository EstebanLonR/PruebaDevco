package tasks;

import interactions.CambiarVentana;
import models.DatosReserva;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import userinterfaces.MainPage;
import userinterfaces.ReservaPage;
import userinterfaces.SearchPage;

public class ReservaAlojamiento implements Task {
    private DatosReserva datosReserva;

    public ReservaAlojamiento(DatosReserva datosReserva) {
        this.datosReserva = datosReserva;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(datosReserva.getDestino()).into(MainPage.ADONDE_VAS),
                Hit.the(Keys.ENTER).into(MainPage.ADONDE_VAS),
                Click.on(SearchPage.FECHA_IDA),
                Click.on(SearchPage.BOTON_REGRESO),
                Click.on(SearchPage.FECHA_REGRESO),
                SelectFromOptions.byValue(datosReserva.getAdultos()).from(SearchPage.CANT_ADULTOS),
                SelectFromOptions.byValue(datosReserva.getNinios()).from(SearchPage.CANT_NINOS),
                Click.on(SearchPage.BUSCAR),
                Scroll.to(ReservaPage.HOTEL),
                Click.on(SearchPage.VER_DISPONIBILIDAD));
        actor.attemptsTo(CambiarVentana.conTitulo("Finca Hotel La Dulcera"));
        actor.attemptsTo(Click.on(ReservaPage.RESERVA_AHORA),
                SelectFromOptions.byValue("1").from(ReservaPage.CANTIDAD));
        actor.attemptsTo(Click.on(ReservaPage.RESERVARE));
        actor.attemptsTo(SendKeys.of(datosReserva.getNombre()).into(ReservaPage.NOMBRE),
                SendKeys.of(datosReserva.getApellido()).into(ReservaPage.APELLIDO),
                SendKeys.of(datosReserva.getEmail()).into(ReservaPage.EMAIL),
                Scroll.to(ReservaPage.CONFIRMAR_EMAIL),
                SendKeys.of(datosReserva.getEmail()).into(ReservaPage.CONFIRMAR_EMAIL),
                Scroll.to(ReservaPage.HORA_LLEGADA),
                SelectFromOptions.byValue("-1").from(ReservaPage.HORA_LLEGADA),
                Click.on(ReservaPage.ULTIMOS_DATOS),
                SendKeys.of(datosReserva.getNumero()).into(ReservaPage.NUMERO_TELEFONO),
                Scroll.to(ReservaPage.TIPO_TARJETA),
                SelectFromOptions.byValue(datosReserva.getTipoTarjeta()).from(ReservaPage.TIPO_TARJETA),
                SendKeys.of(datosReserva.getNumeroTarjeta()).into(ReservaPage.NUMERO_TARJETA),
                SelectFromOptions.byValue("05").from(ReservaPage.CADUCIDAD_MES),
                SelectFromOptions.byValue("2025").from(ReservaPage.CADUCIDAD_ANIO));


    }

    public static ReservaAlojamiento enLaPagina(DatosReserva datosReserva) {
        return new ReservaAlojamiento(datosReserva);
    }
}
