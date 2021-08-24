package co.com.devco.booking.certificacion.manualtest.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.es.Dado;

import static co.com.devco.booking.certificacion.utils.ManualTest.validate;


public class ManualTestDefinitions {
    private Scenario scenario;


    @Before
    public void getScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("^(.*)$")
    public void manualTestBooking(String step) {
        validate(step, scenario.getName());
    }
}