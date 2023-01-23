package co.com.choucair.certification.automation.tasks;

import co.com.choucair.certification.automation.userinterfaces.Paginaprueba;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Ingresar implements Task {
    public static Ingresar credenciales(){
        return Tasks.instrumented(Ingresar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
       Enter.theValue("standard_user").into(Paginaprueba.TXT_USUARIO),
       Enter.theValue("secret_sauce").into(Paginaprueba.TXT_CONTRASEÑA),
        Click.on(Paginaprueba.BTN_SING_IN)
                );
        //try{
           // Thread.sleep(5000);
        //}catch (InterruptedException e){
            //e.printStackTrace();
        //}

    }
}
