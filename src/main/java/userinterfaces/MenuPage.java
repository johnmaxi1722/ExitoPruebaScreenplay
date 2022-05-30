package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuPage extends PageObject {

    public static final Target BTN_MENUEXITO = Target.the("Botón Menú Articulos")
            .located(By.id("Enmascarar_grupo_659"));

    public static final Target BTN_TECNOLOGIA1 = Target.the("Botón Articulo Tecnologia 1")
            .located(By.xpath("/html/body/div[14]/div[3]/div/div/ul/li[5]/p"));

    public static final Target BTN_TECNOLOGIA2 = Target.the("Botón ir a Tecnoloia")
            .located(By.xpath("/html/body/div[14]/div[3]/div/section/div[1]/a"));
}
