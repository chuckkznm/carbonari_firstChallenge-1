
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import tareas.*;

@RunWith(SerenityRunner.class)
public class Runner {

    public Runner(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/browserBinaries/chromedriver.exe");
    }

    @Managed(options = "marionette", driver = "chrome")
    WebDriver nvg;

    Actor actor;

    @Before
    public void definimosElEsecenario(){
        actor = Actor.named("Poseidón");
        actor.can(BrowseTheWeb.with(nvg));
    }

    @Test
    public void darDeAltaUnItem() {
        /* El actor, abre el navegador */
        actor.has(Decidido.abrirElNavegador());

        /* Luego, el actor quiere ir a la sección de Employees */
        actor.attemptsTo(
                IrHacia.seccionEmployees()
        );

        /* Luego, el actor quiere agregar un nuevo ítem */
        actor.attemptsTo(
                HacerClickEn.boton()
                        .then(Rellenar.campos("alejo", "Executive Producer"))
        );
    }
}
