package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CochesPage {

    public static final Target DESTACADOS =
            Target.the("Destacados").located(By.xpath("//h2[contains(string(), 'Destinos populares para alquiler de coches')]"));

    public static final Target LUGAR =
            Target.the("Lugar").located(By.xpath("(//div[@class='bui-card__content']/ancestor::div[@class='cars__top_dest_card bui-card bui-card--media bui-u-full-height'])[3]"));

    public static final Target ABRIR_CALENDARIO =
            Target.the("Abrir Calendario").located(By.xpath("(//button[@aria-label='Abrir el calendario'])[1]"));

    public static final Target FECHA_UNO =
            Target.the("Fecha uno").located(By.xpath("(//td[@data-id='1632096000000'])[1]"));

    public static final Target BUSCAR =
            Target.the("Buscar").located(By.xpath("//button[@type='submit']"));

    public static final Target MOSTRAR_COCHES =
            Target.the("Mostrar coches").located(By.xpath("(//a[@class='result__bui-btn result__bui-btn--primary'])[1]"));

    public static final Target Click =
            Target.the("click").located(By.xpath("//div[@class='ab-SearchSummary_PickUp-headline']"));

    public static final Target COCHES_GRANDES =
            Target.the("Elegir coche").located(By.xpath("(//div[@class='sr-CarCategories_Item_Mask'])[3]"));

    public static final Target ESCOGER_COCHE =
            Target.the("ESCOGER_COCHE").located(By.xpath("(//button[@type='button'])[@class='bui-button bui-button--primary bui-button--large bui-button--wide bui-u-pull-end'][1]"));

    public static final Target RESERVA =
            Target.the("Reserva").located(By.xpath("(//button[@type='button'])[@class='bui-button bui-button--secondary bui-button--large cdb__button-seperation']"));
}
