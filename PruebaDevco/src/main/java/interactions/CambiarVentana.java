package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class CambiarVentana implements Interaction {

    private String titulo;

    public CambiarVentana(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver= BrowseTheWeb.as(actor).getDriver();
        Set<String> listaPantalla=driver.getWindowHandles();

        for(String pantalla:listaPantalla){
            driver.switchTo().window(pantalla);
            if (driver.getTitle().contains(titulo)){
                break;
            }
        }
        if (!driver.getTitle().contains(titulo)){
            throw new NoSuchWindowException("no se encontro una ventana "
                    +"con el titulo " +titulo);
        }
        listaPantalla.remove(driver.getWindowHandle());
    }
    public static CambiarVentana conTitulo(String title){
        return Tasks.instrumented(CambiarVentana.class,title);
    }
}
