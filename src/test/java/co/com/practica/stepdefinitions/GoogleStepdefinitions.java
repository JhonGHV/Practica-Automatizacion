package co.com.practica.stepdefinitions;

import co.com.practica.tasks.Abrir;
import co.com.practica.tasks.Buscar;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class GoogleStepdefinitions {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que estoy en la pagina de Google")
    public void que_estoy_en_la_pagina_de_google() {
        OnStage.theActorCalled("jhon").wasAbleTo(Abrir.LaPaginaDeGoogle());
    }

    @Cuando("ingreso {string} en el campo de búsqueda")
    public void ingreso_en_el_campo_de_búsqueda(String palabra) {
        OnStage.theActorInTheSpotlight().attemptsTo(Buscar.La(palabra));
    }

    @Cuando("presiono entrar")
    public void presiono_entrar() {
        // No necesitas implementar este paso aquí, ya que está implementado en la tarea de búsqueda.
    }

    @Entonces("debería ver los resultados de la búsqueda relacionados con {string}")
    public void debería_ver_los_resultados_de_la_búsqueda_relacionados_con(String palabra) {
        // Puedes agregar aquí aserciones para verificar los resultados de búsqueda si lo deseas
    }
}