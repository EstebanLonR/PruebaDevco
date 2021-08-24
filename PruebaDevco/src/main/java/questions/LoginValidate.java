package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;
import userinterfaces.MainPage;

public class LoginValidate implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Enabled.of(MainPage.LOGIN_VALIDATE).viewedBy(actor).asBoolean();
    }

    public static LoginValidate completeLogin() {
        return new LoginValidate();
    }
}
