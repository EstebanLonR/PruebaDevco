package tasks;

import models.RecordData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import userinterfaces.LoginPage;
import userinterfaces.MainPage;

public class LoginSuccessfully implements Task {
    private RecordData recordData;

    public LoginSuccessfully(RecordData recordData) {
        this.recordData = recordData;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo
                (Click.on(MainPage.INICIA_SESION),
                        SendKeys.of(recordData.getEmail()).into(LoginPage.EMAIL),
                        Click.on(LoginPage.CONTINUAR_CON_EMAIL),
                        SendKeys.of(recordData.getPassword()).into(LoginPage.CONTRASENA),
                        Click.on(LoginPage.INICIAR_SESION));

    }

    public static LoginSuccessfully inThePageWith(RecordData recordData) {
        return new LoginSuccessfully(recordData);
    }
}
