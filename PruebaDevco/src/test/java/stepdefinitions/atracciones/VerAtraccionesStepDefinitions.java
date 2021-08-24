package stepdefinitions.atracciones;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.DatosAtracciones;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.ValidarPagoAtraccion;
import tasks.VerAtracciones;


import java.util.List;

public class VerAtraccionesStepDefinitions {

    @Managed
    private WebDriver navegador;

    @Before
    public void SetUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Barto");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(navegador));
    }

    @Given("^El usuario se encuentra en la pagina principal$")
    public void elUsuarioSeEncuentraEnLaPaginaPrincipal() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com"));

    }

    @When("^Realiza la busqueda de atracciones por la pagina$")
    public void realizaLaBusquedaDeAtraccionesPorLaPagina(List<DatosAtracciones> datosAtraccionesList) {
        DatosAtracciones datosAtracciones= datosAtraccionesList.get(1);
        OnStage.theActorInTheSpotlight().attemptsTo(VerAtracciones.enLaPagina(datosAtracciones));

    }

    @Then("^Debera ver el valor de la cotizacion$")
    public void deberaVerElValorDeLaCotizacion() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarPagoAtraccion.enLaPagina(), Matchers.is(true)));

    }
}
