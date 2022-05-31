package stepsdefinitions;

import cucumber.api.java.es.*;
import models.DataEmail;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Shared;
import tasks.IngresarEmail;
import tasks.Loguearse;
import userinterfaces.LogueoPage;
import net.serenitybdd.screenplay.Actor;
import org.openqa.selenium.WebDriver;
import tasks.SelTipoEntrega;
import userinterfaces.TipoEntregaPage;
import userinterfaces.CategoriaPage;
import userinterfaces.CarritoPage;
import userinterfaces.IngresarEmailPage;

import userinterfaces.HomePage;


public class TipoEntregaStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("John");
    private HomePage homePage = new HomePage();

    @Shared
    DataEmail dataEmail;

    @Cuando("^seleccione Tipo de Entrega$")
    public void seleccione_Tipo_de_Entrega() {

        actor.attemptsTo(Click.on(HomePage.BTN_RECIBIRPEDIDO));
        actor.attemptsTo(Click.on(TipoEntregaPage.BTN_ENVIODOMICILIO));

        BrowseTheWeb.as(actor).waitFor(2).seconds();
        actor.attemptsTo((Performable) IngresarEmail.femail(dataEmail.getUserEmail()));

        actor.attemptsTo(Click.on(TipoEntregaPage.BTN_ENVIAREMAILDOMIC));

    }


    @Entonces("^generara mensaje de Seleccion Exitosa$")
    public void generara_mensaje_de_Seleccion_Exitosa() {

    }

}
