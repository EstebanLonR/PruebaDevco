package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReservaPage {

    public static final Target HOTEL =
            Target.the("Hotel").located(By.xpath("//span[contains(string(),'Finca Hotel La Dulcera')]"));

    public static final Target RESERVA_AHORA =
            Target.the("Reserva Ahora").located(By.xpath("//button[@id='hp_book_now_button']"));

    public static final Target CANTIDAD =
            Target.the("Cantidad").located(By.xpath("(//select[@class='hprt-nos-select js-hprt-nos-select'])[2]"));

    public static final Target RESERVARE =
            Target.the("Reservare").located(By.xpath("(//button[@type='submit'])[3]"));

    public static final Target NOMBRE =
            Target.the("Indica Nombre").located(By.xpath("//input[@id='firstname']"));

    public static final Target APELLIDO =
            Target.the("Apellido").located(By.xpath("//input[@id='lastname']"));

    public static final Target EMAIL =
            Target.the("Email").located(By.xpath("//input[@id='email']"));

    public static final Target CONFIRMAR_EMAIL =
            Target.the("Confirmar email").located(By.xpath("//input[@id='email_confirm']"));

    public static final Target HORA_LLEGADA =
            Target.the("Hora llegada").located(By.xpath("//select[@id='checkin_eta_hour']"));

    public static final Target ULTIMOS_DATOS =
            Target.the("Ultimos datos").located(By.xpath("//button[@type='submit']/ancestor::div[@class='bui-group__item']"));

    public static final Target NUMERO_TELEFONO =
            Target.the("Numero Telefono").located(By.xpath("//input[@id='phone']"));

    public static final Target TIPO_TARJETA =
            Target.the("Tipo de Tarjeta").located(By.xpath("//select[@id='cc_type']"));

    public static final Target NUMERO_TARJETA =
            Target.the("Numero Tarjeta").located(By.xpath("//input[@id='cc_number']"));

    public static final Target CADUCIDAD_MES =
            Target.the("Caducidad Mes").located(By.xpath("//select[@name='cc_month']"));

    public static final Target CADUCIDAD_ANIO =
            Target.the("Caducidad año").located(By.xpath("//select[@name='cc_year']"));

    public static final Target COMPLETA_LA_RESERVA =
            Target.the("Completa la reserva").located(By.xpath("//button[@type='submit']/ancestor::div[@class='bui-group__item']"));
}
