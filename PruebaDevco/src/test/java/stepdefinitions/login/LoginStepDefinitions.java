package stepdefinitions.login;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.RecordData;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.LoginValidate;
import tasks.LoginSuccessfully;

import java.util.List;

public class LoginStepDefinitions {

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

    @When("^El se loguea con los datos$")
    public void elSeLogueaConLosDatos(List<RecordData> recordDatas) {
        RecordData recordData = recordDatas.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(LoginSuccessfully.inThePageWith(recordData));

    }

    @Then("^Debera ver su nombre en el login$")
    public void deberaVerSuNombreEnElLogin() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(LoginValidate.completeLogin(), Matchers.is(true)));

    }
}
