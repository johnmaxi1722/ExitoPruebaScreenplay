package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ArticuloTecnologiaPage {

    public static final Target BTN_ARTICULOTECN1 = Target.the("Botón Articulo Tecnologia 1")
            .located(By.xpath("//*[@id=\"gallery-layout-container\"]/div[4]/section/a/article/div[2]/div[2]/div/div/div/div[5]/div/div[2]/div[2]/button/div/div/span"));
}