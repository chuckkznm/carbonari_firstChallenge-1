package tareas;

import UI.PaginaPrincipal;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class HacerClickEn implements Task {

    private Target boton;

    public HacerClickEn(Target boton){
        this.boton = boton;
    }

    public static Performable boton(){
        return Instrumented
                .instanceOf(HacerClickEn.class)
                .withProperties(PaginaPrincipal.BOTON_ADD_ITEM);
    }

    @Override
    @Step("{0} decide hacer click en agregar ítem")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(this.boton)
        );
    }

}
