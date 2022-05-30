package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;

public class TipoEntregaPage extends PageObject {


    public static final Target BTN_RECIBIRPEDIDO = Target.the("Botón Recibir Pedido")
            .located(By.xpath("//*[@id=\"header-container\"]/div[3]/div/div/span"));

    public static final Target BTN_ENVIODOMICILIO = Target.the("Botón Envio a Domicilio")
            .located(By.xpath("/html/body/div[21]/div[3]/div/div/div[2]/div[2]/div[3]/button"));

    //public static final Target BTN_COMPRAYRECOGE = Target.the("Botón Recoger en Tienda")
    //.located(By.xpath("/html/body/div[14]/div[3]/div/div/div[2]/div[2]/div[1]/button"));

    public static final Target BTN_ENVIAREMAILDOMIC = Target.the("Botón Enviar Email")
            .located(By.xpath("/html/body/div[14]/div[3]/div/div/div[2]/div[2]/div[2]/button[2]"));








}
