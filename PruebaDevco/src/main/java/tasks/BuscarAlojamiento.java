package tasks;

import models.DatosAlojamiento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;
import userinterfaces.MainPage;
import userinterfaces.SearchPage;

public class BuscarAlojamiento implements Task {
    private DatosAlojamiento datosAlojamiento;

    public BuscarAlojamiento(DatosAlojamiento datosAlojamiento) {
        this.datosAlojamiento = datosAlojamiento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(datosAlojamiento.getDestino()).into(MainPage.ADONDE_VAS),
                Hit.the(Keys.ENTER).into(MainPage.ADONDE_VAS),
                Click.on(SearchPage.FECHA_IDA),
                Click.on(SearchPage.BOTON_REGRESO),
                Click.on(SearchPage.FECHA_REGRESO),
                SelectFromOptions.byValue(datosAlojamiento.getAdultos()).from(SearchPage.CANT_ADULTOS),
                SelectFromOptions.byValue(datosAlojamiento.getNinios()).from(SearchPage.CANT_NINOS),
                SelectFromOptions.byValue(datosAlojamiento.getEdadNinios()).from(SearchPage.EDAD_NINIO),
                Click.on(SearchPage.BUSCAR));
    }

    public static BuscarAlojamiento enLaPagina(DatosAlojamiento datosAlojamiento){
        return new BuscarAlojamiento(datosAlojamiento);
    }
}
