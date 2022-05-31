package tasks;

import interactions.Write;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import userinterfaces.IngresarEmailPage;


public class IngresarEmail implements Task{

    private String userEmail;


    public void Email(String userEmail) {

        this.userEmail = userEmail;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Write.on(IngresarEmailPage.LBL_EMAIL, this.userEmail));

    }
    public static IngresarEmail femail(String userEmail){
        return (IngresarEmail) Tasks.instrumented(IngresarEmail.class, userEmail);
    }
}
