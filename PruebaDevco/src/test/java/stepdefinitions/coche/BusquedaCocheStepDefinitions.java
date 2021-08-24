package stepdefinitions.coche;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.ValidarReservaCoche;
import tasks.BusquedaCoche;

public class BusquedaCocheStepDefinitions {

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

    @When("^El diligencia los campos de busqueda de coche$")
    public void elDiligenciaLosCamposDeBusquedaDeCoche() {
        OnStage.theActorInTheSpotlight().attemptsTo(BusquedaCoche.enLaPagina());

    }

    @Then("^Debera ver el boton de Reserva del coche$")
    public void deberaVerElBotonDeReservaDelCoche() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarReservaCoche.enLaPagina(), Matchers.equalTo(true)));

    }
}
