package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogueoPage extends PageObject {

    public static final Target BTN_MICUENTA = Target.the("Botón Mi Cuenta")
            .located(By.xpath("//*[@id=\"header-container\"]/div[2]/div[4]/div/div[1]/span"));

    public static final Target BTN_ENTRARCONGOOGLE = Target.the("Botón Entrar con Google")
            .located(By.xpath("/html/body/div[14]/div[3]/div[2]/div/div/div/div[1]/div/div/div/div[1]/ul/li[3]/div/button/div/span"));

    public static final Target BTN_LOGIN = Target.the("Botón Login")
            .located(By.id("login2"));

}
