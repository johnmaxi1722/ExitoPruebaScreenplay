package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoPage {

    public static final Target BTN_VACIARCARRITO = Target.the("Botón Vaciar Carrito")
            .located(By.xpath("//*[@id=\"checkoutMainContainer\"]/div[5]/div[3]/div[1]/div[4]/span[5]/a/span"));

    public static final Target BTN_CONFIRMARVACIARCARRITO = Target.the("Botón Confirmar Vaciar Carrito")
            .located(By.xpath("//*[@id=\"modal\"]/div[2]/div/div[2]/button[2]"));

    public static final Target BTN_CANCELARVACIARCARRITO = Target.the("Botón Cancelar Vaciar Carrito")
            .located(By.xpath("//*[@id=\"modal\"]/div[2]/div/div[2]/button[1]"));

}
