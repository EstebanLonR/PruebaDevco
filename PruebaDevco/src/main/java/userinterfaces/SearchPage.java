package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchPage {

    public static final Target FECHA_IDA =
            Target.the("Fecha Ida").located(By.xpath("//td[@data-date='2021-09-24']"));

    public static final Target BOTON_REGRESO =
            Target.the("Boton Regreso").located(By.xpath("//div[@data-placeholder='Fecha de salida']"));

    public static final Target FECHA_REGRESO =
            Target.the("Fecha Regreso").located(By.xpath("//td[@data-date='2021-09-28']"));

    public static final Target CANT_ADULTOS =
            Target.the("Cantidad Adultos").located(By.xpath("//select[@name='group_adults']"));

    public static final Target CANT_NINOS =
            Target.the("Cantidad niños").located(By.xpath("//select[@name='group_children']"));

    public static final Target EDAD_NINIO=
            Target.the("Edad niño").located(By.xpath("//select[@name='age']"));

    public static final Target BUSCAR =
            Target.the("Buscar").located(By.xpath("//button[@type='submit']"));

    public static final Target MENSAJE_ALOJAMIENTOS =
            Target.the("Alojamientos Encontrados").located(By.xpath("//h1[contains(string(), 'alojamientos encontrados' )]"));

    public static final Target VER_DISPONIBILIDAD =
            Target.the("Ver Disponibilidad").located(By.xpath("(//a[@class='txp-cta bui-button bui-button--primary sr_cta_button'])[2]"));

}
