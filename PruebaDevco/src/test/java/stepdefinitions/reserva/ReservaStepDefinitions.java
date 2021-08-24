package stepdefinitions.reserva;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.DatosAlojamiento;
import models.DatosReserva;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.ValidarCompletarReserva;
import tasks.ReservaAlojamiento;

import java.util.List;

public class ReservaStepDefinitions {

    @Managed
    private WebDriver navegador;

    @Before
    public void SetUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Usuario");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(navegador));
    }


    @Given("^El usuario se encuentra en la pestania de alojamiento$")
    public void elUsuarioSeEncuentraEnLaPestaniaDeAlojamiento() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com"));

    }


    @When("^El diligencia todos los campos para reservar el alojamiento$")
    public void elDiligenciaTodosLosCamposParaReservarElAlojamiento(List<DatosReserva> datosReservas) {
        DatosReserva datosReserva=datosReservas.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(ReservaAlojamiento.enLaPagina(datosReserva));

    }

    @Then("^Debera ver el boton de Completar Reserva$")
    public void deberaVerElBotonDeCompletarReserva(){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarCompletarReserva.enLaPagina(), Matchers.is(true)));

    }
}
