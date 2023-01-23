package co.com.choucair.certification.automation.tasks;

import co.com.choucair.certification.automation.userinterfaces.Paginaprueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {
    private Paginaprueba paginaprueba;
public static AbrirPagina urlpagina(){
    return Tasks.instrumented(AbrirPagina.class);
}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaprueba));
    }
}
