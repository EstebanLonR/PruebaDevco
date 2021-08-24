package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AtraccionesPage {

    public static final Target DESTINO =
            Target.the("Destino").located(By.xpath("(//input[@type='search'])"));

    public static final Target BUSCAR_BOTON =
            Target.the("Boton buscar").located(By.xpath("//button[@type='submit']"));

    public static final Target TOUR=
            Target.the("Tour").located(By.xpath("//h4[contains(string(), 'Tour de compras por Tokio')]"));

    public static final Target SELECCIONAR=
            Target.the("Seleccionar").located(By.xpath("//button[@data-testid='select-ticket']"));

    public static final Target TICKETS =
            Target.the("Tickets").located(By.xpath("((//button[@type='button'])[@data-testid='add-ticket'])[1]"));

    public static final Target SIGUIENTE =
            Target.the("Siguiente").located(By.xpath("(//button[@type='submit'])[2]"));

    public static final Target TOTAL_PAGO=
            Target.the("Total").located(By.xpath("(//div[contains(string(), '737.429,31 COP')])[@class='Text-module__root--variant-strong_1___2aniL']"));
}
