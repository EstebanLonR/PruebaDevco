package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/veratracciones.feature",
        glue = "stepdefinitions.atracciones",
        snippets = SnippetType.CAMELCASE)
public class VerAtracciones {
}
