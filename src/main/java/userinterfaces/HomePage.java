package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage extends PageObject{

    public static final Target BTN_RECIBIRPEDIDO = Target.the("Botón Recibir Pedido")
            .located(By.xpath("//*[@id=\"header-container\"]/div[3]/div/div/span"));
}
