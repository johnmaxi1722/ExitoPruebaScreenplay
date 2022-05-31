package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarEmailPage {

    public static final Target LBL_EMAIL = Target.the("Label Email")
            .located(By.id("requestemail-input"));

}
