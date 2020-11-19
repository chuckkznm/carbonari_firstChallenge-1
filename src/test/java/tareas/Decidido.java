package tareas;

import constantes.Constantes;
import navegacion.Navegar;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Decidido implements Task {

    public Decidido(){
    }

    public static Performable abrirElNavegador(){
        return instrumented(Decidido.class);
    }

    @Override
    @Step("{0} ha decidido dar de alta un ítem")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Navegar.hacia(Constantes.paginaPrincipal));
    }
}

