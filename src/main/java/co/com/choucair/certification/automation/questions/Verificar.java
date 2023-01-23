package co.com.choucair.certification.automation.questions;

import co.com.choucair.certification.automation.userinterfaces.Paginaprueba;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verificar  implements Question {
    public static Verificar resultado(){
        return new Verificar();
    }
    @Override
    public Object answeredBy(Actor actor){
      return Text.of(Paginaprueba.BTN_MENU).viewedBy(actor).asString();

    }
}
