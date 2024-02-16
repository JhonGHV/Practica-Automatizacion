package co.com.practica.questions;

import co.com.practica.userinterface.GoogleResultPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LaRespuesta implements Question<String> {

    public static LaRespuesta es() {
        return new  LaRespuesta();
    }


    @Override
    public String answeredBy(Actor actor) {
        return Text.of(GoogleResultPage.TEXTO_RESULTADO).answeredBy(actor);
    }
}
