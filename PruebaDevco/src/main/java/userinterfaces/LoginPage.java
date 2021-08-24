package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target EMAIL =
            Target.the("E-mail").located(By.xpath("//input[@type='email']"));

    public static final Target CONTINUAR_CON_EMAIL =
            Target.the("Continuar con e-mail").located(By.xpath("//span[@class='bui-button__text'][contains(string(), 'Continuar con e-mail')]"));

    public static final Target CONTRASENA =
            Target.the("Contraseña").located(By.xpath("//input[@id='password']"));

    public static final Target INICIAR_SESION =
            Target.the("Iniciar Sesion").located(By.xpath("//button[@type='submit']"));
}
