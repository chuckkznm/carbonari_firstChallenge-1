package tareas;

import UI.PaginaPrincipal;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Rellenar implements Task {
    private String nombre, opcion;

    public Rellenar(String nombre, String opcion){
        this.nombre = nombre;
        this.opcion = opcion;
    }

    public static Performable campos(String nombre, String opcion){
        return Instrumented.instanceOf(Rellenar.class).withProperties(nombre, opcion);
    }

    @Override
    @Step("{0} decide agregar un ítem nuevo")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(this.nombre)
                .into(By.cssSelector("div.popup-content div.form-row.row:nth-child(1) > input:nth-child(2)"))
                .then(Click.on(By.xpath("//option[@value='Co-Executive Producer']")))
                .then(Click.on(PaginaPrincipal.BOTON_SUBMIT))

        );
    }
}
