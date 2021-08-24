package stepdefinitions.busqueda;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.DatosAlojamiento;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.ValidarAlojamientosEncontrados;
import tasks.BuscarAlojamiento;

import java.util.List;

public class BusquedaAlojamientoStepDefinition {

    @Managed
    private WebDriver navegador;

    @Before
    public void SetUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Usuario");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(navegador));
    }


    @Given("^El usuario se encuentra en la pagina principal$")
    public void elUsuarioSeEncuentraEnLaPaginaPrincipal() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com"));

    }

    @When("^Diligencia los campos de la busqueda$")
    public void diligenciaLosCamposDeLaBusqueda(List<DatosAlojamiento> datosAlojamientos) {
        DatosAlojamiento datosAlojamiento = datosAlojamientos.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarAlojamiento.enLaPagina(datosAlojamiento));

    }

    @Then("^Debera ver el mensaje de alojamientos encontrados$")
    public void deberaVerElMensajeDeAlojamientosEncontrados() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarAlojamientosEncontrados.enLaPagina(), Matchers.is(true)));

    }
}
