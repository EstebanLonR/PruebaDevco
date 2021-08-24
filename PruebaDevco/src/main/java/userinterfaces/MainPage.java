package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {

    public static final Target INICIA_SESION =
            Target.the("Inicia sesion").located(By.xpath("//span[contains(string(), 'Hazte una cuenta')]"));

    public static final Target LOGIN_VALIDATE=
            Target.the("Login Validate").located(By.xpath("//span[contains(string(), 'Bartolo Martinez')][@id='profile-menu-trigger--title']"));

    public static final Target ADONDE_VAS=
            Target.the("Adonde vas").located(By.xpath("//input[@id='ss']"));

    public static final Target ATRACCIONES =
            Target.the("Atracciones").located(By.xpath("(//a[@class='bui-tab__link'])[3]"));

    public static final Target COCHES =
            Target.the("Coches").located(By.xpath("(//a[@class='bui-tab__link']/ancestor::li[@class='bui-tab__item'])[2]"));


}
