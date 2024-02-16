package co.com.practica.tasks;

import co.com.practica.userinterface.GoogleHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Buscar implements Task {

    private String palabra;

    public Buscar(String palabra) {
        super();
        this.palabra = palabra;
    }


    public static Buscar La(String palabra){return Tasks.instrumented(Buscar.class,palabra);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(palabra).into(GoogleHomePage.TEXTO_BUSQUEDA));
        actor.attemptsTo(Click.on(GoogleHomePage.BOTON_BUSQUEDA));
    }
}
