package stepsdefinitions;

import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Shared;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;
import userinterfaces.HomePage;
import userinterfaces.LogueoPage;


public class LoginStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("John");
    private HomePage homePage = new HomePage();

    //@Shared
    //DataRegistro dataRegistro;


    @Dado("que un usuario ingresa a la web")
    public void que_un_usuario_ingresa_a_la_web() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
        //actor.attemptsTo(Click.on(LogueoPage.BTN_MICUENTA));

    }
    @Cuando("Ingresa diligencia toda la informacion")
    public void ingresa_diligencia_toda_la_informacion() {


        actor.attemptsTo(Click.on(LogueoPage.BTN_ENTRARCONGOOGLE));
        actor.attemptsTo(Click.on(LogueoPage.BTN_MICUENTA));
    }
    @Entonces("generara mensaje de registro exitoso")
    public void generara_mensaje_de_registro_exitoso() {

    }
}
